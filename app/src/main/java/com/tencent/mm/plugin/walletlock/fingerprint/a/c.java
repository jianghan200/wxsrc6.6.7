package com.tencent.mm.plugin.walletlock.fingerprint.a;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.tencent.d.b.a;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.plugin.walletlock.b.h;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  implements com.tencent.mm.ab.e, d
{
  private String eWo = null;
  boolean mcv = false;
  d.a pGA = null;
  private d.a pGB = null;
  private boolean pGC = false;
  
  static void fg(String paramString1, String paramString2)
  {
    paramString1 = new e(paramString1, paramString2);
    com.tencent.mm.kernel.g.DF().a(paramString1, 0);
  }
  
  private void jH(boolean paramBoolean)
  {
    x.i("MicroMsg.FingerprintLockOpenDelegate", "alvinluo prepareAuthKey isNeedChangeAuthKey: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    com.tencent.d.b.a.b local1 = new com.tencent.d.b.a.b() {};
    if (this.pGC) {}
    for (Object localObject = null;; localObject = new g(this.eWo))
    {
      a.a(local1, paramBoolean, 3, (com.tencent.d.b.e.e)localObject, new com.tencent.mm.plugin.soter.b.e());
      return;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.FingerprintLockOpenDelegate", "alvinluo fingerprint wallet lock open delegate errType: %d, errCode: %d, errMsg: %s, cgi type: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Integer.valueOf(paraml.getType()) });
    if (this.mcv) {}
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            if (!(paraml instanceof e)) {
              break;
            }
            if ((paramInt1 == 0) && (paramInt2 == 0))
            {
              paramString = (e)paraml;
              paraml = paramString.jgX;
              com.tencent.mm.plugin.walletlock.b.g.pIt.pIu = paraml;
              jH(paramString.pGF);
              return;
            }
          } while (this.pGA == null);
          this.pGA.af(7, "get challenge failed");
          return;
        } while (!(paraml instanceof f));
        if ((paramInt1 != 0) || (paramInt2 != 0)) {
          break;
        }
        h.jL(true);
      } while (this.pGB == null);
      this.pGB.af(0, "open touch lock ok");
      return;
      h.jL(false);
    } while (this.pGB == null);
    this.pGB.af(6, "open touch lock failed");
  }
  
  public final void a(d.a parama, Bundle paramBundle)
  {
    this.eWo = paramBundle.getString("key_pay_passwd");
    this.pGC = paramBundle.getBoolean("key_fp_lock_offline_mode");
    x.i("MicroMsg.FingerprintLockOpenDelegate", "alvinluo prepare pwd: %s, isOfflineMode: %b", new Object[] { this.eWo, Boolean.valueOf(this.pGC) });
    this.pGA = parama;
    this.mcv = false;
    com.tencent.mm.plugin.walletlock.b.g.pIt.pIu = null;
    com.tencent.mm.plugin.walletlock.b.g.pIt.pIv = null;
    com.tencent.mm.kernel.g.DF().a(1967, this);
    com.tencent.mm.kernel.g.DF().a(1548, this);
    if (this.pGC)
    {
      long l = System.currentTimeMillis();
      com.tencent.mm.plugin.walletlock.b.g.pIt.pIu = String.valueOf(l);
      jH(false);
    }
    do
    {
      return;
      parama = ad.chZ();
      if (parama != null) {
        break;
      }
    } while (this.pGA == null);
    this.pGA.af(2, "system error");
    return;
    paramBundle = parama.getString("cpu_id", null);
    String str = parama.getString("uid", null);
    x.i("MicroMsg.FingerprintLockOpenDelegate", "alvinluo cpuId: %s, uid: %s", new Object[] { paramBundle, str });
    if ((bi.oW(paramBundle)) || (bi.oW(str)))
    {
      com.tencent.mm.plugin.soter.d.b.a(true, true, new c.2(this, parama));
      return;
    }
    fg(paramBundle, str);
  }
  
  public final void a(d.a parama, String paramString1, String paramString2, String paramString3)
  {
    x.i("MicroMsg.FingerprintLockOpenDelegate", "alvinluo do open fingerprint lock");
    this.pGB = parama;
    com.tencent.mm.kernel.g.DF().a(new f(paramString2, paramString3, paramString1), 0);
  }
  
  public final void release()
  {
    x.d("MicroMsg.FingerprintLockOpenDelegate", "alvinluo release open delegate");
    this.pGA = null;
    this.pGB = null;
    this.mcv = true;
    com.tencent.mm.kernel.g.DF().b(1967, this);
    com.tencent.mm.kernel.g.DF().b(1548, this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/walletlock/fingerprint/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */