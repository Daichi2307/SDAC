package jdbc_ps_diff;

public class Main {
    public static void main(String[] args) {
        Create insert = new Create();
        Update update = new Update();
        Delete delete = new Delete();
        Show show = new Show();

        insert.insert(1, "Sumeet");
        update.update(1, "Daichi");
        show.show();
        delete.delete(1);
    }
}
