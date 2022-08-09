package cn.guokay.mekatok.husky.exception.consumer.register;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 用户证件未选择
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0141", message = "User ID not selected")
public class CredentialsNotSelectedException extends CredentialsException{

    public CredentialsNotSelectedException() {
    }

    public CredentialsNotSelectedException(String message) {
        super(message);
    }

    public CredentialsNotSelectedException(String message, Throwable cause) {
        super(message, cause);
    }

    public CredentialsNotSelectedException(Throwable cause) {
        super(cause);
    }

    public CredentialsNotSelectedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
