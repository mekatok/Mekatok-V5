package cn.guokay.mekatok.husky.exception.consumer.authority;

import cn.guokay.mekatok.husky.exception.Exception;

/**
 * 网关访问受限
 * @author guokay
 * @since 2022/8/8
 */
@Exception(code = "A0324", message = "Gateway access is restricted")
public class GatewayException extends InterceptException{
}
