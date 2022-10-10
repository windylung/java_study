import java.util.Scanner;
public class UpAndDownGame {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = 1 + (int)(Math.random() * 50);
        while (true) {
            System.out.print("1과 50 사이의 정수를 입력하세요: ");
            int input = sc.nextInt();
            if (input == -1)
                return ;
            else if (input < num)
                System.out.println("UP");
            else if (input > num)
                System.out.println("DOWN");
            else
                break;
        }
        System.out.println("정답입니다!");
    }
}