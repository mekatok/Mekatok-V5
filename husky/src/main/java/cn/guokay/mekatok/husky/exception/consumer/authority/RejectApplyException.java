package cn.guokay.mekatok.husky.exception.consumer.authority;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 权限申请被拒绝
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0303", message = "Permission request denied")
public class RejectApplyException extends AuthorityException{

    public RejectApplyException() {
    }

    public RejectApplyException(String message) {
        super(message);
    }

    public RejectApplyException(String message, Throwable cause) {
        super(message, cause);
    }

    public RejectApplyException(Throwable cause) {
        super(cause);
    }

    public RejectApplyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
