package win.superxiaoming.po.req;

/**
 * 链接信息
 * @author Wu
 *
 */
public class LinkMessage extends ReqBaseMessage{
	//消息标题
	private String title;
	//消息描述
	private String desc;
	//消息链接
	private String url;
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
