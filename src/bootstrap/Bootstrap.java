package bootstrap;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import actors.SystemActor;

public class Bootstrap {
	private static Bootstrap bootstrap = null;
	SystemActor system;

	private Bootstrap() {
		system = new SystemActor();
	}

	public static Bootstrap getInstance() {
		if (bootstrap == null) {
			bootstrap = new Bootstrap();
		}
		return bootstrap;
	}

	public static void main(String[] args) {
		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				String operation = br.readLine();
				switch (operation) {
				case "Enter Vehicle": {
					Bootstrap.getInstance().system.assignParkingSpot();
				}
					break;
				case "":
					break;
				default:
					System.out.println("unknown operation :: " + operation);
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
