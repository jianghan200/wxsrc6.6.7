package com.tencent.mm.sandbox.updater;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.l;
import com.tencent.mm.c.i.a;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.g.a.bf;
import com.tencent.mm.model.al;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bg.a;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.plugin.messenger.foundation.a.a.g;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.protocal.c.aiv;
import com.tencent.mm.protocal.c.avn;
import com.tencent.mm.protocal.n;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.p;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public class Updater
  extends LinearLayout
  implements com.tencent.mm.ab.e, com.tencent.mm.plugin.y.a
{
  private boolean bIq;
  private int sDi;
  private p sEn = null;
  private boolean sEo = false;
  private boolean sEp = false;
  private boolean sEq = false;
  private com.tencent.mm.ab.e sEr;
  private com.tencent.mm.ab.e sEs;
  
  private Updater(Context paramContext)
  {
    super(paramContext);
  }
  
  public Updater(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public static void CU(int paramInt)
  {
    if (!au.HX()) {
      return;
    }
    x.d("MicroMsg.Updater", "reportUpdateStat : opCode = " + paramInt);
    au.HU();
    com.tencent.mm.model.c.FQ().b(new com.tencent.mm.aq.o(paramInt));
  }
  
  public static Updater c(Context paramContext, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    if (paramContext == null) {
      return null;
    }
    if (((paramContext instanceof Activity)) && ((((Activity)paramContext).isFinishing()) || (((Activity)paramContext).getWindow() == null)))
    {
      x.e("MicroMsg.Updater", "showWithProgress, context isFinishing");
      return null;
    }
    ad.getContext().getSharedPreferences("system_config_prefs", 0).edit().putLong("recomended_update_ignore", bi.VE()).commit();
    au.getNotification().cancel(34);
    x.i("MicroMsg.Updater", "showWithProgress");
    Updater localUpdater = (Updater)View.inflate(paramContext, R.i.updater, null);
    localUpdater.onStart();
    paramContext = p.a(paramContext, paramContext.getString(R.l.update_getting_updateinfo), true, 0, null);
    paramContext.setCancelable(true);
    paramContext.setOnCancelListener(new Updater.1(localUpdater, paramOnCancelListener));
    try
    {
      localUpdater.sEn = paramContext;
      localUpdater.sEn.show();
      localUpdater.bIq = true;
      com.tencent.mm.plugin.report.service.h.mEJ.a(405L, 46L, 1L, true);
      return localUpdater;
    }
    catch (Exception paramContext)
    {
      x.e("MicroMsg.Updater", "exception in showWithProgress, ", new Object[] { paramContext.getMessage() });
      x.printErrStackTrace("MicroMsg.Updater", paramContext, "", new Object[0]);
    }
    return null;
  }
  
  public static void c(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    Intent localIntent = new Intent(ad.getContext(), UpdaterService.class);
    localIntent.putExtra("intent_client_version", com.tencent.mm.protocal.d.qVN);
    localIntent.putExtra("intent_update_type", 4);
    localIntent.putExtra("intent_extra_desc", paramString2);
    localIntent.putExtra("intent_extra_md5", paramString1);
    localIntent.putExtra("intent_extra_size", paramInt);
    localIntent.putExtra("intent_extra_download_url", new String[] { paramString3 });
    localIntent.putExtra("intent_extra_updateMode", com.tencent.mm.sdk.platformtools.e.bxm);
    localIntent.putExtra("intent_extra_marketUrl", com.tencent.mm.sdk.platformtools.e.sFB);
    localIntent.putExtra("intent_extra_run_in_foreground", true);
    localIntent.putExtra("intent_extra_download_mode", 2);
    com.tencent.mm.plugin.report.service.h.mEJ.a(405L, 45L, 1L, true);
    ad.getContext().startService(localIntent);
  }
  
  private void cancel()
  {
    au.DF().b(11, this);
  }
  
  public static Updater d(Context paramContext, final DialogInterface.OnCancelListener paramOnCancelListener)
  {
    ad.getContext().getSharedPreferences("system_config_prefs", 0).edit().putLong("recomended_update_ignore", bi.VE()).commit();
    au.getNotification().cancel(34);
    x.i("MicroMsg.Updater", "show update dialog");
    Updater localUpdater = (Updater)View.inflate(paramContext, R.i.updater, null);
    localUpdater.onStart();
    paramContext = p.a(paramContext, "", true, 0, null);
    paramContext.setCancelable(true);
    paramContext.setOnCancelListener(new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        au.getNotification().cancel(99);
        com.tencent.mm.plugin.report.service.h.mEJ.a(405L, 49L, 1L, true);
        Updater.CU(2);
        this.sEt.onStop();
        if ((!Updater.a(this.sEt)) && (paramOnCancelListener != null)) {
          paramOnCancelListener.onCancel(paramAnonymousDialogInterface);
        }
      }
    });
    com.tencent.mm.plugin.report.service.h.mEJ.a(405L, 48L, 1L, true);
    localUpdater.sEn = paramContext;
    localUpdater.bIq = false;
    return localUpdater;
  }
  
  public static void dT(Context paramContext)
  {
    paramContext.startActivity(new Intent(paramContext, AppInstallerUI.class));
  }
  
  public static Updater fo(Context paramContext)
  {
    ad.getContext().getSharedPreferences("system_config_prefs", 0).edit().putLong("recomended_update_ignore", bi.VE()).commit();
    au.getNotification().cancel(34);
    com.tencent.mm.plugin.report.service.h.mEJ.a(405L, 50L, 1L, true);
    x.i("MicroMsg.Updater", "updater silence");
    paramContext = new Updater(paramContext);
    paramContext.onStart();
    paramContext.sEp = true;
    return paramContext;
  }
  
  private String[] getShortIps()
  {
    int i = 0;
    if ((af.ewV != null) && (af.ewV.length() > 0)) {
      return new String[] { af.ewV };
    }
    Object localObject = ad.getContext().getSharedPreferences("system_config_prefs", 0).getString("builtin_short_ips", "");
    if ((localObject != null) && (((String)localObject).length() > 0)) {}
    String[] arrayOfString;
    for (;;)
    {
      localObject = n.Uz((String)localObject);
      arrayOfString = new String[((List)localObject).size()];
      while (i < ((List)localObject).size())
      {
        arrayOfString[i] = ((n)((List)localObject).get(i)).kCs;
        i += 1;
      }
      localObject = "0,112.64.200.240,80|0,180.153.82.27,80|0,117.135.130.177,80";
    }
    return arrayOfString;
  }
  
  private void onStart()
  {
    au.DF().a(11, this);
    com.tencent.mm.plugin.report.service.h.mEJ.a(405L, 42L, 1L, true);
  }
  
  public final void a(int paramInt1, int paramInt2, final String paramString, l paraml)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      com.tencent.mm.plugin.report.service.h.mEJ.a(405L, 51L, 1L, true);
      x.i("MicroMsg.Updater", "isShow " + this.bIq);
      if ((!this.bIq) && (this.sEn != null)) {
        this.sEn.show();
      }
      this.sEo = true;
      if (this.sEn != null) {
        this.sEn.cancel();
      }
      paramString = (com.tencent.mm.sandbox.a.a)paraml;
      au.DF().a(new bg(new bg.a()
      {
        public final void a(com.tencent.mm.network.e paramAnonymouse)
        {
          if (paramAnonymouse == null)
          {
            com.tencent.mm.plugin.report.service.h.mEJ.a(405L, 52L, 1L, true);
            Assert.assertTrue("updater invalid assert", false);
          }
          au.getNotification().cancel(34);
          x.i("MicroMsg.Updater", "go to update");
          if (!com.tencent.mm.compatible.util.h.getExternalStorageState().equals("mounted"))
          {
            x.e("MicroMsg.Updater", "no sdcard.");
            com.tencent.mm.plugin.report.service.h.mEJ.a(405L, 53L, 1L, true);
            Updater.b(Updater.this);
          }
          int i = paramString.cgH();
          com.tencent.mm.c.i locali = com.tencent.mm.c.i.cG(paramString.cgJ());
          String str = com.tencent.mm.pluginsdk.f.i.eU(Updater.this.getContext());
          Object localObject = null;
          if (locali != null) {
            localObject = locali.cF(str);
          }
          if (localObject == null) {}
          for (long l = i;; l = ((i.a)localObject).size + i)
          {
            if (!f.aM(l))
            {
              x.e("MicroMsg.Updater", "no enough space.");
              com.tencent.mm.plugin.report.service.h.mEJ.a(405L, 54L, 1L, true);
              Updater.b(Updater.this);
            }
            if ((com.tencent.mm.sdk.platformtools.e.bxm & 0x1) != 0)
            {
              x.i("MicroMsg.Updater", "channel pack, not silence download.");
              com.tencent.mm.plugin.report.service.h.mEJ.a(405L, 55L, 1L, true);
              Updater.b(Updater.this);
            }
            if ((Updater.c(Updater.this) != 2) || (Updater.d(Updater.this))) {
              break;
            }
            localObject = i.cce();
            if ((com.tencent.mm.sandbox.monitor.c.Hw(paramString.cgI()) == null) || (bi.oW((String)localObject)) || (!((String)localObject).equals(paramString.cgI()))) {
              break;
            }
            x.i("MicroMsg.Updater", "we already have this pack %s being to install, just ignore this update request", new Object[] { localObject });
            com.tencent.mm.plugin.report.service.h.mEJ.a(405L, 56L, 1L, true);
            return;
          }
          localObject = paramString.bfy();
          if ((localObject != null) && (((aiv)localObject).rLD != 0) && (!bi.oW(((aiv)localObject).rLE)))
          {
            paramAnonymouse = ((aiv)localObject).rLE;
            localObject = new Intent();
            ((Intent)localObject).putExtra("rawUrl", paramAnonymouse);
            ((Intent)localObject).putExtra("showShare", false);
            ((Intent)localObject).putExtra("show_bottom", false);
            com.tencent.mm.bg.d.b(Updater.this.getContext(), "webview", ".ui.tools.WebViewUI", (Intent)localObject);
            i.chb();
            com.tencent.mm.plugin.report.service.h.mEJ.a(405L, 57L, 1L, true);
            return;
          }
          if (Updater.e(Updater.this))
          {
            x.i("MicroMsg.Updater", "summerupdate gonna start UpdaterService checkcontrol");
            com.tencent.mm.plugin.report.service.h.mEJ.a(405L, 58L, 1L, true);
            au.DF().a(725, Updater.a(Updater.this, new Updater.3.1(this, paramAnonymouse)));
            au.DF().a(new com.tencent.mm.modelsimple.o(), 0);
            com.tencent.mm.s.c.Cp().u(262145, true);
            com.tencent.mm.pluginsdk.model.app.a.cbG();
            return;
          }
          x.i("MicroMsg.Updater", "gonna start AppUpdaterUI");
          localObject = new Intent(Updater.this.getContext(), AppUpdaterUI.class);
          Updater.a(Updater.this, (Intent)localObject, paramAnonymouse, paramString);
          x.i("MicroMsg.Updater", "current updateType : %s", new Object[] { Integer.valueOf(Updater.c(Updater.this)) });
          if (Updater.c(Updater.this) == 1)
          {
            ((Intent)localObject).putExtra("intent_extra_download_mode", 0);
            com.tencent.mm.plugin.report.service.h.mEJ.a(405L, 60L, 1L, true);
          }
          for (;;)
          {
            Updater.this.getContext().startActivity((Intent)localObject);
            break;
            com.tencent.mm.plugin.report.service.h.mEJ.a(405L, 61L, 1L, true);
            ((Intent)localObject).putExtra("intent_extra_download_mode", 1);
          }
        }
      }), 0);
      onStop();
      return;
    }
    com.tencent.mm.plugin.report.service.h.mEJ.a(405L, 62L, 1L, true);
    if (this.sEn != null)
    {
      paramString = this.sEn;
      if (paramString.gFh != null) {
        paramString.gFh.setVisibility(8);
      }
      paramString = (TextView)this.sEn.findViewById(R.h.mm_progress_dialog_msg);
      if ((paramInt1 != 4) || (paramInt2 != -18)) {
        break label244;
      }
      paraml = new bf();
      com.tencent.mm.sdk.b.a.sFg.m(paraml);
      paraml = au.DF();
      paramString = new Updater.4(this, paramString);
      this.sEs = paramString;
      paraml.a(922, paramString);
    }
    for (;;)
    {
      i.chf();
      cancel();
      return;
      label244:
      if (paramString != null)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.a(405L, 64L, 1L, true);
        paramString.setText(R.l.update_err_getinfo);
        j.g(paramString, 1);
      }
    }
  }
  
  public final void a(Intent paramIntent, e parame)
  {
    paramIntent.putExtra("intent_short_ips", getShortIps());
    paramIntent.putExtra("intent_client_version", com.tencent.mm.protocal.d.qVN);
    paramIntent.putExtra("intent_update_type", 3);
    int i;
    if ((parame.kne != null) && (!parame.kne.isEmpty()) && (parame.kne.containsKey(Integer.valueOf(4))))
    {
      i = 1;
      if (i == 0) {
        break label352;
      }
      localObject1 = parame.kne;
      if ((localObject1 != null) && (!((HashMap)localObject1).isEmpty())) {
        break label204;
      }
      localObject1 = "";
    }
    label204:
    Object localObject2;
    LinkedList localLinkedList;
    int j;
    label253:
    do
    {
      do
      {
        do
        {
          paramIntent.putExtra("intent_extra_desc", (String)localObject1);
          paramIntent.putExtra("intent_extra_md5", parame.kni);
          paramIntent.putExtra("intent_extra_size", parame.fileSize);
          paramIntent.putExtra("intent_extra_download_url", new String[] { parame.knh });
          paramIntent.putExtra("intent_extra_patchInfo", parame.cgW());
          paramIntent.putExtra("intent_extra_updateMode", com.tencent.mm.sdk.platformtools.e.bxm);
          paramIntent.putExtra("intent_extra_marketUrl", com.tencent.mm.sdk.platformtools.e.sFB);
          paramIntent.putExtra("intent_extra_extinfo", "<extinfo></extinfo>");
          paramIntent.putExtra("intent_extra_tinker_patch", true);
          paramIntent.putExtra("intent_extra_download_mode", 1);
          return;
          i = 0;
          break;
          localObject2 = "";
          localLinkedList = (LinkedList)((HashMap)localObject1).get(Integer.valueOf(4));
          localObject1 = localObject2;
        } while (localLinkedList == null);
        localObject1 = localObject2;
      } while (localLinkedList.isEmpty());
      j = localLinkedList.size();
      i = 0;
      localObject1 = localObject2;
    } while (i >= j);
    Object localObject1 = (avn)localLinkedList.get(i);
    if (((avn)localObject1).lang.equalsIgnoreCase("default")) {}
    for (localObject1 = new String(Base64.decode(((avn)localObject1).content, 0));; localObject1 = localObject2)
    {
      i += 1;
      localObject2 = localObject1;
      break label253;
      if (((avn)localObject1).lang.equalsIgnoreCase(w.chP()))
      {
        localObject1 = new String(Base64.decode(((avn)localObject1).content, 0));
        break;
        label352:
        localObject1 = "";
        break;
      }
    }
  }
  
  public final void ah(int paramInt, boolean paramBoolean)
  {
    x.i("MicroMsg.Updater", "summerupdate begin update routine, type=" + paramInt);
    this.sDi = paramInt;
    this.sEq = paramBoolean;
    com.tencent.mm.plugin.report.service.h.mEJ.a(405L, 44L, 1L, true);
    com.tencent.mm.sandbox.a.a locala = new com.tencent.mm.sandbox.a.a(paramInt);
    au.DF().a(locala, 0);
  }
  
  public final void onStop()
  {
    com.tencent.mm.plugin.report.service.h.mEJ.a(405L, 43L, 1L, true);
    cancel();
  }
  
  public final void update(int paramInt)
  {
    ah(paramInt, false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/sandbox/updater/Updater.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */