//package utils;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.Date;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//import java.util.logging.Level;
//
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.logging.LogEntries;
//import org.openqa.selenium.logging.LogEntry;
//import org.openqa.selenium.logging.LogType;
//import org.openqa.selenium.logging.LoggingPreferences;
//import org.openqa.selenium.remote.CapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
////import io.netty.handler.logging.LogLevel;
//
//
//
//public class NetworkTrafficUtil {
//	//private static DevTools chromeDevTools;
//	private static ChromeDriver driver;
//
//	public static void main(String[] args) throws MalformedURLException{
//		//ChromeOptions options = new ChromeOptions();
//
//		//LoggingPreferences logPrefs = new LoggingPreferences();
//		//logPrefs.enable(LogType.PERFORMANCE, Level.ALL);
//
//		//var perfLogPrefs = new ChromePerformanceLoggingPreferences();
//		//var tracingCategories = "toplevel,disabled-by-default-devtools.timeline.frame,blink.console,disabled-by-default-devtools.timeline,benchmark";
//		//perfLogPrefs.AddTracingCategories(new string[] { tracingCategories });
//		//options.PerformanceLoggingPreferences = perfLogPrefs;
//		//options.setLogLevel(LogLevel.TRACE);
//
//		//		DesiredCapabilities caps = DesiredCapabilities.chrome();
//		//
//		//		LoggingPreferences logPrefs = new LoggingPreferences();
//		//		logPrefs.enable(LogType.BROWSER, Level.ALL);
//		//	    options.setCapability( "goog:loggingPrefs", logPrefs );
//		//
//		//
//		//		caps.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
//		//		WebDriverManager.chromedriver().setup();
//		//		driver = new ChromeDriver();
//		//		
//		//	
//		//		//System.out.println(driver.manage().logs().get(LogType.BROWSER).getAll());
//		//		
//		//		List<LogEntry> entries = driver.manage().logs().get(LogType.BROWSER).getAll();
//		//
//		//		//System.out.println(entries.size() + " " + LogType.PERFORMANCE + " log entries found");
//		//
//		//		for (LogEntry entry : entries) {
//		//		    System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
//		//
//		//		}
//
//
//		//ChromeOptions options = new ChromeOptions();
////		options.addArguments("start-maximized");
////		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
////		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
////		WebDriverManager.chromedriver().setup();
////		driver = new ChromeDriver(capabilities);
////		//WebDriver driver = new ChromeDriver(capabilities);
////		driver.get("https://www.paio.co");
////		//String scriptToExecute = "var performance = window.performance || window.mozPerformance || window.msPerformance || window.webkitPerformance || {}; var network = performance.getEntries() || {}; return network;";
////		//String netData = ((JavascriptExecutor)driver).executeScript(scriptToExecute).toString();
////		//System.out.println(netData);
////		
////		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
////		LogEntries les = driver.manage().logs().get(LogType.BROWSER);
////		for (LogEntry le : les) {
////		    System.out.println(le.getMessage());
////		}
////		driver.close();
////		driver.quit();
//
//		//chromeDevTools = driver.getDevTools();
//		//chromeDevTools.createSession();
//
//		//chromeDevTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));	
//
//		//List<LogEntry> entries = driver.
//		//System.out.println(entries.size() + " " + LogType.BROWSER + " log entries found");
//		//for (LogEntry entry : entries) {
//		//          System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
//		//}
//
//
//		//		chromeDevTools.addListener(Network.requestWillBeSentExtraInfo(),
//		//				
//		//				entry -> {
//		//					System.out.println("Request URI : " + entry.getRequestId().+"\n"
//		//							+ " With headers : "+entry.getHeaders(). + "\n"+ " With cookies : "+entry.getAssociatedCookies(). + "\n");
//		//					System.out.println(entry);
//		//				});
//		//		driver.get("https://www.paio.co/");
//		//		chromeDevTools.send(Network.disable());
//		//		LogEntries les = driver.manage().logs().get(LogType.SERVER);
//		//		for (LogEntry le : les) {
//		//		    System.out.println(le.getMessage());
//		//		}
//		//		
//		//	}
//
//		//	public void analyzeLog() {
//		//        LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
//		//        for (LogEntry entry : logEntries) {
//		//            System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
//		//            //do something useful with the data
//		//        }
//		
//		
//		
//		ChromeOptions options = new ChromeOptions();
//	    LoggingPreferences logPrefs = new LoggingPreferences();
//	    logPrefs.enable( LogType.PERFORMANCE, Level.ALL );
//	    options.setCapability( "goog:loggingPrefs", logPrefs );
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver(options);
//		 
//		driver.get("https://www.paio.co/emel-pink-velvet-flats.html");
//		 
//		List<LogEntry> entries = driver.manage().logs().get(LogType.PERFORMANCE).getAll();
//		System.out.println(entries.size() + " " + LogType.PERFORMANCE + " log entries found");
//		for (LogEntry entry : entries) {
//		          System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
//		}
//
//	}
//	
//	
//}
