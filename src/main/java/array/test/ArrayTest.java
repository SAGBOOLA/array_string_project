package array.test;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args){

    }

    public static void ex1(){
        int [] numbers = {23, 11, 39, 45, 67};
        for (int number : numbers) {
            System.out.print(number+"\t");
        }
    }

    public static int indexOf(int[] arrays, int x){
        if (arrays == null) return -1;
        int length = arrays.length;
        int i = 0;
        while (i<length){
            if (arrays[i] == x){
                return i;
            } else {
                i = i + 1;
            }
        }
        return -1;

    }
    public static void ex2(){
        int[] arrays = {3, 15, 5, 17, 73, 24};
        System.out.println("Index position of 5 is: " + indexOf(arrays,6));
    }

    public static void ex3(){
        String [] stringArray = {"Paris", "London", "New York", "Stockholm"};
        Arrays.sort(stringArray);
        for (String names : stringArray){
            System.out.println(names);
        }
    }

    public static void ex4(){
        int [] array1 = {1, 15, 20};
        int [] array2 = Arrays.copyOf(array1,3);
        System.out.println("This is array1:");
        for (int arrays : array1){
            System.out.println(arrays);
        }
        System.out.println("This is array2:");
        for (int array : array2){
            System.out.println(array);
        }
    }

    public static void ex5(){
        String[][] cities = new String[3][2];
        cities[0][0] = "France";
        cities[0][1] = "Paris";
        cities[1][0] = "Sweden";
        cities[1][1] = "Stockholm";
        cities[2][0] = "United Kingdom";
        cities[2][1] = "London";
        for (String[] city : cities) {
            for (int j = 0; j < city.length; j++) {
                System.out.print(city[j]+"\t");
                if (j == city.length - 1) {
                    System.out.println();
                }
            }
        }
    }

    public static void ex6(){
        int[] numbers = {43, 5, 23, 17, 2, 14};
        float sum = 0;
        float average = 0;
        for (int number : numbers) {
            sum += number;
            average = sum / 6;
        }
        System.out.printf("%.1f", average);
    }

    public static void ex7(){
        int[] numbers = {1, 2, 4, 7, 9, 12, 17, 23, 32, 14};
        System.out.println("The Array:" + "\n" + Arrays.toString(numbers) + "\t");
        System.out.println("The Odd Array:");
        for (int number : numbers) {
            if (number % 2 != 0){
                System.out.print(number+"\t");
            }
        }
    }

    public static int dupElement(int[] array, int y){
        if (y==0 || y==1){
            return y;
        }
        int[] tmpValue = new int[y];
        int z = 0;
        for (int i = 0; i<y-1; i++){
            if (array[i] != array[i+1]){
                tmpValue[z++] = array[i];
            }
        }
        tmpValue[z++] = array[y-1];
        for (int i = 0; i<z; i++){
            array[i] = tmpValue[i];
        }
        return z;

    }

    public static void ex8(){
        int [] array = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        Arrays.sort(array);
        int length = array.length;
        int value = dupElement(array,length);
        for (int i = 0; i<value; i++){
            System.out.print(array[i]+"\t");
        }
    }

    /*
    public static int dynArray(int [] initialValue, int size){
        int count = initialValue.length;
        int index = 0;
        //int element = new int [];
        if (index >= count){
            int[] tempValues = initialValue;
            tempValues = new int[count*2];
            for (int i=0; i< tempValues.length; i++){
                initialValue[i] = tempValues[i];
            }
            initialValue[index] = element;
            index++;
            return initialValue
        }

    }

     */




    public static void ex10(){
        //int [][] data = new int[10][10];
        int[][] data = timesTable(10,10);
        for (int row = 0; row<data.length; row++){
            for (int column = 0; column<data[row].length; column++){
                System.out.printf(data[row][column]+"\t");
            }
            System.out.println();
        }
    }
    public static int [][]timesTable(int r, int c){
        int [][] multiply = new int[r][c];
        for (int row = 0; row<multiply.length; row++){
            for (int column = 0; column<multiply[row].length; column++){
                multiply[row][column] = (row+1)*(column+1);
            }
        }
        return multiply;
    }

    public static void ex13(){
        int [] array = {2, 3, 7, 8, 17, 12};
        int [] array2 = new int [array.length];
        int j = array.length - 1;
        int k = 0;
        for (int i = 0; i< array.length; i++){
            if (array[i] % 2 == 0){
                array2[j--] = array[i];
            } else {
                array2[k++] = array[i];
            }
        }
        System.out.println(Arrays.toString(array2));
    }

    public static void diagonal (int[][] arr, int x){
        System.out.println("The diagonal is: ");
        for (int i = 0; i<x; i++){
            System.out.print(arr[i][i]+" ");
        }
        System.out.println();
    }

    public static void ex12(){
        int x = 3;
        int [][] arr = {{1, 2, 3}, {2, 4, 6}, {3, 6, 9}};
        diagonal(arr,x);
    }

    public static void reverseArray (String [] num){
        String [] newNum = new String [num.length];
        for (int i = 0; i<num.length; i++){
            newNum[i] = num[num.length-1-i];
        }
        System.out.println(Arrays.toString(newNum));

    }
    public static String [] addNum(String [] orgArray, int newNumber){
        String [] newArray = Arrays.copyOf(orgArray, orgArray.length+1);
        newArray[newArray.length-1] = String.valueOf(newNumber);
        return newArray;
    }

    public static int getValue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number, then enter -1 to exit");
        int value = sc.nextInt();
        return value;
    }

    public static String [] getMoreValue(String[] array){
        String[] arrays = new String[0];
        boolean getMore = true;
        while (true){
            int value = getValue();
            String[] intValue = addNum(arrays, value);
            if (value == -1){
                getMore = false;
            }
            return array;
        }
    }

    public static String[] printResult(String[] arr){
        System.out.println("The result: ");
        for (int i = 0; i<arr.length-1; i++){
            System.out.println(arr[i]);
        }
        return arr;
    }

    public static void ex11(){
        int value = getValue();
        String[] orgValue = new String[0];
        String [] intArray = addNum(orgValue, value);
        getMoreValue(intArray);
        printResult(intArray);
        reverseArray(intArray);
    }

    public static void ex9(){
        Scanner scan = new Scanner(System.in);
        boolean userInput = true;
        while (userInput){
            System.out.println("Input number: ");
            int num1 = scan.nextInt();
            int [] array = new int [0];
            int [] newArray = Arrays.copyOf(array, array.length+1);
            newArray[newArray.length-1] = num1;
            array = newArray;
            if (num1>6){
                userInput = false;
            }
            System.out.println(Arrays.toString(array));
        }

    }

    public static void ex14() {
        String [] coolNames = {"Erik", "Steven", "Joseph", "Henrik"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Add a name");
        String getName = sc.nextLine();
        String [] allNames = addMoreNames(coolNames,getName);
        System.out.println(Arrays.toString(allNames));
    }

    public static String [] addMoreNames (String[] names, String name){
        String [] moreNames = Arrays.copyOf(names,names.length+1);
        moreNames[moreNames.length-1] = name;
        return moreNames;
    }

}



