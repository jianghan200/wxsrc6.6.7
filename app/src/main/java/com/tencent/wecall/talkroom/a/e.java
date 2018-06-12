package com.tencent.wecall.talkroom.a;

import com.tencent.pb.common.b.a.a.aa;
import com.tencent.pb.common.b.a.a.al;
import com.tencent.pb.common.b.a.a.at;
import com.tencent.pb.common.b.a.a.ba;
import com.tencent.pb.common.b.a.a.e;
import com.tencent.pb.common.c.c;
import com.tencent.wecall.talkroom.model.k;

public final class e
  extends com.tencent.pb.common.b.d
{
  public String jTX = null;
  public int kvL = 0;
  public String vxx = null;
  public long vxz = 0L;
  public int vzw = 0;
  
  public e(e parame)
  {
    this.jTX = parame.jTX;
    this.kvL = parame.kvL;
    this.vxz = parame.vxz;
    this.vzw = parame.vzw;
    this.vxx = parame.vxx;
    this.vbZ = parame.vbZ;
    this.vcb = parame.vcb;
    this.vcc = parame.vcc;
    this.jIm = 1;
  }
  
  public e(String paramString1, int paramInt1, long paramLong, byte[] paramArrayOfByte, int paramInt2, int paramInt3, String paramString2)
  {
    c.d("MicroMsg.Voip", new Object[] { this.TAG2, "enter2", paramString1, Integer.valueOf(paramInt1), Long.valueOf(paramLong), paramString2 });
    a.e locale = new a.e();
    for (;;)
    {
      try
      {
        locale.groupId = paramString1;
        this.jTX = paramString1;
        locale.oLB = paramInt1;
        this.kvL = paramInt1;
        locale.oLC = paramLong;
        this.vxz = paramLong;
        locale.vcU = paramInt3;
        this.vzw = paramInt3;
        paramString1 = new a.at();
        paramString1.vfd = paramString2;
        locale.vcK = paramString1;
        this.vxx = paramString2;
        c.d("MicroMsg.Voip", new Object[] { this.TAG2, "wXgroupId", locale.vcK.vfd });
        paramString1 = new a.al();
        if (paramArrayOfByte == null) {
          continue;
        }
        paramString1.buffer = paramArrayOfByte;
        paramString1.siI = paramArrayOfByte.length;
        paramArrayOfByte = new a.ba();
        paramArrayOfByte.type = 3;
        paramArrayOfByte.vfX = paramString1;
        locale.vcM = paramArrayOfByte;
        this.jIm = 2;
        this.vcc = paramInt2;
        locale.vcO = 2;
        locale.netType = k.ih(com.tencent.pb.common.c.d.oSX);
      }
      catch (Exception paramString1)
      {
        c.x(this.TAG2, new Object[] { "NetSceneEnterVoiceRoom constructor", paramString1 });
        continue;
      }
      c(141, locale);
      return;
      paramString1.siI = 0;
    }
  }
  
  protected final Object bI(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {
      try
      {
        paramArrayOfByte = (a.aa)com.google.a.a.e.a(new a.aa(), paramArrayOfByte, paramArrayOfByte.length);
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
    return "CsCmd.Cmd_V_CSEnterVoiceRoomReq";
  }
  
  public final int getType()
  {
    return 202;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/wecall/talkroom/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */