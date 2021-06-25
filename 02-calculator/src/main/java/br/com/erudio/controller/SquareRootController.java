package br.com.erudio.controller;

import br.com.erudio.exception.UnsuportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static br.com.erudio.controller.ConvertToDouble.convertToDouble;
import static br.com.erudio.controller.ConvertToDouble.isNumeric;

@RestController
public class SquareRootController {

    @RequestMapping(value="/sqr/{numberOne}",method = RequestMethod.GET)
    public Double Sqr (@PathVariable("numberOne")String numberOne) throws Exception {
        if (!isNumeric(numberOne)){
            throw new UnsuportedMathOperationException("Please set a numeric Value!");
        }
        Double sqr = Math.sqrt(convertToDouble(numberOne)) ;
        return sqr;
    }


}
