package FoleyDes.MusicProject.menu;

public class FactoryException extends Exception {
	public FactoryException() {
	}

	public FactoryException(String s) {
		super(s);
	}

	public FactoryException(Exception e) {
		super(e.toString());
	}
}// eoc