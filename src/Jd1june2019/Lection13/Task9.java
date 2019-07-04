package Jd1june2019.Lection13;

public class Task9 {
    public static void main(String[] args) {
        String text = "MMCDXXXVII";
        char[] array = text.toCharArray();
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case ('M'): {
                    arr[i] = 1000;
                    continue;
                }
                case ('D'): {
                    arr[i] = 500;
                    continue;
                }
                case ('C'): {
                    arr[i] = 100;
                    continue;
                }
                case ('L'): {
                    arr[i] = 50;
                    continue;
                }
                case ('X'): {
                    arr[i] = 10;
                    continue;
                }
                case ('V'): {
                    arr[i] = 5;
                    continue;
                }
                case ('I'): {
                    arr[i] = 1;
                    continue;
                }
            }
        }
        int sum = arr[arr.length - 1];

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                sum += arr[i];
            } else sum -= arr[i];

        }
        System.out.println(sum);
    }

}
