/*Usecase :
Singleton
Cache
List : Arraylist
Implementaion of Queue 
*/


/*Problem solving : Write a program to maintain the latest fatched 10 values in a queue, and should be able to access 
any of the 10 value using the index, where at zeroth location newest value should be available and the at the 9th location oldest value should be available.
*/

import java.util.*;
public class Singleton {
    public static void main(String[] args) {
		Cache cache = Cache.getCacheInstance();
		for(int i=1;i<21;i++){
			cache.push("SD"+i);
		}	
			System.out.println("Cache Contents :");
		for(int index=0;index<10;index++){
		System.out.println(index+" : "+cache.pop(index));
		}
    }
}
class Cache{
	private static List<String> l = new ArrayList<String>();
	private String value;
	private static Cache cacheInstance;
	private Cache(){	
	}
	public static Cache getCacheInstance(){
		 synchronized(Cache.class){
			if(cacheInstance == null){
				cacheInstance = new Cache();
		    }
		 }
		return cacheInstance;
	}
	public boolean push(String value){
		this.value=value;
		if(l.size()>10){
			l.remove(9);
		}
		l.add(0,value);
		return true;
	}
	public String pop(int index){
		String value;
			value = l.get(index);
		return value;
	}
}