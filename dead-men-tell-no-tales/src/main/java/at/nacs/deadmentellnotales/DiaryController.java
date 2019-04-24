package at.nacs.deadmentellnotales;

import at.nacs.deadmentellnotales.configuration.Triedent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.security.RolesAllowed;
import javax.validation.Valid;

@Controller
@RequestMapping("/diary")
@RequiredArgsConstructor
public class DiaryController {

  private final Triedent triedent;

  @GetMapping
  String page() {
    return "diary";
  }

  @PostMapping
  String post() {
    triedent.setStatus(true);
    return "redirect:/";
  }
}