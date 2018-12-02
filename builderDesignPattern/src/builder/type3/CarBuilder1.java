package builder.type3;

public class CarBuilder1 {
	//Required Parameters
	private String gearBox;
	private String carLock;
	
	//Optional Parameters
	private String carMusicSystem;
	private String carColor;
	private String carDashBoard;
	private String carAvs;
	private String carAlloyWheel;
	private String carType;
	
	public static class Builder1 {
		
		//Required Parameters
		private String gearBox;
		private String carLock;
		
		//Optional Default Parameters
		private String carMusicSystem = "Car Music";
		private String carColor = "Green";
		private String carDashBoard = "Normal Dashboard";
		private String carAvs = "No";
		private String carAlloyWheel = "No";
		private String carType = "normal";
		
		public Builder1( String gearBox, String carLock )
		{
			this.gearBox = gearBox;
			this.carLock = carLock;
		}
		
		public Builder1 carMusicSystem( String musicSystem )
		{
			carMusicSystem = musicSystem;
			return this;
		}
		
		public Builder1 carColor( String color )
		{
			carColor = color;
			return this;
		}
		
		public Builder1 carDashBoard( String dashBoard )
		{
			carDashBoard = dashBoard;
			return this;
		}
		
		public Builder1 carAvs( String avs )
		{
			carAvs = avs;
			return this;
		}
		
		public Builder1 carAlloyWheel( String wheel )
		{
			carAlloyWheel = wheel;
			return this;
		}
		
		public Builder1 carType(String type) {
			carType = type;
			return this;
		}
		
		public CarBuilder1 build()
		{
			return new CarBuilder1(this);
		}
	}
	
	private CarBuilder1( Builder1 builder )
	{
		carMusicSystem = builder.carMusicSystem;
		carColor = builder.carColor;
		carDashBoard = builder.carDashBoard;
		carAvs = builder.carAvs;
		carAlloyWheel = builder.carAlloyWheel;
		carType = builder.carType;
	}
	
	//~ ~ All Getter methods for CarBuilder
	public String getGearBox() {
		return gearBox;
	}

	public String getCarLock() {
		return carLock;
	}

	public String getCarMusicSystem() {
		return carMusicSystem;
	}

	public String getCarColor() {
		return carColor;
	}

	public String getCarDashBoard() {
		return carDashBoard;
	}

	public String getCarAvs() {
		return carAvs;
	}

	public String getCarAlloyWheel() {
		return carAlloyWheel;
	}

	public String getCarType() {
		return carType;
	}
	
}
