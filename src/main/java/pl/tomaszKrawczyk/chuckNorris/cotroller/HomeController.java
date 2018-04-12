package pl.tomaszKrawczyk.chuckNorris.cotroller;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Tomek Krawczyk on 23.01.2018.
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String index(ModelMap modelMap){

        ChuckNorrisQuotes chuckNorrisQuotes=new ChuckNorrisQuotes();

        modelMap.addAttribute("quote",chuckNorrisQuotes.getRandomQuote());
        return "index";
    }


}
