package cn.guokay.mekatok.husky.exception.consumer.authority;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 访问对象隐私设置被拒绝
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0310", message = "Access to Object Privacy Device Denied")
public class RejectPrivacyException extends AuthorityException{

    public RejectPrivacyException() {
    }

    public RejectPrivacyException(String message) {
        super(message);
    }

    public RejectPrivacyException(String message, Throwable cause) {
        super(message, cause);
    }

    public RejectPrivacyException(Throwable cause) {
        super(cause);
    }

    public RejectPrivacyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
