package emm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Monitor implements ActionListener{
	JTextField Input;
	JPasswordField psd;
	JFrame jf ;
	public void actionPerformed(ActionEvent e) {
	    String name = Input.getText();
	    String psdd = psd.getText();
	    
	    if("".equals(name)) {
			JOptionPane.showMessageDialog(null, "用户名不能为空", "提示", JOptionPane.ERROR_MESSAGE);
	}
	    else if("gh".equals(name))
	    {
	    	if("123".equals(psdd))
	    	{
	    		JOptionPane.showMessageDialog(null, "登陆成功", "提示", JOptionPane.OK_CANCEL_OPTION);
	    		jf.dispose();;
	    		SuccessFrame sf =new SuccessFrame();
	    		sf.Show();
	    	}else {
	    		JOptionPane.showMessageDialog(null, "密码错误", "提示", JOptionPane.ERROR_MESSAGE);
	    	}
	    }
	    else
	    {
	    	JOptionPane.showMessageDialog(null, "用户名错误", "提示", JOptionPane.ERROR_MESSAGE);
	    }
}
}
