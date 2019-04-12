package org.otto.spike.springboot.RestController;

import org.otto.spike.springboot.Model.Hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  

  @GetMapping("/hello")
  public Hello getHelloWordObject() {
      Hello helloObj = new Hello();
      helloObj.setMessage("Hi there..!! ");
      return helloObj;
  }
}
