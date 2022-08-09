package cn.guokay.mekatok.husky.exception.consumer.login;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 账户指纹校验失败
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0221", message = "Account fingerprint verification failed")
public class FingerprintException extends IdentityException{

    public FingerprintException() {
    }

    public FingerprintException(String message) {
        super(message);
    }

    public FingerprintException(String message, Throwable cause) {
        super(message, cause);
    }

    public FingerprintException(Throwable cause) {
        super(cause);
    }

    public FingerprintException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
