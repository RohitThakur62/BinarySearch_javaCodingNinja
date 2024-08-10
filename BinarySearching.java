class BinarySearching {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 4;
        int ans = Binary(arr, target);
        System.out.println(ans);
    }

    static int Binary(int[] a, int element) {
        int s = 0;
        int e = a.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2; // Correctly calculate the midpoint
            if (element < a[mid]) {
                e = mid - 1;
            } else if (element > a[mid]) {
                s = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
