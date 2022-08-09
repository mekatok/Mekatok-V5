package cn.guokay.mekatok.husky.exception.consumer.file;

import cn.guokay.mekatok.husky.exception.Exception;
import cn.guokay.mekatok.husky.exception.consumer.ConsumerException;

/**
 * 文件上传错误
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0700", message = "Consumer upload file error")
public class FileException extends ConsumerException {

    public FileException() {
    }

    public FileException(String message) {
        super(message);
    }

    public FileException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileException(Throwable cause) {
        super(cause);
    }

    public FileException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
