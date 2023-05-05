package JDBC;

import java.util.Random;

public class GetRandomNumber {
    public static int[] getRandomNumber(int max, int amount) {
        //1到max之间的amount个不同随机整数（左闭右闭，包含端点）
        int[] randomNumber = new int[amount];
        int index = 0;
        randomNumber[0] = -1;
        Random random = new Random();
        while (index < amount) {
            int number = random.nextInt(max) + 1;
            boolean isInArrays = false;
            for (int m : randomNumber)//m依次取数组randomNumber元素的值
                if (m == number)//去重
                {
                    isInArrays = true;
                    break;
                }
            if (!isInArrays) {
                //如果number不在数组中，则加入
                randomNumber[index] = number;
                index++;
            }
        }
        return randomNumber;
    }
}
