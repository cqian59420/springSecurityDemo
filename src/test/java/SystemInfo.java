import java.util.Map;

/**
 * Created by Terrance on 2014/12/8 2014/12/8.
 * ${todo} describe
 */
public class SystemInfo {

    public static void main(String[] args) {
        System.out.println(SystemInfo.class.getClassLoader().getResource("").getPath());
        for (Map.Entry entry:System.getenv().entrySet()) {
            System.out.println(entry.getKey() + "~~~~~~~~~" + entry.getValue());

        }
    }
}
