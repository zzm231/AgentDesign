package day7;

/**
 * 代理设计模式
 */
public class MyClass {
    public static void main(String[] args) {
        Read read = new Read("test");
        read.goToSetting();
    }
}
