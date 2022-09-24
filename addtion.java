package siva;
import java.lang.*;

public class addtion {

	public static void main(String[] args) {
		int[] a={1,2,3,4};
		int[] b={2,3,4,5};
		int[] c=new int[4];
		int[] d=new int[4];
		int[] e=new int[4];
		System.out.println("addition");
		
		for(int i=0;i<=3;i++)
		{
			c[i]=a[i]+b[i];
			System.out.println(c[i]+"  ");
		}
		System.out.println("subraction");
		
		for(int i=0;i<=3;i++) {
			d[i]=a[i]-b[i];
			System.out.println(d[i]+" ");
		}
		System.out.println("multiplication");
		for(int i=0;i<=3;i++)
		{
			
			e[i]=a[i]*b[i];
			System.out.println(e[i]+" ");
			
		}
		
	}
}

