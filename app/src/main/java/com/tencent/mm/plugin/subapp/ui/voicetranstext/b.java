package com.tencent.mm.plugin.subapp.ui.voicetranstext;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ajp;
import com.tencent.mm.protocal.c.ajq;
import com.tencent.mm.protocal.c.bea;
import com.tencent.mm.protocal.c.byt;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import junit.framework.Assert;

public final class b
  extends l
  implements k
{
  private final String TAG = "MicroMsg.NetSceneGetVoiceTransRes";
  private com.tencent.mm.ab.b dIy;
  private com.tencent.mm.ab.e lCQ;
  private String otU;
  public byt oud;
  public int ouh = -1;
  
  public b(String paramString)
  {
    if (!bi.oW(paramString)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      this.otU = paramString;
      paramString = new b.a();
      paramString.dIG = new ajp();
      paramString.dIH = new ajq();
      paramString.uri = "/cgi-bin/micromsg-bin/getvoicetransres";
      paramString.dIF = 548;
      paramString.dII = 0;
      paramString.dIJ = 0;
      this.dIy = paramString.KT();
      return;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.lCQ = parame1;
    ((ajp)this.dIy.dID.dIL).rsZ = this.otU;
    return a(parame, this.dIy, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (ajq)this.dIy.dIE.dIL;
      if (paramq.rtd != null) {
        this.ouh = paramq.rtd.sga;
      }
      this.oud = paramq.rtb;
    }
    for (;;)
    {
      this.lCQ.a(paramInt2, paramInt3, paramString, this);
      return;
      x.i("MicroMsg.NetSceneGetVoiceTransRes", "error get: errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    }
  }
  
  public final boolean bGC()
  {
    return (this.oud != null) && (!bi.oW(this.oud.suF));
  }
  
  public final int getType()
  {
    return 548;
  }
  
  public final boolean isComplete()
  {
    return (this.oud != null) && (this.oud.rgC == 1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/subapp/ui/voicetranstext/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */