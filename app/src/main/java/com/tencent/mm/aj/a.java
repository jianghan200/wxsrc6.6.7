package com.tencent.mm.aj;

import android.os.HandlerThread;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.model.ar;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;

public class a
  implements ar
{
  private static HandlerThread dTd = null;
  private static ag dTe = null;
  
  public static boolean c(Runnable paramRunnable, long paramLong)
  {
    boolean bool2 = false;
    if (paramRunnable == null) {
      return false;
    }
    boolean bool1;
    if ((dTe == null) || (dTd == null))
    {
      if (dTe != null)
      {
        bool1 = true;
        if (dTd != null) {
          bool2 = true;
        }
        x.w("MicroMsg.GIF.SubCoreGIF", "check decoder thread available fail, handler[%B] thread[%B] stack[%s]", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), bi.cjd() });
        if (dTe != null) {
          dTe.removeCallbacksAndMessages(null);
        }
        if (dTd != null) {
          dTd.quit();
        }
        HandlerThread localHandlerThread = e.Xs("GIF-Decoder");
        dTd = localHandlerThread;
        localHandlerThread.start();
        dTe = new ag(dTd.getLooper());
      }
    }
    else
    {
      if (paramLong <= 0L) {
        break label151;
      }
      dTe.postDelayed(paramRunnable, paramLong);
    }
    for (;;)
    {
      return true;
      bool1 = false;
      break;
      label151:
      dTe.post(paramRunnable);
    }
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void bn(boolean paramBoolean)
  {
    if (dTe != null) {
      dTe.removeCallbacksAndMessages(null);
    }
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    if (dTe != null) {
      dTe.removeCallbacksAndMessages(null);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/aj/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */