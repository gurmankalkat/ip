import java.util.Scanner;

public class Duke {
    public static void main(String[] args) {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);
    }

    public static void run() {
        System.out.println("Hello! I'm Duke");
        System.out.println("What can I do for you?");

        Scanner scan = new Scanner(System.in);
        String command = scan.next();
        while (!command.equals("bye")) {
            System.out.println(command);
            command = scan.next();
        }

        System.out.println("Bye. Hope to see you again soon!");
    }
}



