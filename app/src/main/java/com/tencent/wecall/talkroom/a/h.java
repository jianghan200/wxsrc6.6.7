package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.pb.common.b.a.a.aj;
import com.tencent.pb.common.b.a.a.k;
import com.tencent.wecall.talkroom.model.k;

public final class h
  extends com.tencent.pb.common.b.d
{
  public String groupId;
  public int kpo;
  public long kpp;
  
  public h(String paramString, int paramInt1, long paramLong, int paramInt2)
  {
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.TAG2, "NetSceneRejectVoiceGroup" });
    a.k localk = new a.k();
    try
    {
      localk.groupId = paramString;
      localk.oLB = paramInt1;
      localk.oLC = paramLong;
      localk.kpU = paramInt2;
      localk.vcO = 2;
      localk.netType = k.ih(com.tencent.pb.common.c.d.oSX);
      this.jIm = 3;
      this.vcc = com.tencent.wecall.talkroom.model.c.cHG().adi(paramString);
      c(211, localk);
      return;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        com.tencent.pb.common.c.c.x(this.TAG2, new Object[] { "NetSceneRedirect constructor", paramString });
      }
    }
  }
  
  protected final Object bI(byte[] paramArrayOfByte)
  {
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.TAG2, "data2Resp" });
    if (paramArrayOfByte != null) {
      try
      {
        paramArrayOfByte = (a.aj)e.a(new a.aj(), paramArrayOfByte, paramArrayOfByte.length);
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
    return "CsCmd.Cmd_V_CSVoiceRedirectReq";
  }
  
  public final int getType()
  {
    return 211;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/wecall/talkroom/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */