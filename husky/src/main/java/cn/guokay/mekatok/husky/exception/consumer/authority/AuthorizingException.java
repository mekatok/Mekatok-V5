package cn.guokay.mekatok.husky.exception.consumer.authority;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 消费者正在授权中
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0302", message = "Access is being authorized")
public class AuthorizingException extends AuthorityException{

    public AuthorizingException() {
    }

    public AuthorizingException(String message) {
        super(message);
    }

    public AuthorizingException(String message, Throwable cause) {
        super(message, cause);
    }

    public AuthorizingException(Throwable cause) {
        super(cause);
    }

    public AuthorizingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
