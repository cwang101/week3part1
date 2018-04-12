package com.thoughtworks.collection;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> result=new ArrayList<>();
        if(left<=right){
            for(int i=left;i<=right;i++){
                result.add(i);
            }
            return result;
        }
        for(int i=left;i>=right;i--){
            result.add(i);
        }
        return result;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> result=new ArrayList<>();
        if(left<=right){
            for(int i=left;i<=right;i++){
                if (i%2==0) {
                    result.add(i);
                }
            }
            return result;
        }
        for(int i=left;i>=right;i--){
            if (i%2==0) {
                result.add(i);
            }
        }
        return result;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> result=new ArrayList<>();
        for(int element:array){
            if (element%2==0){
                result.add(element);
            }
        }
        return result;
    }

    public int popLastElment(int[] array) {
        List<Integer> result= new ArrayList<>();
        for(int element:array){
            result.add(element);
        }
        return result.remove(result.size()-1);
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> first=Arrays.stream(firstArray).boxed().collect(Collectors.toList());
        List<Integer> second=Arrays.stream(secondArray).boxed().collect(Collectors.toList());
        first.retainAll(second);
        return first;

    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> result=new ArrayList<>();
        List<Integer> first=Arrays.asList(firstArray);
        List<Integer> second=Arrays.asList(secondArray);
        result.addAll(first);
        for (int element:second){
            if(!first.contains(element)){
                result.add(element);
            }
        }
        return result;
    }
}
