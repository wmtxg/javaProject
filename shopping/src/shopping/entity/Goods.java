package shopping.entity;

import java.io.Serializable;
import java.math.BigDecimal;

@SuppressWarnings("serial")
public class Goods implements Serializable{
	private String s_goods_id;
	private String s_seller_id;
	private String s_goods_type;
	private String s_goods_name;
	private int s_goods_qty;
	private String s_goods_desc;
	private BigDecimal s_goods_price;
	private String s_goods_pic;
	private String s_goods_detal;
	public String getS_goods_id() {
		return s_goods_id;
	}
	public void setS_goods_id(String sGoodsId) {
		s_goods_id = sGoodsId;
	}
	public String getS_seller_id() {
		return s_seller_id;
	}
	public void setS_seller_id(String sSellerId) {
		s_seller_id = sSellerId;
	}
	public String getS_goods_type() {
		return s_goods_type;
	}
	public void setS_goods_type(String sGoodsType) {
		s_goods_type = sGoodsType;
	}
	public String getS_goods_name() {
		return s_goods_name;
	}
	public void setS_goods_name(String sGoodsName) {
		s_goods_name = sGoodsName;
	}
	public int getS_goods_qty() {
		return s_goods_qty;
	}
	public void setS_goods_qty(int sGoodsQty) {
		s_goods_qty = sGoodsQty;
	}
	public String getS_goods_desc() {
		return s_goods_desc;
	}
	public void setS_goods_desc(String sGoodsDesc) {
		s_goods_desc = sGoodsDesc;
	}
	public BigDecimal getS_goods_price() {
		return s_goods_price;
	}
	public void setS_goods_price(BigDecimal sGoodsPrice) {
		s_goods_price = sGoodsPrice;
	}
	public String getS_goods_pic() {
		return s_goods_pic;
	}
	public void setS_goods_pic(String sGoodsPic) {
		s_goods_pic = sGoodsPic;
	}
	public String getS_goods_detal() {
		return s_goods_detal;
	}
	public void setS_goods_detal(String sGoodsDetal) {
		s_goods_detal = sGoodsDetal;
	}
	
	
}
