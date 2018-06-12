package com.tencent.mm.platformtools;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.at;
import com.tencent.mm.model.q;
import com.tencent.mm.modelsimple.q.a;
import com.tencent.mm.plugin.account.friend.a.l.a;
import com.tencent.mm.plugin.account.ui.q.e;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.BioHelperUI;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.protocal.c.xt;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.base.h;

public final class aa
{
  public static void a(Context paramContext, q.a parama, int paramInt)
  {
    paramContext = new Intent(paramContext, BioHelperUI.class);
    paramContext.putExtra("k_type", parama.type);
    paramContext.putExtra("KVoiceHelpCode", paramInt);
    paramContext.putExtra("Kvertify_key", parama.bLe);
    paramContext.putExtra("KVoiceHelpUrl", parama.efV);
    paramContext.putExtra("KVoiceHelpWording", parama.bSc);
    paramContext.putExtra("Kusername", parama.username);
    if (parama.efW != null) {
      paramContext.getExtras().putAll(parama.efW);
    }
  }
  
  public static void ch(Context paramContext)
  {
    String str1 = paramContext.getString(q.e.alpha_version_tip_login);
    String str2 = paramContext.getString(q.e.alpha_version_open_offical_url);
    h.a(paramContext, str1, "", paramContext.getString(q.e.confirm_dialog_ok), paramContext.getString(q.e.confirm_dialog_cancel), new aa.3(str2, paramContext), null);
  }
  
  public static void e(Context paramContext, String paramString, int paramInt)
  {
    paramString = com.tencent.mm.h.a.eV(paramString);
    if (paramString != null)
    {
      if (paramString.showType != 8) {
        break label29;
      }
      a.b(paramContext, paramString.url, paramInt, false);
    }
    label29:
    String str1;
    String str2;
    aa.5 local5;
    do
    {
      return;
      str1 = paramContext.getString(q.e.app_ok);
      str2 = paramContext.getString(q.e.app_cancel);
      local5 = new aa.5(paramContext, paramString, paramInt);
    } while ((paramString.showType != 1) && (paramString.showType != 4));
    if (bi.oW(paramString.url))
    {
      h.b(paramContext, paramString.desc, paramString.bHD, true);
      return;
    }
    h.a(paramContext, paramString.desc, paramString.bHD, str1, str2, local5, null);
  }
  
  public static void n(final Context paramContext, String paramString1, String paramString2)
  {
    paramString1 = com.tencent.mm.h.a.eV(paramString1);
    if (paramString1 != null) {
      paramString1.a(paramContext, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          paramAnonymousDialogInterface = new Intent();
          paramAnonymousDialogInterface.putExtra("rawUrl", this.ewu);
          paramAnonymousDialogInterface.putExtra("showShare", false);
          paramAnonymousDialogInterface.putExtra("show_bottom", false);
          paramAnonymousDialogInterface.putExtra("needRedirect", false);
          paramAnonymousDialogInterface.putExtra("neverGetA8Key", true);
          paramAnonymousDialogInterface.putExtra("hardcode_jspermission", JsapiPermissionWrapper.qWa);
          paramAnonymousDialogInterface.putExtra("hardcode_general_ctrl", GeneralControlWrapper.qVX);
          com.tencent.mm.plugin.account.a.a.ezn.j(paramAnonymousDialogInterface, paramContext);
        }
      }, null);
    }
  }
  
  public static void oS(String paramString)
  {
    at.dBv.T("login_user_name", paramString);
  }
  
  public static void showAddrBookUploadConfirm(final Activity paramActivity, Runnable paramRunnable, boolean paramBoolean, int paramInt)
  {
    if ((com.tencent.mm.plugin.account.friend.a.l.XC() != l.a.eKt) && (com.tencent.mm.plugin.account.friend.a.l.XC() != l.a.eKu)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.PostLoginUtil", "not successfully binded, skip addrbook confirm");
    }
    for (;;)
    {
      if (paramRunnable != null) {
        paramRunnable.run();
      }
      return;
      if (bi.d((Boolean)com.tencent.mm.kernel.g.Ei().DT().get(12322, null)))
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.PostLoginUtil", "addrbook upload confirmed");
      }
      else if ((!paramBoolean) && (bi.d((Boolean)com.tencent.mm.kernel.g.Ei().DT().get(12323, null))))
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.PostLoginUtil", "addrbook upload login confirmed showed");
      }
      else
      {
        com.tencent.mm.kernel.g.Ei().DT().set(12322, Boolean.valueOf(false));
        String str = bi.oV(bi.fR(paramActivity));
        if ((str.length() <= 0) || (!str.equals(com.tencent.mm.kernel.g.Ei().DT().get(6, null)))) {
          break;
        }
        com.tencent.mm.kernel.g.Ei().DT().set(12322, Boolean.valueOf(true));
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PostLoginUtil", "same none-nil phone number, leave it");
      }
    }
    h.a(paramActivity, q.e.bind_mcontact_bind_alert_content, q.e.app_tip, q.e.app_yes, q.e.app_no, new aa.1(paramInt, paramActivity, paramRunnable), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        com.tencent.mm.kernel.g.Ei().DT().set(12322, Boolean.valueOf(false));
        aa.syncUploadMContactStatus(false, false);
        if (this.ewt != null) {
          this.ewt.run();
        }
        paramActivity.getSharedPreferences(ad.chY(), 0).edit().putBoolean("login_upload_contacts_already_displayed", true).commit();
      }
    });
    com.tencent.mm.kernel.g.Ei().DT().set(12323, Boolean.valueOf(true));
  }
  
  public static void syncUploadMContactStatus(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = q.GJ();
    if (paramBoolean1)
    {
      i &= 0xFFFDFFFF;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.PostLoginUtil", "Reg By mobile update = " + i);
      com.tencent.mm.kernel.g.Ei().DT().set(7, Integer.valueOf(i));
      if (paramBoolean1) {
        break label127;
      }
    }
    label127:
    for (i = 1;; i = 2)
    {
      xt localxt = new xt();
      localxt.rDz = 17;
      localxt.rDA = i;
      ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b(new h.a(23, localxt));
      if (paramBoolean2) {
        com.tencent.mm.plugin.account.a.a.ezo.vl();
      }
      return;
      i |= 0x20000;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/platformtools/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */