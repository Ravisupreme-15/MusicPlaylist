import java.util.LinkedList;
import java.util.List;

public class Albums {


    String name;
    String artist;
    private List<Song> songs;

    public Albums()
    {
    }

    public Albums(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new LinkedList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<Song> getSongs() {
        return this.songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }


    public boolean findSong(String title){

      for(Song s : this.songs){

          if(s.getTitle().equals(title)){

              //System.out.println("Song is present in the album");
            return true;
          }

          return false;
      }
    }

    public boolean addSong(String title, double duration){


         if(findSong(title)==true){

             System.out.println("Sorry we cannot add the "+ title+ " song is already  present");

             return false; // false reminds that song hasnot been added

         }

         Song  s = new Song(title,duration);

           songs.add(s);

           return true; // true remaind that the song is added
    }


    public boolean  addToplaylist(String title, LinkedList<Song> palyList){

            if(findSong(title)){


            }

            return false;
    }
}
