public class ReverseWords {
public static void main(String[] args) {
    

String s = "Hello World";
StringBuilder result = new StringBuilder();;
// String[] copy = new String [s.length()];
String [] copy = s.split(" " ) ;

for(int i = 0 ; i < copy.length ; i++)
{
String s2 = copy[i];
for (int j=s2.length()-1 ; j >=0 ; j--)
{
  
  result.append(s2.charAt(j));
}
result.append(" ");
}
System.out.println("final: " + result);
}
}
