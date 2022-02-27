public class MainApp {

    public static void main(String[] args) {

        int[] numbers = {2, 4, 1, 9, 5, 2, 4, 0, 5, 8};

// exercise 1:

        int currentHighest;

        for (int i = 0; i < numbers.length; i++) {
            currentHighest = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] > numbers[i]) {
                    currentHighest = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = currentHighest;
                }
            }
        }

        for (int number : numbers) {
            System.out.println(number);
        }

//exercise 2:
//        int currentLowest;
//
//        for (int i = 0; i < numbers.length; i++) {
//            currentLowest = numbers[i];
//            for (int j = i + 1; j < numbers.length; j++) {
//                if (numbers[j] < currentLowest) {
//                    currentLowest = numbers[j];
//                    numbers[j] = numbers[i];
//                    numbers[i] = currentLowest;
//                }
//            }
//        }
//
//        for (int number : numbers) {
//            System.out.println(number);
//        }

//exercise 3:
//        int[] numbers = {2, 2, 3, 4, 5, 7, 7, 7, 8, 8, 2};
//
//        int evens = 0;
//        int odds = 0;
//
//        for (int number : numbers) {
//            if (number % 2 == 0) {
//                evens++;
//            }
//            else {
//                odds++;
//            }
//        }
//        System.out.println("There are " + evens + " even numbers and " + odds + " odd numbers.");

//        int[] numbers = {1, 2, 3 ,4, 5};

// With two variables:

//        int first = numbers[0];
//        int last = numbers[numbers.length - 1];
//
//        numbers[0] = last;
//        numbers[numbers.length - 1] = first;
//
//        for (int number : numbers) {
//            System.out.println(number);
//        }

// With one variable:
//        int first = numbers[0];
//        numbers[0] = numbers[numbers.length - 1];
//        numbers[numbers.length - 1] = first;
//
//        for (int number : numbers) {
//            System.out.println(number);
//        }


// With no variables:
//        numbers[numbers.length - 1] = numbers[numbers.length - 1] + numbers[0];
//        numbers[0] = numbers[numbers.length - 1] - numbers[0];
//        numbers[numbers.length - 1] = numbers[numbers.length - 1] - numbers[0];
//
//        for (int number : numbers) {
//            System.out.println(number);
//        }
//
    }
}
