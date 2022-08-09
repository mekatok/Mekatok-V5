package cn.guokay.mekatok.husky.exception.consumer.resource;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 用户OOS空间不足
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0601", message = "User OOS space is insufficient")
public class SpaceInsufficientException extends ResourceException {

    public SpaceInsufficientException() {
    }

    public SpaceInsufficientException(String message) {
        super(message);
    }

    public SpaceInsufficientException(String message, Throwable cause) {
        super(message, cause);
    }

    public SpaceInsufficientException(Throwable cause) {
        super(cause);
    }

    public SpaceInsufficientException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
