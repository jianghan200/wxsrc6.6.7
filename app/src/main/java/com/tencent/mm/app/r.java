package com.tencent.mm.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.tencent.mm.ab.h;
import com.tencent.mm.ar.k;
import com.tencent.mm.ar.n;
import com.tencent.mm.g.a.ro;
import com.tencent.mm.model.au;
import com.tencent.mm.modelmulti.b.a;
import com.tencent.mm.plugin.game.a.a.a;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.pluginsdk.ui.d.q;
import com.tencent.mm.protocal.c.aue;
import com.tencent.mm.protocal.c.bja;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.bd.a;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.base.s;
import com.tencent.mm.ui.w.a;

final class r
  implements h, com.tencent.mm.pluginsdk.g, i, com.tencent.mm.pluginsdk.l
{
  public final String B(String paramString1, String paramString2)
  {
    return com.tencent.mm.pluginsdk.model.app.p.B(paramString1, paramString2);
  }
  
  public final Bitmap a(Activity paramActivity, int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 != -1) {}
    do
    {
      do
      {
        do
        {
          return null;
          switch (paramInt1)
          {
          default: 
            return null;
          }
        } while (paramIntent == null);
        localIntent = new Intent();
        localIntent.setClassName(paramActivity, "com.tencent.mm.ui.tools.CropImageNewUI");
        localIntent.putExtra("CropImageMode", 1);
        localIntent.putExtra("CropImage_Filter", true);
        localIntent.putExtra("CropImage_OutputPath", com.tencent.mm.compatible.util.e.dgs + "temp.avatar");
        localIntent.putExtra("CropImage_ImgPath", null);
        com.tencent.mm.ui.tools.a.a(paramActivity, paramIntent, localIntent, com.tencent.mm.compatible.util.e.dgs, 4);
        return null;
        paramIntent = com.tencent.mm.pluginsdk.ui.tools.l.d(paramActivity.getApplicationContext(), paramIntent, com.tencent.mm.compatible.util.e.dgs);
      } while (paramIntent == null);
      Intent localIntent = new Intent();
      localIntent.setClassName(paramActivity, "com.tencent.mm.ui.tools.CropImageNewUI");
      localIntent.putExtra("CropImageMode", 1);
      localIntent.putExtra("CropImage_OutputPath", com.tencent.mm.compatible.util.e.dgs + "temp.avatar");
      localIntent.putExtra("CropImage_ImgPath", paramIntent);
      paramActivity.startActivityForResult(localIntent, 4);
      return null;
    } while (paramIntent == null);
    paramActivity = paramIntent.getStringExtra("CropImage_OutputPath");
    if (paramActivity == null)
    {
      x.e("MicroMsg.WorkerModelCallback", "crop picture failed");
      return null;
    }
    x.e("MicroMsg.WorkerModelCallback", "crop picture path %s ", new Object[] { paramActivity });
    return com.tencent.mm.sdk.platformtools.c.Wb(paramActivity);
  }
  
  public final com.tencent.mm.ab.l a(com.tencent.mm.ab.f paramf)
  {
    if (com.tencent.mm.modelmulti.l.PJ()) {
      return new com.tencent.mm.modelmulti.f(paramf);
    }
    com.tencent.mm.modelmulti.o.PM().id(4);
    return null;
  }
  
  public final void a(Context paramContext, ab paramab, bd.a parama, Bundle paramBundle, String paramString)
  {
    com.tencent.mm.ui.contact.e.a(paramContext, paramab, parama, true, true, paramBundle, paramString);
  }
  
  public final void a(Context paramContext, bd.a parama, Bundle paramBundle)
  {
    com.tencent.mm.ui.contact.e.a(paramContext, parama, true, true, paramBundle);
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, String paramString4, String paramString5)
  {
    com.tencent.mm.plugin.game.a.a locala = a.a.aSm();
    if (locala != null) {
      locala.a(paramContext, paramString1, paramString2, paramString3, paramInt1, paramInt2, paramInt3, paramString4, paramString5);
    }
  }
  
  public final void a(Intent paramIntent, bja parambja, int paramInt)
  {
    com.tencent.mm.pluginsdk.ui.tools.c.a(paramIntent, parambja, paramInt);
  }
  
  public final void a(Intent paramIntent, String paramString)
  {
    com.tencent.mm.ui.contact.e.a(paramIntent, paramString);
  }
  
  public final void a(com.tencent.mm.ac.d paramd, Activity paramActivity, ab paramab)
  {
    com.tencent.mm.ui.tools.b.c(paramd, paramActivity, paramab);
  }
  
  public final void a(com.tencent.mm.ac.d paramd, Activity paramActivity, ab paramab, boolean paramBoolean, Runnable paramRunnable)
  {
    com.tencent.mm.ui.tools.b.a(paramd, paramActivity, paramab, paramBoolean, paramRunnable, 0);
  }
  
  public final void a(aue paramaue, String paramString)
  {
    ((com.tencent.mm.plugin.messenger.foundation.a.d)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.d.class)).a(paramaue, paramString);
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, long paramLong)
  {
    com.tencent.mm.plugin.game.a.a locala = a.a.aSm();
    if (locala != null) {
      locala.a(paramString1, paramString2, 2, 4, paramString3, paramLong);
    }
  }
  
  public final boolean a(Context paramContext, int paramInt1, int paramInt2, String paramString)
  {
    return w.a.a(paramContext, paramInt1, paramInt2, paramString, 4);
  }
  
  public final boolean a(ab paramab)
  {
    return com.tencent.mm.modelmulti.a.a(paramab);
  }
  
  public final com.tencent.mm.ab.l aG(boolean paramBoolean)
  {
    if (paramBoolean) {
      com.tencent.mm.ar.r.Qp().ij(4);
    }
    k localk = new k(4);
    au.DF().a(localk, 0);
    return localk;
  }
  
  public final boolean b(Context paramContext, int paramInt1, int paramInt2, String paramString)
  {
    return w.a.a(paramContext, paramInt1, paramInt2, paramString, 7);
  }
  
  public final void bb(Context paramContext)
  {
    MMAppMgr.go(paramContext);
  }
  
  public final String cS(String paramString)
  {
    if (com.tencent.mm.pluginsdk.model.app.g.bl(paramString, false) != null) {
      return com.tencent.mm.pluginsdk.model.app.g.bl(paramString, false).field_packageName;
    }
    return "";
  }
  
  public final boolean cT(String paramString)
  {
    return com.tencent.mm.pluginsdk.model.app.g.cT(paramString);
  }
  
  public final boolean cU(String paramString)
  {
    return com.tencent.mm.pluginsdk.model.app.g.cU(paramString);
  }
  
  public final void cV(String paramString)
  {
    com.tencent.mm.modelmulti.o.PN().a(new b.a(paramString, 0, 0, 0, 0));
  }
  
  public final void eu(int paramInt)
  {
    x.d("MicroMsg.WorkerModelCallback", "trigger netscene sync, scene[%d]", new Object[] { Integer.valueOf(paramInt) });
    com.tencent.mm.modelmulti.o.PM().id(paramInt);
  }
  
  public final boolean f(Activity paramActivity)
  {
    if (!com.tencent.mm.compatible.util.f.zZ())
    {
      s.gH(paramActivity);
      return false;
    }
    com.tencent.mm.pluginsdk.ui.tools.l.Q(paramActivity);
    return true;
  }
  
  public final void g(Activity paramActivity)
  {
    MMAppMgr.a(paramActivity, null);
  }
  
  public final String h(Context paramContext, String paramString1, String paramString2)
  {
    return com.tencent.mm.pluginsdk.model.app.p.h(paramContext, paramString1, paramString2);
  }
  
  public final String q(Context paramContext, String paramString)
  {
    return com.tencent.mm.pluginsdk.model.app.g.q(paramContext, paramString);
  }
  
  public final boolean r(Context paramContext, String paramString)
  {
    return com.tencent.mm.pluginsdk.model.app.g.r(paramContext, paramString);
  }
  
  public final String s(String paramString, int paramInt)
  {
    if (com.tencent.mm.pluginsdk.model.app.g.cP(paramString, paramInt) != null) {
      return com.tencent.mm.pluginsdk.model.app.g.cP(paramString, paramInt).field_packageName;
    }
    return "";
  }
  
  public final void vl()
  {
    com.tencent.mm.modelmulti.o.PM().id(7);
  }
  
  public final com.tencent.mm.ab.g vm()
  {
    return new com.tencent.mm.e.a.a(ad.getContext());
  }
  
  public final void vn()
  {
    ro localro = new ro();
    localro.ccs.ccu = true;
    com.tencent.mm.sdk.b.a.sFg.m(localro);
  }
  
  public final void vo() {}
  
  public final Intent vp()
  {
    Intent localIntent = new Intent(ad.getContext(), LauncherUI.class);
    localIntent.putExtra("nofification_type", "talkroom_notification");
    localIntent.addFlags(67108864);
    return localIntent;
  }
  
  public final boolean vq()
  {
    return q.vq();
  }
  
  public final void vr() {}
  
  public final boolean vs()
  {
    return com.tencent.mm.modelmulti.l.PJ();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/app/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */