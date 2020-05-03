package emm;

import javax.swing.JFrame;

public class SuccessFrame {
    public void Show() {
    	JFrame jf  = new JFrame();
    	jf.setTitle("成功界面");
		jf.setSize(500, 380);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
    }
}
