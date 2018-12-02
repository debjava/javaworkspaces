package builder.type2;

public class ArtMovieBuilder extends MovieBuilder {

	@Override
	public void buildShootingSet() {
		System.out.println("Shootng Set arranaged");
		
	}

	@Override
	public void selectStarCast() {
		System.out.println("Star Cast : Vidya Balan, Amitav Bachhan");
		
	}

	@Override
	public void makeEditing() {
		System.out.println("Fild editing is in progress in Adlabs");
		
	}
	
	public void createNewMovie() {
		movie = new Movie();
		movie.setActor("Vidya Balan, Amitav Bachhan");
		movie.setTitle("Builder Film");
		movie.setType("ART");
	}

}
