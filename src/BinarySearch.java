public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySeacrch(new int [] {-1,2,3,4,5,6,7,8,9}, 7));
    }

    public static int binarySeacrch (int a [], int key){
        int low = 0;
        int hight = a.length - 1;

        while (low <= hight) {
            int middle = low + (hight - low) / 2;

            if (key < a[middle]){
                hight = middle -1;
            }else if (key > a[middle]){
                low = middle + 1;
            }else{
                return middle;
            }
        }

        return -1;
    }
}
