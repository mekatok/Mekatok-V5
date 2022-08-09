package cn.guokay.mekatok.husky.exception.consumer.file;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 文件过大
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0702", message = "File too Big")
public class FileTooBigException extends FileException{

    public FileTooBigException() {
    }

    public FileTooBigException(String message) {
        super(message);
    }

    public FileTooBigException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileTooBigException(Throwable cause) {
        super(cause);
    }

    public FileTooBigException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
