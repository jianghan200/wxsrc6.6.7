package com.tencent.mm.plugin.mmsight.model.a;

import android.os.Looper;
import android.util.SparseArray;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;

public final class s
{
  public d.c ljK = d.c.lhF;
  SparseArray<WeakReference<d.b>> ljL = new SparseArray();
  private ag ljM = new s.1(this, Looper.getMainLooper());
  
  public final void a(d.c paramc)
  {
    x.i("MicroMsg.SightMediaStatusHandler", "status change to %s", new Object[] { paramc.toString() });
    this.ljK = paramc;
    this.ljM.sendMessage(this.ljM.obtainMessage(257, paramc));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/mmsight/model/a/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */