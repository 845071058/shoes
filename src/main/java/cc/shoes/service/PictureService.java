package cc.shoes.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import cc.shoes.entity.Picture;

public interface PictureService {

	boolean addPicture(int mallId, MultipartFile[] PicArr) throws Exception;

	List<Picture> selectRecommedMall();

}
