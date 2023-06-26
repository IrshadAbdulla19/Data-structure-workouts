package binarySearch;

public class SearchStringLinear {
	public static boolean searchString(String name,char target) {
		if(name.length()==0) {
			return false;
		}
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==target) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		String name="irshad";
		char target='h';
		System.out.println(searchString(name, target));
	}

}
