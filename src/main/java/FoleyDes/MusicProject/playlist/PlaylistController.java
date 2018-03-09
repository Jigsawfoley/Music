package FoleyDes.MusicProject.playlist;

import java.util.Scanner;

public class PlaylistController {
	private PlaylistConsoleListView view;
	private PlaylistDAO model;
	Scanner input = new Scanner(System.in);
	
	public PlaylistController(PlaylistConsoleListView view, PlaylistDAO model) {
		this.view = view;
		this.model = model;
	}
	public void display() {
		view.setPlaylist(model.getAllPlaylists());
		view.display();
		System.out.println("	\n Press enter return to the main menu");
		this.input.nextLine();

	}
}