# import java.util.*;
public class vowel
{
public static void main(String[] args)
{
char q;
Scanner s=new Scanner(System.in);
q=s.next().charAt(0);
if(q=='a'||q=='e'||q=='i'||q=='o'||q=='u')
{
System.out.println("Vowel");
}
else
{
System.out.println("Consonant");
}
}
}
