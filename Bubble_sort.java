public class demo {
    public static void main(String[] args) {
        int []arr = new int[]{1,3,2,7,3,2,1,4,6,7,4,32,3,5,6,7,54,3,23,2,4,5,6,5,4,34};
        int temp;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++) {
                if (arr[j]>arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                    /*不用临时变量
                    方式一:
                    a = a+b;
                    b = a-b;
                    a = a-b;
                    方式二:
                    a = a^b;
                    b = a^b;
                    a = a^b;
                    */
                }
            }
        }
        for (int j:arr
        ) {
            System.out.print(j+", ");
        }

    }
}
