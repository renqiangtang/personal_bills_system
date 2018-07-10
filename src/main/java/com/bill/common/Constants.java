package com.bill.common;

/**
 * 常量类
 * Created by sky on 2018/7/9.
 */
public class Constants {

	public static final String  SUCCESS = "SUCCESS";

	public static final String  FAILED = "FAILED";

	/**
	 * 请求成功
	 */
	public final static Integer REQUEST_SUCCESS = 0;

	/**
	 * 请求失败
	 */
	public final static Integer REQUEST_FAILED = -1;

	/**
	 * 请求失败
	 */
	public final static Integer REQUEST_PARAMETER_INVALID = -1001;

	/**
	 * 请求未查询到记录
	 */
	public final static Integer REQUEST_GET_NO_RESULT = 908;

	/**
	 * 刪除未查询到记录
	 */
	public final static Integer REQUEST_DEL_NO_RESULT = 910;


	/**
	 * 日期格式化年月日
	 */
	public final static String YYYY_MM_DD = "yyyy-MM-dd";

	/**
	 * 日期格式化年月日时分秒
	 */
	public final static String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

	/**
	 * 日期格式化年月日时分秒
	 */
	public final static String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";

}
