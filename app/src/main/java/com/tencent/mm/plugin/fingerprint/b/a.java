package com.tencent.mm.plugin.fingerprint.b;

import android.content.Context;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.s;
import com.tencent.mm.g.a.bq;
import com.tencent.mm.g.a.lg;
import com.tencent.mm.g.a.lg.a;
import com.tencent.mm.g.a.lg.b;
import com.tencent.mm.pluginsdk.k;
import com.tencent.mm.sdk.platformtools.x;

public abstract class a
  implements k
{
  public final void a(lg paramlg, int paramInt, String paramString)
  {
    x.i("MicroMsg.BaseFingerprintImp", "hy: onOpenFingerprintAuthFailed");
    if ((paramlg != null) && (paramlg.bVz.bVD != null))
    {
      paramlg.bVA = new lg.b();
      paramlg.bVA.errCode = paramInt;
      paramlg.bVA.bQb = "";
      paramlg.bVA.bQc = "";
      paramlg.bVA.Yy = paramString;
      paramlg.bVA.bVF = type();
      paramlg.bVz.bVD.run();
    }
  }
  
  public final boolean aNa()
  {
    return e.aNy();
  }
  
  public final boolean aNb()
  {
    com.tencent.mm.plugin.fingerprint.a.aMW();
    com.tencent.mm.plugin.fingerprint.a.aMX();
    return c.aNf();
  }
  
  public boolean aNc()
  {
    return false;
  }
  
  public final void dh(Context paramContext)
  {
    x.i("MicroMsg.BaseFingerprintImp", "showFingerPrintEntrance");
    if ((e.aNy()) && (!aNb()))
    {
      x.e("MicroMsg.BaseFingerprintImp", "the fingerprint is open ready, but system has none Finger print ids!");
      x.i("MicroMsg.BaseFingerprintImp", "closeFP");
      bq localbq = new bq();
      localbq.bJX = new a.1(this, localbq);
      com.tencent.mm.sdk.b.a.sFg.a(localbq, paramContext.getMainLooper());
    }
    do
    {
      return;
      if (q.deQ.deZ != 1)
      {
        x.e("MicroMsg.BaseFingerprintImp", "hy: device info not support");
        return;
      }
    } while ((!e.aNy()) && ((e.aNB()) || (e.aNC())));
    x.e("MicroMsg.BaseFingerprintImp", "mgr == null or not support FP or has show guide or show HWManager!");
  }
  
  public final void eZ(boolean paramBoolean)
  {
    x.i("MicroMsg.BaseFingerprintImp", "hy: set isOpenFp: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    e.fa(paramBoolean);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/fingerprint/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */