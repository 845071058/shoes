package cc.shoes.entity.vo;

import java.util.Date;

import cc.shoes.entity.Mall;

/**
 * 搜索条件
 * 
 * @author Administrator
 *
 */
public class MallCondition extends Mall {

	private String keyWord;

	private Date date;

	private Integer maxPrice;

	private Integer minPrice;

	public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(Integer maxPrice) {
		this.maxPrice = maxPrice;
	}

	public Integer getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(Integer minPrice) {
		this.minPrice = minPrice;
	}

}
