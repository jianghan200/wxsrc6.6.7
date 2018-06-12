package com.tencent.c.f;

import com.qq.taf.RequestPacket;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceUtil;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Set;

public final class l
{
  static HashMap<String, byte[]> vkR = null;
  protected String vkN = "UTF-8";
  protected RequestPacket vkO = new RequestPacket();
  protected HashMap<String, byte[]> vkP = new HashMap();
  private HashMap<String, Object> vkQ = new HashMap();
  
  public l()
  {
    this.vkO.iVersion = 3;
  }
  
  public final void acv(String paramString)
  {
    this.vkN = paramString;
  }
  
  public final void acw(String paramString)
  {
    this.vkO.sServantName = paramString;
  }
  
  public final void acx(String paramString)
  {
    this.vkO.sFuncName = paramString;
  }
  
  public final void cFy()
  {
    this.vkO.iRequestId = 3;
  }
  
  public final <T> void put(String paramString, T paramT)
  {
    if ((paramString.startsWith(".")) || (paramT == null) || ((paramT instanceof Set))) {
      throw new IllegalArgumentException("wup put err");
    }
    JceOutputStream localJceOutputStream = new JceOutputStream();
    localJceOutputStream.setServerEncoding(this.vkN);
    localJceOutputStream.write(paramT, 0);
    paramT = JceUtil.getJceBufArray(localJceOutputStream.getByteBuffer());
    this.vkP.put(paramString, paramT);
  }
  
  public final byte[] uu()
  {
    if (this.vkO.sServantName == null) {
      this.vkO.sServantName = "";
    }
    if (this.vkO.sFuncName == null) {
      this.vkO.sFuncName = "";
    }
    Object localObject = new JceOutputStream(0);
    ((JceOutputStream)localObject).setServerEncoding(this.vkN);
    ((JceOutputStream)localObject).write(this.vkP, 0);
    this.vkO.sBuffer = JceUtil.getJceBufArray(((JceOutputStream)localObject).getByteBuffer());
    localObject = new JceOutputStream(0);
    ((JceOutputStream)localObject).setServerEncoding(this.vkN);
    this.vkO.writeTo((JceOutputStream)localObject);
    localObject = JceUtil.getJceBufArray(((JceOutputStream)localObject).getByteBuffer());
    int i = localObject.length;
    ByteBuffer localByteBuffer = ByteBuffer.allocate(i + 4);
    localByteBuffer.putInt(i + 4).put((byte[])localObject).flip();
    return localByteBuffer.array();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/c/f/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */