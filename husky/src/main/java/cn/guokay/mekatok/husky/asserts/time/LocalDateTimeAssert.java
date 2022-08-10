package cn.guokay.mekatok.husky.asserts.time;

import cn.guokay.mekatok.husky.asserts.AbstractAssert;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

/**
 * 日期时间 断言工具类
 * @author guokay
 * @since 2022/8/10
 */
public class LocalDateTimeAssert extends AbstractAssert<LocalDateTimeAssert, LocalDateTime> {

    /**
     * 日期断言对象
     */
    private final LocalDateAssert LOCAL_DATE_ASSERT;

    /**
     * 时间断言对象
     */
    private final LocalTimeAssert LOCAL_TIME_ASSERT;

    /**
     * 时间戳
     */
    private final long TIMESTAMP;

    public LocalDateTimeAssert(LocalDateTime actual) {
        super(actual);
        LOCAL_DATE_ASSERT = new LocalDateAssert(actual.toLocalDate());
        LOCAL_TIME_ASSERT = new LocalTimeAssert(actual.toLocalTime());
        TIMESTAMP = actual.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    /**
     * 断言当前对象是否与传入的参数一致.
     * @param param 参数
     * @return 断言工具对象
     */
    public LocalDateTimeAssert isLocalDate(LocalDate param){
        LOCAL_DATE_ASSERT.equal(param);
        return self();
    }

    /**
     * 断言当前对象是否与传入的参数一致.
     * @param param 参数
     * @return 断言工具对象
     */
    public LocalDateTimeAssert isLocalTime(LocalTime param){
        LOCAL_TIME_ASSERT.equal(param);
        return self();
    }

    /**
     * 断言当前对象是否与传入的参数一致.
     * @param year 年份
     * @param month 月份
     * @param day 日
     * @return 断言工具对象
     */
    public LocalDateTimeAssert isDate(int year, int month, int day){
        return isLocalDate(LocalDate.of(year, month, day));
    }

    /**
     * 断言当前对象是否与传入的参数一致.
     * @param hour 时
     * @param minute 分
     * @param second 秒
     * @return 断言工具对象
     */
    public LocalDateTimeAssert isTime(int hour, int minute, int second){
        return isLocalTime(LocalTime.of(hour, minute, second));
    }

    /**
     * 断言当前对象是否在给定日期之前.
     * @param before 之前
     * @return 断言工具对象
     */
    public LocalDateTimeAssert isBefore(LocalDateTime before){
        return asserts(!actual.isBefore(before));
    }

    /**
     * 断言当前对象是否在给定日期之后.
     * @param after 之后
     * @return 断言工具对象
     */
    public LocalDateTimeAssert isAfter(LocalDateTime after){
        return asserts(!actual.isAfter(after));
    }

    /**
     * 断言当前对象是否在给定日期之间.
     * @param before 之前
     * @param after 之后
     * @return 断言工具对象
     */
    public LocalDateTimeAssert isBetween(LocalDateTime before, LocalDateTime after){
        return isBefore(before).isAfter(after);
    }
}
