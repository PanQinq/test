package Knapsack;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Data {
	public class TextOutputTest {
		private static final String fileName = "E:\\{0-1}��������:\\data.txt";
		public void main(String[] args) throws IOException {
		System.out.println("������һ���ַ�,ϵͳ���Զ����浽E:\\{0-1}��������:\\data.txt�ļ��С�");
		System.out.println("�ַ���Ϊ��");
	
		//����file�ĳ�ʼ��
		File outputFile = new File(fileName);
		if(!outputFile.exists()){
		outputFile.createNewFile();
		}
	
		//��ȡ����̨���ַ���
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(outputFile)), true);
		String str = in.nextLine();
	
		if (str != null && str.length() != 0) {
			System.out.println(str);
		}else{
			System.out.println("��ʾ��û���ڿ���̨�����κ��ַ�!");
		}
	
		System.out.println("�鿴data.txt�ļ�,����ִ����ϡ�");
		out.close();
		in.close();
		}

	}

}


