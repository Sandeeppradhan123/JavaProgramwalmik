package JavaProgram;

import java.util.Arrays;
import java.util.TreeSet;

public class Anagram {
	
	public static void m1() {
		String str1="Listen";
		String str2="Silent";
 
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		char[]arr=str1.toCharArray();
		char[]arr2=str2.toCharArray();
		
		Arrays.sort(arr);
		System.out.println(arr);
		
		Arrays.sort(arr2);
		System.out.println(arr2);
		
		if(Arrays.equals(arr,arr2)) {
			
			System.out.println("it is anagram string");
		}
		
	}

	public static void main(String[] args) {
	//	m1();
		String str1="Cat";
		String str2="act";
 
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		char[]arr=str1.toCharArray();
		char[]arr2=str2.toCharArray();
		
		TreeSet obj=new TreeSet();
		TreeSet obj2=new TreeSet();
		for(char a:arr) {
			obj.add(a);
		}
		System.out.println(obj);
		for(char aa:arr2) {
			obj2.add(aa);
		}
		System.out.println(obj2);
		
		
		if(obj.equals(obj2))
			System.out.println("anagram");
	}	
	
}
