

import application.extensions.Extension;



public class Minuscules implements Extension {

	public String transformer(String s) {return s.toLowerCase() ;}

	public String toString() {return "En minuscules" ;}

}
