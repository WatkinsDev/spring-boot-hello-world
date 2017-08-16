package hello;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import hello.models.Car;

@RestController
@EnableAutoConfiguration
public class JsonExample{
  @RequestMapping(value = "/car")
  public ResponseEntity<Car> get() {

      Car car = new Car();
      car.setColor("Blue");
      car.setMiles(100);
      car.setVIN("1234");

      return new ResponseEntity<Car>(car, HttpStatus.OK);
  }

  @RequestMapping(value = "/car/increment", method = RequestMethod.POST)
  public ResponseEntity<Car> update(@RequestBody Car car) {
      if (car != null) {
          car.setMiles(car.getMiles() + 100);
      }
      return new ResponseEntity<Car>(car, HttpStatus.OK);
  }
}
