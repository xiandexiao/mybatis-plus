package xian.mybatisenum.entity.enums;

import com.baomidou.mybatisplus.enums.IEnum;

import java.io.Serializable;

public enum UserStatus implements IEnum {
	
	LOCKED(0,"禁止登录"),NORMAL(1,"账号正常");
	
	UserStatus (int value, String desc) {
		this.value = value;
		this.desc = desc;
	}
	
	private int value;
	
	private String desc;
	
	public void setValue (int value) {
		this.value = value;
	}
	
	public String getDesc () {
		return desc;
	}
	
	public void setDesc (String desc) {
		this.desc = desc;
	}
	
	@Override
	public Serializable getValue () {
		return this;
	}
	
	@Override
	public String toString () {
		return "UserStatus{" +
				"value=" + value +
				", desc='" + desc + '\'' +
				'}';
	}
}
