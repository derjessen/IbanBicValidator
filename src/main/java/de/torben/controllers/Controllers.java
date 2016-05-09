package de.torben.controllers;

import org.iban4j.IbanFormatException;
import org.iban4j.IbanUtil;
import org.iban4j.InvalidCheckDigitException;
import org.iban4j.UnsupportedCountryException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Torben Jessen
 */
@Controller
public class Controllers {

    @RequestMapping(value = "/roflcopter/{iban}", method = RequestMethod.GET)
    @ResponseBody
    String home(@PathVariable("iban") String iban) {
        String rofl;
        try {
            IbanUtil.validate(iban);
            rofl = "ya geht";
        } catch (IbanFormatException | InvalidCheckDigitException | UnsupportedCountryException e) {
            rofl = e.getMessage();
        }
        return rofl;
    }

    @RequestMapping("/")
    @ResponseBody
    String index() {
        return "<h1>index</h1>";
    }
}
