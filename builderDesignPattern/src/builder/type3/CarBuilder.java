package builder.type3;
public class CarBuilder 
{
	private String gearBox;
	private String carLock;
	
	//Optional Parameters
	private String carMusicSystem;
	private String carColor;
	private String carDashBoard;
	private String carAvs;
	private String carAlloyWheel;
	
	private CarBuilder( Builder builder )
	{
		carMusicSystem = builder.carMusicSystem;
		carColor = builder.carColor;
		carDashBoard = builder.carDashBoard;
		carAvs = builder.carAvs;
		carAlloyWheel = builder.carAlloyWheel;
	}
	
	public static class Builder 
	{
		private String gearBox;
		private String carLock;
		
		//Optional Default
		private String carMusicSystem = "Car Music";
		private String carColor = "Green";
		private String carDashBoard = "Normal Dashboard";
		private String carAvs = "No";
		private String carAlloyWheel = "No";
		
		public Builder( String gearBox, String carLock )
		{
			this.gearBox = gearBox;
			this.carLock = carLock;
		}
		
		public Builder carMusicSystem( String musicSystem )
		{
			carMusicSystem = musicSystem;
			return this;
		}
		
		public Builder carColor( String color )
		{
			carColor = color;
			return this;
		}
		
		public Builder carDashBoard( String dashBoard )
		{
			carDashBoard = dashBoard;
			return this;
		}
		
		public Builder carAvs( String avs )
		{
			carAvs = avs;
			return this;
		}
		
		public Builder carAlloyWheel( String wheel )
		{
			carAlloyWheel = wheel;
			return this;
		}
		
		public CarBuilder build()
		{
			return new CarBuilder(this);
		}
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
}
