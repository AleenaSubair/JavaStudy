public class reversepattern {
  static void star(int x){
    for(int i =x;i>=1;i--){
      for(int j=1;j<=i;j++){
        System.out.print("8");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
   star(3);
  }
}
