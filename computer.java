
public class computer {//����
    String screen ="Һ����ʾ��";
    void startUp() {
    	System.out.println("�������ڿ��������Եȡ�����");
    }
    protected void showPicture() {
    	System.out.println("̨ʽ�����ԣ��������");
    }
    String Welcome() {
    	return "��ӭʹ��";
    }
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
     public  void showPicture() {
       	System.out.println("ƽ����ԣ�����ָ�������Ļ");
       }
       String Welcome() {
       	return super.Welcome()+"ƽ�����";
       }
    }
}
