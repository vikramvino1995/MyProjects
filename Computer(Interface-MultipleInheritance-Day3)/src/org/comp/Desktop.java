package org.comp;

public class Desktop implements Hardware, Software {
	private void desktopModel() {
		System.out.println("Model:0001");
	}

	@Override
	public void softwareResources() {
		System.out.println("Overrided from Software Interface.");

	}

	@Override
	public void hardwareResources() {
		System.out.println("Overrided from Hardware Interface.");

	}

	public static void main(String[] args) {
		Desktop d =new Desktop();
		d.desktopModel();
		d.softwareResources();
		d.hardwareResources();
	}

}
