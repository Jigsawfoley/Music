package FoleyDes.MusicProject.playlist;

import java.util.ArrayList;
import java.util.Iterator;
import FoleyDes.MusicProject.menu.ConsoleControls;

public class PlaylistConsoleListView {

	ArrayList<Playlist> playlist;

	public PlaylistConsoleListView() {
		// TODO Auto-generated constructor stub
	}

	public void setPlaylist(ArrayList<Playlist> playlist) {
		this.playlist = playlist;
	}

	public void display() {

		System.out.println(ConsoleControls.ANSI_GREEN + "... PLAYLIST VIEWER ..." + ConsoleControls.ANSI_RESET);
		System.out.println("\n");
		Iterator<Playlist> iterator = this.playlist.iterator();
		while (iterator.hasNext()) {
			Playlist aPlaylist = (Playlist) iterator.next();
			aPlaylist.display();

		}
	}
}