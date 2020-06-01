package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import services.DictionaryImpl;

@Controller
public class DictionaryController {
    DictionaryImpl dictionary = new DictionaryImpl();
    @RequestMapping(value = "/dictionary", method = RequestMethod.POST)
    public String Dictionary(@RequestParam String english, Model model){
        model.addAttribute("vietnam", dictionary.search(english));
        model.addAttribute("english", english);
        return "search";
    }
}
