package cn.guokay.mekatok.husky.exception.consumer.register;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 邮件验证码校验失败
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0132", message = "Mail verification code verification failed")
public class VerificationMailException extends VerificationCodeException {

    public VerificationMailException() {
    }

    public VerificationMailException(String message) {
        super(message);
    }

    public VerificationMailException(String message, Throwable cause) {
        super(message, cause);
    }

    public VerificationMailException(Throwable cause) {
        super(cause);
    }

    public VerificationMailException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
