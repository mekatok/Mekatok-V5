package cn.guokay.mekatok.husky.annotation;

import java.lang.annotation.*;

/**
 * 设置忽略的标记
 * @author GuoKay
 * @since 2022/8/6
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
public @interface Ignore {

    /**
     * 设置是否忽略
     * @return 是否忽略
     */
    boolean value() default true;
}
