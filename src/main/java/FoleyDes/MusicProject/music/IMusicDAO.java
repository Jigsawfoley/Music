package FoleyDes.MusicProject.music;

import java.util.ArrayList;

public interface IMusicDAO {
	public ArrayList<Music> getAllMusic();
	public Music getMusic(int musicID);
	public int addMusic(Music aUser);
	public void updateMusic(Music aMusic);
	public void deleteMusic(Music aMusic);
	public String printMusic(int musicID);
}