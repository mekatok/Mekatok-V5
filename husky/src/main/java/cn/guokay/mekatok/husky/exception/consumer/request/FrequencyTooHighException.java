package cn.guokay.mekatok.husky.exception.consumer.request;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 请求次数超过限制
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0501",message = "The number of requests exceeded the limit")
public class FrequencyTooHighException extends RequestException{

    public FrequencyTooHighException() {
    }

    public FrequencyTooHighException(String message) {
        super(message);
    }

    public FrequencyTooHighException(String message, Throwable cause) {
        super(message, cause);
    }

    public FrequencyTooHighException(Throwable cause) {
        super(cause);
    }

    public FrequencyTooHighException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
