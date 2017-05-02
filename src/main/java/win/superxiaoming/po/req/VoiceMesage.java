package win.superxiaoming.po.req;

/**
 * 语音消息
 * @author Wu
 *
 */
public class VoiceMesage extends ReqBaseMessage{
	//媒体id
	private String mediaId;
	//语音格式
	private String formate;
	public String getMediaId() {
		return mediaId;
	}
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
	public String getFormate() {
		return formate;
	}
	public void setFormate(String formate) {
		this.formate = formate;
	}
	
}
