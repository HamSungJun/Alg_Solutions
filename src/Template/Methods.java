package Template;

public class Methods {

    public static void main(String[] args) {

        System.out.println(hasDup(new int[]{1,2,3,1}));
        System.out.println(recSum(10));
    }

    public static boolean hasDup(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) return true;
            }
        }
        return false;

    }

    public static int recSum(int n){
        if(n == 1) return 1;
        return n + recSum(n-1);
    }

}
