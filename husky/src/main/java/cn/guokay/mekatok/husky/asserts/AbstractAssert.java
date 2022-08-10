package cn.guokay.mekatok.husky.asserts;

import cn.guokay.mekatok.husky.lang.Expressions;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * @author guokay
 * @since 2022/8/10
 */
public abstract class AbstractAssert<S extends AbstractAssert<S,A>,A> implements Assert<S>{

    /**
     * 用于存储异常提示信息.
     */
    protected String exMessage;

    /**
     * 待断言对象
     */
    protected final A actual;

    public AbstractAssert(A actual) {
        this.actual = actual;
        nonNull();
    }

    @Override
    @SuppressWarnings("unchecked")
    public S self() {
        return (S) this;
    }

    @Override
    public S message(String exMessage){
        this.exMessage = exMessage;
        return self();
    }

    @Override
    public String message() {
        return exMessage;
    }

    /**
     * 断言是否为空对象, 不为空对象则抛出异常.
     * @return 断言工具对象
     */
    public S isEmpty(){
        return asserts(Objects.nonNull(actual));
    }

    /**
     * 断言是否不为空, 为空则抛出异常.
     * @return 断言工具对象
     */
    protected S nonNull(){
        return asserts(Objects.isNull(actual));
    }

    /**
     * 通过hashCode函数判断对象是否完全相等, 不相等则抛出异常.
     * @param param 对象
     * @return 断言工具对象
     */
    public S is(A param){
        Expressions.apply(Objects.isNull(param), this::asserts);
        return asserts(actual.hashCode() != param.hashCode());
    }

    /**
     * 通过equals函数判断对象是否完全相等, 不相等则抛出异常.
     * @param param 对象
     * @return 断言工具对象
     */
    public S equal(A param){
        return asserts(!actual.equals(param));
    }

    /**
     * 自定义断言规则.
     * 通过lambda表达式进行判断, 表达式为false则抛出异常
     * @param predicate 判断条件
     * @return 断言工具对象
     */
    public S custom(Predicate<A> predicate){
        return asserts(!predicate.test(actual));
    }
}
