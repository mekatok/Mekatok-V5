package cn.guokay.mekatok.husky.exception.consumer.file;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 视频过大
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0704", message = "Video too big")
public class VideoTooBigException extends FileException{

    public VideoTooBigException() {
    }

    public VideoTooBigException(String message) {
        super(message);
    }

    public VideoTooBigException(String message, Throwable cause) {
        super(message, cause);
    }

    public VideoTooBigException(Throwable cause) {
        super(cause);
    }

    public VideoTooBigException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
