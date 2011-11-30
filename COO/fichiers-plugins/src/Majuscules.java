

import application.extensions.Extension;



public class Majuscules implements Extension {

	public String transformer(String s) {return s.toUpperCase() ;}

	public String toString() {return "En majuscules" ;}

}
