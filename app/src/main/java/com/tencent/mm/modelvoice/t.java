package com.tencent.mm.modelvoice;

import com.tencent.mm.ab.i.a;
import com.tencent.mm.compatible.b.b.a;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.e.b.a;
import com.tencent.mm.e.b.b;
import com.tencent.mm.e.b.c;
import com.tencent.mm.sdk.platformtools.x;

public final class t
  implements a
{
  private static int bFx = 100;
  private b bFv;
  private i.a epV = null;
  String fileName = "";
  private int status = 0;
  
  public t(b.a parama)
  {
    this.bFv = new b(parama);
  }
  
  public final void a(i.a parama)
  {
    this.epV = parama;
  }
  
  public final boolean dc(String paramString)
  {
    g.a locala = new g.a();
    if (this.fileName.length() > 0)
    {
      x.e("VoiceRecorder", "Duplicate Call startRecord , maybe Stop Fail Before");
      return false;
    }
    this.fileName = paramString;
    try
    {
      this.bFv.a(new t.1(this));
      this.bFv.wh();
      this.bFv.wi();
      this.bFv.wg();
      this.bFv.setOutputFile(this.fileName);
      this.bFv.setMaxDuration(70000);
      this.bFv.prepare();
      this.bFv.start();
      x.d("VoiceRecorder", "StartRecord File[" + this.fileName + "] start time:" + locala.Ad());
      this.status = 1;
      return true;
    }
    catch (Exception paramString)
    {
      x.e("VoiceRecorder", "StartRecord File[" + this.fileName + "] ErrMsg[" + paramString.getMessage() + "]");
      this.status = -1;
    }
    return false;
  }
  
  public final int getMaxAmplitude()
  {
    if (this.status == 1)
    {
      int i = this.bFv.getMaxAmplitude();
      if (i > bFx) {
        bFx = i;
      }
      return i * 100 / bFx;
    }
    return 0;
  }
  
  public final int getStatus()
  {
    return this.status;
  }
  
  public final boolean we()
  {
    if (this.bFv == null) {
      return true;
    }
    try
    {
      this.bFv.wk();
      this.bFv.release();
      this.fileName = "";
      this.status = 0;
      return true;
    }
    catch (Exception localException)
    {
      x.e("VoiceRecorder", "StopRecord File[" + this.fileName + "] ErrMsg[" + localException.getMessage() + "]");
      this.status = -1;
    }
    return false;
  }
  
  public final int wf()
  {
    b localb = this.bFv;
    if (((localb.bDq == b.a.daL) || (localb.bDq == b.a.daN)) && (localb.bDp != null)) {
      return localb.bDp.bEg;
    }
    return 1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/modelvoice/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */