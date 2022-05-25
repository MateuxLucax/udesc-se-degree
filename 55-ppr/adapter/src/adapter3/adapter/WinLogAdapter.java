package adapter3.adapter;

import adapter3.logger.Logger;
import swinglog.WinMsg;

public class WinLogAdapter implements Logger {

    public final WinMsg logger;

    public WinLogAdapter() {
        this.logger = new WinMsg();
    }

    @Override
    public void log(String message) {
        logger.mostrar(message);
    }

}
