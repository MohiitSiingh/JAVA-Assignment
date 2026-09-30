public class MergeString {
public static void main(String[] args) {
    String s = "hello world";
    int [] a = new int[26];
     for ( int i = 0 ; i < s.length() ; i++)
     {
        int position = s.charAt(i) - 'a';
        a[position]++;
     }
     for(int i = 0 ; i < a.length ; i++)
        System.out.println(a[i]);
    
}
}
