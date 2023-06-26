package sample;

public class StringWorkOut2 {
	public static void main(String[] args) {
		String name="irshad";
		System.out.println(ChangeStr(name));
//		System.out.println(FirstLetChng(name));
	}
	static String ChangeStr(String str) {
		char[] name=str.toCharArray();
		int s=0;
		int e=name.length-1;
		while(s<e) {
			char temp=name[s];
			name[s]=name[e];
			name[e]=temp;
			s++;
			e--;
		}
		return new String(name);
	}
	static String FirstLetChng(String str) {
		char[] nm=str.toCharArray();
		char temp=nm[0];
		for(int i=0;i<nm.length-1;i++) {
			nm[i]=nm[i+1];
		}
		nm[nm.length-1]=temp;
		
		return new String(nm);
	}

}
