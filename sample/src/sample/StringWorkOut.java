package sample;

public class StringWorkOut {
	public static String ChangeString(String str,int key) {
		int newkey=26%key;
		char[] nm=new char[str.length()];
		for(int i=0;i<str.length();i++) {
			int letposn=str.charAt(i)+newkey;
			if(letposn<=122) {
				nm[i]=(char)letposn;
			}else {
				nm[i]=(char)(96+letposn%2);
			}
		}
		return new String(nm);
	}
	public static void main(String[] args) {
		String val="hai";
		System.out.println(ChangeString(val, 2));
	}

}
