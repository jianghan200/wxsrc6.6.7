package com.tencent.mm.plugin.fav.a;

import android.os.Bundle;
import com.tencent.mm.g.a.kq;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.SensorController;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class ao
  implements n.a
{
  private static n iXl = null;
  private static ao iXm = null;
  public int bOS;
  public int duration;
  public String path;
  
  public static ao aLW()
  {
    if (iXm == null) {
      iXm = new ao();
    }
    return iXm;
  }
  
  public static n aLY()
  {
    return iXl;
  }
  
  public final void aLX()
  {
    if (iXl == null) {
      iXl = new n();
    }
    iXl.a(this);
    iXl.iWG = true;
    n localn = iXl;
    if (n.hlW == null) {
      n.hlW = new SensorController(ad.getContext());
    }
    if (localn.hma == null) {
      localn.hma = new az(ad.getContext());
    }
  }
  
  public final void aW(String paramString, int paramInt)
  {
    x.d("MicroMsg.WNNoteVoicePlayLogic", "on play, my path %s, my duration %d, play path %s", new Object[] { this.path, Integer.valueOf(this.duration), paramString });
    Bundle localBundle = new Bundle();
    localBundle.putInt("actionCode", 1);
    if (!bi.aG(paramString, "").equals(this.path)) {
      localBundle.putBoolean("result", true);
    }
    for (;;)
    {
      localBundle.putInt("position", paramInt);
      paramString = new kq();
      paramString.bVa.bUU = localBundle;
      paramString.bVa.type = 4;
      a.sFg.m(paramString);
      return;
      localBundle.putBoolean("result", false);
    }
  }
  
  public final void onFinish()
  {
    iXl.stopPlay();
    Bundle localBundle = new Bundle();
    localBundle.putInt("actionCode", 2);
    kq localkq = new kq();
    localkq.bVa.bUU = localBundle;
    localkq.bVa.type = 4;
    a.sFg.m(localkq);
  }
  
  public final void onPause()
  {
    iXl.aLs();
    Bundle localBundle = new Bundle();
    localBundle.putInt("actionCode", 3);
    kq localkq = new kq();
    localkq.bVa.bUU = localBundle;
    localkq.bVa.type = 4;
    a.sFg.m(localkq);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/fav/a/ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */