package cn.guokay.mekatok.husky.exception.tripartite.middleware;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 消息投递出错
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "C0121", message = "message delivery error")
public class MessageDeliveryException extends MessageServiceException{

    public MessageDeliveryException() {
    }

    public MessageDeliveryException(String message) {
        super(message);
    }

    public MessageDeliveryException(String message, Throwable cause) {
        super(message, cause);
    }

    public MessageDeliveryException(Throwable cause) {
        super(cause);
    }

    public MessageDeliveryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
