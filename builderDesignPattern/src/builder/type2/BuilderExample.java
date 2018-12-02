package builder.type2;

public class BuilderExample {
	
	public static void main(String[] args) {
		Director director = new Director();
		ArtMovieBuilder artFilmBuilder = new ArtMovieBuilder();
		director.setMovieBuilder(artFilmBuilder);
		
		director.makeMovie();
		
		Movie movie = director.getMovie();
		
		System.out.println(movie.getTitle()+"--------"+movie.getActor()+"-----"+movie.getType());
	}

}
