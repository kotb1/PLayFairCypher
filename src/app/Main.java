package app;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o = new Scanner (System.in);
		char matrix [][] = new char [5][5];
		char letters [] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		System.out.println("Please Enter the key");
		String key = o.nextLine();
		key=key.toLowerCase();
		char [] keyy= key.toCharArray();
		ArrayList <Character> keylist = new ArrayList <Character>();
		for(int i =0;i<keyy.length;i++) 
		{
				if(!(keylist.contains(keyy[i]))) 
				{
					keylist.add(keyy[i]);
				}
		}
		int k=0;
		int a=0;
		for(int i=0;i<5;i++) 
		{
			for(int j=0;j<5;j++) 
			{
				if(k<keylist.size()) 
				{
					matrix[i][j]=keylist.get(k);
					k++;
				}
				else if(a<26) 
				{
					if(a==8) 
					{
						if(keylist.contains(letters[a]) || keylist.contains(letters[a+1])) 
						{
							a=a+1;
							j--;
						}
						else 
						{
							Random rn = new Random();
							float max=1;
							float min=0;
							float random = min+(max-min)*rn.nextFloat();
							if(random>0.5) 
							{
								matrix[i][j]=letters[a];
								a=a+1;
							}
							else if(random<0.5) 
							{
								matrix[i][j]=letters[a+1];
								a=a+1;
							}
						}
					}
					else 
					{
						if(!(keylist.contains(letters[a]))) 
						{
							matrix[i][j]=letters[a];
						}
						else
							j--;
					}
					a++;
				}
			}
		}
		//System.out.println();
		for(int i=0;i<5;i++) 
		{
			for(int j=0;j<5;j++) 
			{
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}

}
