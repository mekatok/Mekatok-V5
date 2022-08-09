package cn.guokay.mekatok.husky.exception.tripartite.middleware;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * DOS 服务出错
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "C0153", message = "DOS service error")
public class DosException extends NetworkServiceException{

    public DosException() {
    }

    public DosException(String message) {
        super(message);
    }

    public DosException(String message, Throwable cause) {
        super(message, cause);
    }

    public DosException(Throwable cause) {
        super(cause);
    }

    public DosException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
