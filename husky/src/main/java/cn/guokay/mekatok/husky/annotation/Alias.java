package cn.guokay.mekatok.husky.annotation;

import java.lang.annotation.*;

/**
 * 用于设置属性,函数和类的别名或备注
 * @author GuoKay
 * @since 2022/8/6
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
public @interface Alias {

    /**
     * 设置别名
     * @return 别名
     */
    String value();

    /**
     * 设置备注
     * @return 备注
     */
    String remarks() default "";
}
