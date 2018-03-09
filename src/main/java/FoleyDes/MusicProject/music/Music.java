package FoleyDes.MusicProject.music;

public class Music {
	private int musicID;
	private String musicArtist;
	private String musicName;
	private String musicAlbum;
	private String musicDescription; 
	private String musicLink;
	private String musicYear;
	private int addedByUserID;
	private String dateAdded;
	
	public Music(
			int musicID, 
			String musicArtist, 
			String musicName, 
			String musicAlbum, 
			String musicLink,
			int addedByUserID,
			String dateAdded
			) {
		this.musicID = musicID;
		this.musicArtist = musicArtist;
		this.musicName = musicName;
		this.musicAlbum = musicAlbum;
		this.musicLink = musicLink;
		this.addedByUserID = addedByUserID;
		this.dateAdded = dateAdded;
	}

	public int getMusicID() {
		return musicID;
	}
	public void setMusicID(int musicID) {
		this.musicID = musicID;
	}
	public String getMusicArtist() {
		return musicArtist;
	}
	public void setMusicArtist(String musicArtist) {
		this.musicArtist = musicArtist;
	}
	public String getMusicName() {
		return musicName;
	}
	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}
	public String getMusicAlbum() {
		return musicAlbum;
	}
	public void setMusicAlbum(String musicAlbum) {
		this.musicAlbum = musicAlbum;
	}
	public String getMusicLink() {
		return musicLink;
	}
	public void setMusicLink(String musicLink) {
		this.musicLink = musicLink;
	}
	public int getAddedByUserID() {
		return addedByUserID;
	}
	public void setAddedByUserID(int addedByUserID) {
		this.addedByUserID = addedByUserID;
	}
	public String getDateAdded() {
		return dateAdded;
	}
	public void setDateAdded(String dateAdded) {

		this.dateAdded = dateAdded;
	}
	
	@Override
	public String toString() {
		return String.format(
				"Music	[musicID=%s, musicArtist=%s, musicName=%s, musicAlbum=%s, musicDescription=%s, musicLink=%s, musicYear=%s, addedByUserID=%s, dateAdded=%s]",
				musicID, musicArtist, musicName, musicAlbum, musicDescription, musicLink, musicYear, addedByUserID, dateAdded);
	}
	public void display() {
		System.out.println(this.toString());
	}
	
}