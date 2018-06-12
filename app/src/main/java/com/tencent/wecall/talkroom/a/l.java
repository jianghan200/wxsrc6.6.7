package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.pb.common.b.a.a.af;
import com.tencent.pb.common.b.a.a.i;
import com.tencent.pb.common.b.d;

public final class l
  extends d
{
  public String jTX;
  public int kvL;
  public long vxz;
  
  public l(String paramString, int paramInt1, long paramLong, int paramInt2)
  {
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.TAG2, "NetSceneSwitchVideoGroup" });
    a.i locali = new a.i();
    try
    {
      locali.groupId = paramString;
      this.jTX = paramString;
      locali.kpo = paramInt1;
      this.kvL = paramInt1;
      locali.kpp = paramLong;
      this.vxz = paramLong;
      locali.action = paramInt2;
      locali.timestamp = System.currentTimeMillis();
      this.jIm = 3;
      this.vcc = com.tencent.wecall.talkroom.model.c.cHG().adi(paramString);
      c(243, locali);
      return;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        com.tencent.pb.common.c.c.x(this.TAG2, new Object[] { "NetSceneSwitchVideoGroup constructor", paramString });
      }
    }
  }
  
  protected final Object bI(byte[] paramArrayOfByte)
  {
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.TAG2, "data2Resp" });
    if (paramArrayOfByte != null) {
      try
      {
        paramArrayOfByte = (a.af)e.a(new a.af(), paramArrayOfByte, paramArrayOfByte.length);
        return paramArrayOfByte;
      }
      catch (Exception paramArrayOfByte)
      {
        com.tencent.pb.common.c.c.x(this.TAG2, new Object[] { "data2Resp", paramArrayOfByte.getMessage() });
        return null;
      }
    }
    return null;
  }
  
  protected final String cEm()
  {
    return "CsCmd.Cmd_V_CSSwitchVideoGroupReq";
  }
  
  public final int getType()
  {
    return 214;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/wecall/talkroom/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */