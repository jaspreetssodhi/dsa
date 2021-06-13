package jaspreet;
import java.util.*;
public class rightGreatest {
	static boolean replace(String s, String t) {
		char s1[] = s.toCharArray();
        char t1[] = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        for(int j=0;j<t1.length;j++){
            System.out.print(s1[j]);
        }
        System.out.println();
        for(int j=0;j<t1.length;j++){
            System.out.print(t1[j]);
        }
        System.out.println();
        boolean result = true;
        if(s1.length==t1.length){
        	for(int i=0,j=0;i<s1.length && j<t1.length;i++,j++){
                
                  if(s1[i]!=t1[j])
                      result = false;
                  break;
          }  
        }
        else
            result= false;
        return result;
		
		
	}
	public static void main(String args[]) {
		boolean r = replace ("aad", "cab");
		System.out.print(r);
	}
}
