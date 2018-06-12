package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;

public final class l
  extends o
{
  protected boolean aEK;
  protected String aEV;
  protected String aEW;
  protected int aEY;
  protected boolean aFF;
  protected int aFG;
  protected boolean aFH;
  protected boolean aFI;
  
  public l(q paramq)
  {
    super(paramq);
  }
  
  public final int getLogLevel()
  {
    np();
    return this.aFG;
  }
  
  protected final void mE()
  {
    Object localObject1 = this.aFn.mContext;
    Object localObject2;
    try
    {
      localObject1 = ((Context)localObject1).getPackageManager().getApplicationInfo(((Context)localObject1).getPackageName(), 129);
      if (localObject1 == null)
      {
        aR("Couldn't get ApplicationInfo to load global config");
        return;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      do
      {
        do
        {
          do
          {
            for (;;)
            {
              f("PackageManager doesn't know about the app package", localNameNotFoundException);
              localObject2 = null;
            }
            localObject2 = ((ApplicationInfo)localObject2).metaData;
          } while (localObject2 == null);
          i = ((Bundle)localObject2).getInt("com.google.android.gms.analytics.globalConfigResource");
        } while (i <= 0);
        localObject2 = (b)new ak(this.aFn).dg(i);
      } while (localObject2 == null);
      aO("Loading global XML config values");
      if (((b)localObject2).aEV == null) {
        break label298;
      }
    }
    int i = 1;
    label105:
    String str;
    if (i != 0)
    {
      str = ((b)localObject2).aEV;
      this.aEV = str;
      e("XML config - app name", str);
    }
    if (((b)localObject2).aEW != null)
    {
      i = 1;
      label138:
      if (i != 0)
      {
        str = ((b)localObject2).aEW;
        this.aEW = str;
        e("XML config - app version", str);
      }
      if (((b)localObject2).aEX == null) {
        break label308;
      }
      i = 1;
      label171:
      if (i != 0)
      {
        str = ((b)localObject2).aEX.toLowerCase();
        if (!"verbose".equals(str)) {
          break label313;
        }
        i = 0;
        label196:
        if (i >= 0)
        {
          this.aFG = i;
          d("XML config - log level", Integer.valueOf(i));
        }
      }
      if (((b)localObject2).aEY < 0) {
        break label363;
      }
      i = 1;
      label224:
      if (i != 0)
      {
        i = ((b)localObject2).aEY;
        this.aEY = i;
        this.aFH = true;
        e("XML config - dispatch period (sec)", Integer.valueOf(i));
      }
      if (((b)localObject2).aEZ == -1) {
        break label368;
      }
      i = 1;
      label263:
      if (i == 0) {
        break label371;
      }
      if (((b)localObject2).aEZ != 1) {
        break label373;
      }
    }
    label298:
    label308:
    label313:
    label363:
    label368:
    label371:
    label373:
    for (boolean bool = true;; bool = false)
    {
      this.aEK = bool;
      this.aFI = true;
      e("XML config - dry run", Boolean.valueOf(bool));
      return;
      i = 0;
      break label105;
      i = 0;
      break label138;
      i = 0;
      break label171;
      if ("info".equals(str))
      {
        i = 1;
        break label196;
      }
      if ("warning".equals(str))
      {
        i = 2;
        break label196;
      }
      if ("error".equals(str))
      {
        i = 3;
        break label196;
      }
      i = -1;
      break label196;
      i = 0;
      break label224;
      i = 0;
      break label263;
      break;
    }
  }
  
  public final String nb()
  {
    np();
    return this.aEW;
  }
  
  public final String nc()
  {
    np();
    return this.aEV;
  }
  
  public final boolean nd()
  {
    np();
    return this.aFF;
  }
  
  public final boolean ne()
  {
    np();
    return this.aFH;
  }
  
  public final int nf()
  {
    np();
    return this.aEY;
  }
  
  public final boolean ng()
  {
    np();
    return this.aFI;
  }
  
  public final boolean nh()
  {
    np();
    return this.aEK;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/analytics/internal/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */