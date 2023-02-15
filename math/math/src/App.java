import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
            Scanner(args);
            
    }
    public static void Scanner(String[] args) throws Exception {
        System.out.println("足し算は1・引き算は2・掛け算は3・割り算は4を入力してください");
 
        try (Scanner scan = new Scanner(System.in)) {
            int str = scan.nextInt();

            switch (str) {
                    case 1:
                        System.out.println("足される数を入力してください");

                        Scanner a = new Scanner(System.in);

                        int x = a.nextInt();

                        System.out.println("足す数を入力してください。");

                        Scanner b = new Scanner(System.in);

                        int y = b.nextInt();

                        System.out.println(x + y);
                        break;
                    case 2:

                        System.out.println("引かれる数を入力してください");

                        Scanner c = new Scanner(System.in);

                        int n = c.nextInt();

                        System.out.println("引く数を入力してください。");

                        Scanner d = new Scanner(System.in);

                        int m = d.nextInt();

                        System.out.println(n - m);
                        break;
                    case 3:
                        
                        System.out.println("かけられる数を入力してください");

                        Scanner e = new Scanner(System.in);

                        int w = e.nextInt();

                        System.out.println("かける数を入力してください。");

                        Scanner f = new Scanner(System.in);

                        int z = f.nextInt();

                        System.out.println(w * z);
                        break;
                    case 4:
                        System.out.println("割られる数を入力してください");

                        Scanner g = new Scanner(System.in);

                        int p = g.nextInt();

                        System.out.println("割る数を入力してください。");

                        Scanner h = new Scanner(System.in);

                        int q = h.nextInt();

                        System.out.println(p / q);
                        break;
                }
            }   
    }
}