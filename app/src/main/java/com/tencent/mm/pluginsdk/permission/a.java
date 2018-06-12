package com.tencent.mm.pluginsdk.permission;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.h;

public final class a
{
  public static boolean a(Activity paramActivity, String paramString1, int paramInt, String paramString2, String paramString3)
  {
    if ((Build.VERSION.SDK_INT < 23) && (!"MNC".equals(Build.VERSION.CODENAME))) {
      return true;
    }
    for (;;)
    {
      try
      {
        int i = android.support.v4.content.a.f(paramActivity, paramString1);
        if (i == 0) {
          break;
        }
        if (!bi.oW(paramString3))
        {
          h.a(paramActivity, paramString3, paramString2, false, new a.1(paramActivity, paramString1, paramInt));
          return false;
        }
      }
      catch (Exception paramActivity)
      {
        x.e("MicroMsg.MPermissionUtil", "check mpermission exception:%s.", new Object[] { paramActivity });
        return true;
      }
      android.support.v4.app.a.a(paramActivity, new String[] { paramString1 }, paramInt);
    }
  }
  
  public static boolean bj(Context paramContext, String paramString)
  {
    int i;
    try
    {
      i = android.support.v4.content.a.f(paramContext, paramString);
      if (i != 0) {
        return false;
      }
    }
    catch (Exception paramContext)
    {
      x.e("MicroMsg.MPermissionUtil", "check mpermission exception:%s.", new Object[] { paramContext });
      return false;
    }
    String str = null;
    if (paramString.equals("android.permission.READ_CONTACTS"))
    {
      str = "android.permission.WRITE_CONTACTS";
      if (bi.oW(str)) {
        break label98;
      }
    }
    label96:
    label98:
    for (;;)
    {
      try
      {
        i = android.support.v4.content.a.f(paramContext, str);
        if (i != 0) {
          break label96;
        }
        return true;
      }
      catch (Exception paramContext)
      {
        x.e("MicroMsg.MPermissionUtil", "check mpermission otherPermisson exception:%s.", new Object[] { paramContext });
        return false;
      }
      if (!paramString.equals("android.permission.WRITE_CONTACTS")) {
        break;
      }
      str = "android.permission.READ_CONTACTS";
      break;
      return false;
    }
  }
  
  public static boolean f(Activity paramActivity, String paramString)
  {
    if ((Build.VERSION.SDK_INT < 23) && (!"MNC".equals(Build.VERSION.CODENAME))) {}
    for (;;)
    {
      return true;
      try
      {
        int i = android.support.v4.content.a.f(paramActivity, paramString);
        if (i != 0) {
          return false;
        }
      }
      catch (Exception paramActivity)
      {
        x.e("MicroMsg.MPermissionUtil", "check mpermission exception:%s.", new Object[] { paramActivity });
      }
    }
    return true;
  }
  
  public static void g(Activity paramActivity, String paramString)
  {
    android.support.v4.app.a.a(paramActivity, new String[] { paramString }, 80);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/permission/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */