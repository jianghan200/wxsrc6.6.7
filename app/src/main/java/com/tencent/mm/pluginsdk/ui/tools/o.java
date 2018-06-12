package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import com.tencent.mm.compatible.e.k;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.y;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class o
{
  public static f fb(Context paramContext)
  {
    if (bi.aG(q.deW.den, "").equals("surface"))
    {
      x.i("MicroMsg.VideoViewFactory", "match full type surface");
      return new VideoSurfaceView(paramContext);
    }
    String str = y.get("ro.mediatek.platform");
    if ((str != null) && ((str.startsWith("MT")) || (str.startsWith("mt")))) {}
    for (int i = 1; i != 0; i = 0)
    {
      x.i("MicroMsg.VideoViewFactory", "IS MTK platform");
      return new VideoSightView(paramContext);
    }
    x.i("MicroMsg.VideoViewFactory", "default settings, use sightview");
    return new VideoSightView(paramContext);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/tools/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */