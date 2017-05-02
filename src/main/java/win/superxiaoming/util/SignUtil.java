package win.superxiaoming.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import org.apache.commons.codec.digest.DigestUtils;

import com.qq.weixin.mp.aes.AesException;
import com.qq.weixin.mp.aes.WXBizMsgCrypt;

public class SignUtil {
	//token
	private static String token = "WeChatXiaoMing";
	//应用id
	private static String appId = "wxd2d4ebadae960240";
	//消息加解密密钥
	private static String encodingAesKey = "a95kKDtR9mWKsGkKfCnWB9zN7ZzzqWAwB4TI10Ntj92";
	/**
	 * 
	 * @param signature
	 * @param timestamp
	 * @param nonce
	 * @return
	 */
	public static boolean checkSignature(String signature,String timestamp,String nonce){
		String[] arr = new String[]{token,timestamp,nonce};
		//token,timestamp,nonce排序
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder();
		//组成一个字符串
		for(int i = 0;i<arr.length;i++){
			sb.append(arr[i]);
		}
		//sha1加密
		try {
			/*MessageDigest md = MessageDigest.getInstance("SHA-1");
			byte[] bresult = md.digest(sb.toString().getBytes());
			String sresult = byteToStr(bresult);*/
			String sresult = DigestUtils.sha1Hex(sb.toString());
			if(sresult!=null&&sresult.equalsIgnoreCase(signature)){
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	
    /** 
     * 
     *  
     * @param byteArray 
     * @return 
     */  
    private static String byteToStr(byte[] byteArray) {  
        String strDigest = "";  
        for (int i = 0; i < byteArray.length; i++) {  
            strDigest += byteToHexStr(byteArray[i]);  
        }  
        return strDigest;  
    }  
    
    /** 
     * 
     *  
     * @param mByte 
     * @return 
     */  
    private static String byteToHexStr(byte mByte) {  
        char[] Digit = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };  
        char[] tempArr = new char[2];  
        tempArr[0] = Digit[(mByte >>> 4) & 0X0F];  
        tempArr[1] = Digit[mByte & 0X0F];  
        String s = new String(tempArr);  
        return s;  
    } 
    
    /**
     * 解密消息
     * @param msgSignature
     * @param timestamp
     * @param nonce
     * @param encryptMsg
     * @return 解密后消息
     */
    public static String decryptMsg(String msgSignature,String timestamp,String nonce,String encryptMsg){
    	try {
			WXBizMsgCrypt pc = new WXBizMsgCrypt(token, encodingAesKey, appId);
			return pc.decryptMsg(msgSignature, timestamp, nonce, encryptMsg);
		} catch (AesException e) {
			e.printStackTrace();
		}
    	
    	return "";
    }
    
    /**
     * 加密消息
     * @param timestamp
     * @param nonce
     * @param replyMsg
     * @return 加密后的消息
     */
    public static String encryptMsg(String timestamp,String nonce,String replyMsg){
    	try {
			WXBizMsgCrypt pc =  new WXBizMsgCrypt(token, encodingAesKey, appId);
			return pc.encryptMsg(replyMsg, timestamp, nonce);
		} catch (AesException e) {
			e.printStackTrace();
		}
    	
    	return "";
    }
    
}
