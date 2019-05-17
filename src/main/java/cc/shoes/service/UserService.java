package cc.shoes.service;

import java.util.List;

import cc.shoes.entity.User;

public interface UserService {

	List<User> findAllUser();
	
	int addUser(User user)throws Exception;
	
	User findUser()throws Exception;
}
