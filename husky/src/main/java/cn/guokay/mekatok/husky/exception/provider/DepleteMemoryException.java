package cn.guokay.mekatok.husky.exception.provider;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 内存资源消耗殆尽
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "B0312", message = "memory resources exhausted")
public class DepleteMemoryException extends DepleteException{

    public DepleteMemoryException() {
    }

    public DepleteMemoryException(String message) {
        super(message);
    }

    public DepleteMemoryException(String message, Throwable cause) {
        super(message, cause);
    }

    public DepleteMemoryException(Throwable cause) {
        super(cause);
    }

    public DepleteMemoryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
