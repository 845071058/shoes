package cc.shoes.service.impl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cc.shoes.entity.Image;
import cc.shoes.mapper.ImageMapper;
import cc.shoes.service.ImageService;
import cc.shoes.util.ImageUtil;

@Service
public class ImageServiceImpl implements ImageService {

	@Autowired
	private ImageMapper imageMapper;

	public void addImage(String path) {
		ImageUtil util = new ImageUtil();
		String imageBase = util.imageToBase64(path);
		Image image = new Image();
		image.setImagebase(imageBase);
		imageMapper.insert(image);
	}

	public void findIma(int imageid) throws IOException {
		// TODO Auto-generated method stub
		Image ima = imageMapper.selectByPrimaryKey(imageid);
		ImageUtil util = new ImageUtil();
		boolean base = util.base64ToImage(ima.getImagebase(), "D:/apple.jpg");
//		util.byteToFile(base.getBytes());

	}

}
