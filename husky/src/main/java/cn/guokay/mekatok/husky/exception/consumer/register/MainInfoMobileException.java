package cn.guokay.mekatok.husky.exception.consumer.register;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 手机校验异常
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0151", message = "Abnormal mobile phone verification")
public class MainInfoMobileException extends MainInfoException{

    public MainInfoMobileException() {
    }

    public MainInfoMobileException(String message) {
        super(message);
    }

    public MainInfoMobileException(String message, Throwable cause) {
        super(message, cause);
    }

    public MainInfoMobileException(Throwable cause) {
        super(cause);
    }

    public MainInfoMobileException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
