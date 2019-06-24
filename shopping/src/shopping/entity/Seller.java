package shopping.entity;

import java.io.Serializable;
import java.sql.Timestamp;

@SuppressWarnings("serial")
public class Seller implements Serializable{
	private String s_seller_id;
	private String s_seller_name;
	private String s_seller_pwd;
	private String s_seller_pho;
	private String s_seller_type;
	private String s_seller_pic;
	private Timestamp s_seller_createtime;
	
	public String getS_seller_id() {
		return s_seller_id;
	}
	public void setS_seller_id(String sSellerId) {
		s_seller_id = sSellerId;
	}
	public String getS_seller_name() {
		return s_seller_name;
	}
	public void setS_seller_name(String sSellerName) {
		s_seller_name = sSellerName;
	}
	public String getS_seller_pwd() {
		return s_seller_pwd;
	}
	public void setS_seller_pwd(String sSellerPwd) {
		s_seller_pwd = sSellerPwd;
	}
	public String getS_seller_pho() {
		return s_seller_pho;
	}
	public void setS_seller_pho(String sSellerPho) {
		s_seller_pho = sSellerPho;
	}
	public String getS_seller_type() {
		return s_seller_type;
	}
	public void setS_seller_type(String sSellerType) {
		s_seller_type = sSellerType;
	}
	public String getS_seller_pic() {
		return s_seller_pic;
	}
	public void setS_seller_pic(String sSellerPic) {
		s_seller_pic = sSellerPic;
	}
	public Timestamp getS_seller_createtime() {
		return s_seller_createtime;
	}
	public void setS_seller_createtime(Timestamp sSellerCreatetime) {
		s_seller_createtime = sSellerCreatetime;
	}
	
}
