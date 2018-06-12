package com.tencent.mm.compatible.loader;

import android.app.Application;
import android.content.Context;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;

public final class f
{
  public static e c(Application paramApplication, String paramString)
  {
    try
    {
      paramString = (e)ad.getContext().getClassLoader().loadClass(ad.chX() + paramString).newInstance();
      paramString.app = paramApplication;
      return paramString;
    }
    catch (Exception paramApplication)
    {
      x.printErrStackTrace("MicroMsg.ProfileFactoryImpl", paramApplication, "", new Object[0]);
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/compatible/loader/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */