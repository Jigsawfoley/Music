package FoleyDes.MusicProject.playlist;

import java.util.Scanner;

public class PlaylistController {
	private PlaylistDAO model;
	private PlayListConsoleListView view;
	
	Scanner input = new Scanner(System.in);

	public PlaylistController(PlaylistDAO model, PlayListConsoleListView view ) {
		this.model = model;
		this.view = view;
	}

	public void getUserList() {
		view.setUserList(model.getUserList());
		view.displayUsers();
		System.out.println("	\nype Id of user to see their playlist or press enter to return to the main menu");
		String playListSelected = input.nextLine();
		getUserPlayList(playListSelected);
	}
	
	public void getUserPlayList(String id) {
		if (id != null) {
			int playListId = Integer.parseInt(id);
			view.setPlayList(model.getPlayList(playListId));
			view.setUser(playListId);
			view.displayPlayList();
			System.out.println("\nPress enter to return to the main menu ");
			this.input.nextLine();
		}else {
		
		
		this.input.nextLine();
		}
	}
}