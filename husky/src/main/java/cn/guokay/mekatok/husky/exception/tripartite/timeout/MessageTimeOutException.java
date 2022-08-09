package cn.guokay.mekatok.husky.exception.tripartite.timeout;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 消息投递超时
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "C0220", message = "message delivery timeout")
public class MessageTimeOutException extends TimeOutException{

    public MessageTimeOutException() {
    }

    public MessageTimeOutException(String message) {
        super(message);
    }

    public MessageTimeOutException(String message, Throwable cause) {
        super(message, cause);
    }

    public MessageTimeOutException(Throwable cause) {
        super(cause);
    }

    public MessageTimeOutException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
