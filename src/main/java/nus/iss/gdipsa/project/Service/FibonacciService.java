package nus.iss.gdipsa.project.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FibonacciService {
    
    // Get unsorted fib seq
    public Integer[] GetFibSeq(Integer numOfElements)
    {
        Integer[] sequenceUnsorted = new Integer[numOfElements];

        for (int i=0; i<=numOfElements-1; i++){
            Integer n = (Integer) NthElementOfFibonacci(i);
            sequenceUnsorted[i] = n;
        }

        return sequenceUnsorted;
    }

    // get nth element of fib seq
    int NthElementOfFibonacci(int n)
    {
        if (n == 0){
            return 0;
        }

        if (n == 1){
            return 1;
        }

        return NthElementOfFibonacci(n-1) + NthElementOfFibonacci(n-2);
    }

    // sort fib seq
    public Integer[] customSort(Integer[] unsorted){
        List<Integer> even = new ArrayList<Integer>();
        List<Integer> odd = new ArrayList<Integer>();
        List<Integer> sorted = new ArrayList<Integer>();

        for (Integer i : unsorted){
            if (i.intValue() % 2 == 0){
                even.add(i);
            }
            else if (i.intValue() % 2 != 0){
                odd.add(i);
            }
        }

        Collections.sort(even, Collections.reverseOrder());
        Collections.sort(odd, Collections.reverseOrder());

        sorted.addAll(even);
        sorted.addAll(odd);

        return sorted.toArray(new Integer[sorted.size()]);
    }
}
