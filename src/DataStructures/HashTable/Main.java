package DataStructures.HashTable;

public class Main {
    public static void main(String[] args) {
      HashTable myTable = new HashTable();

      myTable.set("nails",100);
      myTable.set("title",50);

      myTable.printTable();
      System.out.println( myTable.get("title"));
      System.out.println(myTable.keys());

    }
}
