package arrayString;

public class Palindroam {
	public boolean isPalindroam(String word) {
		char[] arr=word.toCharArray();
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			if(arr[start]!=arr[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	public static void main(String[] args) {
		Palindroam n=new Palindroam();
		if(n.isPalindroam("malayalam")){
			System.out.println("string is palindrom");
			
		}else {
			System.out.println("string is not palindrom");
		}
	}

}
