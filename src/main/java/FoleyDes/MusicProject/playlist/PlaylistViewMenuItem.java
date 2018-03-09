package FoleyDes.MusicProject.playlist;

import FoleyDes.MusicProject.data.DataManagerSQLite;
import FoleyDes.MusicProject.menu.IExecuatable;
import FoleyDes.MusicProject.playlist.PlaylistConsoleListView;
import FoleyDes.MusicProject.playlist.PlaylistController;
import FoleyDes.MusicProject.playlist.PlaylistDAO;

public class PlaylistViewMenuItem implements IExecuatable {

	public PlaylistViewMenuItem() {
		
	}

	public void execute() {

		PlaylistDAO model = new PlaylistDAO(DataManagerSQLite.getInstance());
		PlaylistConsoleListView view = new PlaylistConsoleListView();
		PlaylistController controller = new PlaylistController(view, model);
		controller.display();
	}
}