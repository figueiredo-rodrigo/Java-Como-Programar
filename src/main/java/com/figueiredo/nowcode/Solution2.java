package com.figueiredo.nowcode;

public class Solution2 {

    public static void main(String[] args) {

        // declara array variável e o inicializa com um objeto array
        int[] numbers = { 2,1,3,1,4 };

        int t = 0;

        for (int count1 = 0; count1 < numbers.length; count1++)

            for (int count0 = count1 + 1; count0 < numbers.length; count0++) {

                if (numbers[count1] == numbers[count0] && t == 0) {
                    

                        System.out.print(numbers[count0]);
                        t = 1;
                    
                    
                }
            }

    }

}