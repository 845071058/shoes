package cc.shoes.service;

import java.io.IOException;

import cc.shoes.entity.Image;

public interface ImageService {

	void addImage(String path);
	
	void findIma(int imageid) throws IOException;
}
