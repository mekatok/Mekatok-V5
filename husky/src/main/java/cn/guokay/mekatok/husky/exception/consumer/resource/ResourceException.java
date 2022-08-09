package cn.guokay.mekatok.husky.exception.consumer.resource;

import cn.guokay.mekatok.husky.exception.Exception;
import cn.guokay.mekatok.husky.exception.consumer.ConsumerException;

/**
 * 用户资源错误
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0600", message = "User resource error")
public class ResourceException extends ConsumerException {

    public ResourceException() {
    }

    public ResourceException(String message) {
        super(message);
    }

    public ResourceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ResourceException(Throwable cause) {
        super(cause);
    }

    public ResourceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
