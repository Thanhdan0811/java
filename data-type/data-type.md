# Primitive Integer
```
  int max = 2147483647;
  int min = -2147483648;
  short shortMax = 32767;
  short shortMIn = -32768;
  long longMax = 9222....;
  long longMin = -9222...;
  byte byteMax = 127;
  bute byteMin = -128;
```

# Primitive Floating

f : specify that the number is float number. same with d is double.

```
float floatNumb1 = 10f/6f;  => 1.666667
double doubleNum1 = 10d/6d; => 1.666666666667

```

# Primitive Boolean , Char

```
boolean var = false;
char var1 = 'c';
char var2 = '\u00A7';

```

Link get unicode table : https://www.rapidtables.com/code/text/unicode-characters.html

# BigDecimal 
 ```
    BigDecimal d1 = new BigDecimal(1.05);
		BigDecimal d2 = new BigDecimal(2.55);
		System.out.println(d1.add(d2)); => 3.5999999999999998667732370449812151491641998291015625
    
    OR
    
    BigDecimal d1 = new BigDecimal("1.05");
		BigDecimal d2 = new BigDecimal("2.55");
		
		System.out.println(d1.add(d2)); => 3.60
 
 ```
 
 # STRING
 
 ```
		String str = "HEllo world \u00BB";
		String str4 = new String("áldfj");
		String str1 = "10";
		String str2 = "20";
		int num1 = 20;
		
		System.out.println(str1 + str2);
		System.out.println(str1 + (num1 + 10 ));
 
 ```
# Type Casting
Implicit Casting : \
	byte (8) => short (16) => int (32 bit) => long (64 bit) => float (32 bit) => double (64bit) \
Explicit Casting : \
	double => float => long => int => short => byte \
