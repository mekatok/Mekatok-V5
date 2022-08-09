package cn.guokay.mekatok.husky.exception.tripartite.middleware;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * RPC 服务异常
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "C0110", message = "RPC service exception")
public class RpcServiceException extends MiddlewareException{

    public RpcServiceException() {
    }

    public RpcServiceException(String message) {
        super(message);
    }

    public RpcServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public RpcServiceException(Throwable cause) {
        super(cause);
    }

    public RpcServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
