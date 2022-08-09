package cn.guokay.mekatok.husky.exception.tripartite.middleware;

import cn.guokay.mekatok.husky.exception.Exception;
import cn.guokay.mekatok.husky.exception.tripartite.TripartiteException;

/**
 * 中间件服务出错
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "C0100", message = "middleware service error")
public class MiddlewareException extends TripartiteException {

    public MiddlewareException() {
    }

    public MiddlewareException(String message) {
        super(message);
    }

    public MiddlewareException(String message, Throwable cause) {
        super(message, cause);
    }

    public MiddlewareException(Throwable cause) {
        super(cause);
    }

    public MiddlewareException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
