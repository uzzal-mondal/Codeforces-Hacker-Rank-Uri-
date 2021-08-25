package ProblemSolvingDayByDay.DataStructure.BinarySearch;

public class BinarySearch {
    int showBinarySearch(int[] aNum, int n, int searchData) {
        int l = 0, r = n - 1, mid;

        while (l <= r) {
            mid = ((l + r) / 2);
            if (searchData == aNum[mid]) {
                return mid;
            } else if (aNum[mid] < searchData ) {
                l = mid + 1;
            } else if (aNum[mid] > searchData) {
                r = mid - 1;
            }
        }
        return -1;
    }
}
