package cn.guokay.mekatok.husky.exception.consumer.params;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 时间不在服务范围内
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0423", message = "Time out of service")
public class PeriodException extends ScopeException{

    public PeriodException() {
    }

    public PeriodException(String message) {
        super(message);
    }

    public PeriodException(String message, Throwable cause) {
        super(message, cause);
    }

    public PeriodException(Throwable cause) {
        super(cause);
    }

    public PeriodException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
