package win.superxiaoming.po.req;

/**
 * 图片消息
 * @author Wu
 *
 */
public class ImageMessage extends ReqBaseMessage{
	//图片链接
	private String picUrl;

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	
}
