package cn.guokay.mekatok.husky.asserts.time;

import cn.guokay.mekatok.husky.asserts.AbstractAssert;

import java.time.LocalTime;

/**
 * @author guokay
 * @since 2022/8/10
 */
public class LocalTimeAssert extends AbstractAssert<LocalTimeAssert, LocalTime> {

    /**
     * 时
     */
    private final int HOUR;

    /**
     * 分
     */
    private final int MINUTE;

    /**
     * 秒
     */
    private final int SECOND;

    public LocalTimeAssert(LocalTime actual) {
        super(actual);
        HOUR = actual.getHour();
        MINUTE = actual.getMinute();
        SECOND = actual.getSecond();
    }

    /**
     * 断言是否为上午.
     * @return 断言工具对象
     */
    public LocalTimeAssert isAM(){
        return asserts(HOUR >= 12);
    }

    /**
     * 断言是否为下午
     * @return 断言工具对象
     */
    public LocalTimeAssert isPM(){
        return asserts(HOUR < 12);
    }

    /**
     * 断言当前对象是否在给定时间之前.
     * @param before 之前
     * @return 断言工具对象
     */
    public LocalTimeAssert isBefore(LocalTime before){
        return asserts(!actual.isBefore(before));
    }

    /**
     * 断言当前对象是否在给定时间之后.
     * @param after 之后
     * @return 断言工具对象
     */
    public LocalTimeAssert isAfter(LocalTime after){
        return asserts(!actual.isAfter(after));
    }

    /**
     * 断言当前对象是否在给定时间之间.
     * @param before 之前
     * @param after 之后
     * @return 断言工具对象
     */
    public LocalTimeAssert isBetween(LocalTime before, LocalTime after){
        return isBefore(before).isAfter(after);
    }
}
