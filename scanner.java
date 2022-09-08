import java.util.Scanner;//java.util is the package for using scanner
class Student
[
    public static void main(String[] args)
	{
		int sid;
		String sname;
		float att;
		System.out.println("enter student details");
		scanner sc=new Scanner(System.in);
		sid=sc.nextInt();
		sname=sc.next();
		att=sc.nextFloat();
		system.out.println(sid+"   "+sname+"   "+att);
	}
}	
