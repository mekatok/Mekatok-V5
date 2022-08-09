package cn.guokay.mekatok.husky.exception.consumer.login;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 账户验证码错误
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0240", message = "Account verification code error")
public class VerificationCodeException extends LoginException{

    public VerificationCodeException() {
    }

    public VerificationCodeException(String message) {
        super(message);
    }

    public VerificationCodeException(String message, Throwable cause) {
        super(message, cause);
    }

    public VerificationCodeException(Throwable cause) {
        super(cause);
    }

    public VerificationCodeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
