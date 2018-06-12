package com.tencent.mm.plugin.subapp.ui.voicetranstext;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bea;
import com.tencent.mm.protocal.c.bws;
import com.tencent.mm.protocal.c.byo;
import com.tencent.mm.protocal.c.byt;
import com.tencent.mm.protocal.c.ow;
import com.tencent.mm.protocal.c.ox;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  extends l
  implements k
{
  public static int oua = 1;
  public static int oub = 2;
  public static int ouc = 3;
  private String bZR;
  private b dIy;
  private com.tencent.mm.ab.e lCQ;
  private String mFileName;
  public int mState = -1;
  private String otU;
  private int otV;
  private byo otW;
  private long otX;
  private int otY;
  private String otZ;
  public byt oud;
  public bws oue;
  public bea ouf;
  int oug;
  
  public a(String paramString1, int paramInt1, int paramInt2, long paramLong, String paramString2)
  {
    a(paramString1, paramInt1, paramInt2, paramLong, paramString2, 0, "", "");
  }
  
  public a(String paramString1, int paramInt1, int paramInt2, long paramLong, String paramString2, int paramInt3, String paramString3, String paramString4)
  {
    a(paramString1, paramInt1, paramInt2, paramLong, paramString2, paramInt3, paramString3, paramString4);
  }
  
  public a(String paramString1, int paramInt, String paramString2)
  {
    a(paramString1, paramInt, -1, -1L, paramString2, 0, "", "");
  }
  
  public a(String paramString1, int paramInt1, String paramString2, int paramInt2, String paramString3, String paramString4)
  {
    a(paramString1, paramInt1, -1, -1L, paramString2, paramInt2, paramString3, paramString4);
  }
  
  private void a(String paramString1, int paramInt1, int paramInt2, long paramLong, String paramString2, int paramInt3, String paramString3, String paramString4)
  {
    b.a locala = new b.a();
    locala.dIG = new ow();
    locala.dIH = new ox();
    locala.uri = "/cgi-bin/micromsg-bin/checkvoicetrans";
    locala.dIF = 546;
    locala.dII = 0;
    locala.dIJ = 0;
    this.mFileName = paramString2;
    this.dIy = locala.KT();
    x.i("MicroMsg.NetSceneCheckVoiceTrans", "voiceId:%s, totalLen:%d, encodeType: %d, svrMsgId: %s", new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(paramLong) });
    if (paramInt2 >= 0) {
      this.otW = d.aI(paramInt2, paramString2);
    }
    if (paramLong > 0L) {
      this.otX = paramLong;
    }
    this.otU = paramString1;
    this.otV = paramInt1;
    this.otY = paramInt3;
    this.otZ = paramString3;
    this.bZR = paramString4;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.lCQ = parame1;
    parame1 = (ow)this.dIy.dID.dIL;
    parame1.rsZ = this.otU;
    parame1.rdV = this.otV;
    parame1.rta = this.otW;
    parame1.rcq = this.otX;
    parame1.otY = this.otY;
    parame1.jTv = this.otZ;
    parame1.jTu = this.bZR;
    return a(parame, this.dIy, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (ox)this.dIy.dIE.dIL;
      if (paramq == null) {
        return;
      }
      this.oud = paramq.rtb;
      this.mState = paramq.hcd;
      this.oue = paramq.rtc;
      this.ouf = paramq.rtd;
      this.oug = paramq.rte;
    }
    for (;;)
    {
      this.lCQ.a(paramInt2, paramInt3, paramString, this);
      return;
      x.i("MicroMsg.NetSceneCheckVoiceTrans", "end checkVoiceTrans, & errType:%d, errCode:%d, voiceId: %s ", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), this.otU });
    }
  }
  
  public final boolean bGC()
  {
    return (this.oud != null) && (!bi.oW(this.oud.suF));
  }
  
  public final int getType()
  {
    return 546;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/subapp/ui/voicetranstext/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */