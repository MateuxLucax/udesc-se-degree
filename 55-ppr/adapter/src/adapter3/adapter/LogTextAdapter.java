package adapter3.adapter;

import adapter3.logger.Logger;
import logconsole.LogConsole;

public class LogTextAdapter implements Logger {

    public final LogConsole logger;

    public LogTextAdapter() {
        this.logger = new LogConsole();
    }

    @Override
    public void log(String message) {
        logger.log(message);
    }

}
