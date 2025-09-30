public class StarPattern{

  public static void pattern(int x){
    
    for(int i=1;i<=x;i++){
      for(int j =1;j<=i;j++){
        System.out.print("(:" + "}");
      }
      System.out.println();
    }
  //  System.out.println();
  }
  public static void main(String[] args) {
    pattern(6);
  }
  
}
