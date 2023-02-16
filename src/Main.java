import java.util.*;

public class Main {
    public static void main(String[] args) {

        Album album1 = new Album("My mix", "somuip");
        album1.addSongToAlbum("song1", 5.3);
        album1.addSongToAlbum("song2", 4.7);
        album1.addSongToAlbum("song3", 4.3);

        Album album2 = new Album("Kannada", "sonu nigam");
        album2.addSongToAlbum("Mungaaru male", 5.3);
        album2.addSongToAlbum("Gaalipata", 4.7);
        album2.addSongToAlbum("Yajamana", 4.3);

        List<Song> myPlayList = new LinkedList<>();

        // overloading concept
        System.out.println(album2.addSongToPlayListfromAlbum("gaalipata", myPlayList));
        System.out.println(album1.addSongToPlayListfromAlbum(2, myPlayList));
        System.out.println(album2.addSongToPlayListfromAlbum("Yajamana", myPlayList));

        play(myPlayList);
    }

    public static void play(List<Song> playList){

        ListIterator<Song> itr = playList.listIterator();

        if(playList.size() == 0){
            System.out.println("PlayList is Empty");
            return;
        }

        System.out.println("Currently playing: ");
        System.out.println(itr.next());

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    if(itr.hasNext()){
                        System.out.println("Now playing");
                        System.out.println(itr.next());
                    }
                    else System.out.println("You have reached the end of list");
                    break;
                case 2:
                    if(itr.hasPrevious()){
                        System.out.println("Now playing");
                        System.out.println(itr.previous());
                    }
                    else System.out.println("You are at the starting song of list");
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    printAllSongs(playList);
                    break;
                case 6:
                    printMenu();
                    break;
                case 7:
                    // exit
                    return;
            }
        }
    }

    public static void printAllSongs(List<Song> playList){
        for(Song song : playList)
            System.out.println(song);
        return;
    }
    public static void printMenu(){
        System.out.println("1. Play next song");
        System.out.println("2. Play previous song");
        System.out.println("3. Play current song again");
        System.out.println("4. Delete current song");
        System.out.println("5. Show all songs");
        System.out.println("6. Show menu");
        System.out.println("7. Exit");
    }
}