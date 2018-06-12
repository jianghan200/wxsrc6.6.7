package com.tencent.mm.app;

import android.content.res.Configuration;
import com.tencent.mm.booter.c;
import com.tencent.mm.booter.u;
import com.tencent.mm.compatible.loader.e;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class SandBoxProfile
  extends e
{
  public static final String byu = ad.getPackageName() + ":sandbox";
  
  public final void onConfigurationChanged(Configuration paramConfiguration) {}
  
  public final void onCreate()
  {
    Object localObject = c.bj(ad.getContext());
    k.setupBrokenLibraryHandler();
    k.b("MMProtocalJni", SandBoxProfile.class.getClassLoader());
    k.b(a.sFa, SandBoxProfile.class.getClassLoader());
    MMProtocalJni.setClientPackVersion(d.qVN);
    localObject = new u((c)localObject);
    try
    {
      ((u)localObject).ez("SANDBOX");
      af.exb = bi.a(((u)localObject).eA(".com.tencent.mm.debug.test.network.simulate_down_fault"), false);
      x.i("MicroMsg.SandboxDebugger", "Test.simulateDownFault = " + af.exb);
      o.ve();
      return;
    }
    catch (Error localError)
    {
      for (;;) {}
    }
  }
  
  public final String toString()
  {
    return byu;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/app/SandBoxProfile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */