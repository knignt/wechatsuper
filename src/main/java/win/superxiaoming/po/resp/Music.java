package win.superxiaoming.po.resp;

/**
 * 音乐model
 * @author Wu
 *
 */
public class Music {
	//音乐名称
	private String title;
	//音乐描述
	private String desc;
	//音乐连接
	private String musicUrl;
	//高质量音乐链接,WIFI下优先使用该链接
	private String HQMusicUrl;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getMusicUrl() {
		return musicUrl;
	}
	public void setMusicUrl(String musicUrl) {
		this.musicUrl = musicUrl;
	}
	public String getHQMusicUrl() {
		return HQMusicUrl;
	}
	public void setHQMusicUrl(String hQMusicUrl) {
		HQMusicUrl = hQMusicUrl;
	}
	
	
}
