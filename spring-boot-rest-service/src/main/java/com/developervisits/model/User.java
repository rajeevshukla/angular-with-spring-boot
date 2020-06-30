package com.developervisits.model;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@ApiModel(description="All details about user")
@Data
public class User {

	private String username;
	private String password;
	private String email;
	@ApiModelProperty(notes="Birth date should be only in past")
	private Date createdDate;


}
