package cc.shoes.controller;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
//import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cc.shoes.entity.UserT;
import cc.shoes.service.UserTservice;
import cc.shoes.util.FtpTool;
//import cc.shoes.util.FtpUtil;
import cc.shoes.util.IDUtils;

@Controller
@RequestMapping("/pic")
public class UserTcontroller {

	@Value("${FTP.ADDRESS}")
	private String host;
	// 端口
	@Value("${FTP.PORT}")
	private String port;
	// ftp用户名
	@Value("${FTP.USERNAME}")
	private String userName;
	// ftp用户密码
	@Value("${FTP.PASSWORD}")
	private String passWord;
	// 文件在服务器端保存的主目录
	@Value("${FTP.BASEPATH}")
	private String basePath;
	// 访问图片时的基础url
	@Value("${IMAGE.BASE.URL}")
	private String baseUrl;

	@Autowired
	private UserTservice userService;

	@RequestMapping("/upload")
	@ResponseBody
	public String pictureUpload(@RequestParam("pic") MultipartFile uploadFile,
			@RequestParam("username") String username, @RequestParam("password") String password) {
		try {
			// 1、给上传的图片生成新的文件名
			// 1.1获取原始文件名
			String oldName = uploadFile.getOriginalFilename();
			// 1.2使用IDUtils工具类生成新的文件名，新文件名 = newName + 文件后缀
			String newName = IDUtils.genImageName();
			newName = newName + oldName.substring(oldName.lastIndexOf("."));
			// 1.3生成文件在服务器端存储的子目录
			String filePath = new DateTime().toString("yyyyMMdd");
			System.out.println(host);
			System.out.println(port);
			int porti = Integer.parseInt(port);
			String fileName = filePath + newName;
			// 2、把前端输入信息，包括图片的url保存到数据库
			UserT user = new UserT();
			user.setUserName(username);
			user.setPassWord(password);
			user.setPicture(baseUrl + "/" + filePath + newName);
			userService.insert(user);

			// 3、把图片上传到图片服务器
			// 3.1获取上传的io流
			InputStream input = uploadFile.getInputStream();
//            Integer port2 = port.
			// 3.2调用FtpUtil工具类进行上传
			boolean result = FtpTool.upload(host, porti, userName, passWord, basePath, input, fileName);
			if (result) {
				return "success";
			} else {
				return "false";
			}
		} catch (IOException e) {
			e.printStackTrace();
			return "false";
		}
	}

	@RequestMapping("/forupload")
	@ResponseBody
	public String forupload(@RequestParam("pic") MultipartFile uploadFile) {
		boolean result = false;
		try {
//        	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date start = new Date();
			// 2、把前端输入信息，包括图片的url保存到数据库
			for (int i = 0; i < 10000; i++) {
				// 1、给上传的图片生成新的文件名
				// 1.1获取原始文件名
				String oldName = uploadFile.getOriginalFilename();
				// 1.2使用IDUtils工具类生成新的文件名，新文件名 = newName + 文件后缀
				String newName = IDUtils.genImageName();
				newName = newName + oldName.substring(oldName.lastIndexOf("."));
				// 1.3生成文件在服务器端存储的子目录
				String filePath = new DateTime().toString("yyyyMMdd");
				int porti = Integer.parseInt(port);
				String fileName = filePath + String.valueOf(i) + newName;
				// 3、把图片上传到图片服务器
				// 3.1获取上传的io流
				InputStream input = uploadFile.getInputStream();
//                Integer port2 = port.
				// 3.2调用FtpUtil工具类进行上传
				result = FtpTool.upload(host, porti, userName, passWord, basePath, input, fileName);
				int a = i + 1;
				DecimalFormat dfs = new DecimalFormat("0.00");// 设置保留位数

				String results = dfs.format((float) a / 100);
				System.out.println("上传进度" + results + "%");
			}
			Date end = new Date();
			Long startLong = start.getTime();
			Long endLong = end.getTime();
			Long ms = endLong - startLong;
			// 时间差转换为 \天\时\分\秒
			String time = longTimeToDay(ms);
			System.out.println(time);
			if (result) {
				return "success";
			} else {
				return "false";
			}
		} catch (IOException e) {
			e.printStackTrace();
			return "false";
		}
	}

	public static String longTimeToDay(Long ms) {
		Integer ss = 1000;
		Integer mi = ss * 60;
		Integer hh = mi * 60;
		Integer dd = hh * 24;

		Long day = ms / dd;
		Long hour = (ms - day * dd) / hh;
		Long minute = (ms - day * dd - hour * hh) / mi;
		Long second = (ms - day * dd - hour * hh - minute * mi) / ss;
		Long milliSecond = ms - day * dd - hour * hh - minute * mi - second * ss;

		StringBuffer sb = new StringBuffer();
		if (day > 0) {
			sb.append(day + "天");
		}
		if (hour > 0) {
			sb.append(hour + "小时");
		}
		if (minute > 0) {
			sb.append(minute + "分");
		}
		if (second > 0) {
			sb.append(second + "秒");
		}
		if (milliSecond > 0) {
			sb.append(milliSecond + "毫秒");
		}
		return sb.toString();
	}

	@RequestMapping("/addCommodityPic")
	@ResponseBody
	public void addCommodityPic(HttpServletRequest request, @RequestParam MultipartFile[] PicArr) {
//	Result result = new Result(Result.FAIL, "新增商品失败！");
//	try{
		// commoPicArr数组则是上传的多文件，然后就可以做进一步处理，在此省略....
		System.out.println(PicArr.length);
//		int a = commService.updateCommodityPic(vo);
//		if(a>0){
//			result.setResultCode(Result.SUCC);
//			result.setMsg("新增商品成功!");
//		}
//	} catch (Exception e) {
//		logger.error("商品信息管理：新增图片", e.getCause());
//		e.printStackTrace();
//	}
//	return result;
	}
}