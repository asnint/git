package Seven;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.StyledEditorKit.FontFamilyAction;


public class Mycalulator extends JFrame implements ActionListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String[]KEYS={"7","8","9","+","4","5","6","-"
    		                   ,"1","2","3","*","0",".","=","/"};
    private final String[]Command={"deleteһλ","��0"};
    private JButton[] keys=new JButton[KEYS.length];
    private JButton[] coms=new JButton[Command.length];
    private JTextField text=new JTextField("0");
    private boolean Firstdigit=true;//�Ƿ��һ������
    private double result=0.0;//���
    private String operator = "=";//Ĭ�ϲ���Ϊ"="
    private boolean operateValidFlag = true;//�����Ƿ�Ϸ�
    public Mycalulator() {
        init();
        setTitle("������");  
        setBounds(700, 600,300,800);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        pack();
    }
    private void init() {
        text.setHorizontalAlignment(JTextField.RIGHT);//�ı��Ҷ���
        text.setEditable(false);//���ɱ༭
        text.setBackground(Color.WHITE);//������ɫ
        JPanel keyspanel=new JPanel();//װ�����Ļ���
        keyspanel.setLayout(new GridLayout(4,4,3,3));//����Ϊ���񲼾�4��4�� ˮƽ��ֱ��඼Ϊ3����
        for(int i=0;i<keys.length;i++){//������ť
            keys[i]=new JButton(KEYS[i]);
            keyspanel.add(keys[i]);//�ڻ�������Ӱ�ť
            keys[i].setForeground(Color.blue);//����ǰ��ɫ��ɫ
            keys[i].setFont(new Font("����",Font.BOLD,18));
        }
        //���������ǰ��ɫΪ��
        keys[3].setForeground(Color.BLACK);
        keys[7].setForeground(Color.BLACK);
        keys[11].setForeground(Color.BLACK);
        keys[15].setForeground(Color.BLACK);
        JPanel comspanel=new JPanel();
        comspanel.setLayout(new GridLayout(1,2,3,3));
        for(int i=0;i<coms.length;i++){
            coms[i]=new JButton(Command[i]);
            comspanel.add(coms[i]);
        }
        JPanel panel1=new JPanel();
        panel1.setLayout(new BorderLayout(3,3));// ������ñ߽粼�ֹ�������
                         //���������֮���ˮƽ�ʹ�ֱ�����ϼ����Ϊ3����
        panel1.add("North", comspanel);
        panel1.add("Center", keyspanel);
        JPanel top = new JPanel();  //װ�ı���Ļ���
        top.setLayout(new BorderLayout()); //�߽粼��
        top.add("Center", text);  
        getContentPane().setLayout(new BorderLayout(3,4));
        getContentPane().add("North", top);  //��  ����top���� �������ı���
        getContentPane().add("Center", panel1);//����  ����panel1���� 
       // װ�������ְ����������
        for (int i = 0; i < KEYS.length; i++) {  
            keys[i].addActionListener(this);  
        }  
        for (int i = 0; i < Command.length; i++) {  
            coms[i].addActionListener(this);  
        }  
    }
    public void actionPerformed(ActionEvent e) {
        String label=e.getActionCommand();
        if(label==Command[0]){
            handledelete();
        }
        else if(label==Command[1]){
            handleC();
        }
        else if("0123456789.".indexOf(label)>=0){
            handlenumber(label);
        }
        else{
            handleOperator(label);
        }
    }
    private void handleOperator(String label) {
        if(operator.equals("/")){
            if(text.getText()=="0"){
                text.setText("��������Ϊ0");
                operateValidFlag=false;
                handleC();
            }
            else{
                result/=Double.valueOf(text.getText());
            }
        }
        else if(operator.equals("*")){
            result*=Double.valueOf(text.getText());
        }
        else if(operator.equals("+")){
            result+=Double.valueOf(text.getText());
        }
        else if(operator.equals("-")){
            result-=Double.valueOf(text.getText());
        }
        else if(operator.equals("=")){
            result=Double.valueOf(text.getText());
        }
        if(operateValidFlag){
            text.setText(String.valueOf(result));
        }
        operator=label;
        Firstdigit = true;//����������� ����������Ϊ��һ������
        operateValidFlag=true;
    }
    private void handlenumber(String label) {
        if(Firstdigit){
            if(label.equals(".")){
                text.setText(text.getText()+".");
            }
            else{
            text.setText(label);
            }
        }
        //������"."�����ַ�����û"."
        else if(label.equals(".")&&text.getText().indexOf(".")<0){
            text.setText(text.getText()+".");
        }
        //����������
        else if(!label.equals(".")){
            text.setText(text.getText()+label);
        }
        Firstdigit=false;//����Ͳ��ǵ�һ��������
    }
    private void handleC() {
        text.setText("0");
        Firstdigit=true;
        operator="=";
    }
    private void handledelete() {
        if(text.getText().length()>1){
            text.setText(text.getText().substring(0, text.getText().length()-1));
        }
        else if(text.getText().length()==1){
            text.setText("0");
        }
    }
    public static void main(String args[]) {  
        Mycalulator calculator1 = new Mycalulator();  
         
        calculator1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }  
}