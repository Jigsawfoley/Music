package FoleyDes.MusicProject.menu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import FoleyDes.MusicProject.App;
import FoleyDes.MusicProject.music.MusicViewMenuItem;
import FoleyDes.MusicProject.playlist.PlaylistViewMenuItem;
import FoleyDes.MusicProject.user.UserViewMenuItem;

/*
 * This class could be used instead of the generic Factory class
 */

public class MenuItemFactory {
	
	private static Logger LOG;
	
	public MenuItemFactory() {
		LOG = LogManager.getLogger(MenuItemFactory.class);
	}

	public IExecuatable getMenuItem(String className) {
		
		if ("FoleyDes.MusicProject.playlist.PlaylistViewMenuItem".equals(className)) {
			return (IExecuatable) new PlaylistViewMenuItem();
		}
		
		if ("FoleyDes.MusicProject.music.MusicViewMenuItem".equals(className)) {
			return (IExecuatable) new MusicViewMenuItem();
		}
		
		if ("FoleyDes.MusicProject.user.UserViewMenuItem".equals(className)) {
			return (IExecuatable) new UserViewMenuItem();
		}
		
		// for each menu item take a copy of an if line above change the class it is looking for
		// and the class to use
		
		
		// this catches deliberately undefined menu items and errors
		
		if ("FoleyDes.MusicProject.playlist.UndefinedMenuItem".equals(className)) {
			return (IExecuatable) new UndefinedMenuItem();
		}
		else
		{
			LOG.error("Undefined class requested" + className);
			return (IExecuatable) new UndefinedMenuItem();
		}
		
	}

}
