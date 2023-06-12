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

```
  public class Car { 
    private int speed = 0; // defautl constructor
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
- Default constructor : nếu ta ko định nghĩa constructor thì jaava sẽ chạy defaut constructor, nếu ta định nghĩa thì java sẽ chỉ chạy constructor mà ta định nghĩa và sẽ ko chạy default mặc định , nên ta ko thể định nghĩa construtor và default construcor cùng 1 class.



# Inheritance

```
  public class Car extends Vehicles {
    private String carProperty;
    public Car() {
      super(); // call constructor ở parent class.
      this.carProperty = "short";
    } 
    
    public Car(String name) {
      this.carProperty = name;
    }
    
    public String getName() {
      return this.carProperty;
    }
  }
  
```

- call super với parameters

```
  // Vehicle parent constructor class
  public Vehicle(String engine, int wheels, int seats, int fuelTank, String lights) {
		this.engine = engine;
		this.wheels = wheels;
		this.seats = seats;
		this.fuelTank = fueTank;
		this.lights = lights;
	}

// constructor Car class.
public Car(String steering, String engine, int wheels, int seats, int fueTank, String lights) {
		super(engine,wheels, seats,fueTank,lights);
		this.steering = steering;
}


@Override
	public String toString() {
		return "Car [getSteering()=" + getSteering() + ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels()
				+ ", getSeats()=" + getSeats() + ", getFueTank()=" + getFueTank() + ", getLights()=" + getLights()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

```

# Overriding
- Rules :
+ The method must have the same name as in the parent class
+ The method must be IS-A relationship(inheritance)
+ The method must have the same parameters as in the parent class.


# Tyoes of Inheritance
- Single Inheritance : 
	+ Class A => Class B : Class B là child class hay sub class.

- Multiple Inheritance : 
	+ Class A => Class C <= Class B : ko cho phép trong java. cho phép trong c++
	+ Class A => Class B => Class C : cho phép trong Java
	+ Class A => Class B , Class A => Class C ....
	+ Class B <= Class A = > Class C ; Class B => Class D <= Class C; ko cho phép trong Java


# Composition OOP
- là mối quan hệ giữa 2 class, nếu ko có class A thì class B cũng ko hoạt động.

```
	public Laptop() {
 
		this.screen = 15.6f;
		this.processor = new Processor();
		this.ram = "DDR4";
		this.hardDrive = "2TB";
		this.graphicsCard = new GraphicsCard();
		this.opticalDrive = "MLT layer";
		this.keyboard = "backlit";
	}
	
	public Processor getProcessor() {
		return processor;
	}
	
	// Main Class
	public class Hello {
 
	public static void main(String[] args) {
		Laptop lappy = new Laptop();
		System.out.println(lappy.getProcessor().getBrand());
 
	}
 
}

```
- class Laptop and class Processor là composition của nhau.
- getProcessor ta có thể access các method trong Processor.

# Encapsulation 
- Dùng keyword private để đóng gói dữ liệu trong class.
- Các properties nên được khởi tạo.


# Polymorphism : Tính đa hình.


```
	Phone note8 = new SamsungNote8("Note 8");
		System.out.println(note8.getModel());
		note8.features();
		
		
		
		Phone nokia3310 = new Nokia3310("Nokia 3310");
		System.out.println(nokia3310.getModel());
		nokia3310.features();

```

- Phone is parent class.
