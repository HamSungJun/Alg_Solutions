package Template;

public class Methods {

    public boolean hasDup(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) return true;
            }
        }
        return false;

    }

    public int recSum(int n){
        if(n == 1) return 1;
        return n + recSum(n-1);
    }

}
