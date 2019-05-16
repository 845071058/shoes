package cc.shoes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import cc.shoes.entity.User;
import cc.shoes.entity.UserExample;
import cc.shoes.mapper.UserMapper;
import cc.shoes.service.UserService;
import cc.shoes.util.ImageUtil;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
//	@Autowired
//	private ImageUtil util;
	@Cacheable(value="user",key=" #users")
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		UserExample example = new UserExample();
		return userMapper.selectByExample(example);
	}

	public int addUser(User user) throws Exception {
		ImageUtil util = new ImageUtil();
		byte[] ima = util.imgToStr("D:/ima.jpg");
		user.setUsername("2");
		user.setUsername("2");
		user.setImage(ima);
		return userMapper.insert(user);
	}

	public User findUser() throws Exception {
		ImageUtil util = new ImageUtil();
		int userid = 4;
		User user = userMapper.selectByPrimaryKey(userid);
		util.byteToFile(user.getImage());
		return user;
	}

	
}
