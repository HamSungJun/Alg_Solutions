package Leetcode.Easy.Algorithm;

class Solution_125 {
    public boolean isPalindrome(String s) {

        if(s.equals("")){
            return true;
        } else {

            String[] alphanum = s.toLowerCase().replaceAll("\\W","").split("");
            for(int i = 0; i < alphanum.length / 2; i++){
                if(!alphanum[i].equals(alphanum[alphanum.length - 1 - i])){
                    return false;
                }
            }
        }

        return true;

    }
}
