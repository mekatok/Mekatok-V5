package cn.guokay.mekatok.husky.exception.consumer.authority;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 地域黑名单
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0325", message = "Regional blacklist")
public class RegionalException extends InterceptException{

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
