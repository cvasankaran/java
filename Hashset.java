package siva;
import java.util.*;


public class Hashset<T> {
	public static void main(String args[]) {
		 HashSet<String> set=new HashSet<String>(); 
		 set.add("zakir"); 
         set.add("nawaz");    
         set.add("kunaal");   
         set.add("dude");  
         set.add("shafiq");  
         Iterator<String> i=set.iterator();  
         while(i.hasNext())  
         {  
         System.out.println(i.next());  
         }  
	}

}
