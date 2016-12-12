package tank.web;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import tank.domain.KUYTOR;

@RequestMapping("/kuytors")
@Controller
@RooWebScaffold(path = "kuytors", formBackingObject = KUYTOR.class)
public class KUYTORController {
}
