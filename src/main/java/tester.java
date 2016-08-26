
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jakob
 */
public class tester
{

    public static void main(String[] args) throws InterruptedException, IOException
    {
        System.out.println("Avilable processors: " + Runtime.getRuntime().availableProcessors());
        sum t = new sum("https://fronter.com/cphbusiness/design_images/images.php/Classic/login/fronter_big-logo.png");
        sum t2 = new sum("https://fronter.com/cphbusiness/design_images/images.php/Classic/login/folder-image-transp.png");
        sum t3 = new sum("https://fronter.com/volY12-cache/cache/img/design_images/Classic/other_images/button_bg.png");
        long start = System.nanoTime();
        int sum = 0;
        t.start();
        t.join();
        sum += t.getSum();
        t2.start();
        t2.join();
        sum += t2.getSum();
        t3.start();
        t3.join();
        sum += t3.getSum();
        long end = System.nanoTime();
        System.out.println("Parallel: " + (end - start));
        System.out.println(sum);

        start = System.nanoTime();
        t.run();
        t2.run();
        t3.run();
        end = System.nanoTime();
        System.out.println("Time Sequental: " + (end - start));

    }
}
