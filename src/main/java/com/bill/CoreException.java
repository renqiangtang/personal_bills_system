package com.bill;

import com.bill.common.Constants;
import com.bill.common.Result;
import org.springframework.beans.InvalidPropertyException;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.support.MissingServletRequestPartException;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  核心异常处理类
 * Created by sky on 2018/7/10.
 */
public class CoreException extends Exception {

	private Integer code;
	private String message;
	/**
	 * 用于传入参数validate错误
	 */
	private Map<String, String> map = new HashMap<String, String>();

	public CoreException(){}

	public CoreException(Integer code,String message){
		this.code = code;
		this.message = message;
	}


	public static Result handle(CoreException e) {
		if (e.map != null && e.map.size() > 0) {
			// Form表单的Errors形式
			return new Result(e.code, e.message,"");
		}

		//非表单异常
		String message = "";
		int code = Integer.valueOf(e.code);
		return new Result(code, e.getMessage(),"");
	}


	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Result handle(HttpServletRequest req, Exception ex) throws Exception {
		if (ex instanceof CoreException) {
			ex.printStackTrace();
			return CoreException.handle((CoreException) ex);
		} else if (ex instanceof NoHandlerFoundException) {
			ex.printStackTrace();
			return buildResult(HttpServletResponse.SC_NOT_FOUND, "Not Found");
		} else if (ex instanceof HttpRequestMethodNotSupportedException) {
			ex.printStackTrace();
			return buildResult(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "Method Not Allowed");
		} else if (ex instanceof HttpMediaTypeNotSupportedException) {
			ex.printStackTrace();
			return buildResult(HttpServletResponse.SC_UNSUPPORTED_MEDIA_TYPE, "Unsupported Media Type");
		} else if (ex instanceof HttpMediaTypeNotAcceptableException) {
			return buildResult(HttpServletResponse.SC_NOT_ACCEPTABLE, "Not Acceptable");
		} else if (ex instanceof MissingServletRequestParameterException
				|| ex instanceof ServletRequestBindingException
				|| ex instanceof TypeMismatchException
				|| ex instanceof HttpMessageNotReadableException
				|| ex instanceof MethodArgumentNotValidException
				|| ex instanceof MissingServletRequestPartException
				|| ex instanceof InvalidPropertyException) {
			ex.printStackTrace();
			return buildResult(HttpServletResponse.SC_BAD_REQUEST, "Bad Request");
		} else if(ex instanceof BindException){
			List<FieldError> fieldErrorList = ((BindException) ex).getFieldErrors();
			StringBuffer errorMsg = new StringBuffer();
			fieldErrorList.forEach(fieldError -> {
				errorMsg.append(fieldError.getField()+fieldError.getDefaultMessage()+",");
			});

			return buildResult(Constants.REQUEST_PARAMETER_INVALID,errorMsg.toString());
		}else {
			ex.printStackTrace();
			return buildResult(-1,"请求失败");
		}
	}
	private Result buildResult(int code, String message) {
		return new Result(Constants.REQUEST_FAILED , message,"");
	}


	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}
}
