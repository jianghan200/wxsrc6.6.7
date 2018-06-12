package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.pb.a.a.a;
import com.tencent.pb.common.b.a.a.al;
import com.tencent.pb.common.b.a.a.at;
import com.tencent.pb.common.b.a.a.ay;
import com.tencent.pb.common.b.a.a.ba;
import com.tencent.pb.common.b.a.a.d;
import com.tencent.pb.common.b.a.a.z;
import com.tencent.pb.common.c.c;
import com.tencent.wecall.talkroom.model.k;

public final class d
  extends com.tencent.pb.common.b.d
{
  public int mType;
  public String vxy;
  public boolean vzv = true;
  
  public d(String paramString1, String[] paramArrayOfString, byte[] paramArrayOfByte, String paramString2, a.ay paramay, int paramInt1, int paramInt2, long paramLong, String paramString3, boolean paramBoolean, String paramString4)
  {
    c.d("MicroMsg.Voip", new Object[] { this.TAG2, "create" });
    a.d locald = new a.d();
    for (;;)
    {
      try
      {
        locald.vcI = paramString1;
        this.vxy = paramString1;
        locald.vcN = paramInt1;
        this.vcc = paramInt1;
        if (paramay != null) {
          locald.vcP = paramay;
        }
        paramString1 = new a.at();
        paramString1.name = paramString2;
        paramString1.vfd = paramString4;
        paramString1.vfc = a.cEG();
        paramString1.bOS = paramInt2;
        this.mType = paramInt2;
        this.vzv = paramBoolean;
        paramString1.veV = paramLong;
        locald.vcK = paramString1;
        locald.vcR = paramArrayOfString;
        paramString1 = paramString3;
        if (paramString3 == null) {
          paramString1 = "";
        }
        locald.vcQ = paramString1;
        paramString1 = new a.al();
        if (paramArrayOfByte == null) {
          continue;
        }
        paramString1.buffer = paramArrayOfByte;
        paramString1.siI = paramArrayOfByte.length;
        paramArrayOfString = new a.ba();
        paramArrayOfString.type = 3;
        paramArrayOfString.vfX = paramString1;
        locald.vcM = paramArrayOfString;
        this.jIm = 3;
        locald.vcO = 2;
        locald.netType = k.ih(com.tencent.pb.common.c.d.oSX);
      }
      catch (Exception paramString1)
      {
        c.x(this.TAG2, new Object[] { "NetSceneCreateVoiceGroup constructor", paramString1 });
        continue;
      }
      c(139, locald);
      return;
      paramString1.siI = 0;
    }
  }
  
  protected final Object bI(byte[] paramArrayOfByte)
  {
    c.d("MicroMsg.Voip", new Object[] { this.TAG2, "data2Resp" });
    if (paramArrayOfByte != null) {
      try
      {
        paramArrayOfByte = (a.z)e.a(new a.z(), paramArrayOfByte, paramArrayOfByte.length);
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
    return "CsCmd.Cmd_V_CSCreateVoiceGroupReq";
  }
  
  public final int getType()
  {
    return 201;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/wecall/talkroom/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */