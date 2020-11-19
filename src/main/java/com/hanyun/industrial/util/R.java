package com.hanyun.industrial.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.http.HttpStatus;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;

@Data
@NoArgsConstructor
public class R<T> {
    @ApiModelProperty(value = "处理结果code", required = true)
    private int status;
    @ApiModelProperty(value = "处理结果描述信息")
    private String msg;
    @ApiModelProperty(value = "处理结果数据信息")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T result;

    /**
     * 内部使用，用于构造成功的结果
     *
     * @param status
     * @param msg
     * @param result
     */
    private R(int status, String msg, T result) {
        this.status = status;
        this.msg = msg;
        this.result = result;
    }

    /**
     * 内部使用，用于构造成功的结果
     *
     * @param status
     * @param msg
     */
    private R(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public static <T> R<T> ok(T data) {
        return new R(HttpStatus.SC_OK, null, data);
    }

    public static <T> R<T> success(String msg, T data) {
        return new R(HttpStatus.SC_OK, msg, data);
    }
    public static <T> R<T> success(String msg) {
        return new R(HttpStatus.SC_OK, msg);
    }

    public static <T> R<T> error401(String msg, T data) {
        return new R(HttpStatus.SC_UNAUTHORIZED, msg, data);
    }

    public static <T> R<T> error401(String msg) {
        return new R(HttpStatus.SC_UNAUTHORIZED, msg);
    }

    public static <T> R<T> error403(String msg, T data) {
        return new R(HttpStatus.SC_FORBIDDEN, msg, data);
    }

    public static <T> R<T> error403(String msg) {
        return new R(HttpStatus.SC_FORBIDDEN, msg);
    }

    public static <T> R<T> error404(String msg, T data) {
        return new R(HttpStatus.SC_NOT_FOUND, msg, data);
    }

    public static <T> R<T> error404(String msg) {
        return new R(HttpStatus.SC_NOT_FOUND, msg);
    }

    public static <T> R<T> error500(String msg, T data) {
        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
        response.setStatus(HttpStatus.SC_INTERNAL_SERVER_ERROR);
        return new R(HttpStatus.SC_INTERNAL_SERVER_ERROR, msg, data);
    }
    public static <T> R<T> error500(String msg) {
        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
        response.setStatus(HttpStatus.SC_INTERNAL_SERVER_ERROR);
        return new R(HttpStatus.SC_INTERNAL_SERVER_ERROR, msg);
    }

    public static <T> R<T> error400(String msg, T data) {
        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
        response.setStatus(HttpStatus.SC_BAD_REQUEST);
        return new R(HttpStatus.SC_BAD_REQUEST, msg, data);
    }
    public static <T> R<T> error400(String msg) {
        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
        response.setStatus(HttpStatus.SC_BAD_REQUEST);
        return new R(HttpStatus.SC_BAD_REQUEST, msg);
    }

    public static <T> R<T> error(int code, String msg, T data) {
        return new R(code, msg, data);
    }
    public static <T> R<T> error(int code, String msg) {
        return new R(code, msg);
    }
}
