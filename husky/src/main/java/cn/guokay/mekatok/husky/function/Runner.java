package cn.guokay.mekatok.husky.function;

/**
 * 用于 无参无返回值 的lambda表达式
 * @author guokay
 * @since 2022/8/10
 */
@FunctionalInterface
public interface Runner {

    /**
     * 执行
     */
    void apply();
}
