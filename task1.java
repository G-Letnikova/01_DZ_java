
// ------ простые числа от 1 до 100 -------------------
public class task1 {
    public static void main(String[] args) {
  


            int val = 100;
            for (int i = 1; i <= val; i++) {
                int flag = 0;
                for (int j=2; j*j <= i; j++) {
                    if (i % j == 0) 
                    flag += 1;
                }
            if (flag == 0) 
                System.out.printf("%d ", i);
            }



    }
}
