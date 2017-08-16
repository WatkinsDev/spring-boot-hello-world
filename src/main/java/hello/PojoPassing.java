package hello;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class PojoPassing{
  @RequestMapping(value = "/ex/foos/{fooid}/bar/{barid}", method = RequestMethod.GET)
  @ResponseBody
  public String getFoosBySimplePathWithPathVariables
    (@PathVariable long fooid, @PathVariable long barid) {
      return "Get a specific Bar with id=" + barid +
        " from a Foo with id=" + fooid;
  }
}
