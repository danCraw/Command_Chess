package utils;

public class ArrayUtils {

    public static <T> boolean contains(T[] arr, T element) {
        for (T e : arr) {
            if (e.equals(element)) {
                return true;
            }
        }
        return false;
    }
}
