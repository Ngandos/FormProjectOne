package LinkFilesInterfacesExos.JournalisationErreurs;

public class FileLogger implements Logger {

    protected int id;
    protected String message;

    public FileLogger(int id, String message) {
        this.id = id;
        this.message = message;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public void log(String message) {

    }

    @Override
    public String toString() {
        return "FileLogger {" +
                "id = " + id +
                ", message = '" + message + '\'' +
                '}';
    }
}
