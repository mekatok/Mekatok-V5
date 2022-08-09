package cn.guokay.mekatok.husky.exception.consumer.register;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 注册国家或地区受限
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0102", message = "Registration country or region restricted")
public class RegionalException extends RegisterException{

    public RegionalException() {
    }

    public RegionalException(String message) {
        super(message);
    }

    public RegionalException(String message, Throwable cause) {
        super(message, cause);
    }

    public RegionalException(Throwable cause) {
        super(cause);
    }

    public RegionalException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
