import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cur = sc.next();
        String execute = sc.next();

        if (cur.equals(execute)) {
            System.out.println("24:00:00");
            return;
        }

        int h = Integer.parseInt(execute.split(":")[0]) - Integer.parseInt(cur.split(":")[0]);
        int m = Integer.parseInt(execute.split(":")[1]) - Integer.parseInt(cur.split(":")[1]);
        int s = Integer.parseInt(execute.split(":")[2]) - Integer.parseInt(cur.split(":")[2]);

        if (s < 0) {
            s += 60;
            --m;
        }

        if (m < 0) {
            m += 60;
            --h;
        }

        if (h < 0) {
            h += 24;
        }

        System.out.format("%02d:%02d:%02d", h, m, s);
    }
}