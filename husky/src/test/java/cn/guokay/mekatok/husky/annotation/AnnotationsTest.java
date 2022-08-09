package cn.guokay.mekatok.husky.annotation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.PrintStream;

/**
 * @see Annotations
 * @author GuoKay
 * @since 2022/8/6
 */
@DisplayName("Annotations 测试类")
public class AnnotationsTest {

    private static final PrintStream log = System.out;

    @Test
    @DisplayName("判断两个注解是否属于一个类")
    public void equals(){

    }
}
