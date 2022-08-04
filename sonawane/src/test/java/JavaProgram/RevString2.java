package JavaProgram;

public class RevString2 {

	public static String revString(String s1) {
		String rev = "";
		for (int i = s1.length()-1; i >= 0; i--) {

			rev = rev + s1.charAt(i);
			
		}
		return rev;

	}

	public static void main(String[] args) {

		String str="selenium webdriver with java";
		String result="";
		String[]arr=str.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			
			String s1 = arr[i];
			if(!(s1.equalsIgnoreCase("java"))) {
				result=result+" "+s1;
			}
			else
			result=result+" "+revString(s1);
			
		}
		
		System.out.println(result);// selenium webdriver with avaj
		
		//if we dont used if and else then ==muineles revirdbew htiw avaj
	}

}
