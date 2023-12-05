public class demoSorting {
    public static void main(String[] args) {
        // insertion sort
        int[] arr = { 1, 2, 5, 6, 7, 4, 3, 9, 8 };
        mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static int[] insertSortArray(int[] arr) {
        // insertion sort
        int temp, j;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i - 1;
            // 当前要排序的值小过遍历的值的时候才会遍历
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;

        }
        return arr;
    }

    public static int[] bubbleSortArray(int[] arr) {
        // bubble sort array
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr) {
        // selection sort array
        // 定义一个变量存储最小值
        // 定义一个外部循环循环第一个值
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            // 定义一个内部循环对数组所有值进行比较找出最小值
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            // 查看当前遍历的值是否是最小的值 如果不是就赋值
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        return arr;

    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int i = start;
            int j = end;
            int pivot = arr[i];
            while (i < j) {
                while (i < j && arr[j] > pivot)
                    j--;
                if (i < j)
                    arr[i++] = arr[j];
                while (i < j && arr[i] < pivot)
                    i++;
                if (i < j)
                    arr[j--] = arr[i];
            }
            arr[i] = pivot;
            System.out.println("i am pivot " + pivot);
            quickSort(arr, i + 1, end);
            quickSort(arr, start, i - 1);
        }
    }

    // 排序入口
    public static void mergeSort(int[] A) {
        sort(A, 0, A.length - 1);
    }

    // 递归
    public static void sort(int[] A, int start, int end) {
        if (start >= end)
            return;
        // 找出中间索引
        int mid = (start + end) / 2;
        // 对左边数组进行递归
        sort(A, start, mid);
        // 对右边数组进行递归
        sort(A, mid + 1, end);
        // 合并
        merge(A, start, mid, end);

    }

    // 将两个数组进行归并，归并前面2个数组已有序，归并后依然有序
    public static void merge(int[] A, int start, int mid, int end) {
        int[] temp = new int[A.length];// 临时数组
        int k = 0;
        int i = start;
        int j = mid + 1;
        while (i <= mid && j <= end) {
            // 从两个数组中取出较小的放入临时数组
            if (A[i] <= A[j]) {
                temp[k++] = A[i++];
            } else {
                temp[k++] = A[j++];
            }
        }
        // 剩余部分依次放入临时数组（实际上两个while只会执行其中一个）
        while (i <= mid) {
            temp[k++] = A[i++];
        }
        while (j <= end) {
            temp[k++] = A[j++];
        }
        // 将临时数组中的内容拷贝回原数组中 （left-right范围的内容）
        for (int m = 0; m < k; m++) {
            A[m + start] = temp[m];
        }
    }
}
