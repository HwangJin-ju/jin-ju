package com.yedam.exam;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
@Service
public class SlipServiceImpl implements SlipService{

	@Resource	SlipDAO dao;
	
	@Override
	public void insertSlip(List<Slip> slip) {
		//테이블 입력
		for(Slip l : slip) {
			dao.insertSlip(l);  
		}		
	}

}
