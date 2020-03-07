package com.gb.crudMerge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gb.crudMerge.dao.MobileDao;
import com.gb.crudMerge.model.Mobile;

@Service
public class MobileService {

	@Autowired
	private MobileDao dao;

	public Mobile save(Mobile mobile) {
		return dao.save(mobile);
	}

	public List<Mobile> findAll() {
		return dao.findAll();
	}

	public void deleteById(int id) {
		dao.deleteById(id);
	}

}
