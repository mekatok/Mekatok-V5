package cn.guokay.mekatok.husky.exception.consumer.register;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 军官证校验失败
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0144", message = "Military ID verification failed")
public class MilitaryIdException extends CredentialsException{

    public MilitaryIdException() {
    }

    public MilitaryIdException(String message) {
        super(message);
    }

    public MilitaryIdException(String message, Throwable cause) {
        super(message, cause);
    }

    public MilitaryIdException(Throwable cause) {
        super(cause);
    }

    public MilitaryIdException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
