package nus.iss.gdipsa.project.Model;

public class FibonacciSequence {
    private Integer[] fibonacci;
    private Integer[] sorted;
    
    public FibonacciSequence(Integer[] fibonacci, Integer[] sorted) {
        this.fibonacci = fibonacci;
        this.sorted = sorted;
    }

    public Integer[] getFibonacci() {
        return fibonacci;
    }

    public void setFibonacci(Integer[] fibonacci) {
        this.fibonacci = fibonacci;
    }

    public Integer[] getSorted() {
        return sorted;
    }

    public void setSorted(Integer[] sorted) {
        this.sorted = sorted;
    }
}
