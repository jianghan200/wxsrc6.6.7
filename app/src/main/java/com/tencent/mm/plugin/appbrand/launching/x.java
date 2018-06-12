package com.tencent.mm.plugin.appbrand.launching;

import android.content.res.Resources;
import android.widget.Toast;
import com.tencent.mm.plugin.appbrand.r.c;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;

public enum x
{
  public static String getMMString(int paramInt, Object... paramVarArgs)
  {
    return c.getMMString(paramInt, paramVarArgs);
  }
  
  public static void lc(int paramInt)
  {
    um(ad.getResources().getString(paramInt));
  }
  
  public static void um(String paramString)
  {
    ah.A(new Runnable()
    {
      public final void run()
      {
        Toast.makeText(ad.getContext(), this.dho, 0).show();
      }
    });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */