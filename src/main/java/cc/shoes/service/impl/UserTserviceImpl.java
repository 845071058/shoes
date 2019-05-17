package cc.shoes.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cc.shoes.entity.UserT;
import cc.shoes.mapper.UserTmapper;
import cc.shoes.service.UserTservice;

@Service
public class UserTserviceImpl implements UserTservice {
	
	@Autowired
	private UserTmapper userTmapper;

	public int insert(UserT record) {

		return userTmapper.insert(record);
	}

}
