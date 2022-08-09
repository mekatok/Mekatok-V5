package cn.guokay.mekatok.husky.exception.consumer.authority;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 无权限访问 API
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0312", message = "No access to API")
public class ApiUnauthorizedException extends RejectPrivacyException{

    public ApiUnauthorizedException() {
    }

    public ApiUnauthorizedException(String message) {
        super(message);
    }

    public ApiUnauthorizedException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApiUnauthorizedException(Throwable cause) {
        super(cause);
    }

    public ApiUnauthorizedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
