package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.pb.common.b.a.a.ae;
import com.tencent.pb.common.b.a.a.h;
import com.tencent.pb.common.b.d;

public final class k
  extends d
{
  public String jTX;
  public int kvL;
  public long vxz;
  
  public k(String paramString1, int paramInt, long paramLong, String paramString2)
  {
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.TAG2, "NetSceneSubscribeLargeVideo" });
    a.h localh = new a.h();
    try
    {
      localh.groupId = paramString1;
      this.jTX = paramString1;
      localh.kpo = paramInt;
      this.kvL = paramInt;
      localh.kpp = paramLong;
      this.vxz = paramLong;
      localh.hOQ = paramString2;
      localh.timestamp = System.currentTimeMillis();
      com.tencent.pb.common.c.c.w("MicroMsg.Voip", new Object[] { "roomId: %d, roomKey: %d, groupId: %s, ownerUserName: %s, timestamp: %d", Integer.valueOf(localh.kpo), Long.valueOf(localh.kpp), localh.groupId, localh.hOQ, Long.valueOf(localh.timestamp) });
      this.jIm = 3;
      this.vcc = com.tencent.wecall.talkroom.model.c.cHG().adi(paramString1);
      c(245, localh);
      return;
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        com.tencent.pb.common.c.c.x(this.TAG2, new Object[] { "NetSceneSwitchVideoGroup constructor", paramString1 });
      }
    }
  }
  
  protected final Object bI(byte[] paramArrayOfByte)
  {
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.TAG2, "data2Resp" });
    if (paramArrayOfByte != null) {
      try
      {
        paramArrayOfByte = (a.ae)e.a(new a.ae(), paramArrayOfByte, paramArrayOfByte.length);
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
    return "CsCmd.Cmd_V_CSSubscribeLargeVideoReq";
  }
  
  public final int getType()
  {
    return 800;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/wecall/talkroom/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */