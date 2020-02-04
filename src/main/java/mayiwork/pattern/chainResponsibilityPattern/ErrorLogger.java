package mayiwork.pattern.chainResponsibilityPattern;

/**
 * @author yingkuigou
 * @date 2019/11/22 23:44
 */
public class ErrorLogger extends AbstractLogger {

    /*
    * @Description //TODO 
    null
    * @return 
    * @Author gouyingkui
    * @Date 2019/12/19 23:57 
    **/
    public ErrorLogger(Integer level) {
        this.level = level;
        System.out.println("this leve is " + this.level);
    }

    @Override
    void wirte(String message) {
        System.out.println(level + "---" + message);
    }

    /*
     * @Description //TODO
     * @Param null
     * @return
     * @ppp
     * @Author gouyingkui
     * @Date 2019/12/20 0:09
     **/
    public ErrorLogger sss(String ss, String eee) {
        return new ErrorLogger(1);
    }
}
