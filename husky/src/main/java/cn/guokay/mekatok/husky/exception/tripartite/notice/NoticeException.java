package cn.guokay.mekatok.husky.exception.tripartite.notice;

import cn.guokay.mekatok.husky.exception.Exception;
import cn.guokay.mekatok.husky.exception.tripartite.TripartiteException;

/**
 * 第三方通知服务出错
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "C0500", message = "Error in third-party notification service")
public class NoticeException extends TripartiteException {

    public NoticeException() {
    }

    public NoticeException(String message) {
        super(message);
    }

    public NoticeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoticeException(Throwable cause) {
        super(cause);
    }

    public NoticeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
