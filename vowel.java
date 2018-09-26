# import java.util.*;
public class vowel
{
public static void main(String[] args)
{
char q;
Scanner s=new Scanner(System.in);
q=s.next().charAt(0);
if(q=='a'&&q=='A'||q=='e'&&q=='E'||q=='i'&&q=='I'||q=='o'&&q=='O'||q=='u'&&q=='U')
{
System.out.println("Vowel");
}
else
{
System.out.println("Consonant");
}
}
}
