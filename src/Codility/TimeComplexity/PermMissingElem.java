package Codility.TimeComplexity;

public class PermMissingElem {

    public static void main(String[] args) {

        System.out.println(solution(new int[]{}));

    }

    public static int solution(int[] A){

        boolean[] visited = new boolean[A.length + 2];

        for (int i = 0; i < A.length; i++) {
            visited[A[i]] = true;
        }

        int result = -1;
        for (int i = 1; i < visited.length; i++) {
            if(!visited[i]){
                result = i;
            }
        }

        return result;

    }

}
