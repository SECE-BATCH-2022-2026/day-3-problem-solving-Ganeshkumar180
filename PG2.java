import java.util.*;
 class PG2 {
  public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();

    int n3 = sc.nextInt();


    int ans = UserMainCode.calculateSum(n1,n2,n3);
    System.out.println(ans);
    sc.close();
  }
  

}

class UserMainCode{
  public static int calculateSum(int n1,int n2,int n3){

    if(n1 ==13){
      if(n3==13){
        return 0;
      }
      else {
        return n3;
      }
}
      
  
    else if(n2 ==13){
      return n1;
    }
    else if(n3 ==13){
      return n1+n2;
    }

    else {
      return n1+n2+n3;
    }
    
  }
} 
