package cn.guokay.mekatok.husky.exception.consumer.params;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 图片包含违禁敏感词
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0432", message = "Image contains prohibited sensitive words")
public class SensitiveImageException extends IllegalException{

    public SensitiveImageException() {
    }

    public SensitiveImageException(String message) {
        super(message);
    }

    public SensitiveImageException(String message, Throwable cause) {
        super(message, cause);
    }

    public SensitiveImageException(Throwable cause) {
        super(cause);
    }

    public SensitiveImageException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
