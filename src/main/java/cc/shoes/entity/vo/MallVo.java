package cc.shoes.entity.vo;

import java.util.List;

import cc.shoes.entity.Mall;

public class MallVo extends Mall {

	private String picPath;

	private List<String> picPaths;

	public String getPicPath() {
		return picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public List<String> getPicPaths() {
		return picPaths;
	}

	public void setPicPaths(List<String> picPaths) {
		this.picPaths = picPaths;
	}

}
