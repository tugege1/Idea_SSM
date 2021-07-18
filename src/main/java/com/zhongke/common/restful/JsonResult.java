package com.zhongke.common.restful;


public class JsonResult {

    private String resultCode;
    private String resultMessage;
    private Object content;

    private boolean success = false;

    public JsonResult() {
    }

    public JsonResult(String resultCode, String resultMessage) {
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
    }

    public JsonResult(String resultCode, String resultMessage, Object content) {
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
        this.content = content;
    }
    public static JsonResult buildSuccessResult(){
        return buildSuccessResult("success");
    }

    public static JsonResult buildSuccessResult(Object object){
        JsonResult result = new JsonResult();
        result.setSuccess(true);
        result.setResultCode(ApplicationResponseCode.SUCCEEDED.getCode());
        result.setResultMessage(ApplicationResponseCode.SUCCEEDED.getValue());
        // 不向前端返回空的对象
        result.setContent(null == object ? "success" : object);
        return result;
    }

    public static JsonResult buildDefaultErrorResponse(ApplicationResponseCode applicationResponseCode){
        return buildErrorResponse(applicationResponseCode, applicationResponseCode.getValue());
    }
    public static JsonResult buildErrorResponse(ApplicationResponseCode applicationResponseCode, Object object){
        JsonResult result = new JsonResult();
        result.setSuccess(false);
        result.setResultCode(applicationResponseCode.getCode());
        result.setResultMessage(applicationResponseCode.getValue());
        // 不向前端返回空的对象
        result.setContent(null == object ? "fail" : object);
        return result;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
