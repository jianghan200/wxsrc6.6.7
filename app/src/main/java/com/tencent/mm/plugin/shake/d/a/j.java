package com.tencent.mm.plugin.shake.d.a;

import com.tencent.mm.plugin.shake.b.d;
import com.tencent.mm.plugin.shake.b.l.a;
import com.tencent.mm.plugin.shake.b.l.b;
import com.tencent.mm.sdk.platformtools.x;
import java.util.List;

public final class j
  extends l.b
{
  public static boolean lkO = false;
  public static j mYS;
  private boolean bGv = false;
  public a mYR = new a();
  private long mYT;
  
  private j(l.a parama)
  {
    super(parama);
  }
  
  public static j a(l.a parama)
  {
    if ((mYS == null) || (mYS.mWQ == null)) {
      mYS = new j(parama);
    }
    return mYS;
  }
  
  private void e(List<d> paramList, long paramLong)
  {
    if (this.mWQ != null) {
      this.mWQ.d(paramList, paramLong);
    }
  }
  
  public final void bup()
  {
    this.mYR.we();
    super.bup();
  }
  
  public final void init()
  {
    if (!lkO)
    {
      if (!this.mYR.bvc()) {
        x.e("Micromsg.ShakeMusicMgr", "init MusicFingerPrintRecorder false");
      }
    }
    else {
      return;
    }
    lkO = true;
  }
  
  public final void pause() {}
  
  public final void reset() {}
  
  public final void resume() {}
  
  public final void start()
  {
    if (this.mWQ == null)
    {
      x.w("Micromsg.ShakeMusicMgr", "shakeGetListener == null");
      return;
    }
    this.mYT = System.currentTimeMillis();
    this.mYR.a(367, new j.1(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/shake/d/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */