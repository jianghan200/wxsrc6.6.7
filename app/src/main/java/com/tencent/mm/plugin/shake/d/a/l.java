package com.tencent.mm.plugin.shake.d.a;

import android.app.Activity;
import android.content.Context;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.shake.b.d;
import com.tencent.mm.plugin.shake.b.l.a;
import com.tencent.mm.plugin.shake.b.l.b;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.List;

public final class l
  extends l.b
{
  private static boolean bgH = false;
  private static boolean lkO = false;
  private boolean bGv = false;
  private Context context;
  private a mYR = new a();
  private long mYT;
  
  public l(Context paramContext, l.a parama)
  {
    super(parama);
    this.context = paramContext;
    bgH = false;
  }
  
  private void e(List<d> paramList, long paramLong)
  {
    if (this.mWQ != null) {
      this.mWQ.d(paramList, paramLong);
    }
  }
  
  public final void bup()
  {
    super.bup();
    this.mYR.we();
    if (bgH)
    {
      long l = System.currentTimeMillis() - this.mYT;
      x.d("Micromsg.ShakeTVService", "a%s, isRunning=%s", new Object[] { Long.valueOf(l), Boolean.valueOf(bgH) });
      h.mEJ.h(10987, new Object[] { Integer.valueOf(1), "", Integer.valueOf(2), Integer.valueOf((int)l) });
      h.mEJ.e(835L, 1L, 1L);
      bgH = false;
    }
  }
  
  public final void init()
  {
    if (!lkO)
    {
      if (!this.mYR.bvc()) {
        x.e("Micromsg.ShakeTVService", "init MusicFingerPrintRecorder false");
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
    x.v("Micromsg.ShakeTVService", "hy: start shake tv!");
    if (this.mWQ == null)
    {
      x.w("Micromsg.ShakeTVService", "shakeGetListener == null");
      return;
    }
    if (!(this.context instanceof Activity))
    {
      x.e("Micromsg.ShakeTVService", "context not an Activity");
      this.mWQ.d(new ArrayList(), 0L);
      return;
    }
    bgH = true;
    this.mYT = System.currentTimeMillis();
    this.mYR.a(408, new l.1(this));
    h.mEJ.e(835L, 5L, 1L);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/shake/d/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */