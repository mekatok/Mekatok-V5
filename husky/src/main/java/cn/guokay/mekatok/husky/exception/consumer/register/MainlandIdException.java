package cn.guokay.mekatok.husky.exception.consumer.register;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 大陆身份证校验异常
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0142", message = "Mainland ID card verification is abnormal")
public class MainlandIdException extends CredentialsException{

    public MainlandIdException() {
    }

    public MainlandIdException(String message) {
        super(message);
    }

    public MainlandIdException(String message, Throwable cause) {
        super(message, cause);
    }

    public MainlandIdException(Throwable cause) {
        super(cause);
    }

    public MainlandIdException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
