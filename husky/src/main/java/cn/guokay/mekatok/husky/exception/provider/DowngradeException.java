package cn.guokay.mekatok.husky.exception.provider;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 降级策略被触发
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "B0220", message = "The downgrade strategy is triggered")
public class DowngradeException extends HedgingException{

    public DowngradeException() {
    }

    public DowngradeException(String message) {
        super(message);
    }

    public DowngradeException(String message, Throwable cause) {
        super(message, cause);
    }

    public DowngradeException(Throwable cause) {
        super(cause);
    }

    public DowngradeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
