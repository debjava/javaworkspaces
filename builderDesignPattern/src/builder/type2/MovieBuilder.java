package builder.type2;

public abstract class MovieBuilder {
	
	protected Movie movie;

	public Movie getMovie() {
		return movie;
	}
	
	public void createNewMovie() {
		movie = new Movie();
	}
	
	public abstract void buildShootingSet();
	
	public abstract void selectStarCast();
	
	public abstract void makeEditing();

}
