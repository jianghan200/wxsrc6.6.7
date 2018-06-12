package com.tencent.mm.plugin.nfc_open;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.nfc.NfcAdapter;
import android.os.Process;
import com.tencent.mm.ab.o;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bs;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.nfc_open.a.b;
import com.tencent.mm.protocal.c.awf;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.util.HashMap;

public final class a
  implements ar
{
  private com.tencent.mm.plugin.nfc_open.b.a lFs;
  
  private static a bjt()
  {
    au.HN();
    a locala2 = (a)bs.iK("plugin.nfc_open");
    a locala1 = locala2;
    if (locala2 == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.SubCoreCpuCard", "[NFC]not found in MMCore, new one");
      locala1 = new a();
      au.HN().a("plugin.nfc_open", locala1);
    }
    return locala1;
  }
  
  private static void gT(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      ad.getContext().getPackageManager().setComponentEnabledSetting(new ComponentName(ad.getPackageName(), "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 1, 1);
      return;
    }
    ad.getContext().getPackageManager().setComponentEnabledSetting(new ComponentName(ad.getPackageName(), "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 2, 1);
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void bn(boolean paramBoolean)
  {
    int i = 1800;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreCpuCard", "alvinluo process: %s", new Object[] { bi.an(ad.getContext(), Process.myPid()) });
    g.Eg().Ds();
    if (bjt().lFs == null) {
      bjt().lFs = new com.tencent.mm.plugin.nfc_open.b.a();
    }
    com.tencent.mm.plugin.nfc_open.b.a locala = bjt().lFs;
    if (NfcAdapter.getDefaultAdapter(ad.getContext()) == null) {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CpuCardConfigManager", "Nfc not support no need update");
    }
    label81:
    label185:
    while (locala.lFu == null)
    {
      i = 0;
      if (i != 0)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CpuCardConfigManager", "do update cpu card config");
        au.DF().a(1561, locala);
        au.DF().a(new b(locala.lFu.version), 0);
      }
      au.HU();
      i = ((Integer)c.DT().get(aa.a.sQG, Integer.valueOf(0))).intValue();
      if (i != 0) {
        break label341;
      }
      au.HU();
      if (((Integer)c.DT().get(aa.a.sQH, Integer.valueOf(0))).intValue() != 1) {
        break;
      }
      gT(true);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreCpuCard", "doNFCReport start");
      e.post(new a.1(this), getClass().getName());
      return;
    }
    int j = locala.lFu.ruM;
    if (j < 1800) {}
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CpuCardConfigManager", "now=" + bi.VE() + ", lastUpdateTime=" + locala.lFu.lastUpdateTime + ", updateFreq=" + i + ", configUpdateFreq=" + locala.lFu.ruM);
      if (bi.VE() - locala.lFu.lastUpdateTime <= i) {
        break;
      }
      i = 1;
      break label81;
      if (j > 604800)
      {
        i = 604800;
        continue;
        gT(false);
        break label185;
        label341:
        if (i == 1)
        {
          gT(true);
          break label185;
        }
        gT(false);
        break label185;
      }
      i = j;
    }
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/nfc_open/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */