package sample;

public class ArrayFuctions {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
//		System.out.println(LinerarSearch(arr, 6));
//		System.out.println(LinearSearch1(arr, 7));
//		System.out.println(BinarySearch(arr, 8));
		String u="irshad";
		System.out.println(Reverse(u));
		
	}
	static int LinerarSearch(int[] arr,int t) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==t) {
				return i; 
			}
		}
		return -1;
	}
	static int LinearSearch1(int[] arr,int t) {
		for(int i:arr) {
			if(i==t) {
				return i;
			}
		}
		return Integer.MAX_VALUE;
	}
	static int BinarySearch(int[] arr,int t) {
		int s=0;
		int e=arr.length-1;
		while(s<=e) {
			int mid=(s+e)/2;
			if(arr[mid]==t) {
				return mid;
			}else if(arr[mid]<t) {
				s=mid+1;
			}else {
				e=mid-1;
			}
		}
		return -1;
	}
	static String Reverse(String str) {
		char[] nm=str.toCharArray();
		int s=0;
		int e=nm.length-1;
		while(s<e) {
			char temp=nm[s];
			nm[s]=nm[e];
			nm[e]=temp;
			s++;
			e--;
		}
		return new String(nm);
	}

}
