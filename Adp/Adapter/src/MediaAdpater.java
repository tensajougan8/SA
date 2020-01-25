
public class MediaAdpater implements MediaPlayer {

	AdvancedMediaPlayer Music;

	@Override

	// TODO Auto-generated method stub
	public void play(String songString) {
		if (songString.equals("vlc")) {
			Music = new VlcPlayer();
			Music.playvlc();
		}
		if (songString.equals("mp4")) {
			Music = new Mp4Player();
			Music.playmp4();
		}

	}

}
