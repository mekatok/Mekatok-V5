package cn.guokay.mekatok.husky.exception.tripartite.hedging;

import cn.guokay.mekatok.husky.exception.Exception;
import cn.guokay.mekatok.husky.exception.tripartite.TripartiteException;

/**
 * 第三方容灾策略被触发
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "C0400", message = "A third-party disaster recovery strategy is triggered")
public class HedgingException extends TripartiteException {

    public HedgingException() {
    }

    public HedgingException(String message) {
        super(message);
    }

    public HedgingException(String message, Throwable cause) {
        super(message, cause);
    }

    public HedgingException(Throwable cause) {
        super(cause);
    }

    public HedgingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
