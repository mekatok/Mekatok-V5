package cn.guokay.mekatok.husky.exception.consumer.params;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 地址不在服务范围内
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0422", message = "The address is not within the service range")
public class AddressException extends ScopeException{

    public AddressException() {
    }

    public AddressException(String message) {
        super(message);
    }

    public AddressException(String message, Throwable cause) {
        super(message, cause);
    }

    public AddressException(Throwable cause) {
        super(cause);
    }

    public AddressException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
