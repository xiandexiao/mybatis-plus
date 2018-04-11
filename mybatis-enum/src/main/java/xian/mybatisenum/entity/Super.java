/*
 * Copyright (c) 2018, 成都中联信通科技股份有限公司
 */
package xian.mybatisenum.entity;

import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;

/**
 * @author xian
 * @date 2018/4/11 9:38
 */
public class Super<T extends Model> extends Model<T> {
	private Integer id;
	
	public Integer getId () {
		return id;
	}
	
	public void setId (Integer id) {
		this.id = id;
	}
	
	@Override
	protected Serializable pkVal () {
		return this.id;
	}
}
