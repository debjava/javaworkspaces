package builder.type3;

public class TestCarBuilder1 {

	public static void main(String[] args) {
		
		CarBuilder1 builder = new CarBuilder1.Builder1("yes", "yes")
				.carAlloyWheel("no").carAvs("yes").build();
		System.out.println(builder.getCarAlloyWheel());
		System.out.println(builder.getCarAvs());
		System.out.println(builder.getCarColor());

	}

}
