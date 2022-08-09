package cn.guokay.mekatok.husky.exception.tripartite.middleware;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * RPC 服务未注册
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "C0112", message = "RPC service not register")
public class RpcServiceNotRegisterException extends RpcServiceException{

    public RpcServiceNotRegisterException() {
    }

    public RpcServiceNotRegisterException(String message) {
        super(message);
    }

    public RpcServiceNotRegisterException(String message, Throwable cause) {
        super(message, cause);
    }

    public RpcServiceNotRegisterException(Throwable cause) {
        super(cause);
    }

    public RpcServiceNotRegisterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
