import db.DBGolfer;
import models.Golfer;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Golfer golfer1 = new Golfer("Tiger", "Woods", 42);
        DBGolfer.save(golfer1);

        Golfer golfer2 = new Golfer("Severiano", "Ballesteros", 1500);//currently death
        DBGolfer.save(golfer2);

    List<Golfer> golfers = DBGolfer.getAll();

    Golfer Tiger = DBGolfer.find(golfer1.getId());

    System.out.println(Tiger.getFirstName());

    System.exit(0);
    }
}
