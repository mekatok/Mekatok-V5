package cn.guokay.mekatok.husky.exception.consumer.params;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 包含违禁敏感词
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0431", message = "Contains prohibited sensitive words")
public class SensitiveException extends IllegalException{

    public SensitiveException() {
    }

    public SensitiveException(String message) {
        super(message);
    }

    public SensitiveException(String message, Throwable cause) {
        super(message, cause);
    }

    public SensitiveException(Throwable cause) {
        super(cause);
    }

    public SensitiveException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
