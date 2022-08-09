package cn.guokay.mekatok.husky.exception.provider;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 系统执行超时
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "B0100", message = "System execution timed out")
public class TimeOutException extends ProviderException{

    public TimeOutException() {
    }

    public TimeOutException(String message) {
        super(message);
    }

    public TimeOutException(String message, Throwable cause) {
        super(message, cause);
    }

    public TimeOutException(Throwable cause) {
        super(cause);
    }

    public TimeOutException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
