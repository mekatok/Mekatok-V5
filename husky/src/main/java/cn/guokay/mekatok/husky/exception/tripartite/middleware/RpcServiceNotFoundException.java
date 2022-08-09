package cn.guokay.mekatok.husky.exception.tripartite.middleware;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * RPC 服务未找到
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "C0111", message = "RPC service not found")
public class RpcServiceNotFoundException extends RpcServiceException{

    public RpcServiceNotFoundException() {
    }

    public RpcServiceNotFoundException(String message) {
        super(message);
    }

    public RpcServiceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public RpcServiceNotFoundException(Throwable cause) {
        super(cause);
    }

    public RpcServiceNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
