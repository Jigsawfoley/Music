package FoleyDes.MusicProject.playlist;

import java.util.ArrayList;
import java.util.Iterator;
import FoleyDes.MusicProject.menu.ConsoleControls;
import FoleyDes.MusicProject.music.Music;
import FoleyDes.MusicProject.user.User;


	public class PlayListConsoleListView {
		// TODO Auto-generated constructor stub
		
	private ArrayList<User> userList;
	private ArrayList<Music> playList;
	private String user;
	

	public void setUserList(ArrayList<User> userList) {
		this.userList = userList;
	}

	public void setUser(int id) {
        Iterator<User> iterator = this.userList.iterator();
        while (iterator.hasNext()) {
        	User aUser = (User)iterator.next();
        	if (aUser.getUserID() == id)
        		this.user = aUser.getUserName();
        	        }
	}
	public void setPlayList(ArrayList<Music> playList) {
		this.playList = playList;
			}
	
	public void displayUsers() {
		ConsoleControls.clearConsole();
		System.out.println(ConsoleControls.ANSI_YELLOW + "PICK YOUR USER..." + ConsoleControls.ANSI_RESET);
		System.out.println("Id User Name");
		System.out.println("------------");
		Iterator<User> iterator = this.userList.iterator();
		while (iterator.hasNext()) {
			User aUser = (User)iterator.next();
			aUser.displayForPlayListChoice();
		}
		
	}
	
	public void displayPlayList() {
		ConsoleControls.clearConsole();
		System.out.println(ConsoleControls.ANSI_YELLOW + " Playlist for " + this.user + "..." +
		ConsoleControls.ANSI_RESET);
		System.out.printf("%-3s %-35.35s %-30.30s %-8.8s%n", "Id" , "Song Name","Artist","Released");
		System.out.println("-----------------------------------------------------------------------------");
		Iterator<Music> iterator = this.playList.iterator();
		while (iterator.hasNext()) {
			Music music = (Music)iterator.next();
			music.displayForPlayList();
          }
		System.out.println();
	}
}