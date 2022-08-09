package cn.guokay.mekatok.husky.exception.consumer.request;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * Websocket 连接异常
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0504", message = "Websocket connection exception")
public class WebsocketException extends RequestException{

    public WebsocketException() {
    }

    public WebsocketException(String message) {
        super(message);
    }

    public WebsocketException(String message, Throwable cause) {
        super(message, cause);
    }

    public WebsocketException(Throwable cause) {
        super(cause);
    }

    public WebsocketException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
