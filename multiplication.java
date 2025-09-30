public class multiplication {

public static void mult(int a){
  for(int i=1;i<=12;i++){
    int mul = a*i;
    System.out.println(a + "x" + i + "=" +mul);

  }
  System.out.println();
}

 public static void main(String[] args) {
  System.out.println("multiplication table is"+ " ");
  mult(4);
 }
}
