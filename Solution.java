package jaspreet;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int a1[] = new int[200];
        int b1[] = new int[200];
        a= a.toLowerCase();
        b= b.toLowerCase();

        boolean res = true;
        for(int i=0;i<a.length();i++){
            int ch =a.charAt(i);
            int ascii = ch;
            a1[ch]+=1;

        }
        for(int i=0;i<b.length();i++){
            int ch =b.charAt(i);
            int ascii = ch;
            b1[ch]+=1;

        }
        for(int i =96;i<123;i++){
            if(a1[i]!=b1[i]){
                res=false;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}