package Knapsack;
import java.io.*;


public class File {
	public static void main(String[] args) {         

	      //��ȡtxt�ļ�
	      File file = new File("E:\\{0-1}��������\\data_set\\sdkp1-10.txt");
	      //File file = new File("E:\\{0-1}��������\\data_set\\udkp1-10.txt");
	      //File file = new File("E:\\{0-1}��������\\data_set\\wdkp1-10.txt");
	      
	      BufferedInputStream bis = null;
	      FileInputStream  fis= null;
	      try{
	          //��һ�� ͨ���ļ�·���������ļ�ʵ��
	          fis = new FileInputStream(file);
	          bis = new BufferedInputStream(fis);
	          //available����ǲ��Ƕ������ļ�ĩβ 
	          
	          while( bis.available() > 0 ){                 
	              System.out.print((char)bis.read());
	          }
	          
	       }catch(FileNotFoundException fnfe)
	        {
	            System.out.println("�ļ�������" + fnfe);
	        }

	        catch(IOException ioe)
	        {
	            System.out.println("I/O ����: " + ioe); 
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
	                  System.out.println("�ر�InputStream�������: " + ioe);
	              }         
	        }
	   }    

}
