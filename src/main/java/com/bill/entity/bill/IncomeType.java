package com.bill.entity.bill;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 收入支出类型实体类
 * Created by sky on 2018/7/9.
 */
@Entity
public class IncomeType {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;

	private String name;

	@NotNull
	@Length(min = 1,max = 2)
	private Integer type;

	@Length(min = 0,max = 100)
	private String description;

	@NotNull
	private Date createTime;

	@NotNull

	private Date modifyTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	@Override
	public String toString() {
		return "IncomeType{" +
				"id=" + id +
				", name='" + name + '\'' +
				", type=" + type +
				", description='" + description + '\'' +
				", createTime=" + createTime +
				", modifyTime=" + modifyTime +
				'}';
	}
}
