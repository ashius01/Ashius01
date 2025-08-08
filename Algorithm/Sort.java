package Heima.Algorithm;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {

        int[] arr = {2, 4, 5, 3, 1};
        //排序,默认升序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //二分查找
        System.out.println(Arrays.binarySearch(arr,19));
    }
    //打印数组
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    //冒泡排序
    public static void bubbleSort(int[] arr) {
        //循环arr.length - 1轮
        for(int i = 0; i < arr.length - 1; i++){
            //每一轮比较的数字数量为arr.length - i - 1
            //依次将第(i + 1)大的数据放到合适的位置(即倒数第i+1的位置)
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //选择排序
    public static void selectSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            //将第i个元素和之后的元素进行比较，找到第i小的元素
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    //插入排序
    public static void insertSort(int[] arr){
        //无序数组起始索引
        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[i + 1]){
                startIndex = i + 1;
                break;
            }
        }
        //依次查找无序数组的每个元素,然后插入有序数组
        for(int i = startIndex; i < arr.length; i++){
            //记录要插入元素的索引
            int j = i;
            //将无序数组的元素插入到有序数组中
            while(j > 0 && arr[j] < arr[j - 1]){
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    //快速排序
    public static void quickSort(int[] arr, int startIndex, int endIndex){

        //递归的出口,即结束条件
        if(startIndex >= endIndex){
            return;
        }
        //记录基准数
        int baseNumber = arr[startIndex];

        //记录要查找的范围,用i,j作为左,右指针
        int i = startIndex;
        int j = endIndex;

        //寻找两个数据,移动指针,找到后交换数据的位置
        while(i < j){

            //将右指针j向左移动,直到找到一个比基准数小的数据
            while (i < j){
                if(arr[j] < baseNumber){
                    break;
                }
                j--;
            }
            //后移动左指针i,方便后面基准数归位时将小的数据交换到左边
            //将左指针i向右移动,直到找到一个比基准数大的数据
            while (i < j) {
                if (arr[i] > baseNumber) {
                    break;
                }
                i++;
            }
            //找到后交换位置
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        //当左,右指针相遇时即 i = j，循环结束,相遇的位置即为基准数应该在的位置
        //将i索引的元素与基准数交换位置
        int temp = arr[i];
        arr[i] = arr[startIndex];
        arr[startIndex] = temp;
        //此时基准数左边的数字都比基准数小，基准数右边的数字都比基准数大
        //此数组最左边的元素放到了合适的位置

        //进行递归,将基准数左边数组的基准数放在合适的位置
        quickSort(arr, startIndex, i - 1);
        //进行递归,将基准数右边数组的基准数放在合适的位置
        quickSort(arr, i + 1, endIndex);

    }

}
