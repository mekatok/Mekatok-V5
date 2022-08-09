package cn.guokay.mekatok.husky.exception.provider;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 系统读取磁盘文件失败
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "B0321", message = "The system failed to read the disk file")
public class FileAccessException extends ResourceAccessException{

    public FileAccessException() {
    }

    public FileAccessException(String message) {
        super(message);
    }

    public FileAccessException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileAccessException(Throwable cause) {
        super(cause);
    }

    public FileAccessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
