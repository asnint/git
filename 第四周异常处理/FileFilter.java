package 第四周异常处理;

import java.io.File;
import java.io.FilenameFilter;

    public class FileFilter implements FilenameFilter{

		public boolean accept(File arg0, String arg1) {
		return arg1.endsWith(".pdf");
		}
    	
    }