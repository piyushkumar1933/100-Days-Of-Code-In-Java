package Day16;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class Square extends Thread


        {

    int x;
    Path fileName = Path.of("square.txt");


    Square(int n)

    {

        x = n;

    }

    public void run()

    {



        int sqr = x * x;
        String s = sqr+"";
        try {
            Files.writeString(fileName, s);
        }
        catch (Exception e){
            System.out.println(e.getStackTrace());
        }




    }

}

class Cube extends Thread

{

    int x;

    Cube(int n)

    {x = n;

    }

    public void run()

    {

        int cub = x * x * x;

        System.out.println("Cube of " + x + " = " + cub );

    }

}

class Number extends Thread

{

    public void run()

    {


        for(int i =0; i<5; i++)

        {

           try {
               Square s = new Square(i);

               s.start();

               Cube c = new Cube(i);

               c.start();

           }
             catch (Exception ex) {

                System.out.println(ex.getStackTrace());

            }

        }

    }

}

public class Thr {

    public static void main(String args[])

    {

        Number n = new Number();

        n.start();

    }

}