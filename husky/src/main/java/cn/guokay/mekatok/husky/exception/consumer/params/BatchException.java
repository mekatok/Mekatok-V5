package cn.guokay.mekatok.husky.exception.consumer.params;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 请求批量操作的个数允许范围
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0426", message = "The allowable range of the number of requested batch operations")
public class BatchException extends ScopeException{

    public BatchException() {
    }

    public BatchException(String message) {
        super(message);
    }

    public BatchException(String message, Throwable cause) {
        super(message, cause);
    }

    public BatchException(Throwable cause) {
        super(cause);
    }

    public BatchException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
