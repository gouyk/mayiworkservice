package mayiwork.pattern.proxyPattern;

import java.lang.reflect.Proxy;

import mayiwork.pattern.proxyPattern.impl.ProxyImage;
import mayiwork.pattern.proxyPattern.impl.RealImage;
import org.apache.commons.pool2.proxy.CglibProxySource;

/**
 * 代理模式demo
 * @author gouyingkui
 * @date 2019/10/14 16:16
 */
public class ProxyPatterDemo {

    /**
     * 在代理模式（Proxy Pattern）中，一个类代表另一个类的功能。这种类型的设计模式属于结构型模式。
     * 在代理模式中，我们创建具有现有对象的对象，以便向外界提供功能接口。
     * 优点： 1、职责清晰。 2、高扩展性。 3、智能化。
     * 缺点： 1、由于在客户端和真实主题之间增加了代理对象，因此有些类型的代理模式可能会造成请求的处理速度变慢。
     * 2、实现代理模式需要额外的工作，有些代理模式的实现非常复杂。
     * @param args
     */
    public static void main(String[] args) {
        Image image = new ProxyImage();
        image.display();
        //使用jdk自带的poxy包实现动态代理
        /**
         * java.lang.reflect.Proxy:生成动态代理类和对象；
         * java.lang.reflect.InvocationHandler（处理器接口）：可以通过invoke方法实现
         */
        Image realImage = new RealImage("jpg");
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(realImage);

        Image pimage = (Image) Proxy
                .newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[] {Image.class}, myInvocationHandler);
        pimage.display();
        //使用cglib实现普通类的代理
        PngImage pngImage = (PngImage) CglibProxy.getProxy(new PngImage());
        pngImage.displayPng();
        pngImage.loadPng();
    }
}
