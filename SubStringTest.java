/*
Hacker rank problem :
Create substring of a given size k, from the given String s, sort them in a alphabetical order, and return first and last substring of it.
*/
import java.util.Scanner;
public class SubStringTest {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        java.util.ArrayList<String> subStringList= new java.util.ArrayList<String>();
            
	try{				

        for(int i=65;i<=122;i++){
			  if(i>90&&i<97){
              continue;
           }
		 
			
            for(int j=0;j<s.length();j++){
				
				if(j>=(s.length()-(k-1)))
				{
					continue;
				}
				if(s.charAt(j)==(char)i){
					subStringList.add(s.substring(j,j+k));
		       }
		    }
        }
}catch(Exception e){
	System.out.println(e);
}
		smallest = subStringList.get(0);
        largest = subStringList.get(subStringList.size()-1);
		
        return smallest + "\n" + largest;
}


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}