//package at.nacs.hotelroomsafe.view;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import javax.validation.Valid;
//
//@Controller
//@RequestMapping("/")
//public class GuestController {
//
//  @GetMapping("/login")
//  String page() {
//    return "login";
//  }
//
//  @GetMapping
//  String login(@Valid BindingResult result) {
//    if (result.hasErrors()) {
//      return page();
//    }
//    return "redirect:/login";
//  }
//
//  @PostMapping("login")
//  String post(@Valid BindingResult result) {
//    if (!result.hasErrors()) {
//      return "guest";
//    }
//    return "error";
//  }
//}