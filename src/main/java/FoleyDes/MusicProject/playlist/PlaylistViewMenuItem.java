package FoleyDes.MusicProject.playlist;

import FoleyDes.MusicProject.data.DataManagerSQLite;

import FoleyDes.MusicProject.menu.IExecuatable;
import FoleyDes.MusicProject.playlist.PlayListConsoleListView;
import FoleyDes.MusicProject.playlist.PlaylistController;
import FoleyDes.MusicProject.playlist.PlaylistDAO;

public class PlaylistViewMenuItem implements IExecuatable {

	public PlaylistViewMenuItem() {
		
	}

	public void execute() {

		PlaylistDAO model = new PlaylistDAO(DataManagerSQLite.getInstance());
		PlayListConsoleListView view = new PlayListConsoleListView();
		PlaylistController controller = new PlaylistController(model, view);
		controller.getUserList();
	}
}