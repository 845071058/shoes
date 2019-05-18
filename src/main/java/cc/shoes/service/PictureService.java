package cc.shoes.service;

import org.springframework.web.multipart.MultipartFile;

public interface PictureService {

	boolean addPicture(int mallId, MultipartFile[] PicArr) throws Exception;
}
