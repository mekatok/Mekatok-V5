package cn.guokay.mekatok.husky.exception.consumer.file;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 图片过大
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0703", message = "Image too big")
public class ImageTooBigException extends FileException{

    public ImageTooBigException() {
    }

    public ImageTooBigException(String message) {
        super(message);
    }

    public ImageTooBigException(String message, Throwable cause) {
        super(message, cause);
    }

    public ImageTooBigException(Throwable cause) {
        super(cause);
    }

    public ImageTooBigException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
