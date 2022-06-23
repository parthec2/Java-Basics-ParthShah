package com.techstack.parthshah.javabasics.threading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.techstack.parthshah.javabasics.models.Cricketer;

public class ThreadDemo1 {

	public static void main(String[] args) {

		Integer[] arry = {1,2,3,4,5,6,7,8,9,1};
        ExecutorService exec = Executors.newFixedThreadPool(3);
        int chunks = (int) Math.ceil((double) arry.length/3);
        int startIndex=0;
        int endIndex=0;
        List<Future<Integer>> lstFuture = new ArrayList<>();
        for(int c=0; c<chunks;c++) {
        	startIndex = c * 3;
        	endIndex = startIndex + 3;
        	if(endIndex>arry.length) {
        		endIndex = arry.length;
        	}
        	ArraySum objArrySum = new ArraySum(startIndex,endIndex,arry);
        	Future<Integer> submit = exec.submit(objArrySum);
        	lstFuture.add(submit);
        }
       
         Integer finalSum=0;
         for(Future<Integer> f : lstFuture) {
        	if(!f.isDone()) {
        		//thread has not completed task to give signal to cpu to take resources
        		//which will avoid delay
        		Thread.yield();
        	}
        	
        	try {
				Integer sum = f.get();
				finalSum = finalSum + sum;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        };
        System.out.println("Final sum is -:"+ finalSum);
	}
	
	
	
}//end of class Streams_reduce

class ArraySum implements Callable<Integer>{

    int startIndex=0;
    int endIndex=0;
    Integer[] arry;
	ArraySum(){
		
	}
	ArraySum(int s,int e,Integer[] arry) {
		this.startIndex=s;
		this.endIndex=e;
		this.arry = arry;
	}
	
	@Override
	public Integer call() throws Exception {
		Integer sum=0;
        for(int i=startIndex;i < endIndex;i++ ) {
        	Integer local = arry[i];
        	sum = sum + local;
        }
		return sum;
	}

	
	
	
	
}