
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * static
 *
 *
 * @author jakob
 */
public class sum extends Thread
{
   

    byteSum b = new byteSum();
    String url;
    int sum;
    byte[] bytes;
    public sum(String url) throws IOException
    {
        this.url = url;
        this. bytes = b.getBytesFromUrl(url);
    }

    public void run() 
    {
        for (int i = 0; i < bytes.length; i++)
        {
            sum += bytes[i];
        }
        setSum(sum);

    }
    public void setSum(int sum)
    {
        this.sum = sum;
    }
    public int getSum()
    {
        return sum;
    }
}
