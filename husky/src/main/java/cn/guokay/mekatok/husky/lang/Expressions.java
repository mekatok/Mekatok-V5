package cn.guokay.mekatok.husky.lang;

import cn.guokay.mekatok.husky.ToolBox;
import cn.guokay.mekatok.husky.function.Runner;

/**
 * 表达式工具类
 * @author guokay
 * @since 2022/8/10
 */
public abstract class Expressions implements ToolBox {

    /**
     * if判断, 执行后续表达式
     * @param expression if表达式
     * @param success 判断true 执行代码
     */
    public static void apply(boolean expression, Runner success){
        if (expression){
            success.apply();
        }
    }

    /**
     * if判断, 执行后续表达式
     * @param expression if表达式
     * @param success 执行代码
     * @param fail 判断false 执行代码
     */
    public static void apply(boolean expression, Runner success, Runner fail){
        Runner runner = expression ? success : fail;
        runner.apply();
    }

}
