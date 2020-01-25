
public class AudioPlayer implements MediaPlayer {
	MediaAdpater amp = new MediaAdpater();

	@Override
	public void play(String songString) {

		if (songString.endsWith("mp3")) {
			System.out.println("MP3 File Playing..........");
		}

		if (songString.endsWith("vlc")) {
			amp.play("vlc");
		}

		if (songString.endsWith("mp4")) {
			amp.play("mp4");
		}

	}

}
