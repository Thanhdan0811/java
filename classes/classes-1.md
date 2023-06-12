# Getter and Setter

``` 
  public class Car {
    private String doors;
    private int speed:
    
    
    public void setSpeed(int speed) {
      this.speed = speed;
    }
    
    public int getSpeed() {
      return this.speed;
    }
     
  }
  
  
  public class Hero {
  
    public static void main(String[] args) {
        Car car = new Car();
        car.setSpeed(10);
        System.out.println(car.getSpeed());
    }
  
  }
  

```

- Tạo nhanh getter, setter : Right Click vào class => Source => Generate Getters and Setters => select all => ok

# Functionality

```
  public String run() {
    if(this.speed > 0) {
      return "running";
    }
    return "stop";
  }
```

# Constructor
- Name constructor cùng tên với tên class

```
  public class Car { 
    public Car() {
      speed = 10;
    }
  
     // overloading constructor.
     public Car(int speed) {
      this.speed = speed;
    }
  
  }
  
```

- Tạo nhanh :  Right Click vào class => Source => Generate constructor => select all => ok
