package cn.guokay.mekatok.husky.exception.consumer.version;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 用户请求API版本过高
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0802", message = "User request API version is too high")
public class VersionTooHighException extends VersionException{

    public VersionTooHighException() {
    }

    public VersionTooHighException(String message) {
        super(message);
    }

    public VersionTooHighException(String message, Throwable cause) {
        super(message, cause);
    }

    public VersionTooHighException(Throwable cause) {
        super(cause);
    }

    public VersionTooHighException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
