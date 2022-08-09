package cn.guokay.mekatok.husky.exception.consumer.params;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 包含恶意跳转链接
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0401", message = "Contains malicious jump links")
public class LinkException extends ParamsException {

    public LinkException() {
    }

    public LinkException(String message) {
        super(message);
    }

    public LinkException(String message, Throwable cause) {
        super(message, cause);
    }

    public LinkException(Throwable cause) {
        super(cause);
    }

    public LinkException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
