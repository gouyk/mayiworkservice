package mayiwork.pattern.proxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * jdk Proxy
 * @author gouyingkui
 * @date 2019/10/14 16:47
 */
public class MyInvocationHandler implements InvocationHandler {

    Image realImage;

    public MyInvocationHandler(Image realImage) {
        this.realImage = realImage;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(realImage, args);
    }
}
