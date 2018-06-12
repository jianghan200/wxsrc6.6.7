package com.tencent.mm.app;

import android.content.res.Configuration;
import com.tencent.mm.compatible.loader.e;
import com.tencent.mm.f.a;
import com.tencent.mm.sdk.platformtools.ad;

public class TMAssistantProfile
  extends e
{
  public static final String byu = ad.getPackageName() + ":TMAssistantDownloadSDKService";
  
  public final void onConfigurationChanged(Configuration paramConfiguration) {}
  
  public final void onCreate()
  {
    a.bh(ad.getContext());
    k.cN(byu);
    com.tencent.mm.compatible.util.k.setupBrokenLibraryHandler();
    o.ve();
  }
  
  public String toString()
  {
    return byu;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/app/TMAssistantProfile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */