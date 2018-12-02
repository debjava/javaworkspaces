package builder.type3;

public class TestCarBuilder {

	public static void main(String[] args) {
		
		CarBuilder builder = new CarBuilder.Builder("gear", "yes")
				.carColor("blue").carAvs("yes").build();
	}

}
