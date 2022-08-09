package cn.guokay.mekatok.husky.exception.consumer.register;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 用户名中包含违禁敏感词
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0112", message = "Username contains prohibited sensitive words")
public class UsernameSensitiveException extends UsernameException {

    public UsernameSensitiveException() {
    }

    public UsernameSensitiveException(String message) {
        super(message);
    }

    public UsernameSensitiveException(String message, Throwable cause) {
        super(message, cause);
    }

    public UsernameSensitiveException(Throwable cause) {
        super(cause);
    }

    public UsernameSensitiveException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
