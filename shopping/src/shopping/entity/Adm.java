package shopping.entity;

import java.io.Serializable;
import java.sql.Timestamp;

@SuppressWarnings("serial")
public class Adm implements Serializable{
	private String s_adm_id;
	private String s_adm_name;
	private String s_adm_pwd;
	private String s_adm_pho;
	private Timestamp s_adm_createtime;
	public String getS_adm_id() {
		return s_adm_id;
	}
	public void setS_adm_id(String sAdmId) {
		s_adm_id = sAdmId;
	}
	public String getS_adm_name() {
		return s_adm_name;
	}
	public void setS_adm_name(String sAdmName) {
		s_adm_name = sAdmName;
	}
	public String getS_adm_pwd() {
		return s_adm_pwd;
	}
	public void setS_adm_pwd(String sAdmPwd) {
		s_adm_pwd = sAdmPwd;
	}
	public String getS_adm_pho() {
		return s_adm_pho;
	}
	public void setS_adm_pho(String sAdmPho) {
		s_adm_pho = sAdmPho;
	}
	public Timestamp getS_adm_createtime() {
		return s_adm_createtime;
	}
	public void setS_adm_createtime(Timestamp sAdmCreatetime) {
		s_adm_createtime = sAdmCreatetime;
	}
	
	
}
