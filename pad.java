
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
   void showPicture() {
   	System.out.println("平板电脑，用手指点击主屏幕");
   }
   String Welcome() {
   	return super.Welcome()+"平板电脑";
   }
}
