package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bucketsort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 2, 4, 0, 2, 1, 4, 1, 24, 10, 74, 85, 11, 45, 24, 11));
        List<Integer> bucketSort = bucketSort(list, 2);
        System.out.println(bucketSort);
    }

    public static List<Integer> bucketSort(List<Integer> array, int bucketSize) {
        //�Ϸ���У��
        if (array == null || array.size() < 2 || bucketSize < 1) {
            return array;
        }
        //�ҳ�������Ԫ�ص����ֵ����Сֵ
        int max = array.get(0);
        int min = array.get(0);
        for (Integer integer : array) {
            if (integer > max) {
                max = integer;
            }
            if (integer < min) {
                min = integer;
            }
        }
        //����Ͱ�ĸ���   �����е���Сֵ�����ֵ �ж�Ͱ�ĸ���
        int bucketCount = (max - min) / bucketSize + 1;
        //����˳�򴴽�Ͱ ����һ��list���±�
        List<List<Integer>> bucketList = new ArrayList<>();
        for (int i = 0; i < bucketCount; i++) {
            bucketList.add(new ArrayList<>());
        }
        //��������ļ���������ӵ���Ӧ��Ͱ��
        //�����ҵ�Ԫ������Ӧ��Ͱ��˳��  �ٽ�Ԫ����ӵ�Ͱ��
        for (Integer integer : array) {
            int bucketIndex = (integer - min) / bucketSize;
            bucketList.get(bucketIndex).add(integer);
        }

        //��Ͱ�ڵ�Ԫ�ؽ�������
        List<Integer> resultList = new ArrayList<>();
        for (List<Integer> everyBucket : bucketList) {
            if (everyBucket.size() > 0) {
                if (bucketCount == 1) {
                    bucketSize--;
                }
                //�ݹ����  ��������
                List<Integer> temp = bucketSort(everyBucket, bucketSize);
                //�ϲ�����
                resultList.addAll(temp);
            }
        }
        return resultList;
    }
}

