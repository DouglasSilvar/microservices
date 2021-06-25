package br.com.erudio.controller;

import br.com.erudio.exception.UnsuportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static br.com.erudio.controller.ConvertToDouble.convertToDouble;
import static br.com.erudio.controller.ConvertToDouble.isNumeric;

@RestController
public class AverageController {

    @RequestMapping(value="/avg/{numberOne}/{numberTwo}",method = RequestMethod.GET)
    public Double Avg (@PathVariable("numberOne")String numberOne, @PathVariable("numberTwo")String numberTwo) throws Exception {
        if ((!isNumeric(numberOne))||(!isNumeric(numberTwo)) ){
            throw new UnsuportedMathOperationException("Please set a numeric Value!");
        }
        Double avg = ((convertToDouble(numberOne) + convertToDouble(numberTwo))/2);
        return avg;
    }


}
