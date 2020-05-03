
public class computer {//父类
    String screen ="液晶显示屏";
    void startUp() {
    	System.out.println("电脑正在开机，请稍等。。。");
    }
    protected void showPicture() {
    	System.out.println("台式机电脑，用鼠标点击");
    }
    String Welcome() {
    	return "欢迎使用";
    }
   public class pad extends computer {//子类
        String battery ="5000毫安电池";
        public pad() {
        	//this.screen = super.screen;与this一样的错误原因
        	super();
        	this.screen = super.screen;
        }
       void open4G() {
    	   System.out.println("打开4G网络");
       }
     public  void showPicture() {
       	System.out.println("平板电脑，用手指点击主屏幕");
       }
       String Welcome() {
       	return super.Welcome()+"平板电脑";
       }
    }
}
