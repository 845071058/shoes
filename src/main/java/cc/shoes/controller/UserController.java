package cc.shoes.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cc.shoes.entity.User;
import cc.shoes.entity.vo.TestForm;
import cc.shoes.redis.CacheUtil;
import cc.shoes.service.UserService;

@RestController
@RequestMapping("/test")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/user")
	public List<User> findAllUser(){
		boolean b = CacheUtil.setString("123", "456");
		System.out.print(b);
		System.out.println(CacheUtil.getString("123"));
		List<User> list =userService.findAllUser();
		boolean a = CacheUtil.setList("555", list);
		System.out.print(a);
		return userService.findAllUser();
	}
	
	@GetMapping("/add")
	public void add() throws Exception {
		User user = new User();
		userService.addUser(user);
//		userService.findUser();
	}
	
	@GetMapping("/find")
	public void find() throws Exception {
//		User user = new User();
//		userService.addUser(user);
		userService.findUser();
	}
	
	@GetMapping("/test")
	@ResponseBody
	public void test(TestForm testForm) throws Exception {
//		User user = new User();
//		userService.addUser(user);
//		userService.findUser();
		System.out.println(111);
	}
}

