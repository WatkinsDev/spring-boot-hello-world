package hello.models;

public class Car {

    private String VIN;
    private String color;
    private Integer miles;

    public void setVIN(String VIN){
      this.VIN = VIN;
    }

    public void setColor(String colour){
      this.color = colour;
    }

    public void setMiles(Integer miles){
      this.miles = miles;
    }

    public String getVIN(){
      return VIN;
    }

    public String getColor(){
      return color;
    }

    public Integer getMiles(){
      return miles;
    }
}
