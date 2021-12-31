package day7;

/**
 * 阅读界面 展示文本大小
 */
public class Read {
    private String text;
    private String color;
    private int size;

    public Read(String text){
        this.text = text;
    }

    //模拟进入设计页面
    public void goToSetting(){
        //1.创建设计页面的对象
        Setting setting = new Setting(this);

        //2.推送到设计页面
        setting.startSetting();
    }

    // 提供个外部一个方法 可以通过这个方法给我传值
    public void change(String color,int size){
        System.out.println("改变前颜色:"+this.color+"大小:"+this.size);

        this.color = color;
        this.size = size;

        System.out.println("改变后颜色:"+this.color+"大小:"+this.size);
    }
}
