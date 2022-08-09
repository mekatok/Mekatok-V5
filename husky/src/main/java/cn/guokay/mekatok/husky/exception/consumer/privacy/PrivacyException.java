package cn.guokay.mekatok.husky.exception.consumer.privacy;

import cn.guokay.mekatok.husky.exception.Exception;
import cn.guokay.mekatok.husky.exception.consumer.ConsumerException;

/**
 * 用户隐私未授权
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0900", message = "User Privacy Unauthorized")
public class PrivacyException extends ConsumerException {

    public PrivacyException() {
    }

    public PrivacyException(String message) {
        super(message);
    }

    public PrivacyException(String message, Throwable cause) {
        super(message, cause);
    }

    public PrivacyException(Throwable cause) {
        super(cause);
    }

    public PrivacyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
