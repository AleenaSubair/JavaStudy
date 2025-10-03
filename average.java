public class average {

  static int avg(int...arr){

    int sum=0;
    int avrg=0;
    for(int a:arr){
      sum+=a;
      avrg = sum/a;
    }
    return avrg;

  }

  public static void main(String[] args) {

    System.out.println("average of 1,2,3 = "+ avg(1,2,3));
    
  }
  
}
