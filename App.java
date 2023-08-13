package Week05;

public class App {

	public static void main(String[] args) {
		
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
		asteriskLogger.log("Hello");
		asteriskLogger.error("Will Robinson");
		
		System.out.println();
		
		spacedLogger.log("Name");
		spacedLogger.error("Failed Attempt");
	}

}
