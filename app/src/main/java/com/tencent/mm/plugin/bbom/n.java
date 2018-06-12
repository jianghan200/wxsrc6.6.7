package com.tencent.mm.plugin.bbom;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.al;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;

public final class n
  implements e
{
  static n hex;
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paramInt1 == 4) && (!au.DF().foreground)) {}
    switch (paramInt2)
    {
    default: 
      return;
    case -311: 
    case -310: 
    case -205: 
    case -72: 
    case -9: 
    case -6: 
    case -4: 
    case -3: 
      au.getNotification().eK(ad.getContext().getString(R.l.main_err_relogin));
      au.hold();
      return;
    case -140: 
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NewSyncErrorProcessor", "alpha need whitelist : [%s]", new Object[] { paramString });
      if (!bi.oW(paramString)) {
        au.getNotification().eK(paramString);
      }
      for (;;)
      {
        au.hold();
        return;
        au.getNotification().eK(ad.getContext().getString(R.l.main_err_relogin));
      }
    case -100: 
      au.getNotification().eK(ad.getContext().getString(R.l.main_err_another_place));
      com.tencent.mm.platformtools.x.ca(ad.getContext());
      au.hold();
      return;
    case -999999: 
      new ag().post(new n.1(this));
      return;
    }
    paramString = ad.getContext().getSharedPreferences("system_config_prefs", 0);
    long l = paramString.getLong("recomended_update_ignore", -1L);
    if ((l != -1L) && (bi.bG(l) < 86400L))
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NewSyncErrorProcessor", "skip update notification, last check=" + l);
      return;
    }
    paraml = au.getNotification();
    if (paramInt2 == -17) {}
    for (paramInt1 = 2;; paramInt1 = 1)
    {
      paraml.fp(paramInt1);
      paramString.edit().putLong("recomended_update_ignore", bi.VE()).commit();
      h.mEJ.a(405L, 27L, 1L, true);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/bbom/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */