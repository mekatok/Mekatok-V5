package cn.guokay.mekatok.husky.exception.consumer.authority;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 授权已过期
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0311", message = "Authorization has expired")
public class AuthorityExpiredException extends RejectPrivacyException{

    public AuthorityExpiredException() {
    }

    public AuthorityExpiredException(String message) {
        super(message);
    }

    public AuthorityExpiredException(String message, Throwable cause) {
        super(message, cause);
    }

    public AuthorityExpiredException(Throwable cause) {
        super(cause);
    }

    public AuthorityExpiredException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
