public class sumOfnaturalnumbers {

  static int sum(int n){
    //int result =0;
    //result= n*(n+1)/2;
  //System.out.println(result);

  if(n==1){
    return 1;
  }else{
    return n + sum(n-1);
  }

  
  }
  public static void main(String[] args) {
    int c =4;
    System.out.println(sum(c));
  }
  
}
