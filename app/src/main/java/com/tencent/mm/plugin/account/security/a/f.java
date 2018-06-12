package com.tencent.mm.plugin.account.security.a;

import android.content.Context;
import android.os.Build;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.protocal.c.xt;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.storage.x;

public final class f
{
  public static String Yo()
  {
    return Build.MANUFACTURER + "-" + Build.MODEL;
  }
  
  public static String cn(Context paramContext)
  {
    if (paramContext == null)
    {
      if (com.tencent.mm.sdk.platformtools.e.sFF) {
        return ad.getContext().getString(a.j.safe_device_android_device_nm);
      }
      return ad.getContext().getString(a.j.safe_device_android_device);
    }
    if (com.tencent.mm.sdk.platformtools.e.sFF) {
      return paramContext.getString(a.j.safe_device_android_device_nm);
    }
    return paramContext.getString(a.j.safe_device_android_device);
  }
  
  public static void n(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (!com.tencent.mm.kernel.g.Eg().Dx()) {}
    do
    {
      return;
      i = q.GL();
      if (!paramBoolean1) {
        break;
      }
      i |= 0x4000;
      com.tencent.mm.kernel.g.Ei().DT().set(40, Integer.valueOf(i));
    } while (!paramBoolean2);
    xt localxt = new xt();
    localxt.rDz = 28;
    if (paramBoolean1) {}
    for (int i = 1;; i = 2)
    {
      localxt.rDA = i;
      ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b(new h.a(23, localxt));
      com.tencent.mm.plugin.account.a.a.ezo.vl();
      return;
      i &= 0xBFFF;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/account/security/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */