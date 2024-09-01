package DSA.basics;

public class Quic {
    public static void main(String[] args) {
        quickSort(new int[]{3,6,5,47,45,12,33,22,11});
    }

    private static void quickSort(int[] ints) {
        int start  = 0 ;
        int end = ints.length;
        quic(ints, start, end-1);

        System.out.println(ints);
    }

    private static void quic(int[] array, int start, int end) {
        if(start<end){
            int x = getpivot(array , start , end );
            quic(array, start , x-1);
            quic(array, x+1 , end);

        }
    }

    private static int getpivot(int[] array, int start, int end) {
        int pivot = array[end];
        int itr = start ;
        for(int i = itr ; i <end;i++){
            if(array[i]<pivot){
                int temp = array[i];
                array[i] = array[itr];
                array[itr] = temp;
                itr++;
            }
        }
        int temp = array[end];
        array[end] = array[itr];
        array[itr] = temp;

        return itr;
    }
}
