package com.tencent.mm.plugin.nfc_open.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.protocal.c.awf;
import com.tencent.mm.protocal.c.kw;
import com.tencent.mm.protocal.c.pl;
import com.tencent.mm.protocal.c.qi;
import com.tencent.mm.protocal.c.qj;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;

public final class a
  implements e
{
  public awf lFu;
  
  public a()
  {
    init();
  }
  
  private void a(awf paramawf)
  {
    if (!au.HX()) {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CpuCardConfigManager", "setConfig account not ready");
    }
    while (paramawf == null) {
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CpuCardConfigManager", "setConfig config");
    this.lFu = paramawf;
    try
    {
      paramawf = new String(this.lFu.toByteArray(), "ISO-8859-1");
      au.HU();
      c.DT().a(aa.a.sQB, paramawf);
      return;
    }
    catch (UnsupportedEncodingException paramawf)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.CpuCardConfigManager", "save config exp, " + paramawf.getLocalizedMessage());
      return;
    }
    catch (IOException paramawf)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.CpuCardConfigManager", "save config exp, " + paramawf.getLocalizedMessage());
    }
  }
  
  private awf bju()
  {
    if (this.lFu == null) {
      init();
    }
    return this.lFu;
  }
  
  private void init()
  {
    this.lFu = new awf();
    au.HU();
    String str = String.valueOf(c.DT().get(aa.a.sQB, null));
    if (bi.oW(str))
    {
      this.lFu.ruL = new LinkedList();
      this.lFu.lastUpdateTime = 0L;
      this.lFu.ruM = 86400;
      this.lFu.version = 0;
      return;
    }
    try
    {
      this.lFu.aG(str.getBytes("ISO-8859-1"));
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.CpuCardConfigManager", "parseConfig exp, " + localException.getLocalizedMessage());
      this.lFu.ruL = new LinkedList();
      this.lFu.lastUpdateTime = 0L;
      this.lFu.ruM = 86400;
      this.lFu.version = 0;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    au.DF().b(1561, this);
    if ((paraml instanceof com.tencent.mm.plugin.nfc_open.a.b))
    {
      paramString = bju();
      paramString.lastUpdateTime = bi.VE();
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label744;
      }
      paraml = (qi)((com.tencent.mm.plugin.nfc_open.a.b)paraml).diG.dIE.dIL;
      if (paraml == null) {
        break label744;
      }
      paramString.ruM = paraml.ruM;
      paramString.ruN = paraml.ruN;
      au.HU();
      if (((Integer)c.DT().get(aa.a.sQG, Integer.valueOf(0))).intValue() == 0)
      {
        if (paraml.ruN != 1) {
          break label220;
        }
        ad.getContext().getPackageManager().setComponentEnabledSetting(new ComponentName(ad.getPackageName(), "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 1, 1);
      }
    }
    for (;;)
    {
      au.HU();
      c.DT().a(aa.a.sQH, Integer.valueOf(paraml.ruN));
      au.HU();
      c.DT().a(aa.a.sQK, paraml.pjK);
      if (paramString.version != paraml.version) {
        break;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CpuCardConfigManager", "nfc-onSceneEnd no config change return version = " + paraml.version);
      a(paramString);
      return;
      label220:
      ad.getContext().getPackageManager().setComponentEnabledSetting(new ComponentName(ad.getPackageName(), "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 2, 1);
    }
    paramString.version = paraml.version;
    if ((paraml.ruL != null) && (!paraml.ruL.isEmpty())) {
      if (paramString.ruL == null)
      {
        paramString.ruL = new LinkedList();
        paramInt1 = 0;
      }
    }
    for (;;)
    {
      if (paramInt1 < paraml.ruL.size())
      {
        kw localkw = new kw();
        localkw.qYo = ((kw)paraml.ruL.get(paramInt1)).qYo;
        localkw.rmT = ((kw)paraml.ruL.get(paramInt1)).rmT;
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.CpuCardConfigManager", "nfc-onSceneEnd sflag=" + bi.f(Integer.valueOf(localkw.rmT)) + ", url=" + bi.oV(localkw.qYo));
        if (localkw.rmS == null)
        {
          localkw.rmS = new LinkedList();
          label424:
          paramInt2 = 0;
        }
        for (;;)
        {
          if (paramInt2 >= ((kw)paraml.ruL.get(paramInt1)).rmS.size()) {
            break label720;
          }
          qj localqj = new qj();
          if (localqj.ruO == null) {
            localqj.ruO = new LinkedList();
          }
          for (;;)
          {
            int i = 0;
            while (i < ((qj)((kw)paraml.ruL.get(paramInt1)).rmS.get(paramInt2)).ruO.size())
            {
              pl localpl = new pl();
              localpl.rtL = ((pl)((qj)((kw)paraml.ruL.get(paramInt1)).rmS.get(paramInt2)).ruO.get(i)).rtL;
              localpl.kQE = ((pl)((qj)((kw)paraml.ruL.get(paramInt1)).rmS.get(paramInt2)).ruO.get(i)).kQE;
              com.tencent.mm.sdk.platformtools.x.d("MicroMsg.CpuCardConfigManager", "nfc-onSceneEnd cmd=" + bi.oV(localpl.rtL) + ", answer=" + bi.oV(localpl.kQE));
              localqj.ruO.add(localpl);
              i += 1;
            }
            paramString.ruL.clear();
            break;
            localkw.rmS.clear();
            break label424;
            localqj.ruO.clear();
          }
          localkw.rmS.add(localqj);
          paramInt2 += 1;
        }
        label720:
        paramString.ruL.add(localkw);
        paramInt1 += 1;
        continue;
        paramString.ruL.clear();
      }
    }
    label744:
    a(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/nfc_open/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */