
public class pad extends computer {//����
    String battery ="5000�������";
    public pad() {
    	//this.screen = super.screen;��thisһ���Ĵ���ԭ��
    	super();
    	this.screen = super.screen;
    }
   void open4G() {
	   System.out.println("��4G����");
   }
   void showPicture() {
   	System.out.println("ƽ����ԣ�����ָ�������Ļ");
   }
   String Welcome() {
   	return super.Welcome()+"ƽ�����";
   }
}
