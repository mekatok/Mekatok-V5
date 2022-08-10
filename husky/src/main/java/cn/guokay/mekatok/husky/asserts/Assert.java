package cn.guokay.mekatok.husky.asserts;

import cn.guokay.mekatok.husky.exception.AssertionException;
import cn.guokay.mekatok.husky.lang.Expressions;

import java.util.Objects;

import static cn.guokay.mekatok.husky.exception.AssertionException.EXCEPTION_MESSAGE;

/**
 * 断言器的主接口
 * @author GuoKay
 * @since 2022/8/6
 */
public interface Assert<S> {

    /**
     * 返回当前断言对象
     * @return 断言工具对象
     */
    S self();

    /**
     * 修改异常提示信息
     * @param exMessage 异常信息
     * @return 断言工具对象
     */
    S message(String exMessage);

    /**
     * 获取异常提示信息
     * @return 异常信息
     */
    String message();

    /**
     * 抛出异常
     */
    default void asserts(){
        String message = message();
        throw new AssertionException(Objects.nonNull(message) ? message : EXCEPTION_MESSAGE);
    }

    /**
     * 当表达式为ture时, 抛出异常.
     * @param expression 表达式
     * @return 断言工具对象
     */
    default S asserts(boolean expression){
        Expressions.apply(expression, this::asserts);
        return self();
    }
}
