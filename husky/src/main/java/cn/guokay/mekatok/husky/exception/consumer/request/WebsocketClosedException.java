package cn.guokay.mekatok.husky.exception.consumer.request;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * Websocket 连接关闭
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0505", message = "Websocket connection closed")
public class WebsocketClosedException extends RequestException{

    public WebsocketClosedException() {
    }

    public WebsocketClosedException(String message) {
        super(message);
    }

    public WebsocketClosedException(String message, Throwable cause) {
        super(message, cause);
    }

    public WebsocketClosedException(Throwable cause) {
        super(cause);
    }

    public WebsocketClosedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
