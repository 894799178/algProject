
import java.util.Scanner;

public class Main {

   // private static TheLongestPalindrome theLongestPalindrome = new TheLongestPalindrome();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        String [] str= new String[row];
        for (int i =0; i<row;i++){
           str[i]= scanner.next();
        }
        for (int i = 0;i<str.length;i++){
            System.out.println(test(str[i]));
        }

    }
    public static int test(String str){
        if(str == null ||  "".equals(str)){
            System.out.println(0);
        }
        char[] chars = str.toCharArray();
        int maxLength = 0;
        int mid  = 1;
        int l,r;
        int length = chars.length;
        while(mid <length){
            int tempSum = 1;
            l = mid-1;
            r = mid+1;
            while (l >= 0 && r <= (length-1)){
                if(chars[l] == chars[r]){
                    tempSum+=2;
                }else{
                    break;
                }
                l--;
                r++;
            }
            mid++;
            if(tempSum >maxLength){
                maxLength = tempSum;
                if(maxLength == length){
                    return maxLength;
                }
            }
        }
        return maxLength;
    }


}
