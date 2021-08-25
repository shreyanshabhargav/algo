package algo;

public class StringReverse {
    public String reverse(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        char[] arr = input.toCharArray();
        int start = 0, end = arr.length - 1;
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return new String(arr);
    }
}
