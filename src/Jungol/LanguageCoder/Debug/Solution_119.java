package Jungol.LanguageCoder.Debug;

public class Solution_119 {

    public static void main(String[] args) {

        java.util.Calendar cal = java.util.Calendar.getInstance();

        int a = 0;

        System.out.print(a + " ");
        a = cal.get(java.util.Calendar.YEAR) - 1900; //---①

        System.out.print(a + " ");
        a += cal.get(java.util.Calendar.MONTH); //---②

        a += cal.get(java.util.Calendar.DATE);
        System.out.print(a + " ");

    }

}