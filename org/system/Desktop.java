package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Desktop Size is 1GB");
	}
	public static void main(String[] args) {
		Desktop system=new Desktop();
		system.computerModel();
		system.desktopSize();
	}

}
