package FoleyDes.MusicProject.music;

import java.util.ArrayList;
import java.util.Iterator;
import FoleyDes.MusicProject.menu.ConsoleControls;

public class MusicConsoleListView {

	ArrayList<Music> musicList;

	public MusicConsoleListView() {
		// TODO Auto-generated constructor stub
	}

	public void setMusicList(ArrayList<Music> musicList) {
		this.musicList = musicList;
	}

	public void display() {

		System.out.println(ConsoleControls.ANSI_GREEN + "... MUSIC VIEWER ..." + ConsoleControls.ANSI_RESET);
		System.out.println("\n");
		Iterator<Music> iterator = this.musicList.iterator();
		while (iterator.hasNext()) {
			Music aMusic = (Music) iterator.next();
			aMusic.display();

		}
	}

}