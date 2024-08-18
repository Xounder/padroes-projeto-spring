package me.dev.pps.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "tb_films")
public class Film {
    @Id
    @Column (name = "film_title", unique = true)
	@JsonProperty("Title")
    private String Title;
    @Column (name = "film_year")
	@JsonProperty("Year")
    private String Year;
    @Column (name = "film_rated")
	@JsonProperty("Rated")
    private String Rated;
    @Column (name = "film_released")
	@JsonProperty("Released")
    private String Released;
    @Column (name = "film_runtime")
	@JsonProperty("Runtime")
    private String Runtime;
    @Column (name = "film_genre")
	@JsonProperty("Genre")
    private String Genre;
    @Column (name = "film_director")
	@JsonProperty("Director")
    private String Director;
    @Column (name = "film_writer")
	@JsonProperty("Writer")
    private String Writer;
    @Column (name = "film_actors")
	@JsonProperty("Actors")
    private String Actors;
    @Column (name = "film_plot")
	@JsonProperty("Plot")
    private String Plot;
    @Column (name = "film_language", length=1000)
	@JsonProperty("Language")
    private String Language;
    @Column (name = "film_country")
	@JsonProperty("Country")
    private String Country;
    @Column (name = "film_awards")
	@JsonProperty("Awards")
    private String Awards;
    @Column (name = "film_poster")
	@JsonProperty("Poster")
    private String Poster;
    @OneToMany(cascade = CascadeType.ALL) // Relação 1:N com Ratings
    @JoinColumn(name = "film_id") // Chave estrangeira para associar Ratings a um Film
	@JsonProperty("Ratings")
    private List<Rating> Ratings;
    @Column (name = "film_score")
	@JsonProperty("Metascore")
    private String Metascore;
    @Column (name = "imdb_rating")
	@JsonProperty("imdbRating")
    private String imdbRating;
    @Column (name = "imdb_votes")
	@JsonProperty("imdbVotes")
    private String imdbVotes;
    @Column (name = "imdb_id")
	@JsonProperty("imdbID")
    private String imdbID;
    @Column (name = "film_type")
	@JsonProperty("Type")
    private String Type;
    @Column (name = "film_dvd")
	@JsonProperty("DVD")
    private String DVD;
    @Column (name = "film_box")
	@JsonProperty("BoxOffice")
    private String BoxOffice;
    @Column (name = "film_prod")
	@JsonProperty("Production")
    private String Production;
    @Column (name = "film_site")
	@JsonProperty("Website")
    private String Website;
    @Column (name = "Response")
	@JsonProperty("Response")
    private String Response;
    
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getYear() {
		return Year;
	}
	public void setYear(String year) {
		Year = year;
	}
	public String getRated() {
		return Rated;
	}
	public void setRated(String rated) {
		Rated = rated;
	}
	public String getReleased() {
		return Released;
	}
	public void setReleased(String released) {
		Released = released;
	}
	public String getRuntime() {
		return Runtime;
	}
	public void setRuntime(String runtime) {
		Runtime = runtime;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}
	public String getDirector() {
		return Director;
	}
	public void setDirector(String director) {
		Director = director;
	}
	public String getWriter() {
		return Writer;
	}
	public void setWriter(String writer) {
		Writer = writer;
	}
	public String getActors() {
		return Actors;
	}
	public void setActors(String actors) {
		Actors = actors;
	}
	public String getPlot() {
		return Plot;
	}
	public void setPlot(String plot) {
		Plot = plot;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getAwards() {
		return Awards;
	}
	public void setAwards(String awards) {
		Awards = awards;
	}
	public String getPoster() {
		return Poster;
	}
	public void setPoster(String poster) {
		Poster = poster;
	}
	public List<Rating> getRatings() {
		return Ratings;
	}
	public void setRatings(List<Rating> ratings) {
		Ratings = ratings;
	}
	public String getMetascore() {
		return Metascore;
	}
	public void setMetascore(String metascore) {
		Metascore = metascore;
	}
	public String getImdbRating() {
		return imdbRating;
	}
	public void setImdbRating(String imdbRating) {
		this.imdbRating = imdbRating;
	}
	public String getImdbVotes() {
		return imdbVotes;
	}
	public void setImdbVotes(String imdbVotes) {
		this.imdbVotes = imdbVotes;
	}
	public String getImdbID() {
		return imdbID;
	}
	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getDVD() {
		return DVD;
	}
	public void setDVD(String dVD) {
		DVD = dVD;
	}
	public String getBoxOffice() {
		return BoxOffice;
	}
	public void setBoxOffice(String boxOffice) {
		BoxOffice = boxOffice;
	}
	public String getProduction() {
		return Production;
	}
	public void setProduction(String production) {
		Production = production;
	}
	public String getWebsite() {
		return Website;
	}
	public void setWebsite(String website) {
		Website = website;
	}
	public String getResponse() {
		return Response;
	}
	public void setResponse(String response) {
		Response = response;
	}
	@Override
	public String toString() {
		return "Film [Title=" + Title + ", Year=" + Year + ", Rated=" + Rated + ", Released=" + Released + ", Runtime="
				+ Runtime + ", Genre=" + Genre + ", Director=" + Director + ", Writer=" + Writer + ", Actors=" + Actors
				+ ", Plot=" + Plot + ", Language=" + Language + ", Country=" + Country + ", Awards=" + Awards
				+ ", Poster=" + Poster + ", Ratings=" + Ratings + ", Metascore=" + Metascore + ", imdbRating="
				+ imdbRating + ", imdbVotes=" + imdbVotes + ", imdbID=" + imdbID + ", Type=" + Type + ", DVD=" + DVD
				+ ", BoxOffice=" + BoxOffice + ", Production=" + Production + ", Website=" + Website + ", Response="
				+ Response + "]";
	}
    
    
    
}
