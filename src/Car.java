
public class Car {
	   int condition;
	    int fuel=100;
	    int t1, t2, t3, t4;
	    String sw;
	    int km;
	    int cylinders; 
	    int t_total;
	   public void Run(String s,int kim){
		    sw=s;
		    km=kim;
		    if (sw=="on"){
		    System.out.println("Your car is runing and your car had run "+km+" km.");
		  } 
		    else if(sw=="off"){
		      System.out.println("Your car is not runing and your had run "+km+" km");
		    }
	   }
	   public void engine()  {
		    if (sw=="on"){
		      System.out.println("the engine is running.");
		    }
		  else if (sw=="off"){
		    System.out.println("the engine is not running.");
		  }
		  else {
		    System.out.println("error.");
		  }
		    cylinders=100-(km/10);
		    if (cylinders<=0) {
		    	sw="off";
		    	System.out.println("Your car is stop running because engine was broken.");
		    }
		}
		public void fuel_tank(){
		  fuel=fuel-(km/10);
		  System.out.println("fuel:"+fuel+"%");
		  if (fuel<=25){
		    System.out.println("Warring, you need to refuel your car!!!");
		  }
		  if (fuel==0){
		    sw="off";
		    System.out.println("Fuel:Empty, your car was stop.");
		  }
		}
		public void tires(){
		t1=km/10;
		t2=km/10;
		t3=km/10;
		t4=km/10;
		int tt=(t1+t2+t3+t4)/4;
		t_total=tt;
		  System.out.println(" The levels of left-font tire wear is:"+t1+",");
		  System.out.println(" The levels of right-font tire wear is:"+t2+",");
		  System.out.println(" The levels of left-rear tire wear is:"+t3+",");
		  System.out.println(" The levels of right-rear tire wear is:"+t4+".");
		   if (t1>80){
		System.out.println("You must change your left-font tire.");
		}
		    if (t2>80){
		System.out.println("You must change your right-font tire.");
		}
		    if (t3>80){
		System.out.println("You must change your left-rear tire.");
		}
		    if (t4>80){
		System.out.println("You must change your right-rear tire.");
		}
		if (t1==100){
		  sw="off";
		  System.out.println("Your left-font tire is broken,Your car is stop running");
		}
		if (t2==100){
		  sw="off";
		  System.out.println("Your right-font tire is broken,Your car is stop running");
		}
		  if (t3==100){
		  sw="off";
		  System.out.println("Your left-rear tire is broken,Your car is stop running");
		}
		  if (t4==100){
		  sw="off";
		  System.out.println("Your right-rear tire is broken,Your car is stop running");
					
		}
		}
		public int engine_condition() {
			cylinders=100-(km/10);
			System.out.println("engine:"+cylinders+"%");
			   return cylinders;
		}
		public int fuel_condition() {
			fuel=fuel-(km/10);
			System.out.println("fuel:"+fuel+"%");
			   return fuel;
		}
		public int tire_condition() {
			t1=km/10;
			t2=km/10;
			t3=km/10;
			t4=km/10;
			t_total=(100-(t1+t2+t3+t4)/4);
			System.out.println("tire:"+t_total+"%");
			   return t_total;
					   }
		}




		 
	 
	   
			

	
