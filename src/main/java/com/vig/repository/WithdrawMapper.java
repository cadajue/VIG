package com.vig.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.vig.domain.Search;
import com.vig.domain.Withdraw;


@Mapper
public interface WithdrawMapper {
	
	public void addWithdraw(Withdraw withdraw) throws Exception;
	
	public void updateWithdraw(Withdraw withdraw) throws Exception;
	
	public List<Withdraw> getWithdrawList(Search search) throws Exception;
	
	public int getCountWithdraw(String userCode) throws Exception;
	

}
