package day7;

/**
 * 设置页面 设置字体颜色和大小
 */
public class Setting {
    Read delegate; // 记录为谁设置颜色和大小 数据的返回对象

    public Setting(Read delegate){
        this.delegate = delegate;
    }

    // 开始设置
    public void startSetting(){
        System.out.println("开始设置");
        System.out.println("--------");
        System.out.println("设置完毕");

        // 通过方法回调
        delegate.change("Yellow",20);
    }
}
