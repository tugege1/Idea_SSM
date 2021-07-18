package com.zhongke.common.restful;

public enum ApplicationResponseCode implements ResponseCode {

    SUCCEEDED("000", "OK"),
    FAILED("999","FAILED"),

    TOKEN_EXPIRE("G001","会话已失效，请重新登录！"),
    TOKEN_REFRESH_FAILED("G002","会话刷新失败，请重新登录！"),
    URL_CHECK("G003","您无请求此地址权限，请联系权限管理员"),

    RECORD_EXISTED("101", "此编码已被占用！请更换"),
    USER_OLD_PASSWORD("102","原密码不正确"),
    USER_NOT_PASSWORD("103","密码不能为空"),
    USER_OR_PASSWORD_ERROR("111","用户名或者密码错误"),
    USER_IS_NOT_ENABLED("112","用户已被禁用"),

    LOGIN_OUT_SUCCESS("800","退出成功"),
    LOGIN_OUT_FAILED("801","退出失败");

    private String code;
    private String value;

    ApplicationResponseCode(String code, String value) {
        this.code = code;
        this.value = value;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getValue() {
        return value;
    }
}
