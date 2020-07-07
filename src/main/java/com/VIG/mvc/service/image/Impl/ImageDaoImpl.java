package com.VIG.mvc.service.image.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.VIG.mvc.service.domain.Image;
import com.VIG.mvc.service.domain.Search;
import com.VIG.mvc.service.image.ImageDao;


@Repository("imageDaoImpl")
public class ImageDaoImpl implements ImageDao {
		
	
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	

	public ImageDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addImage(Image image) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Image getImage(int imageId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Image> getImageList(Search search) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteImage(Image image) throws Exception {
		// TODO Auto-generated method stub

	}

}