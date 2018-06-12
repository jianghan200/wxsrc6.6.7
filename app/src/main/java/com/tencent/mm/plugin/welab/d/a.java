package com.tencent.mm.plugin.welab.d;

import android.app.Activity;
import com.tencent.mm.g.a.qu;
import com.tencent.mm.g.c.ci;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.welab.a.a.b;
import com.tencent.mm.plugin.welab.a.a.d;
import com.tencent.mm.storage.x;

public final class a
  implements b
{
  public final String bYQ()
  {
    return null;
  }
  
  public final String bYR()
  {
    return null;
  }
  
  public final void e(Activity paramActivity, String paramString)
  {
    paramActivity = ((d)g.l(d.class)).RU(paramString);
    paramString = new qu();
    paramString.cbq.userName = paramActivity.field_WeAppUser;
    paramString.cbq.cbs = paramActivity.field_WeAppPath;
    paramString.cbq.scene = 1051;
    paramString.cbq.cbt = paramActivity.field_WeAppDebugMode;
    paramString.cbq.bGG = String.format("%s:%s:%s:%s", new Object[] { (String)g.Ei().DT().get(2, null), paramActivity.field_expId, paramActivity.field_LabsAppId, Long.valueOf(System.currentTimeMillis() / 1000L) });
    com.tencent.mm.sdk.b.a.sFg.m(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/welab/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */