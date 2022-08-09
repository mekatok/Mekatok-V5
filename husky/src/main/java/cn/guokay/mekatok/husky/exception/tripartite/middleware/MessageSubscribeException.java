package cn.guokay.mekatok.husky.exception.tripartite.middleware;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 消息订阅出错
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "C0123", message = "message subscribe error")
public class MessageSubscribeException extends MessageServiceException{

    public MessageSubscribeException() {
    }

    public MessageSubscribeException(String message) {
        super(message);
    }

    public MessageSubscribeException(String message, Throwable cause) {
        super(message, cause);
    }

    public MessageSubscribeException(Throwable cause) {
        super(cause);
    }

    public MessageSubscribeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
