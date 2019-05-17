package cc.shoes.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cc.shoes.entity.Picture;
import cc.shoes.mapper.PictureMapper;
import cc.shoes.service.PictureService;

@Service
public class PictureServiceImpl implements PictureService{

	@Autowired
	private PictureMapper picMapper;
	public int addPicture(Picture record) {
		return picMapper.insert(record);
	}

}
