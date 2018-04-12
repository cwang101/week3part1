package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> result=new ArrayList<>();
        for (int element:array){
            result.add(3*element);
        }
        return result;
    }

    public List<String> mapLetter() {
        List<String> result=new ArrayList<>();
        for (int element:array){
            result.add(letters[element-1]);
        }
        return result;
    }

    public List<String> mapLetters() {
        List<String> result=new ArrayList<>();
        for (int element:array){
            int quotient=element/letters.length;
            int remainder=element%letters.length;
            if(remainder==0){
                quotient-=1;
            }
            StringBuilder sb=new StringBuilder();
            if(quotient>0){
                sb.append(letters[quotient-1]);
            }
            if(remainder>0) {
                sb.append(letters[remainder - 1]);
            }else {
                sb.append(letters[letters.length - 1]);
            }
            result.add(sb.toString());
        }
        return result;
    }

    public List<Integer> sortFromBig() {
        array.sort(Comparator.reverseOrder());
        return array;
    }

    public List<Integer> sortFromSmall() {
        array.sort(Comparator.naturalOrder());
        return array;
    }
}
