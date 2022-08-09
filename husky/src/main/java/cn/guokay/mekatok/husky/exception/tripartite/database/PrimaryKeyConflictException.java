package cn.guokay.mekatok.husky.exception.tripartite.database;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 主键冲突
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "C0341", message = "primary key conflict")
public class PrimaryKeyConflictException extends DatabaseException{

    public PrimaryKeyConflictException() {
    }

    public PrimaryKeyConflictException(String message) {
        super(message);
    }

    public PrimaryKeyConflictException(String message, Throwable cause) {
        super(message, cause);
    }

    public PrimaryKeyConflictException(Throwable cause) {
        super(cause);
    }

    public PrimaryKeyConflictException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
