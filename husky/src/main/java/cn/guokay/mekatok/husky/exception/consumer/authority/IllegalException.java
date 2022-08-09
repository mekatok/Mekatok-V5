package cn.guokay.mekatok.husky.exception.consumer.authority;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 非法的IP地址
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0323", message = "illegal IP address")
public class IllegalException extends InterceptException{

    public IllegalException() {
    }

    public IllegalException(String message) {
        super(message);
    }

    public IllegalException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalException(Throwable cause) {
        super(cause);
    }

    public IllegalException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
