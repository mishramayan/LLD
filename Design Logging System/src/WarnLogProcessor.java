public class WarnLogProcessor extends LogProcessor {

    WarnLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    public void log(int logLevel, String message){
        if(logLevel == LogProcessor.WARN){
            System.out.println("WARN: " + message);
        }else{
            super.log(logLevel, message);
        }
    }

}
