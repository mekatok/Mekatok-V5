package cn.guokay.mekatok.husky.exception.tripartite.middleware;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 消息消费出错
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "C0122", message = "message consume error")
public class MessageConsumeException extends MessageServiceException{

    public MessageConsumeException() {
    }

    public MessageConsumeException(String message) {
        super(message);
    }

    public MessageConsumeException(String message, Throwable cause) {
        super(message, cause);
    }

    public MessageConsumeException(Throwable cause) {
        super(cause);
    }

    public MessageConsumeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
