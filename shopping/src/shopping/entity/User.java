package shopping.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@SuppressWarnings("serial")
public class User implements Serializable{
	private String s_user_id;
	private String s_user_name;
	private String s_user_pwd;
	private String s_user_gender;
	private Date s_user_birth;
	private String s_user_pho;
	private String s_user_add;
	private String s_user_type;
	private Timestamp s_user_createtime;
	private String s_user_comm;
	
	public String getS_user_id() {
		return s_user_id;
	}
	public void setS_user_id(String sUserId) {
		s_user_id = sUserId;
	}
	public String getS_user_name() {
		return s_user_name;
	}
	public void setS_user_name(String sUserName) {
		s_user_name = sUserName;
	}
	public String getS_user_pwd() {
		return s_user_pwd;
	}
	public void setS_user_pwd(String sUserPwd) {
		s_user_pwd = sUserPwd;
	}
	public String getS_user_gender() {
		return s_user_gender;
	}
	public void setS_user_gender(String sUserGender) {
		s_user_gender = sUserGender;
	}
	public Date getS_user_birth() {
		return s_user_birth;
	}
	public void setS_user_birth(Date sUserBirth) {
		s_user_birth = sUserBirth;
	}
	public String getS_user_pho() {
		return s_user_pho;
	}
	public void setS_user_pho(String sUserPho) {
		s_user_pho = sUserPho;
	}
	public String getS_user_add() {
		return s_user_add;
	}
	public void setS_user_add(String sUserAdd) {
		s_user_add = sUserAdd;
	}
	public String getS_user_type() {
		return s_user_type;
	}
	public void setS_user_type(String sUserType) {
		s_user_type = sUserType;
	}
	public Timestamp getS_user_createtime() {
		return s_user_createtime;
	}
	public void setS_user_createtime(Timestamp sUserCreatetime) {
		s_user_createtime = sUserCreatetime;
	}
	public String getS_user_comm() {
		return s_user_comm;
	}
	public void setS_user_comm(String sUserComm) {
		s_user_comm = sUserComm;
	}
	
	
}
