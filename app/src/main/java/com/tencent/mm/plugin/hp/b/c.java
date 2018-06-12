package com.tencent.mm.plugin.hp.b;

import android.util.Base64;
import com.tencent.mm.g.a.ig;
import com.tencent.mm.g.a.ig.a;
import com.tencent.mm.plugin.hp.d.a;
import com.tencent.mm.plugin.hp.tinker.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  extends com.tencent.mm.sdk.b.c<ig>
  implements com.tencent.mm.sdk.f.c
{
  private static final String dYs = com.tencent.mm.compatible.util.e.duN + "_temp.hp";
  private a kmy = null;
  
  public c()
  {
    com.tencent.mm.sdk.f.e.a(this);
    this.sFo = ig.class.getName().hashCode();
  }
  
  public static void EG(String paramString)
  {
    x.w("Tinker.HotPatchApplyService", "hp_apply from file %s", new Object[] { paramString });
    d.EH(paramString);
  }
  
  private boolean a(ig paramig)
  {
    if (this.kmy != null) {
      x.e("Tinker.HotPatchApplyService", "hp_apply processing busy, ignore new event");
    }
    for (;;)
    {
      return false;
      if (1 == paramig.bRH.bIH)
      {
        d.aWt();
        return false;
      }
      if (paramig.bRH.bRM != null)
      {
        EG(paramig.bRH.bRM);
        return false;
      }
      b.rl(1);
      if (paramig.bRH.bRK != null) {}
      try
      {
        byte[] arrayOfByte = Base64.decode(paramig.bRH.bRK, 0);
        paramig.bRH.bRK = new String(arrayOfByte);
        if ((!bi.oW(paramig.bRH.bRK)) && (!bi.oW(paramig.bRH.bRL)))
        {
          x.i("Tinker.HotPatchApplyService", "hp_apply request url=%s, signature=%s", new Object[] { paramig.bRH.bRK, paramig.bRH.bRL });
          this.kmy = new a(paramig.bRH.bRK, dYs, paramig.bRH.bRL);
        }
        do
        {
          com.tencent.mm.sdk.f.e.post(this.kmy, "hp_apply_download");
          return false;
          if (bi.oW(paramig.bRH.bRI)) {
            break;
          }
        } while (!bi.oW(paramig.bRH.bRJ));
        return false;
      }
      catch (Error localError)
      {
        for (;;) {}
      }
    }
  }
  
  public final void B(Runnable paramRunnable)
  {
    if (paramRunnable == this.kmy)
    {
      x.d("Tinker.HotPatchApplyService", "hp_apply download url=%s, file=%s, failed=%b", new Object[] { this.kmy.url, this.kmy.ewp, Boolean.valueOf(this.kmy.dHC) });
      if (this.kmy.dHC) {
        break label82;
      }
      b.rm(1);
      EG(this.kmy.ewp);
    }
    for (;;)
    {
      this.kmy = null;
      return;
      label82:
      b.rn(1);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/hp/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */