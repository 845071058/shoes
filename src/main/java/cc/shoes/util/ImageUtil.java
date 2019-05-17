package cc.shoes.util;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.imageio.ImageIO;

import com.mysql.cj.util.Base64Decoder;
import com.thoughtworks.xstream.core.util.Base64Encoder;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * 图片处理工具类
 * @author Lenovo
 *
 */
public class ImageUtil {

//	static BASE64Decoder decoder = new sun.misc.BASE64Decoder();
//	 static BASE64Encoder encoder = new sun.misc.BASE64Encoder(); 
	
	/**
	 * 图片转字节
	 * @param path
	 * @return
	 * @throws Exception
	 */
	public byte[] imgToStr(String path) throws Exception {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
		    File file = new File(path);     //将图片转换成file类型的文件
			BufferedImage bi;
			bi = ImageIO.read(file);
			ImageIO.write(bi, "jpg", baos);
			byte[] bytes = baos.toByteArray();
			return bytes;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			baos.close();
		}
		return null;

	}
	
	/**
	 * 字节转图片
	 * @param bytes
	 * @throws IOException
	 */
	public void byteToFile(byte[] bytes) throws IOException {
		ByteArrayInputStream bais = new ByteArrayInputStream(bytes);   
        BufferedImage bi1 =ImageIO.read(bais); 
        try {   
            File w2 = new File("D:/apple.jpg");//可以是jpg,png,gif格式   
            ImageIO.write(bi1, "jpg", w2);//不管输出什么格式图片，此处不需改动   
        } catch (IOException e) {   
            e.printStackTrace();   
        }finally{
        	bais.close();
        }
    }
	
	/**
	 * 图片转base64
	 * @param path
	 * @return
	 */
	@SuppressWarnings("restriction")
	public  String imageToBase64(String path) {// 将图片文件转化为字节数组字符串，并对其进行Base64编码处理
	    byte[] data = null;
	    // 读取图片字节数组
	    try {
	    	File file = new File(path);
	        InputStream in = new FileInputStream(path);
	        data = new byte[in.available()];
	        in.read(data);
	        in.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    // 对字节数组Base64编码
	    BASE64Encoder encoder = new BASE64Encoder();
	    return encoder.encode(data);// 返回Base64编码过的字节数组字符串
	}
	
	/**
	 * base64转图片
	 * @param base64
	 * @param path
	 * @return
	 */
	@SuppressWarnings("restriction")
	public  boolean base64ToImage(String base64, String path) {// 对字节数组字符串进行Base64解码并生成图片
	    if (base64 == null){ // 图像数据为空
	        return false;
	    }
		BASE64Decoder decoder = new BASE64Decoder();
	    try {
	        // Base64解码
	        byte[] bytes = decoder.decodeBuffer(base64);
	        for (int i = 0; i < bytes.length; ++i) {
	            if (bytes[i] < 0) {// 调整异常数据
	                bytes[i] += 256;
	            }
	        }
	        // 生成jpeg图片
	        OutputStream out = new FileOutputStream(path);
	        out.write(bytes);
	        out.flush();
	        out.close();
	        return true;
	    } catch (Exception e) {
	        return false;
	    }
	}
}

