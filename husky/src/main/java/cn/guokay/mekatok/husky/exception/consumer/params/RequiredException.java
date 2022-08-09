package cn.guokay.mekatok.husky.exception.consumer.params;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 请求参数必填项为空
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0410", message = "Request parameter required field is empty")
public class RequiredException extends ParamsException{

    public RequiredException() {
    }

    public RequiredException(String message) {
        super(message);
    }

    public RequiredException(String message, Throwable cause) {
        super(message, cause);
    }

    public RequiredException(Throwable cause) {
        super(cause);
    }

    public RequiredException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
