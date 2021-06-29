package behaviro.observermodel.demo1;

/**
 * @author czy
 * @date 2021/6/28
 */
public interface Subject {
    /**
     * 注册
     * @param o
     */
    void registerObserver(Object o);

    /**
     * 删除
     * @param o
     */
    void removeObserver(Object o);

    /**
     * 通知观察者
     */
    void notifyObservers();
}
