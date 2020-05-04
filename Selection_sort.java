//时间复杂度为O(n2)
public class demo {
    public static void main(String[] args) {
        int []arr = new int[]{1,3,2,7,3,2};
        int temp;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++) {
                if (arr[i]>arr[j]){
                    //引入变量
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    /*不引入变量方式一
                    a = a+b;
                    b = a-b;
                    a = a-b;
                    */
                    /*不引入变量方式二
                    a = a^b;
                    b = a^b;
                    a = a^b;
                    */
                }
            }
        }
        for (int j:arr
        ) {
            System.out.print(j);
        }

    }
}
