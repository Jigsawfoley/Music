package FoleyDes.MusicProject.music;

import FoleyDes.MusicProject.data.DataManagerSQLite;
import FoleyDes.MusicProject.menu.IExecuatable;
import FoleyDes.MusicProject.music.MusicConsoleListView;
import FoleyDes.MusicProject.music.MusicController;
import FoleyDes.MusicProject.music.MusicDAO;

public class MusicViewMenuItem implements IExecuatable {

	public MusicViewMenuItem() {
			}

	public void execute() {
		MusicDAO model = new MusicDAO(DataManagerSQLite.getInstance());
		MusicConsoleListView view = new MusicConsoleListView();
		MusicController controller = new MusicController(view, model);
		controller.display();
	}
}