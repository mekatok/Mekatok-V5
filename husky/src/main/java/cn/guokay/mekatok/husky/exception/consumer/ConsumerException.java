package cn.guokay.mekatok.husky.exception.consumer;

import cn.guokay.mekatok.husky.exception.Exception;
import cn.guokay.mekatok.husky.exception.PlatformException;

/**
 * 消费者 主异常
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0001", message = "consumer error")
public class ConsumerException extends PlatformException {

    public ConsumerException() {
    }

    public ConsumerException(String message) {
        super(message);
    }

    public ConsumerException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConsumerException(Throwable cause) {
        super(cause);
    }

    public ConsumerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
