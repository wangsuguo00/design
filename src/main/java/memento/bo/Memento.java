package memento.bo;

import java.io.Serializable;

public class Memento implements Serializable {
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Memento{" +
                "status='" + status + '\'' +
                '}';
    }
}
