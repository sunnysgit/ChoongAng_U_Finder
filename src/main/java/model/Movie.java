package model;

public class Movie {
   private int movieno;
   private String moviename;
   private String story;
   private String director;
   private int playtime;
   private String netflix;
   private String disney;
   private String coupang;
   private String tving;
   private String genre;
   private int mvcnt;
   private String poster;
   private String trailer;
   
   /* 태그, 배우 검색용  */
   private String tag;     
   private String actorname;
   /* 추천작용 */
   private String actor;
	   
	public int getMovieno() {
		return movieno;
	}
	public void setMovieno(int movieno) {
		this.movieno = movieno;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getPlaytime() {
		return playtime;
	}
	public void setPlaytime(int playtime) {
		this.playtime = playtime;
	}
	public String getNetflix() {
		return netflix;
	}
	public void setNetflix(String netflix) {
		this.netflix = netflix;
	}
	public String getDisney() {
		return disney;
	}
	public void setDisney(String disney) {
		this.disney = disney;
	}
	public String getCoupang() {
		return coupang;
	}
	public void setCoupang(String coupang) {
		this.coupang = coupang;
	}
	public String getTving() {
		return tving;
	}
	public void setTving(String tving) {
		this.tving = tving;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getMvcnt() {
		return mvcnt;
	}
	public void setMvcnt(int mvcnt) {
		this.mvcnt = mvcnt;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getTrailer() {
		return trailer;
	}
	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getActorname() {
		return actorname;
	}
	public void setActorname(String actorname) {
		this.actorname = actorname;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
}
