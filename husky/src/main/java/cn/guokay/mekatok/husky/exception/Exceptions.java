package cn.guokay.mekatok.husky.exception;

import cn.guokay.mekatok.husky.ToolBox;

import java.util.Objects;
import java.util.Optional;

/**
 * 异常 相关工具类
 * @author guokay
 * @since 2022/8/8
 */
public abstract class Exceptions implements ToolBox {

    /**
     * 获取异常编码
     * @param exClass 异常类
     * @return 异常编码
     * @param <T> 异常泛型
     */
    public static <T extends PlatformException> Optional<String> getCode(Class<T> exClass){
        if (Objects.equals(exClass, PlatformException.class)){
            return Optional.empty();
        }
        return Optional.of(exClass.getAnnotation(Exception.class).code());
    }

    /**
     * 获取异常描述
     * @param exClass 异常类
     * @return 异常编码
     * @param <T> 异常泛型
     */
    public static <T extends PlatformException> Optional<String> getMessage(Class<T> exClass){
        if (Objects.equals(exClass, PlatformException.class)){
            return Optional.empty();
        }
        return Optional.of(exClass.getAnnotation(Exception.class).message());
    }

}
