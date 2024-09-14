package DSA.basics;

public class FloorCeil {
    public static int getFloor(int[] arr , int x){
        int start  = 0 ;
        int end  = arr.length-1;
        int answer = 0 ;
        while(start<=end){
            int mid  =( start+ end )/2;
            if(arr[mid] <=x){
                answer = arr[mid];
                start =  mid+1;
            }
            else{
                end  = mid-1;
            }
        }
        return answer;
    }


    public static int getCeil(int[] arr , int x){
        int start  = 0 ;
        int end  = arr.length-1;
        int answer = 0 ;
        while(start<=end){
            int mid  =( start+ end )/2;
            if(arr[mid] >=x){
                answer = arr[mid];
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{3,4,4,7,8,10};
        int x = 5 ;

        System.out.println(getCeil(arr,x));
    }
}
