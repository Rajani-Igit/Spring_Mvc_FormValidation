package com.spring.app.vo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name="User_Hb")
public class User {
@Id
@Column(name="userid")
@GeneratedValue(strategy=GenerationType.IDENTITY)
private String userId;
@Column(name="pasword")
private String pwd;
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
@Override
public String toString() {
	return "User [userId=" + userId + ", pwd=" + pwd + "]";
}


}
