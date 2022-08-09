package cn.guokay.mekatok.husky.exception.consumer.params;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 用户操作异常
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0440", message = "User operation is abnormal")
public class OperateException extends ParamsException{

    public OperateException() {
    }

    public OperateException(String message) {
        super(message);
    }

    public OperateException(String message, Throwable cause) {
        super(message, cause);
    }

    public OperateException(Throwable cause) {
        super(cause);
    }

    public OperateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
