package com.tencent.mm.plugin.backup.i;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.ab.d.a;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.bv.a;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;

public final class a
  implements ar
{
  public static a hdd;
  private c hde = new a.1(this);
  private c hdf = new a.2(this);
  private c hdg = new a.3(this);
  private c hdh = new a.4(this);
  private bv.a hdi = new bv.a()
  {
    public final void a(d.a paramAnonymousa)
    {
      x.i("MicroMsg.BackupCore.BackupToPc", "backupcore onreceiveMsg");
      h.mEJ.a(400L, 0L, 1L, false);
      String str = (String)bl.z(ab.a(paramAnonymousa.dIN.rcl), "sysmsg").get(".sysmsg.MMBakChatNotify.url");
      if (bi.oW(str)) {
        x.e("MicroMsg.BackupCore.BackupToPc", "MMBakChatNotify url is null");
      }
      paramAnonymousa = new Intent().setClassName(ad.getContext(), "com.tencent.mm.plugin.backup.backuppcmodel.BackupPcService");
      Intent localIntent = bi.C(ad.getContext(), paramAnonymousa);
      if (localIntent != null) {
        paramAnonymousa = localIntent;
      }
      for (;;)
      {
        ad.getContext().startService(paramAnonymousa.putExtra("url", str).putExtra("isFromWifi", true));
        return;
      }
    }
  };
  
  public a()
  {
    x.i("MicroMsg.BackupCore", "BackupCore init");
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void bn(boolean paramBoolean)
  {
    b localb = b.att();
    x.i("MicroMsg.BackupEventListener", "init addListener");
    localb.hdm = new b.1(localb);
    com.tencent.mm.sdk.b.a.sFg.b(localb.hdm);
    localb.hdn = new b.2(localb);
    com.tencent.mm.sdk.b.a.sFg.b(localb.hdn);
    localb.bannerOnInitListener = new b.3(localb);
    com.tencent.mm.sdk.b.a.sFg.b(localb.bannerOnInitListener);
    au.getSysCmdMsgExtension().a("MMBakChatNotify", this.hdi, true);
    com.tencent.mm.sdk.b.a.sFg.a(this.hde);
    com.tencent.mm.sdk.b.a.sFg.a(this.hdf);
    com.tencent.mm.sdk.b.a.sFg.a(this.hdg);
    com.tencent.mm.sdk.b.a.sFg.a(this.hdh);
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    b localb = b.att();
    com.tencent.mm.sdk.b.a.sFg.c(localb.hdm);
    com.tencent.mm.sdk.b.a.sFg.c(localb.hdn);
    com.tencent.mm.sdk.b.a.sFg.c(localb.bannerOnInitListener);
    au.getSysCmdMsgExtension().b("MMBakChatNotify", this.hdi, true);
    com.tencent.mm.sdk.b.a.sFg.c(this.hde);
    com.tencent.mm.sdk.b.a.sFg.c(this.hdf);
    com.tencent.mm.sdk.b.a.sFg.c(this.hdg);
    com.tencent.mm.sdk.b.a.sFg.c(this.hdh);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/backup/i/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */