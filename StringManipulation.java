package siva;

public class StringManipulation {

	public static void main(String[] args) {
		String S1="siva";
		String S2="shafiq";
		System.out.println(S1==S2);
		System.out.println(S1.equals(S2));
		System.out.println(S1.replace("siva","nawaz"));
		String [] S3=S2.split(" ");
		for(String i:S3) {
			System.out.println(i+" ");
		}
		System.out.println(S1.charAt(3));
		System.out.println(S1.compareTo(S2));
		System.out.println(S1.substring(2,3));
		System.out.println(S2.concat(S1));
		
		

	}

}
