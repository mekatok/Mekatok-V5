package cn.guokay.mekatok.husky.pojo;

/**
 * 键值对
 * @author guokay
 * @since 2022/8/8
 */
public interface KeyValue<K,V> {

    /**
     * 获取键
     * @return 键
     */
    K key();

    /**
     * 获取值
     * @return 值
     */
    V value();
}
