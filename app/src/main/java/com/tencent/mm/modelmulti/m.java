package com.tencent.mm.modelmulti;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Method;

public final class m
{
  Boolean eai = null;
  
  public m(Context paramContext, a parama)
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.SCREEN_ON");
    localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
    paramContext.registerReceiver(new m.1(this, parama), localIntentFilter);
  }
  
  private Boolean bO(Context paramContext)
  {
    try
    {
      paramContext = (Boolean)PowerManager.class.getMethod("isScreenOn", new Class[0]).invoke((PowerManager)paramContext.getSystemService("power"), new Object[0]);
      x.i("MicroMsg.ScreenState", "reflectScreenOn: byReflect:%s isScreenOn:%s", new Object[] { paramContext, this.eai });
      return paramContext;
    }
    catch (Exception paramContext)
    {
      h.mEJ.a(99L, 154L, 1L, false);
      x.e("MicroMsg.ScreenState", "reflectScreenOn invoke ERROR use isScreenOn:%s e:%s", new Object[] { this.eai, bi.i(paramContext) });
    }
    return null;
  }
  
  public static abstract interface a
  {
    public abstract void bL(boolean paramBoolean);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/modelmulti/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */