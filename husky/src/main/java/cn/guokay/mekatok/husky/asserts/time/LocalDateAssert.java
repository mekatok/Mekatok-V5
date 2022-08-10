package cn.guokay.mekatok.husky.asserts.time;

import cn.guokay.mekatok.husky.asserts.AbstractAssert;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

/**
 * 日期 断言工具类
 * @author guokay
 * @since 2022/8/10
 */
public class LocalDateAssert extends AbstractAssert<LocalDateAssert, LocalDate> {

    /**
     * 年
     */
    private final int YEAR;

    /**
     * 月
     */
    private final Month MONTH;

    /**
     * 日
     */
    private final int DAY_OF_MONTH;

    /**
     * 周几
     */
    private final DayOfWeek DAY_OF_WEEK;

    public LocalDateAssert(LocalDate actual) {
        super(actual);
        YEAR = actual.getYear();
        MONTH = actual.getMonth();
        DAY_OF_MONTH = actual.getDayOfMonth();
        DAY_OF_WEEK = actual.getDayOfWeek();
    }

    /**
     * 是否几年
     * @param year 年
     * @return 断言工具对象
     */
    public LocalDateAssert isYear(int year){
        return asserts(year != YEAR);
    }

    /**
     * 是否几月
     * @param month 月
     * @return 断言工具对象
     */
    public LocalDateAssert isMonth(Month month){
        return asserts(!MONTH.equals(month));
    }

    /**
     * 是否几号
     * @param dayOfMonth 日
     * @return 断言工具对象
     */
    public LocalDateAssert isMonthDay(int dayOfMonth){
        return asserts(dayOfMonth != DAY_OF_MONTH);
    }

    /**
     * 是否周几
     * @param dayOfWeek 周几
     * @return 断言工具对象
     */
    public LocalDateAssert isWeekDay(DayOfWeek dayOfWeek){
        return asserts(!DAY_OF_WEEK.equals(dayOfWeek));
    }

    /**
     * 断言当前对象是否在给定日期之前.
     * @param before 之前
     * @return 断言工具对象
     */
    public LocalDateAssert isBefore(LocalDate before){
        return asserts(!actual.isBefore(before));
    }

    /**
     * 断言当前对象是否在给定日期之后.
     * @param after 之后
     * @return 断言工具对象
     */
    public LocalDateAssert isAfter(LocalDate after){
        return asserts(!actual.isAfter(after));
    }

    /**
     * 断言当前对象是否在给定日期之间.
     * @param before 之前
     * @param after 之后
     * @return 断言工具对象
     */
    public LocalDateAssert isBetween(LocalDate before, LocalDate after){
        return isBefore(before).isAfter(after);
    }
}
