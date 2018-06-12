package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.pb.common.b.a.a.ak;
import com.tencent.pb.common.b.a.a.l;
import com.tencent.pb.common.b.d;

public final class m
  extends d
{
  public String jTX;
  public int kvL;
  public long vxz;
  
  public m(String paramString, int paramInt1, long paramLong, int paramInt2, int paramInt3)
  {
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.TAG2, "hello", paramString, Integer.valueOf(paramInt1), Long.valueOf(paramLong) });
    a.l locall = new a.l();
    locall.vcZ = paramInt3;
    locall.oLB = paramInt1;
    this.kvL = paramInt1;
    locall.oLC = paramLong;
    this.vxz = paramLong;
    locall.groupId = paramString;
    this.jTX = paramString;
    locall.kpU = paramInt2;
    this.jIm = 3;
    try
    {
      this.vcc = com.tencent.wecall.talkroom.model.c.cHG().adi(paramString);
      c(147, locall);
      return;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        com.tencent.pb.common.c.c.x(this.TAG2, new Object[] { "NetSceneVoiceRoomHello constructor", paramString });
      }
    }
  }
  
  protected final Object bI(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {
      try
      {
        paramArrayOfByte = (a.ak)e.a(new a.ak(), paramArrayOfByte, paramArrayOfByte.length);
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
    return "CsCmd.Cmd_V_CSVoiceRoomHelloReq";
  }
  
  public final int getType()
  {
    return 205;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/wecall/talkroom/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */