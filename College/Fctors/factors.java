
public class factors {
  public static void main(String[] args) {
    // 18 ->  1 2 3 6 9 18
    java.util.Scanner in = new java.util.Scanner(System.in);
    int n = in.nextInt();

    for(int i = 1; i <= n; i++) {
      if(18 % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}
