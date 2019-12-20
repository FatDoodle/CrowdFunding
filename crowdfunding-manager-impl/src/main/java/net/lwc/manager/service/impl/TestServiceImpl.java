package net.lwc.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.lwc.manager.dao.TestDao;
import net.lwc.manager.service.TestService;

@Service
public class TestServiceImpl implements TestService{

	
	@Autowired
	TestDao td;
	
	@Override
	public int insert() {
		
		return td.insert();
	}

}
