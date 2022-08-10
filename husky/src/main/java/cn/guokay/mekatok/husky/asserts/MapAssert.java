package cn.guokay.mekatok.husky.asserts;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @author guokay
 * @since 2022/8/10
 */
public class MapAssert<K,V> extends AbstractAssert<MapAssert<K,V>, Map<K,V>>{

    private final int SIZE;

    public MapAssert(Map<K, V> actual) {
        super(actual);
        SIZE = actual.size();
    }

    @Override
    public MapAssert<K, V> isEmpty() {
        return size(0);
    }

    /**
     * 断言个数是否符合给定数值
     * @param size 个数
     * @return 断言工具对象
     */
    public MapAssert<K,V> size(int size){
        return asserts( size != SIZE);
    }

    /**
     * 断言key中是否包含其中一项
     * @param keys 键
     * @return 断言工具对象
     */
    public MapAssert<K,V> anyKey(K... keys){
        long count = Stream.of(keys).filter(actual.keySet()::contains).count();
        return asserts(0 == count);
    }

    /**
     * 断言key中是否全部包含
     * @param keys 键
     * @return 断言工具对象
     */
    public MapAssert<K,V> allKey(K... keys){
        return asserts(!actual.keySet().containsAll(Arrays.asList(keys)));
    }

    public MapAssert<K,V> anyValue(V... values){
        long count = Stream.of(values).filter(actual.values()::contains).count();
        return asserts(0 == count);
    }

    public MapAssert<K,V> allValue(V... values){
        return asserts((!actual.values().containsAll(Arrays.asList(values))));
    }
}
