package win.superxiaoming.po.resp;

/**
 * 音乐消息
 * @author Wu
 *
 */
public class MusicMessage extends RespBaseMessage{
	private Music music;

	public Music getMusic() {
		return music;
	}

	public void setMusic(Music music) {
		this.music = music;
	}
	
}
