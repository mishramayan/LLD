//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Chain of Responsibility Design Pattern - Logger System!");
        LogProcessor logObject = new InfoLogProcessor( new DebugLogProcessor( new WarnLogProcessor( new ErrorLogProcessor(null) ) ) );

        logObject.log(LogProcessor.ERROR, "Exception message!");
        logObject.log(LogProcessor.WARN, "Warning!");
        logObject.log(LogProcessor.INFO, "Info!");
        logObject.log(LogProcessor.DEBUG, "Debug!");

    }
}