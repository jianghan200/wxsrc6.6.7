package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.pb.common.b.a.a.a;
import com.tencent.pb.common.b.a.a.x;
import com.tencent.pb.common.b.d;

public final class b
  extends d
{
  public String jTX;
  public int kvL;
  public long vxz;
  
  public b(String paramString, int paramInt, long paramLong, String[] paramArrayOfString)
  {
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.TAG2, "addmember", paramString });
    a.a locala = new a.a();
    try
    {
      locala.groupId = paramString;
      this.jTX = paramString;
      locala.oLB = paramInt;
      this.kvL = paramInt;
      locala.oLC = paramLong;
      this.vxz = paramLong;
      locala.vcH = paramArrayOfString;
      locala.oLB = paramInt;
      this.jIm = 3;
      this.vcc = com.tencent.wecall.talkroom.model.c.cHG().adi(paramString);
      c(145, locala);
      return;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        com.tencent.pb.common.c.c.x(this.TAG2, new Object[] { "NetSceneAddVoiceGroupMember constructor", paramString });
      }
    }
  }
  
  protected final Object bI(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {
      try
      {
        paramArrayOfByte = (a.x)e.a(new a.x(), paramArrayOfByte, paramArrayOfByte.length);
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
    return "CsCmd.Cmd_V_CSAddVoiceGroupMemberReq";
  }
  
  public final int getType()
  {
    return 204;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/wecall/talkroom/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */