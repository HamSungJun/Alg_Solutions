package Codility.CountingElements;

public class PermCheck {

    public static void main(String[] args) {

        System.out.println(solution(new int[]{4, 2, 1}));

    }

    public static int solution(int[] A) {

        boolean[] visited = new boolean[A.length + 1];

        for (int i = 0; i < A.length; i++) {

            if (A[i] >= visited.length) return 0;

            if (!visited[A[i]]) {
                visited[A[i]] = true;
            } else {
                return 0;
            }

        }

        for (int i = 1; i <= A.length; i++) {
            if (!visited[i]) {
                return 0;
            }
        }

        return 1;


    }

}
