package br.com.erudio.controller;


import br.com.erudio.exception.UnsuportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static br.com.erudio.controller.ConvertToDouble.convertToDouble;
import static br.com.erudio.controller.ConvertToDouble.isNumeric;

@RestController
public class DivController {

    @RequestMapping(value="/div/{numberOne}/{numberTwo}",method = RequestMethod.GET)
    public Double Div (@PathVariable("numberOne")String numberOne, @PathVariable("numberTwo")String numberTwo) throws Exception {
        if ((!isNumeric(numberOne))||(!isNumeric(numberTwo)) ){
            throw new UnsuportedMathOperationException("Please set a numeric Value!");
        }
        Double div = convertToDouble(numberOne) / convertToDouble(numberTwo);
        return div;
    }


}