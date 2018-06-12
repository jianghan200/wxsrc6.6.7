package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.pb.common.b.a.a.ag;
import com.tencent.pb.common.b.a.a.al;
import com.tencent.pb.common.b.a.a.ba;
import com.tencent.pb.common.b.a.a.j;
import com.tencent.pb.common.b.d;
import com.tencent.pb.common.c.c;

public final class a
  extends d
{
  public String jTX = null;
  public int kvL = 0;
  public int vcc;
  public long vxz = 0L;
  public int vzu;
  
  public a(String paramString, int paramInt1, long paramLong, int paramInt2, int paramInt3)
  {
    c.d("MicroMsg.Voip", new Object[] { this.TAG2, "NetSceneAckVoiceGroup" });
    a.j localj = new a.j();
    try
    {
      localj.groupId = paramString;
      this.jTX = paramString;
      localj.oLB = paramInt1;
      this.kvL = paramInt1;
      localj.oLC = paramLong;
      this.vxz = paramLong;
      this.vzu = paramInt3;
      this.vcc = paramInt2;
      paramString = new a.al();
      paramString.siI = 0;
      a.ba localba = new a.ba();
      localba.type = 3;
      localba.vfX = paramString;
      localj.vcM = localba;
      this.jIm = 3;
      this.vcc = paramInt2;
      c(189, localj);
      return;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        c.x(this.TAG2, new Object[] { "NetSceneAckVoiceGroup constructor", paramString });
      }
    }
  }
  
  protected final Object bI(byte[] paramArrayOfByte)
  {
    c.d("MicroMsg.Voip", new Object[] { this.TAG2, "data2Resp" });
    if (paramArrayOfByte != null) {
      try
      {
        paramArrayOfByte = (a.ag)e.a(new a.ag(), paramArrayOfByte, paramArrayOfByte.length);
        return paramArrayOfByte;
      }
      catch (Exception paramArrayOfByte)
      {
        c.x(this.TAG2, new Object[] { "data2Resp", paramArrayOfByte.getMessage() });
        return null;
      }
    }
    return null;
  }
  
  protected final String cEm()
  {
    return "CsCmd.Cmd_V_CSVoiceAckReq";
  }
  
  public final int getType()
  {
    return 206;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/wecall/talkroom/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */