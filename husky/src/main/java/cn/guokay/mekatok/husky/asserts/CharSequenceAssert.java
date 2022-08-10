package cn.guokay.mekatok.husky.asserts;

import cn.guokay.mekatok.husky.lang.Strings;

/**
 * @author guokay
 * @since 2022/8/10
 */
public class CharSequenceAssert<T extends CharSequence> extends AbstractAssert<CharSequenceAssert<T>, T>{

    public CharSequenceAssert(T actual) {
        super(actual);
    }

    @Override
    public CharSequenceAssert<T> isEmpty() {
        return asserts(Strings.isNotEmpty(actual));
    }

    @Override
    public CharSequenceAssert<T> is(T param) {
        return super.equal(param);
    }

    /**
     * 断言不为空字符串, 为空则抛出异常
     * @return 断言工具对象
     */
    public CharSequenceAssert<T> isNotEmpty() {
        return asserts(Strings.isEmpty(actual));
    }

    /**
     * 断言为空白字符串, 不为空白则抛出异常
     * @return 断言工具对象
     */
    public CharSequenceAssert<T> isBlank() {
        return asserts(Strings.isNotBlank(actual));
    }

    /**
     * 断言不为空白字符串, 为空则抛出异常
     * @return 断言工具对象
     */
    public CharSequenceAssert<T> isNotBlank() {
        return asserts(Strings.isBlank(actual));
    }

    /**
     * 断言是否包含字符串,不包含则抛出异常
     * @param param 字符串
     * @return 断言工具对象
     */
    public CharSequenceAssert<T> contains(CharSequence param){
        return asserts(!Strings.contains(actual, param));
    }

    /**
     * 断言是否指定的长度, 不是则抛出异常
     * @param size 长度
     * @return 断言工具对象
     */
    public CharSequenceAssert<T> size(int size){
        return asserts(actual.length() != size);
    }

    /**
     * 断言字符串长度小于指定值
     * @param size 个数
     * @return 断言工具对象
     */
    public CharSequenceAssert<T> less(int size){
        return asserts(size >= actual.length());
    }

    /**
     * 断言字符串长度大于指定值
     * @param size 个数
     * @return 断言工具对象
     */
    public CharSequenceAssert<T> greater(int size){
        return asserts(size <= actual.length());
    }

}
