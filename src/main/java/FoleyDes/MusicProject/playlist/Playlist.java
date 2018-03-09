package FoleyDes.MusicProject.playlist;

public class Playlist {
	private int playlistID;
	private String playlistName;
	private String playlistDescription;
	private int playlistOwnerID;
	private String playlistAdded;
	
	public Playlist(
			int playlistID, 
			String playlistName, 
			String playlistDescription, 
			int playlistOwnerID, 
			String playlistAdded
			) {
		this.playlistID = playlistID;
		this.playlistName = playlistName;
		this.playlistDescription = playlistDescription;
		this.playlistOwnerID = playlistOwnerID;
		this.playlistAdded = playlistAdded;
	}
	public int getPlaylistID() {
		return playlistID;
	}
	public void setPlaylistID(int playlistID) {
		this.playlistID = playlistID;
	}
	public String getPlaylistName() {
		return playlistName;
	}
	public void setPlaylistName(String playlistName) {
		this.playlistName = playlistName;
	}
	public String getPlaylistDescription() {
		return playlistDescription;
	}
	public void setPlaylistDescription(String playlistDescription) {
		this.playlistDescription = playlistDescription;
	}
	public int getPlaylistOwnerID() {
		return playlistOwnerID;
	}
	public void setPlaylistOwnerID(int playlistOwnerID) {
		this.playlistOwnerID = playlistOwnerID;
	}
	public String getPlaylistAdded() {
		return playlistAdded;
	}
	public void setPlaylistAdded(String playlistAdded) {
		this.playlistAdded = playlistAdded;
	}
	
	@Override
	public String toString() {
		return String.format(
				"Playlist	[playlistID=%s, playlistName=%s, playlistDescription=%s, playlistOwnerID=%s, playlistAdded=%s]",
				playlistID, playlistName, playlistDescription, playlistOwnerID, playlistAdded);
	}
	public void display() {
		System.out.println(this.toString());
	}
}