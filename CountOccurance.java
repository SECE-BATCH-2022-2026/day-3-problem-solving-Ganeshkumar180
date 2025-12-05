import java.util.*;
class CountOccurance {
public static void main(String[]args){
 
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String s2=sc.nextLine();
System.out.print(UserMainCode.CountOccurance(s1,s2));
}
}
class UserMainCode{
public static int CountOccurance(String s1,String s2){
int count=1;
Set<String>set=new HashSet<>();
set.add(s2);
int len=s2.length();
int i=0;
while(i<s1.length()&&i+len<s1.length()){
String str=s1.substring(i,i+len);
if(set.contains(str)){
count++;
}
i++;
}
return count;
}}
