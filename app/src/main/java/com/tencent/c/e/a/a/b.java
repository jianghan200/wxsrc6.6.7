package com.tencent.c.e.a.a;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.SparseArray;
import com.tencent.c.e.a.b.e;
import com.tencent.c.e.a.b.g;
import com.tencent.c.f.d;
import java.util.ArrayList;
import java.util.List;

public final class b
{
  private static final int[] vjQ = { 1, 5, 4, 8, 9, 2 };
  private static int vjR = -1;
  
  public static com.tencent.c.e.a.b.a a(int paramInt1, int paramInt2, Context paramContext, int paramInt3, SparseArray<i> paramSparseArray, List<k> paramList)
  {
    com.tencent.c.e.a.b.a locala = new com.tencent.c.e.a.b.a();
    locala.vkm = 0L;
    locala.vkn = "";
    locala.pMn = com.tencent.c.f.i.bL(paramContext, paramContext.getPackageName()).versionCode;
    locala.vie = "14D6ACDE3C2F2F48";
    locala.bVU = 500000;
    locala.requestType = paramInt3;
    locala.vkp = acn(paramContext.getPackageName());
    ArrayList localArrayList = new ArrayList();
    paramInt3 = 0;
    while (paramInt3 < paramSparseArray.size())
    {
      localArrayList.addAll(((i)paramSparseArray.valueAt(paramInt3)).eg(paramList));
      paramInt3 += 1;
    }
    if ((localArrayList.size() <= 0) || (localArrayList.get(0) == null)) {
      throw new IllegalArgumentException("invalid stateUnits");
    }
    paramSparseArray = new e();
    paramSparseArray.vkx = ((g)localArrayList.get(0)).vkC;
    paramSparseArray.vky = localArrayList;
    paramSparseArray.vjz = paramInt1;
    paramSparseArray.action = paramInt2;
    paramList = new ArrayList();
    paramList.add(paramSparseArray);
    locala.vko = paramList;
    locala.imei = acn(d.ht(paramContext));
    locala.imsi = acn(d.hu(paramContext));
    locala.dMB = acn(Build.BRAND);
    locala.model = acn(Build.MODEL);
    locala.vkq = acn(Build.FINGERPRINT);
    locala.vkr = hr(paramContext);
    locala.sdkVer = Build.VERSION.SDK_INT;
    locala.seW = 2;
    return locala;
  }
  
  private static String acn(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    return str;
  }
  
  private static int hr(Context paramContext)
  {
    if (vjR == -1)
    {
      paramContext = (SensorManager)paramContext.getSystemService("sensor");
      if (paramContext == null) {
        return vjR;
      }
      int i = 0;
      int j = 1;
      if (i < vjQ.length)
      {
        if (paramContext.getDefaultSensor(vjQ[i]) == null) {}
        for (int k = 0;; k = 1)
        {
          j |= k << i;
          i += 1;
          break;
        }
      }
      vjR = j;
    }
    return vjR;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/c/e/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */