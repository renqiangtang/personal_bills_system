package com.bill.common;


/**
 * 结果集实体类
 * Created by sky on 2018/7/9.
 */
public class Result {
	private int code;

	private String message;

	private Object data;

	public Result(int code,String message,Object data){
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public static Result success(){
		return new Result(Constants.REQUEST_SUCCESS,Constants.SUCCESS,"");
	}

	public static Result failed(){
		return new Result(Constants.REQUEST_FAILED,Constants.FAILED,"");
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
