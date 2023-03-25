// ------ доп задача --------------------------------
import java.util.Scanner;

public class taskDop {
    public static void main(String[] args) {
  


        Scanner sc = new Scanner(System.in);
        System.out.printf("int equation as 2? + ?2 = 56: ");
        String str = sc.nextLine();
        String[] words = str.split("=");
        for (int i=0; i<words.length; i++) {
            words[i] = words[i].strip();
        }

        int res = Integer.valueOf(words[words.length-1]);


        int[] num = new int[4];
        char[] ch = words[0].toCharArray();

        int i = 0;

        for (char chr: ch) {
            if (Character.isDigit(chr)) {
                num[i] = Character.digit(chr, 10);
                i++;
            }
            if (chr == '?') {
                num[i] = -1;
                i++;
            }
        }
  
        i = 0;
        int sum = 0;


        while (sum < res) {  
            sum = 0;
            for (int j=0 ; j< num.length;j++) {
                if (num[j] == -1) {
                    if (j%2==0) sum += i;
                    else sum += i*10;
                }
                else {
                    if (j%2==0) sum += num[j]*10;
                    else sum += num[j];
                }
            } 
            
            if (sum == res) {
                for (int k = 0 ; k< num.length;k++) {
                
                    if (num[k] == -1) {
                        if (k%2 == 0) num[k] = i*10;
                        else num[k] = i;
                    }
                    else {
                        if (k%2 == 0) num[k] = num[k]*10;
                    }
                    }


            System.out.printf("%d + %d = %d", num[0]+num[1],num[2]+num[3],sum);
            break;
            }
            i++;

        }
        if (sum > res)
            System.out.println("no combination");

        sc.close();


    }
}
