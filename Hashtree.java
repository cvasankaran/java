package siva;

public class Hashtree {

	public static void main(String[] args) {
		 Hashset<String> set=new Hashset();  
         set.add("One");    
         set.add("Two");    
         set.add("Three");   
         set.add("Four");  
         set.add("Five");  
         iterator<String> i=set.iterator();  
         while(i.hasNext())  
         {  
         System.out.println(i.next());  
         }  
}  
}  

	}

}
