package com.zipcodewilmington;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return  array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(String ar:array){
            if( ar.contains(value));
        }
        return true;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        int i=0;
        int length=array.length-1;
        String[] result = new String[array.length];
        while(length>=0){
            //  System.out.println(array[length]);
            result[i] = array[length];
            length--;
            i++;
        }
        System.out.println(Arrays.toString(result));
        return result;

    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
      return Arrays.equals(array,reverse(array));
      //  return Arrays.equals(array,reverse(Arrays.copyOf(array,array.length)));  //don't understamnd we need copy

    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count=0;
        for(int i=0; i<array.length-1; i++){

            if(array[i].equals(value))
                count++;
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> al=new ArrayList<String>(Arrays.asList(array));
        //List<String> al=Arrays.asList(array);  //not working
        ArrayList<String> removedAl=new ArrayList<>();

        for(String s:al){
            if(s.equals(valueToRemove))
                removedAl.add(s);
        }
        System.out.println("string removed:"+removedAl);
        al.removeAll(removedAl);
        //System.out.println(al);

        String[] st=al.toArray(new String[al.size()]); //converts ArrayList to String[]
        return st;

    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> al=new ArrayList<>(Arrays.asList(array));
        ArrayList<String> removeCon=new ArrayList<>();

       for (int i=0; i<al.size();i++){
//           if(al[i].equals(al[i+1])){
//               removeCon.add(al[i]);
//           }
           System.out.println("string removed:"+removeCon);
           al.removeAll(removeCon);
       }
       String[] st=al.toArray(new String[al.size()]);
      return st;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
