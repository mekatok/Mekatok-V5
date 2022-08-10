package cn.guokay.mekatok.husky.asserts;

/**
 * @author guokay
 * @since 2022/8/10
 */
public class BooleanAssert extends AbstractAssert<BooleanAssert, Boolean>{

    public BooleanAssert(Boolean actual) {
        super(actual);
    }

    /**
     * 断言是真
     * @return 断言工具对象
     */
    public BooleanAssert isTrue(){
        return asserts(!actual);
    }

    /**
     * 断言是假
     * @return 断言工具对象
     */
    public BooleanAssert isFalse(){
        return asserts(actual);
    }

}
