package com.gb.crudMerge.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gb.crudMerge.model.Mobile;

@Repository
public interface MobileDao extends JpaRepository<Mobile, Integer>{

}
