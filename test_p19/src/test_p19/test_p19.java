package test_p19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p19 {
	public static void main(String[] args)throws IOException
	{
		System.out.println("�аݧA�O�k�Ͷ�?");
		System.out.println("�п�JY��N");
	
		BufferedReader br= 
				new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		char letter=str.charAt(0);
		
		if(letter=='Y'||letter=='y')
		{
			System.out.println("�A�O�k�ͪ�!");
		}
		else if(letter=='N'||letter=='n')
		{
			System.out.println("�p�O�k�ͪ�!");
		}
		else
		{
			System.out.println("�п�JY��N");
		}
	
	}
}
