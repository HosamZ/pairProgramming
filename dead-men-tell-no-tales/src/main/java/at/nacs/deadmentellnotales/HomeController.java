package at.nacs.deadmentellnotales;

import at.nacs.deadmentellnotales.configuration.Triedent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class HomeController {

  @ModelAttribute("triedent")
  Triedent triedent() {
    return new Triedent();
  }

  @GetMapping
  String page() {
    return "redirect:/login";
  }
}