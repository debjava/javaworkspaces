package builder.type2;

public class Director {
	
	private MovieBuilder movieBuilder;
	
	public void setMovieBuilder(MovieBuilder movieBuilder) {
		this.movieBuilder = movieBuilder;
	}

	public Movie getMovie() {
		
		return movieBuilder.getMovie();
	}
	
	public void makeMovie() {
		
		movieBuilder.createNewMovie();
		
		movieBuilder.buildShootingSet();
		
		movieBuilder.selectStarCast();
		
		movieBuilder.makeEditing();
	}

}
