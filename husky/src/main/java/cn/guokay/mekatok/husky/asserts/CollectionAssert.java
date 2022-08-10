package cn.guokay.mekatok.husky.asserts;

import cn.guokay.mekatok.husky.lang.Expressions;

import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Stream;

/**
 * 集合类型数据对象断言工具
 * @author guokay
 * @since 2022/8/10
 */
public class CollectionAssert<E, T extends Collection<E>> extends AbstractAssert<CollectionAssert<E, T>, T>{

    public CollectionAssert(T actual) {
        super(actual);
    }

    @Override
    public CollectionAssert<E, T> isEmpty() {
        return size(0);
    }

    /**
     * 判断是否为指定类型
     * @param clazz 类型
     * @param <O> 泛型
     * @return 断言工具对象
     */
    public <O extends Collection<E>> CollectionAssert<E, T> isClass(Class<O> clazz){
        return asserts(!clazz.isAssignableFrom(actual.getClass()));
    }

    /**
     * 是否为 List 类型
     * @return 断言工具对象
     */
    @SuppressWarnings("unchecked")
    public CollectionAssert<E, T> isList(){
        return isClass(List.class);
    }

    /**
     * 是否为 Set 类型
     * @return 断言工具对象
     */
    @SuppressWarnings("unchecked")
    public CollectionAssert<E, T> isSet(){
        return isClass(Set.class);
    }

    /**
     * 是否为 Queue 类型
     * @return 断言工具对象
     */
    @SuppressWarnings("unchecked")
    public CollectionAssert<E, T> isQueue(){
        return isClass(Queue.class);
    }

    /**
     * 是否为 Deque 类型
     * @return 断言工具对象
     */
    @SuppressWarnings("unchecked")
    public CollectionAssert<E, T> isDeque(){
        return isClass(Deque.class);
    }

    /**
     * 断言集合个数
     * @param size 个数
     * @return 断言工具对象
     */
    public CollectionAssert<E, T> size(int size){
        return asserts(size != actual.size());
    }

    /**
     * 去重后的集合个数
     * @param size 个数
     * @return 断言工具对象
     */
    public CollectionAssert<E, T> sizeBySet(int size){
        return asserts(size != new HashSet<>(actual).size());
    }

    /**
     * 断言集合个数小于指定值
     * @param size 个数
     * @return 断言工具对象
     */
    public CollectionAssert<E, T> less(int size){
        return asserts(size >= actual.size());
    }

    /**
     * 断言集合个数大于指定值
     * @param size 个数
     * @return 断言工具对象
     */
    public CollectionAssert<E, T> greater(int size){
        return asserts(size <= actual.size());
    }

    /**
     * 断言包含任何一项
     * @param params 参数
     * @return 断言工具对象
     */
    @SafeVarargs
    public final CollectionAssert<E, T> anyMatch(E... params){
        Expressions.apply(Objects.isNull(params), this::asserts);
        long count = Stream.of(params).filter(actual::contains).count();
        return asserts(count < 1L);
    }

    /**
     * 断言包含所有项
     * @param params 参数
     * @return 断言工具对象
     */
    @SafeVarargs
    public final CollectionAssert<E, T> allMatch(E... params){
        Expressions.apply(Objects.isNull(params), this::asserts);
        return asserts(!actual.containsAll(Arrays.asList(params)));
    }

}
