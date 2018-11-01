import com.github.javafaker.Faker;
import org.eclipse.collections.api.block.procedure.Procedure;
import org.eclipse.collections.impl.list.Interval;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Program {
    public static void main(String[] args) throws IOException {

        Faker f = new Faker();
        FileWriter fw = new FileWriter("/Users/mganitombalak/Desktop/data.csv", true);
        Random r = new Random();
        Interval.zeroTo(1000000).forEach((Procedure<? super Integer>) integer -> {
            try {
                fw.append(f.name().firstName())
                        .append(",")
                        .append(f.name().lastName())
                        .append(",")
                        .append(f.internet().emailAddress())
                        .append(",")
                        .append(String.valueOf(r.nextInt(11501) + 500))
                        .append(",")
                        .append("TRAN-")
                        .append(String.valueOf(f.number().randomDigit()))
                        .append("\r\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        fw.flush();
        fw.close();
    }
}
