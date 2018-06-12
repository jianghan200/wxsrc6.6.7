package com.tencent.mm.platformtools;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.base.h;

public final class a
{
  public static boolean F(Context paramContext, String paramString)
  {
    if (paramString.length() > 16)
    {
      w(paramContext, a.evp);
      return false;
    }
    if (bi.WC(paramString))
    {
      h.i(paramContext, a.j.regbyfacebook_reg_setpwd_alert_using_chinese, a.j.regbymobile_reg_setpwd_alert_title);
      return false;
    }
    if (!bi.WH(paramString))
    {
      if ((paramString.length() >= 8) && (paramString.length() < 16))
      {
        w(paramContext, a.evr);
        return false;
      }
      w(paramContext, a.evq);
      return false;
    }
    return true;
  }
  
  public static void b(Context paramContext, String paramString, int paramInt, boolean paramBoolean)
  {
    boolean bool = false;
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("showShare", false);
    localIntent.putExtra("show_bottom", false);
    localIntent.putExtra("needRedirect", false);
    if (!paramBoolean) {
      bool = true;
    }
    localIntent.putExtra("neverGetA8Key", bool);
    localIntent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.qWa);
    localIntent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.qVX);
    if (paramInt > 0)
    {
      d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent, paramInt);
      return;
    }
    d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
  }
  
  private static void w(Context paramContext, int paramInt)
  {
    switch (a.1.evn[(paramInt - 1)])
    {
    default: 
      return;
    case 1: 
      h.i(paramContext, a.j.regbymobile_reg_setpwd_alert_diff, a.j.regbymobile_reg_setpwd_alert_title);
      return;
    case 2: 
      h.i(paramContext, a.j.regbymobile_reg_setpwd_alert_more_byte, a.j.regbymobile_reg_setpwd_alert_title);
      return;
    case 3: 
      h.i(paramContext, a.j.verify_password_all_num_tip, a.j.app_err_reg_title);
      return;
    }
    h.i(paramContext, a.j.verify_password_tip, a.j.app_err_reg_title);
  }
  
  public static enum a
  {
    public static int[] Vm()
    {
      return (int[])evs.clone();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/platformtools/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */