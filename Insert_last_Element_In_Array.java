public class Insert_last_Element_In_Array{
    public static void main(String[] args){
        int[]  arr={2,4,5,6,7,8,9,3};
        System.out.println(Insert_last_Element(arr));
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int Insert_last_Element(int[] arr){
        int item=arr[arr.length-1];
        int i=arr.length-2;
        while(i>0&&arr[i]>item){
            arr[i+1]=arr[i];
            i--;
        }
        return i+1;

    }


    }


