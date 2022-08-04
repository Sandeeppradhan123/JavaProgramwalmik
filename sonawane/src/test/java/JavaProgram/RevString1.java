package JavaProgram;

public class RevString1 {

	public static void main(String[] args) {
		
		String str="selenium webdriver with java";
		
		
		String[]arr=str.split(" ");
		String rev ="";
		String temp= "";
	
		
		for(int i=0;i<arr.length;i++) {
			temp =arr[i];
			
			if(i==1) {
				temp= "";
			for(int j=arr[i].length()-1; j>=0; j--) {
			  temp = temp + arr[i].charAt(j);
			}
			}
			
			
			rev = rev + " " + temp;
		
		}
		System.out.println(rev);
	}
	
	
}
