package cn.guokay.mekatok.husky.exception;

import cn.guokay.mekatok.husky.exception.consumer.login.LoginException;
import cn.guokay.mekatok.husky.exception.consumer.register.RegisterException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * @see Exceptions
 * @author guokay
 * @since 2022/8/8
 */
@DisplayName("Exceptions 测试类")
public class ExceptionsTest {

    @ParameterizedTest
    @DisplayName("测试 获取异常编码")
    @ValueSource(classes = {LoginException.class, RegisterException.class, PlatformException.class})
    public void test1(Class<PlatformException> clazz){
        System.out.println(Exceptions.getCode(clazz).orElse("null"));
    }

    @ParameterizedTest
    @DisplayName("测试 获取异常描述")
    @ValueSource(classes = {LoginException.class, RegisterException.class, PlatformException.class})
    public void test2(Class<PlatformException> clazz){
        System.out.println(Exceptions.getMessage(clazz).orElse("null"));
    }
}
