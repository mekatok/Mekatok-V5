package cn.guokay.mekatok.husky.exception.consumer.version;

import cn.guokay.mekatok.husky.exception.Exception;
import cn.guokay.mekatok.husky.exception.consumer.ConsumerException;

/**
 * 用户版本错误
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0800", message = "wrong user version")
public class VersionException extends ConsumerException {

    public VersionException() {
    }

    public VersionException(String message) {
        super(message);
    }

    public VersionException(String message, Throwable cause) {
        super(message, cause);
    }

    public VersionException(Throwable cause) {
        super(cause);
    }

    public VersionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
