package mayiwork.pattern.proxyPattern;

/**
 * @author gouyingkui
 * @date 2019/10/14 17:01
 */
public class PngImage {

    //可以代理
    void displayPng() {

        System.out.println("png display!");
    }

    // final 方法不会被生成的字类覆盖
    public final void loadPng() {
        System.out.println("load png");
    }

    //private 方法不会被生成的字类覆盖
    private void savePng() {
        System.out.println("save png");
    }

}
