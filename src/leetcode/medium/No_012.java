package leetcode.medium;

import java.util.Scanner;

/*
 * 12. Integer to Roman
 */
public class No_012 {
	
	
	public static String intToRoman(int num) {
        
		String [] romans = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int [] value = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

        int idx = romans.length - 1;
        String res = "";
        while(num > 0){
            while (value[idx] <= num){
                res += romans[idx];
                num -= value[idx];
            }
            idx--;
        }
        return res;	
    }
	
	
	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String result = intToRoman(n);
		System.out.println(result);
		in.close();
	}
}
