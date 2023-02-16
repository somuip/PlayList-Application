import java.util.*;

public class Album {
    private String title;
    private String artist;
    private List<Song> songs;

    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    // find a song
    boolean findSong(String title){
        for(Song song : songs ){
            if(song.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    // add song to album
    String addSongToAlbum(String title,double duration){
        if(findSong(title) == false){
            Song s = new Song(title, duration);
            songs.add(s);
            return "Song added to album";
        }
        return "Song already exist";
    }
    // add song to playlist from album
    String addSongToPlayListfromAlbum(String title, List<Song> playList){
        if(findSong(title) == true){
            for (Song s:songs){
                if(s.getTitle().equals(title)){
                    playList.add(s);
                    return "Song is added to your playlist";
                }
            }
        }
        return "Song is not present in Album";
    }
    String addSongToPlayListfromAlbum(int trackNo, List<Song> playList) {
        int index = trackNo;
        if(index >=0 && index < this.songs.size()){
            playList.add(this.songs.get(index));
            return "Song has been added to playlist";
        }
        return "Invalid Index";
    }
}
