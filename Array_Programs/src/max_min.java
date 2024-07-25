public class max_min {
    public static void main(String[] args){
        int[] arr={2,3,4,1,44};



        int max=findmax(arr);
        int min=findmin(arr);

        System.out.println("max:"+max);
        System.out.println("min:"+min);



    }
    public static int findmax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {   //for(int i=1;i<arr.length;i++)
            if (num > max) {    //if(arr[i]>max)
                max = num;    //max=arr[i]
            }
        }
        return max;
    }
        public static int findmin(int[] arr){
            int min=arr[0];
            for(int num:arr){   //for(int i=1;i<arr.length;i++)
                if(num<min){    //if(arr[i]<min)
                    min=num;    //min=arr[i]
                }
            }
            return min;

    }
}
