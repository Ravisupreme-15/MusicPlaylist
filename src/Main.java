import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import static java.lang.System.exit;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Albums albums1 = new Albums("buttabomma","armanmalik");
        Albums albums2 = new Albums("Natu Natu","kalabhairava");

        albums1.addSong("nachavule nachavule",4.3);
        albums1.addSong("cheliya cheliya",5.0);
        albums2.addSong("lux papa",3.5);
        albums2.addSong("jai balayya",4.0);




        // find song

        if(albums1.findSong("nachavule nachavule")){

            System.out.println("Congrats! Song is  present in the  albums");
        }
        else{
             System.out.println("Sorry song is not present in the albums1");

        }

        if(albums2.findSong("cheliya cheliya")){

            System.out.println("Congrats! Song is  present in the "+ albums1);
        }
        else{
            System.out.println("Sorry song is not present in the "+albums1);

        }


        // create playlist and songs
        LinkedList<Song> myplayList = new LinkedList<>();

        albums1.addToplaylist("buttabomma",myplayList);
        albums2.addToplaylist(2,myplayList);
        albums1.addToplaylist(2,myplayList);



        // wrong song

        albums1.addToplaylist(5,myplayList);
        albums2.addToplaylist("Oh madhu",myplayList);


        play(myplayList);


    }

    public static void printSongs(LinkedList<Song> playlist){


        for(Song s : playlist){

             System.out.print(s);
        }
    }

    public static void printMenu(){

        System.out.println("1 play next song");
        System.out.println("2 play prev song");
        System.out.println("3 Repeat the current song");
        System.out.println("4 show all song in playlist");
        System.out.println("5 delete the current song");
        System.out.println("6 Show the menu option");
        System.out.println("7 exit");







    }

    public static void play(LinkedList<Song> playList){


        ListIterator<Song> itr = playList.listIterator();


        if(!itr.hasNext()){

            System.out.println("Your playlist is empy!");
            return;
        }

        System.out.print("Now playing: ");
         System.out.println(itr.next());


        printMenu();

        Scanner sc = new Scanner(System.in);

        while(true){


            System.out.println("Please enter the option");
            int option = sc.nextInt();


            switch (option){

                case 1:
                    if(itr.hasNext()){

                        System.out.println("Now playing");
                        System.out.println(itr.next());
                    }
                    else{
                        System.out.println("you have reached the end of the list");
                    }
                        break;

                case 2:

                    if(itr.hasPrevious()){
                        System.out.println("Now playing");
                        System.out.println(itr.previous());
                    }
                    else{
                        System.out.println("you are at start of the list");
                    }

                    break;


                case 3:
                    break;

                case 4:

                    printSongs(playList);
                    break;

                case 5:
                    break;

                case 6:
                    printMenu();
                    break;

                case 7:
                    exit(0);

            }
        }







    }
}