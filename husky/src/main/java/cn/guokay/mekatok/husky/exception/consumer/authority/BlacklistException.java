package cn.guokay.mekatok.husky.exception.consumer.authority;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 黑名单用户
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0321", message = "blacklist consumers")
public class BlacklistException extends InterceptException{

    public BlacklistException() {
    }

    public BlacklistException(String message) {
        super(message);
    }

    public BlacklistException(String message, Throwable cause) {
        super(message, cause);
    }

    public BlacklistException(Throwable cause) {
        super(cause);
    }

    public BlacklistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
