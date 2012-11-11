import java.lang.*;
import iste.media.*;

class PlaylistA
{
   public static void main(String[] args)
   {

	/*Generation and Initialization of Objects*/
	
	Song bugsBunnySong = new Song();

	bugsBunnySong.name = "Bugs Bunny";
	bugsBunnySong.type = "Musik";
	bugsBunnySong.duration = 35;

	Song tourSong = new Song();

	tourSong.name = "Tour Song";
	tourSong.type = "Musik";
	tourSong.duration = 35;

	Song maschenDrahtZaunSong = new Song();

	maschenDrahtZaunSong.name = "Maschendraht sonh";
	maschenDrahtZaunSong.type = "vielleicht Musik";
	maschenDrahtZaunSong.duration = 35;

	/*play" the songs
 	* then "pause" them	
 	finaly "stop" them */

	bugsBunnySong.play();
	bugsBunnySong.pause();
	bugsBunnySong.stop();

	tourSong.play();
	tourSong.pause();
	tourSong.stop();

	maschenDrahtZaunSong.play();
	maschenDrahtZaunSong.pause();
	maschenDrahtZaunSong.stop();

	tourSong.songAlbum = "t";
   }
}
