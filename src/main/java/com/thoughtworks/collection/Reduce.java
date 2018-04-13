package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return Collections.max(arrayList);
    }

    public double getMinimum() {
        return Collections.min(arrayList);
    }

    public double getAverage() {
        double result=0.0f;
        double sum=0.0f;
        for(int element:arrayList){
            sum+=element;
        }
        result=sum/arrayList.size();
        return result;
    }

    public double getOrderedMedian() {
        double result=0.0f;
        if (arrayList.size()%2!=0){
            int index=0;
            for(int element:arrayList){
                if(index==(arrayList.size()-1)/2){
                    result=element;
                    return result;
                }
                index++;
            }
        }
        int index=0;
        double before=0.0f;
        double after=0.0f;
        for(int element:arrayList){

            if(index==(arrayList.size())/2-1) {
                before = element;
            }
            if(index==(arrayList.size())/2) {
                after = element;
                result=(before+after)/2;
                return result;
            }
            index++;
        }
        throw new NotImplementedException();
    }

    public int getFirstEven() {
        for(int element:arrayList){
            if (element%2==0){
              return element;
            }
        }
        throw new NotImplementedException();
    }

    public int getIndexOfFirstEven() {
        int index=0;
        for(int element:arrayList){
            if (element%2==0){
                return index;
            }
            index++;
        }
        throw new NotImplementedException();
    }

    public boolean isEqual(List<Integer> arrayList) {
        if(this.arrayList.size()!=arrayList.size()){
            return false;
        }

        for(int i=0;i<arrayList.size();i++){
            if(this.arrayList.get(i)!=arrayList.get(i)){
                return false;
            }
        }
        return true;
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {
        for(int element:arrayList){
            singleLink.addTailPointer(element);
        }
        double result=0.0f;
        if (arrayList.size()%2!=0){
            result=(int) singleLink.getNode((arrayList.size()+1)/2);

        }else{
            int temp1=(int) singleLink.getNode(arrayList.size()/2);
            int temp2=(int) singleLink.getNode(arrayList.size()/2+1);
            result=((double)temp1+(double)temp2)/2;
        }
        return result;
    }

    public int getLastOdd() {
        for(int i=arrayList.size()-1;i>=0;i--){
            if(arrayList.get(i)%2!=0){
                return arrayList.get(i);
            }
        }
        throw new NotImplementedException();
    }

    public int getIndexOfLastOdd() {
        for(int i=arrayList.size()-1;i>=0;i--){
            if(arrayList.get(i)%2!=0){
                return i;
            }
        }
        throw new NotImplementedException();
    }
}
