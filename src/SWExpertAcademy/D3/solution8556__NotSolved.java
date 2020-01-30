/*
(23/32)
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class solution8556__NotSolved {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= T; i++) {

            String dirIn = sc.nextLine();
            System.out.format("#%d %s", i, calcAngle(dirIn));

        }

    }
    
    public static String calcAngle(String dirIn){

        StringBuilder sBuf = new StringBuilder();
        Stack<Double> angles = new Stack<>();
        int n = 0;

        for (int i = dirIn.length() - 1; i >= 0; i--) {

            sBuf.insert(0,dirIn.charAt(i));
            if(sBuf.toString().equals("west") || sBuf.toString().equals("north")){
                String which = sBuf.toString();
                angles.push(n == 0 ? (which.equals("west") ? 90 : 0) : (90/Math.pow(2,n)) * (which.equals("west") ? 1 : -1));
                n++;
                System.out.println(angles.toString());
                sBuf.delete(0,sBuf.length());
            }

        }

        double calcedAngle = angles.stream().reduce((double)0.0,(acc, curr) -> {
            return acc += curr;
        });

        System.out.println(calcedAngle);

        if( calcedAngle % 1 == 0){
            return ""+(int)calcedAngle;
        } else {
            long[] aTol = Arrays.stream(("" + calcedAngle).split("\\.")).mapToLong(Long::parseLong).toArray();
            System.out.println(Arrays.toString(aTol));
            long gcd = calcGcd(aTol[0]*(int)Math.pow(10,(""+aTol[1]).length())+aTol[1],(int)Math.pow(10,(""+aTol[1]).length()));
            System.out.println(gcd);
            return new StringBuilder().append((aTol[0]*(int)Math.pow(10,(""+aTol[1]).length())+aTol[1])/gcd).append("/").append(""+((int)Math.pow(10,(""+aTol[1]).length())/gcd)).toString();
        }


    }

    public static long calcGcd(long a, long b){
        if(b == 0){
            return a;
        }
        return calcGcd(b,a%b);
    }


}

