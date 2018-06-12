package com.tencent.mm.plugin.mmsight.model;

import android.content.Context;
import android.view.OrientationEventListener;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  extends OrientationEventListener
{
  public int lfl = -1;
  public int lfm = -1;
  private long lfn = 0L;
  private long lfo = 0L;
  public a lfp;
  public int orientation = -1;
  
  public c(Context paramContext)
  {
    super(paramContext, 2);
  }
  
  public final boolean bdK()
  {
    if (!j.lgw) {}
    long l;
    do
    {
      return false;
      l = bi.bI(this.lfo);
      x.i("MicroMsg.DeviceOrientationListener", "isLandscape, tickToNow: %s, orientation: %s", new Object[] { Long.valueOf(l), Integer.valueOf(this.orientation) });
    } while ((l < 2000L) || (this.orientation < 0) || ((this.orientation != 90) && (this.orientation != 270)));
    return true;
  }
  
  public final void enable()
  {
    x.i("MicroMsg.DeviceOrientationListener", "enable, config isEnableLandscapeMode: %s", new Object[] { Boolean.valueOf(j.lgw) });
    if (j.lgw)
    {
      super.enable();
      this.lfo = bi.VG();
    }
  }
  
  public final int getOrientation()
  {
    if (!j.lgw) {
      return 0;
    }
    return this.orientation;
  }
  
  public final void onOrientationChanged(int paramInt)
  {
    if (!j.lgw) {}
    for (;;)
    {
      return;
      if (bi.bI(this.lfo) < 2000L)
      {
        x.v("MicroMsg.DeviceOrientationListener", "onOrientationChanged, not reach DETECT_THRESHOLD");
        return;
      }
      if ((Math.abs(this.lfl - paramInt) >= 30) || (bi.bI(this.lfn) >= 300L))
      {
        this.lfl = paramInt;
        this.lfn = bi.VG();
        if ((paramInt <= 60) || (paramInt >= 300)) {
          if ((paramInt <= 30) || (paramInt >= 330)) {
            this.orientation = 0;
          }
        }
        while (this.lfp != null)
        {
          this.lfp.sO(this.orientation);
          return;
          if ((paramInt >= 30) && (paramInt <= 150))
          {
            if ((paramInt >= 60) && (paramInt <= 120)) {
              this.orientation = 90;
            }
          }
          else if ((paramInt >= 120) && (paramInt <= 240))
          {
            if ((paramInt >= 150) && (paramInt <= 210)) {
              this.orientation = 180;
            }
          }
          else if ((paramInt >= 210) && (paramInt <= 330) && (paramInt >= 240) && (paramInt <= 300)) {
            this.orientation = 270;
          }
        }
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void sO(int paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/mmsight/model/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */