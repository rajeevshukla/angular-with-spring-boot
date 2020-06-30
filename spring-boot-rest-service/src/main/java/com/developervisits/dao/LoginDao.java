package com.developervisits.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.developervisits.model.User;

public interface LoginDao extends CrudRepository<User, Serializable>{

}