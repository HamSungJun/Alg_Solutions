package Codility.PrefixSums;

public class CountDiv {

    public static void main(String[] args) {

        System.out.println(solution(0, 2000000000, 1));

    }

    public static int solution(int A, int B, int K) {

        double dA = A;
        double dB = B;

        int answer = (int) (Math.floor(dB / K) - Math.floor((dA - 1) / K));

        return answer;

    }

}
