package cc.shoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cc.shoes.entity.User;
import cc.shoes.redis.CacheUtil;
import cc.shoes.service.UserService;

@RestController
@RequestMapping("/test")
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * 测试redis
	 * 
	 * @return
	 */
	@GetMapping("/user")
	public List<User> findAllUser() {
		boolean b = CacheUtil.setString("123", "456");
		System.out.print(b);
		System.out.println(CacheUtil.getString("123"));
		List<User> list = userService.findAllUser();
		boolean a = CacheUtil.setList("555", list);
		return userService.findAllUser();
	}

	/**
	 * 测试添加用户
	 * 
	 * @throws Exception
	 */
	@GetMapping("/add")
	public void add() throws Exception {
		User user = new User();
		userService.addUser(user);
	}

	/**
	 * 测试查找用户
	 * 
	 * @throws Exception
	 */
	@GetMapping("/find")
	public void find() throws Exception {
		userService.findUser();
	}

	/**
	 * 测试weChat交互
	 * 
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/test")
	@ResponseBody
	public User test() throws Exception {
		System.out.println(111);
		User user = new User();
		user.setUsername("222");
		user.setUserpwd("111");
		return user;
	}
}
