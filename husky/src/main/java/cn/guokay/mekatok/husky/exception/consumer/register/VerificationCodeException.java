package cn.guokay.mekatok.husky.exception.consumer.register;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 验证码校验失败
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0130", message = "Verification code verification failed")
public class VerificationCodeException extends RegisterException{

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
