package com.vig.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class ImageKeyword implements Serializable{
	
	private static final long serialVersionUID = 1236283424582915L;
	
	private int keywordId;
	private int imageId;
	// 0= 테그아님 1= 테그
 	private int isTag;
	private int userCode;
	private String keywordEn;
	private String keywordOrigin;	
	private float score;
	
	
	public ImageKeyword() {
		// TODO Auto-generated constructor stub
	}


}
