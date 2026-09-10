import java.util.*;

public class Task04_DesignBrowserHistory {
    static class BrowserHistory {
        List<String> history = new ArrayList<>();
        int current = 0;

        BrowserHistory(String homepage) {
            history.add(homepage);
        }

        void visit(String url) {
            while (history.size() > current + 1)
                history.remove(history.size() - 1);

            history.add(url);
            current++;
        }

        String back(int steps) {
            current = Math.max(0, current - steps);
            return history.get(current);
        }

        String forward(int steps) {
            current = Math.min(history.size() - 1, current + steps);
            return history.get(current);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BrowserHistory browser = new BrowserHistory(sc.next());

        int q = sc.nextInt();

        while (q-- > 0) {
            String op = sc.next();

            if (op.equals("visit")) {
                browser.visit(sc.next());
            } else if (op.equals("back")) {
                System.out.println(browser.back(sc.nextInt()));
            } else {
                System.out.println(browser.forward(sc.nextInt()));
            }
        }
    }
}

/*
INPUT:
leetcode.com
7
visit google.com
visit facebook.com
visit youtube.com
back 1
back 1
forward 1
visit linkedin.com

OUTPUT:
facebook.com
google.com
facebook.com
*/