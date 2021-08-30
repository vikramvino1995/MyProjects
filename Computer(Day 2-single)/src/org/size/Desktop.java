package org.size;
//child
import org.model.Computer;

public class Desktop extends  Computer {
	private void desktopSize() {
		System.out.println("Desktop size :  16 inches ");
		}
	public static void main(String[] args) {
		Desktop d =new Desktop();
		d.computerModel();
		d.desktopSize();
	}
}
