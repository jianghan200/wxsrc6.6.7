package com.tencent.mm.modelvoice;

import com.tencent.mm.ab.i.a;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.e.b.a;
import com.tencent.mm.e.b.c;
import com.tencent.mm.e.b.c.a;
import com.tencent.mm.e.c.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class k
  implements a
{
  private static int epz = 100;
  private int bDa = 0;
  public c bDp;
  c.a bEb = new k.1(this);
  private d epA;
  private String mFileName = null;
  public int mStatus = 0;
  
  private void clean()
  {
    if (this.bDp != null)
    {
      this.bDp.we();
      this.bDp = null;
    }
    if (this.epA != null)
    {
      this.epA.wA();
      this.epA = null;
    }
  }
  
  public final void a(i.a parama) {}
  
  public final boolean dc(String paramString)
  {
    if (!bi.oW(this.mFileName))
    {
      x.e("MicroMsg.SpeexRecorder", "Duplicate Call startRecord , maybe Stop Fail Before");
      return false;
    }
    this.mStatus = 1;
    this.bDa = 0;
    this.bDp = new c(16000, 1, 0);
    this.bDp.bDQ = -19;
    if (q.deW.ddI > 0) {
      this.bDp.t(q.deW.ddI, true);
    }
    for (;;)
    {
      this.bDp.aM(false);
      this.bDp.bEb = this.bEb;
      this.epA = new d();
      if (this.epA.df(paramString)) {
        break;
      }
      x.e("MicroMsg.SpeexRecorder", "init speex writer failed");
      clean();
      this.mStatus = -1;
      return false;
      this.bDp.t(5, false);
    }
    if (!this.bDp.wn())
    {
      x.e("MicroMsg.SpeexRecorder", "start record failed");
      clean();
      this.mStatus = -1;
      return false;
    }
    this.mFileName = paramString;
    return true;
  }
  
  public final int getMaxAmplitude()
  {
    int i = this.bDa;
    this.bDa = 0;
    if (i > epz) {
      epz = i;
    }
    return i * 100 / epz;
  }
  
  public final int getStatus()
  {
    return this.mStatus;
  }
  
  public final boolean we()
  {
    this.mFileName = null;
    this.mStatus = 0;
    clean();
    return true;
  }
  
  public final int wf()
  {
    return this.bDp.bEg;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/modelvoice/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */