package nus.iss.gdipsa.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nus.iss.gdipsa.project.Model.FibonacciSequence;
import nus.iss.gdipsa.project.Service.FibonacciService;

@CrossOrigin(origins = "http://localhost:3000") // React's default
@RestController
@RequestMapping("/")
public class HomeController {
    @Autowired
    FibonacciService fibonacciService;
    
    @GetMapping("/fibonacci/{numOfElements}")
    public ResponseEntity<FibonacciSequence> GetFibonacciSequence(@PathVariable("numOfElements") String numOfElements){
    
        int num = Integer.parseInt(numOfElements);
        
        if (num <= 0){
            return new ResponseEntity<>(null, HttpStatus.NOT_ACCEPTABLE);
        }

        Integer[] unsorted = fibonacciService.GetFibSeq(num);
        Integer[] sorted = fibonacciService.customSort(unsorted);
        
        FibonacciSequence fibseq = new FibonacciSequence(unsorted, sorted);

        return new ResponseEntity<FibonacciSequence>(fibseq, HttpStatus.OK);
    }
}
