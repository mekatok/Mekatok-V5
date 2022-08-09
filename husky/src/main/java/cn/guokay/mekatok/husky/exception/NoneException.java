package cn.guokay.mekatok.husky.exception;

/**
 * 平台内无异常的异常表示
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "0000", message = "everything is ok")
public class NoneException extends PlatformException {

    public NoneException() {
    }
}
