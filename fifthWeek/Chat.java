package fifthWeek;

import java.util.ArrayList;
import java.util.List;

public class Chat {
    private String name;
    private List<String> messages = new ArrayList<>();

    public void addMessage(String msg) {
        messages.add(msg);
    }

    public String getName() {
        return name;
    }
}