package cn.guokay.mekatok.husky.exception.consumer.authority;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 消费者RSA签名异常
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0341", message = "Consumer signature error")
public class SignatureRsaException extends SignatureException{

    public SignatureRsaException() {
    }

    public SignatureRsaException(String message) {
        super(message);
    }

    public SignatureRsaException(String message, Throwable cause) {
        super(message, cause);
    }

    public SignatureRsaException(Throwable cause) {
        super(cause);
    }

    public SignatureRsaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
