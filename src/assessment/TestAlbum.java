package assessment;
//TestAlbum.java
//This test driver tests the functionality of the two instantiable classes and displays them
//Aggregation is used between the classes
import javax.swing.*;

public class TestAlbum {
    public static void main(String[] args) {
        Song song1 = new Song("Sugar Baby Love", "Rubettes", "Pop", 136, 1977);


        Song song2 = new Song("Living on a Prayer", "Bon Jovi", "Rock", 184, 1985);


        Song song3 = new Song("Blue Suede Shoes", "Elvis Presley", "Pop", 157, 1963);


        Song song4 = new Song("Someone Like You", "Adele", "Pop", 223, 2013);


        Song song5 = new Song("House of Fun", "Madness", "Pop", 178, 1984);


        Song[] allSongs = new Song[5];

        allSongs[0] = song1;
        allSongs[1] = song2;
        allSongs[2] = song3;
        allSongs[3] = song4;
        allSongs[5] = song5;

        Album album1 = new Album("Now that’s what I call music 98",new Song[]{song1,song2,song3,song4,song5} , "Universal Music", 2016, 5 ,"878 seconds");

        JOptionPane.showMessageDialog(null,"");
        String trackNumberAsString;


     trackNumberAsString   =   JOptionPane.showInputDialog("Which track number would you like to play");

        JOptionPane.showMessageDialog(null,"Now playing track-details as follows:\n\n" + getTrackNumber(),"Playing Track",JOptionPane.INFORMATION_MESSAGE);
        String shufflePlaylist;
    shufflePlaylist =   JOptionPane.showInputDialog("Do you wish to shuffle the playlist (yes or no): ");

while(shufflePlaylist=="yes") {
    for (int i = 0; i < allSongs.length; i++) {
        JOptionPane.showMessageDialog(null, "\n\nShuffled playlist as follows: " + "\n\n" + shuffled(), "Shuffled Playlist",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
System.exit(0);
    }
}
