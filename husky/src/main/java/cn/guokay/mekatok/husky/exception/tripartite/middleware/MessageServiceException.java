package cn.guokay.mekatok.husky.exception.tripartite.middleware;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 消息 服务异常
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "C0120", message = "Message service exception")
public class MessageServiceException extends MiddlewareException{

    public MessageServiceException() {
    }

    public MessageServiceException(String message) {
        super(message);
    }

    public MessageServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public MessageServiceException(Throwable cause) {
        super(cause);
    }

    public MessageServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
