public class MergeString {
public static void main(String[] args) {
    String s = "hello world";
    int [] a = new int[26];
     for ( int i = 0 ; i < s.length() ; i++)
     {
        char ch = s.charAt(i);
        if(ch >= 'a' && ch<='z')
        {

        
        int position = ch - 'a';
        a[position]++;

        }
     }
     for(int i = 0 ; i < a.length ; i++)
        System.out.println(a[i]);
    
}
}
