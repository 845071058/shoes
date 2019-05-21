//package cc.shoes.controller;
//
//import java.io.IOException;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import cc.shoes.service.ImageService;
//
//@Controller
//@RequestMapping("/ima")
//public class ImageController {
//
//	@Autowired
//	private ImageService imageService;
//	
//	@RequestMapping("/add")
//	public void addIma() {
//		String path = "D:/ima.jpg";
//		imageService.addImage(path);
//	}
//	
//	
//	@RequestMapping("/find")
//	public void findIma() throws IOException {
//		imageService.findIma(1);
//	}
//}
