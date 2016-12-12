package tank.web;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import tank.domain.Topping;

@RequestMapping("/toppings")
@Controller
@RooWebScaffold(path = "toppings", formBackingObject = Topping.class)
public class ToppingController {
}
