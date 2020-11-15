package main.java.uebung1.buchungssystem;

interface UsingDBAccess {
    DBAccess db = new DBAccess();

    private void openConnection() {
        db.openConnection();
    }
    private void closeConnection() {
        db.closeConnection();
    }
}
