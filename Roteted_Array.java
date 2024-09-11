public class Roteted_Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        Rotate(arr,k);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Rotate(int[] arr,int k) {
        int n=arr.length;
        k=k%n;
        Revsere(arr,0,n-k-1);
        Revsere(arr,n-k,n-1);
        Revsere(arr,0,n-1);

    }
    public static void Revsere(int[] arr,int i,int j) {
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
