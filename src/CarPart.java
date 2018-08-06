
public class CarPart extends Car {

public CarPart() {
	
}

public static void status() {
		Car c=new Car();
		c.Run("on",50);
		c.engine();
		c.fuel_tank();
		c.tires();
		
	}
public static void condition() {
	Car c=new Car();
	c.Run("on",50);
	c.engine_condition();
	c.tire_condition();
	c.fuel_condition();
}

}