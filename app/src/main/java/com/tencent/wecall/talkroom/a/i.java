package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.pb.common.b.a.a.ad;
import com.tencent.pb.common.b.a.a.g;
import com.tencent.pb.common.b.d;

public final class i
  extends d
{
  public i(String paramString, int paramInt1, long paramLong, int paramInt2)
  {
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.TAG2, "NetSceneRejectVoiceGroup" });
    a.g localg = new a.g();
    try
    {
      localg.groupId = paramString;
      localg.oLB = paramInt1;
      localg.oLC = paramLong;
      localg.aAk = paramInt2;
      this.jIm = 3;
      this.vcc = com.tencent.wecall.talkroom.model.c.cHG().adi(paramString);
      c(181, localg);
      return;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        com.tencent.pb.common.c.c.x(this.TAG2, new Object[] { "NetSceneRejectVoiceGroup constructor", paramString });
      }
    }
  }
  
  protected final Object bI(byte[] paramArrayOfByte)
  {
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.TAG2, "data2Resp" });
    if (paramArrayOfByte != null) {
      try
      {
        paramArrayOfByte = (a.ad)e.a(new a.ad(), paramArrayOfByte, paramArrayOfByte.length);
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
    return "CsCmd.Cmd_V_CSRejectEnterVoiceRoomReq";
  }
  
  public final int getType()
  {
    return 207;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/wecall/talkroom/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */