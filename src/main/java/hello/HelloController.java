package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by swaraj on 14/6/16.
 *
 * @author evivehealth on 14/6/16.
 */
@Controller
public class HelloController {

    private static final String template = "Hello %s";

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String hello(Model model ) {
        model.addAttribute("name", "Swaraj Gandhi");
        return "hello";
    }

//    @RequestMapping("/error")
//    public String error() {
//        return "error";
//    }

}
