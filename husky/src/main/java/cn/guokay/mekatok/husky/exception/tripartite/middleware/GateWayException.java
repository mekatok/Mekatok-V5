package cn.guokay.mekatok.husky.exception.tripartite.middleware;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 网关 服务出错
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "C0154", message = "GateWay service error")
public class GateWayException extends NetworkServiceException{

    public GateWayException() {
    }

    public GateWayException(String message) {
        super(message);
    }

    public GateWayException(String message, Throwable cause) {
        super(message, cause);
    }

    public GateWayException(Throwable cause) {
        super(cause);
    }

    public GateWayException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
