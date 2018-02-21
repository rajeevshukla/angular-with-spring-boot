package com.springboot.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.springboot.model.Login;

public interface LoginDao extends CrudRepository<Login, Serializable>{

}