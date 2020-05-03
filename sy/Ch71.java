package sy;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class Ch71 extends Frame  {
    int n;
    String dirname="C:\\Program Files\\Java\\jdk1.8.0_201";
    File file=new File(dirname);
    String[] flist=new String[100]; 
    Choice listFile=new Choice();
    TextField tf=new TextField();
    public Ch71(){
    	setLayout(new BorderLayout(10,10));
	    flist=file.list();
        for (n=0;n<flist.length;n++) {
	          listFile.addItem(flist[n]);
       	  }
	     add("North",listFile);
	     add("South",tf);
setSize(250,200);
	      setVisible(true);
        listFile.addItemListener(new koListener());
        addWindowListener(new koWindowListener());
	    }
    public static void main(String args[]) {
	new Ch71();
	   }
    class koListener implements ItemListener	{
	      public void itemStateChanged(ItemEvent e) {
	      String ko=(String)e.getItem();
	       for (n=0;n<flist.length;n++)
	       if (ko==flist[n])	{
		    File f=new File(file+System.getProperty("file.separator")+ko);
	        if (f.isFile()==true)
	           tf.setText(ko+"是个文件！");
	    	if (f.isDirectory()==true) 
		    tf.setText(ko+"是个目录!");
		}
	    }
	}
    class koWindowListener extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
	      dispose();
	      System.exit(0);
	    }
	}
}
