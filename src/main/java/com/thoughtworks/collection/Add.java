package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        //对两个边界从小打到排序
        if(leftBorder>rightBorder){
            int temp=leftBorder;
            leftBorder=rightBorder;
            rightBorder=temp;
        }
        int sum=0;
        for (int i=leftBorder;i<=rightBorder;i++){
            if (i%2==0){
                sum+=i;
            }
        }
        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        //对两个边界从小打到排序
        if(leftBorder>rightBorder){
            int temp=leftBorder;
            leftBorder=rightBorder;
            rightBorder=temp;
        }
        int sum=0;
        for (int i=leftBorder;i<=rightBorder;i++){
            if (i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum=0;
        for (int element:arrayList){
            sum+=(element*3+2);
        }
        return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> result=new ArrayList<>();
        for (int element:arrayList){
            if (element%2!=0){
                result.add(element*3+2);
                continue;
            }
            result.add(element);
        }
        return result;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int sum=0;
        for (int element:arrayList){
            if(element%2!=0) {
                sum += (element * 3 + 5);
            }
        }
        return sum;
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        double result=0.0f;
        Set<Integer> sets=new TreeSet<>();
        for (int element:arrayList){
            if(element%2==0) {
                sets.add(element);
            }
        }

        if (sets.size()%2!=0){
            int index=0;
            for(int element:sets){
                if(index==(sets.size()-1)/2){
                result=element;
                return result;
                }
                index++;
            }
        }
        int index=0;
        double before=0.0f;
        double after=0.0f;
        for(int element:sets){

            if(index==(sets.size())/2-1) {
                before = element;
            }
            if(index==(sets.size())/2) {
                after = element;
                result=(before+after)/2;
                return result;
            }
            index++;
        }

        throw new NotImplementedException();
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        double result=0.0f;
        int num=0;
        for(int element:arrayList){
            if(element%2==0){
                result+=element;
                num++;
            }
        }
        return result/num;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        List<Integer> temp=new ArrayList<>();
        for(int element:arrayList){
            if(element%2==0){
                temp.add(element);
            }
        }
        return temp.contains(specialElment);
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> temp=new ArrayList<>();
        for(int element:arrayList){
            if(element%2==0&&!temp.contains(element)){
                temp.add(element);
            }
        }
        return temp;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> result=new ArrayList<>();
        List<Integer> odds=new ArrayList<>();
        List<Integer> events=new ArrayList<>();
        for(int element:arrayList){
            if(element%2==0){
                events.add(element);
            }else {
                odds.add(element);
            }
        }
        events.sort(Comparator.naturalOrder());
        odds.sort(Comparator.reverseOrder());
        result.addAll(events);
        result.addAll(odds);
        return result;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<arrayList.size()-1;i++){
            result.add((arrayList.get(i)+arrayList.get(i+1))*3);
        }
        return result;
    }
}
