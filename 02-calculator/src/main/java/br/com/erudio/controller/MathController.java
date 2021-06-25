package br.com.erudio.controller;

import br.com.erudio.exception.UnsuportedMathOperationException;
import org.springframework.web.bind.annotation.*;

import static br.com.erudio.controller.ConvertToDouble.convertToDouble;
import static br.com.erudio.controller.ConvertToDouble.isNumeric;


@RestController
public class MathController {



    @RequestMapping(value="/sum/{numberOne}/{numberTwo}",method = RequestMethod.GET)
    public Double sum(@PathVariable("numberOne")String numberOne,@PathVariable("numberTwo")String numberTwo) throws Exception {
        if ((!isNumeric(numberOne))||(!isNumeric(numberTwo)) ){
            throw new UnsuportedMathOperationException("Please set a numeric Value!");
        }
        Double sum = convertToDouble(numberOne) + convertToDouble(numberTwo);
        return sum;
    }



    }

