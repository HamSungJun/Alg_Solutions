package Codility.Iterations;

public class BinaryGap {

    public static void main(String[] args) {

        String binaryString = Integer.toBinaryString(32);

        int maxBinaryGap = 0;
        for (int i = 1; i < binaryString.length(); i++) {

            if(binaryString.charAt(i) == '0'){

                if(isBinaryGap(binaryString.substring(i))){

                    int subCounter = 0;
                    int startIdx = i;
                    while (binaryString.charAt(startIdx) != '1'){
                        subCounter++;
                        startIdx++;
                    }

                    if(maxBinaryGap < subCounter){
                        maxBinaryGap = subCounter;
                    }

                } else {
                    break;
                }

            }

        }

        System.out.println(maxBinaryGap);

    }

    public static boolean isBinaryGap(String binaryString){

        System.out.println(binaryString);
        boolean isBinaryGap = false;
        for (int i = 0; i < binaryString.length(); i++) {

            if(binaryString.charAt(i) == '1'){
                isBinaryGap = true;
            }

        }

        return isBinaryGap;

    }

}
