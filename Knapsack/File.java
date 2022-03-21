package Knapsack;
import java.io.*;


public class File {
	public static void main(String[] args) {         

	      //读取txt文件
	      File file = new File("E:\\{0-1}背包问题\\data_set\\sdkp1-10.txt");
	      //File file = new File("E:\\{0-1}背包问题\\data_set\\udkp1-10.txt");
	      //File file = new File("E:\\{0-1}背包问题\\data_set\\wdkp1-10.txt");
	      
	      BufferedInputStream bis = null;
	      FileInputStream  fis= null;
	      try{
	          //第一步 通过文件路径来创建文件实例
	          fis = new FileInputStream(file);
	          bis = new BufferedInputStream(fis);
	          //available检查是不是读到了文件末尾 
	          
	          while( bis.available() > 0 ){                 
	              System.out.print((char)bis.read());
	          }
	          
	       }catch(FileNotFoundException fnfe)
	        {
	            System.out.println("文件不存在" + fnfe);
	        }

	        catch(IOException ioe)
	        {
	            System.out.println("I/O 错误: " + ioe); 
	        }

	        finally
	        {
	            try{
	               if(bis != null && fis!=null)
	               {
	                     fis.close();
	                  bis.close();
	               }      
	             }catch(IOException ioe)
	              {
	                  System.out.println("关闭InputStream句柄错误: " + ioe);
	              }         
	        }
	   }    

}
