package string.dispon;

/**
 * 最长回文子串
 */
public class TheLongestPalindrome {
    /**
     *  执行最长回文算法
     * @param str 需要一个主 字符串
     * @return 返回最长回文子串的长度
     */
    public Integer exe(String str){
        if(str == null ||  "".equals(str)){
            return 0;
        }
        char[] chars = str.toCharArray();
        int maxLength = 0;
        int mid  = 1;
        int l,r;
        int length = chars.length;
        System.out.println("length:"+length);
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
                System.out.println(mid);
                l--;
                r++;
            }
            mid++;
            if(tempSum >maxLength){
                maxLength = tempSum;
                System.out.println("maxLength:"+maxLength);
            }
        }
        return maxLength;
    }



}
