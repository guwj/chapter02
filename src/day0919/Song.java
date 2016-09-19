package day0919;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public Song(){
		
	}
	
	public Song(String artist, String title){
		this(null, artist, null, title, 0, 0);
	}
	
	public Song(String album, String artist, String composer, String title, int track, int year){
		this.album = album;
		this.artist = artist;
		this.composer = composer;
		this.title = title;
		this.track = track;
		this.year = year;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	public void show(){
		System.out.println(artist + " " + title + "( " + album + ", " + year + ", " + track + ", " + composer + " )");
	}
	
}
