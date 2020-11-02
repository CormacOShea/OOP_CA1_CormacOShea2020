package assessment;
//Album.java
//This is an instantiable class called album



import java.util.Arrays;

public class Album {
    private String name;
    private Song[] tracks;
    private String producer;
    private int releaseYear;

    public Album(String name, Song[] tracks, String producer, int releaseYear) {
        setName(name);
        setTracks(tracks);
        setProducer(producer);
        setReleaseYear(releaseYear);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (setName()== null)
            this.name = "no name specified";
        else
            this.name = name;



    }



    public Song[] getTracks() {
        return tracks;
    }

    public void setTracks(Song[] tracks) {
        this.tracks = tracks;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void getNumberOfTracks(int numberOfTracks){
        new Song(numberOfTracks.getTrackNumber);
        return numberOfTracks;


    }

    public void getPlayingTime(int playingTime){
        return new Song(playingTime.getDuration());

    }

    public void playTrack(int playTrack) {
        if(playTrack=>5)


    }

    public void shuffle(){
        String shuffledPlaylist ="";

        if(shuffle()=="yes")
            shuffledPlaylist+= + getTracks();
        else
            shuffledPlaylist+= null;


    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n\nProducer" + getProducer() + "\n\nRelease Year: " + getReleaseYear() +
                "\n\nNumber of Tracks: " + getNumberOfTracks() + "\n\nTotal Playing Time: " + getPlayingTime() + Arrays.toString(Album);
    }
}
