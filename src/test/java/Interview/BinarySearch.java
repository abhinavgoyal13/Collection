package Interview;

public class BinarySearch {
    public void binarySrch(int[] arr, int key)
    {
        int low =0;
        int high=arr.length-1;

        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]==key)
            {
                System.out.println(mid);
                break;
            }
            else if(arr[mid] > key)
            {
                high = mid -1;
            }
            else{
                low=mid+1;
            }

        }
        if(low>high)
        {
            System.out.println("no matching");
        }

    }

    public static void main(String[] args)
    {
        BinarySearch bv = new BinarySearch();
        int[] arr={2,3,4,5,10,20};
        bv.binarySrch(arr,80);


    }
}
