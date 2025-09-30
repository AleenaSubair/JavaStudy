import java.util.Scanner;

public class EndOfFile {
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
        int lineNo = 1;
        while(scan.hasNext()){
            String data = scan.nextLine();
           System.out.println(lineNo + " " + data);
           lineNo++;
  }
  }  
}
