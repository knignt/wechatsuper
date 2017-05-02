package win.superxiaoming.po.resp;

/**
 * 文本消息
 * @author Wu
 *
 */
public class TextMessage extends RespBaseMessage{
	//回复的消息内容
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
