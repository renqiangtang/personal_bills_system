package com.bill.entity.bill;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 收入支出实体类
 * Created by sky on 2018/7/9.
 */
@Entity
public class IncomePayment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@NotNull
	private BigDecimal money;

	@NotNull
	@Length(min = 1,max = 2)
	private Integer type;//收入支出类型

	@Length(min = 0,max = 255)
	private String description;

	@NotNull
	private Date createTime;

	@NotNull
	private  Date modifyTime;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
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
		return "IncomePayment{" +
				"id=" + id +
				", money=" + money +
				", type=" + type +
				", description='" + description + '\'' +
				", createTime=" + createTime +
				", modifyTime=" + modifyTime +
				'}';
	}
}
