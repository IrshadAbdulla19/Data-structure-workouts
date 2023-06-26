package arrayChange;

import java.util.Scanner;

public class ChangeElements {
	Scanner in=new Scanner(System.in);
	
	public static void main(String[] args) {

		String[][] arr= {
				{"1","1","1"},
				{"0","1","0"},
				{"1","1","1"}
		};
		
		ChangeElements s=new ChangeElements();
		s.Display(arr);
		s.Change(arr);
		System.out.println();
		s.Display(arr);
		 
		
		
	}
	
	public void Change(String[][] arr) {
		int a=97;
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i][j]=="1") {
					
					arr[i][j]=String.valueOf((char)(a)) ;
					
					 a++;
					 
				}else {
					continue;
				}
				
			}
		}
	}
	
	
	public void Display(String[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
			System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
