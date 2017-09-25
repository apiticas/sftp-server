package ro.b1nnar.examples.sftpserver;

import java.util.concurrent.TimeUnit;

public class SftpMain {

    public static void main(String[] args) throws InterruptedException {

        new Thread(new SftpServer()).start();
        TimeUnit.MINUTES.sleep(100000);

    }

}
