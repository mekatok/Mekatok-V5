package cn.guokay.mekatok.husky.exception.consumer.authority;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 用户访问被拦截
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0320", message = "Consumer access is blocked")
public class InterceptException extends AuthorityException{

    public InterceptException() {
    }

    public InterceptException(String message) {
        super(message);
    }

    public InterceptException(String message, Throwable cause) {
        super(message, cause);
    }

    public InterceptException(Throwable cause) {
        super(cause);
    }

    public InterceptException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
