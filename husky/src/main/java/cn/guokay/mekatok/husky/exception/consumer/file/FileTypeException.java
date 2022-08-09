package cn.guokay.mekatok.husky.exception.consumer.file;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 文件类型不匹配
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0701", message = "file type mismatch")
public class FileTypeException extends FileException{

    public FileTypeException() {
    }

    public FileTypeException(String message) {
        super(message);
    }

    public FileTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileTypeException(Throwable cause) {
        super(cause);
    }

    public FileTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
