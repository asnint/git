import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class wuweu{
	public static void zoomImage(String src,String dest,Integer size) throws Exception {
	      File srcFile = new File(src);
	      File destFile = new File(dest);
	      System.out.println(srcFile.getAbsolutePath());
	      long fileSize = srcFile.length();
	      if(fileSize < size *1024)   //文件大于size k时，才进行缩放
	          return;
	      Double rate = (size *1024 * 0.5) / fileSize; // 获取长宽缩放比例
	      
	      BufferedImage bufImg = ImageIO.read(srcFile);
	      System.out.println(bufImg.getHeight());
	      System.out.println(bufImg.getWidth());
	      Image Itemp = bufImg.getScaledInstance(bufImg.getWidth(), bufImg.getHeight(), bufImg.SCALE_SMOOTH);
	          
	      AffineTransformOp ato = new AffineTransformOp(AffineTransform.getScaleInstance(rate, rate), null);
	      Itemp = ato.filter(bufImg, null);
	      try {
	          ImageIO.write((BufferedImage) Itemp,dest.substring(dest.lastIndexOf(".")+1), destFile);
	      } catch (Exception ex) {
	          ex.printStackTrace();
	      }}
public static void main(String[] args) throws Exception {
	zoomImage("D:\\2223\\222.jpg","C:\\Users\\asus\\Desktop\\22.jpg",100);
}
}