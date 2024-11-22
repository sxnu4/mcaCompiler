import java.util.HashMap;
import java.util.Scanner;

class SymbolTable {
    private HashMap<String, String> table;

    public SymbolTable() {
        table = new HashMap<>();
    }

    public void insert(String name, String type) {
        table.put(name, type);
    }

    public void display() {
        System.out.println("Symbol Table:");
        System.out.println("Name\tType");
        for (HashMap.Entry<String, String> entry : table.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }
}

public class SymbolTableApp {
    public static void main(String[] args) {
        SymbolTable st = new SymbolTable();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of symbols: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name and type of symbol " + (i + 1) + ": ");
            String name = scanner.next();
            String type = scanner.next();
            st.insert(name, type);
        }
        
        st.display();
        scanner.close();
    }
}
