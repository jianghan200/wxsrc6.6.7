package com.tencent.mm.protocal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import junit.framework.Assert;

public final class d
  extends e
{
  public static final String DEVICE_NAME;
  public static String DEVICE_TYPE = "android-" + Build.VERSION.SDK_INT;
  public static final String qVH = Build.BRAND;
  public static final String qVI = Build.MODEL + Build.CPU_ABI;
  public static String qVJ = "android-" + Build.VERSION.SDK_INT;
  public static final String qVK = "android-" + Build.MANUFACTURER;
  public static String qVL = Build.VERSION.SDK_INT;
  public static long qVM;
  public static int qVN;
  public static boolean qVO = cge();
  public static boolean qVP = cgd();
  public static boolean qVQ = cgb();
  public static boolean qVR = cga();
  public static boolean qVS = cgc();
  public static int qVT = 5;
  public static final byte[] qVU = null;
  public static final byte[] qVV = null;
  public static final byte[] qVW = null;
  
  static
  {
    DEVICE_NAME = Build.MANUFACTURER + "-" + Build.MODEL;
    qVM = 0L;
    qVN = Integer.decode(com.tencent.mm.sdk.platformtools.d.CLIENT_VERSION).intValue();
    Assert.assertNotNull(com.tencent.mm.sdk.platformtools.d.CLIENT_VERSION);
    try
    {
      int i = ad.getContext().getPackageManager().getApplicationInfo(ad.getPackageName(), 128).metaData.getInt("com.tencent.mm.BuildInfo.CLIENT_VERSION");
      if ((i > qVN) && (i - qVN < 255) && ((i & 0xFF) >= 48)) {
        qVN = i;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.k("MicroMsg.ConstantsProtocal", "", new Object[] { localException });
      }
    }
  }
  
  public static void CA(int paramInt)
  {
    qVN = paramInt;
    qVQ = cgb();
    qVR = cga();
    qVO = cge();
    qVP = cgd();
    qVS = cgc();
  }
  
  private static boolean cga()
  {
    return ((qVN & 0xFF) >= 32) && ((qVN & 0xFF) <= 47);
  }
  
  private static boolean cgb()
  {
    return ((qVN & 0xFF) >= 0) && ((qVN & 0xFF) <= 31);
  }
  
  private static boolean cgc()
  {
    return ((qVN & 0xFF) >= 0) && ((qVN & 0xFF) <= 15);
  }
  
  private static boolean cgd()
  {
    return ((qVN & 0xFF) >= 96) && ((qVN & 0xFF) <= 159);
  }
  
  private static boolean cge()
  {
    return ((qVN & 0xFF) >= 48) && ((qVN & 0xFF) <= 95);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */