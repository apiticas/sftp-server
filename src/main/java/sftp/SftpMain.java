package sftp;

public class SftpMain {

    public static void main(String[] args) {

        new Thread(new SftpServer()).start();

    }

}
