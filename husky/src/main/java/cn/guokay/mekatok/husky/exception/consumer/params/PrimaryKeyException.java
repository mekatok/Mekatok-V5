package cn.guokay.mekatok.husky.exception.consumer.params;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 主键字段不得为空
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0411", message = "Primary key field must not be empty")
public class PrimaryKeyException extends RequiredException{

    public PrimaryKeyException() {
    }

    public PrimaryKeyException(String message) {
        super(message);
    }

    public PrimaryKeyException(String message, Throwable cause) {
        super(message, cause);
    }

    public PrimaryKeyException(Throwable cause) {
        super(cause);
    }

    public PrimaryKeyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
