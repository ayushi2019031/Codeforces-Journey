//Avoid division by decimal digits :). Always try to multiply with whole numbers or fractions instead.
//if getting wrong answer then use long/double instead of int/float
//e + e = o; o + o = e; e + o = o;
//see stuff in a jugaad way... if you are being complicated you are doing it wrong baby girl :)
//If a=b+1 and b is even, then a∧b=1
//Be confident in Maths you are not that bad at it.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        // write your code here
        FastReader reader = new FastReader();
      int test = reader.nextInt();
      for (int i = 0; i < test; i++){

            }
          //  System.out.println(1);
      }
    //    }
    }
    static long gcd(long a, long b)
    {
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
}

class FastReader
{
    BufferedReader br;
    StringTokenizer st;
 
    public FastReader()
    {
        br = new BufferedReader(new
                InputStreamReader(System.in));
    }
 
    String next()
    {
        while (st == null || !st.hasMoreElements())
        {
            try
            {
                st = new StringTokenizer(br.readLine());
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
 
    int nextInt()
    {
        return Integer.parseInt(next());
    }
 
    long nextLong()
    {
        return Long.parseLong(next());
    }
 
    double nextDouble()
    {
        return Double.parseDouble(next());
    }
 
    String nextLine()
    {
        String str = "";
        try
        {
            str = br.readLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return str;
    }
}
 
/** Class for buffered reading int and double values */
class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;
 
    /** call this method to initialize reader for InputStream */
    static void init(InputStream input) {
        reader = new BufferedReader(
                new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }
 
    /** get next word */
    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            //TODO add check for eof if necessary
            tokenizer = new StringTokenizer(
                    reader.readLine() );
        }
        return tokenizer.nextToken();
    }
 
    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }
 
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}