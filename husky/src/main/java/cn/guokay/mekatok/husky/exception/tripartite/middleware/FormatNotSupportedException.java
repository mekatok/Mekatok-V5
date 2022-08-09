package cn.guokay.mekatok.husky.exception.tripartite.middleware;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 不支持的数据格式
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "C0134", message = "unsupported data format")
public class FormatNotSupportedException extends CacheServiceException{

    public FormatNotSupportedException() {
    }

    public FormatNotSupportedException(String message) {
        super(message);
    }

    public FormatNotSupportedException(String message, Throwable cause) {
        super(message, cause);
    }

    public FormatNotSupportedException(Throwable cause) {
        super(cause);
    }

    public FormatNotSupportedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
