package win.superxiaoming.po.req;

/**
 * 消息基类(普通用户 -> 公众帐号)
 * @author Wu
 *
 */
public class ReqBaseMessage {
	//开发者微信号
	private String toUserName;
	//发送方帐号(只能开到一个openId)
	private String fromUserName;
	//消息创建时间
	private long createTime;
	//消息类型
	private String msgType;
	//消息id,64位整形
	private long msgId;
	public String getToUserName() {
		return toUserName;
	}
	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}
	public String getFromUserName() {
		return fromUserName;
	}
	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}
	public long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	public long getMsgId() {
		return msgId;
	}
	public void setMsgId(long msgId) {
		this.msgId = msgId;
	}

}
