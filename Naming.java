package siva;

public class Naming  extends Thread{
	public void run(){

		System.out.println("running");
	}

	public static void main(String[] args) {
		Naming t1=new  Naming();
		Naming t2=new Naming();
		Naming t3=new Naming();
		System.out.println("name of the t1"+t1.getName());
		System.out.println("name of the t2"+t2.getName());
		System.out.println("name of the t3"+t3.getName());
		
		t1.start();
		t2.start();
		t3.start();
		
		t2.setName("mathibhuva");
		System.out.println("After changing the name of t1:"+t2.getName());
		

	}

}
