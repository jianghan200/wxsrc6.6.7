package com.tencent.mm.an;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.protocal.c.avq;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

public final class c
{
  private static float[] O(List<float[]> paramList)
  {
    float[] arrayOfFloat;
    int i;
    if (paramList.size() > 4)
    {
      arrayOfFloat = null;
      i = 0;
      if (i < paramList.size())
      {
        if (((float[])paramList.get(i))[2] >= Float.MAX_VALUE) {
          break label122;
        }
        arrayOfFloat = (float[])paramList.get(i);
      }
    }
    label122:
    for (;;)
    {
      i += 1;
      break;
      if (arrayOfFloat[2] <= 0.15D) {
        return arrayOfFloat;
      }
      if (arrayOfFloat[1] > 0.5D) {
        arrayOfFloat[1] -= 0.1F;
      }
      arrayOfFloat[2] -= 0.1F;
      return arrayOfFloat;
      paramList = (float[])paramList.get(0);
      paramList[2] = 0.15F;
      return paramList;
    }
  }
  
  public static boolean Qc()
  {
    if ((b.PZ()) && (!b.PY()))
    {
      b.yM();
      return true;
    }
    return false;
  }
  
  public static boolean Qd()
  {
    if (b.PY())
    {
      b.yL();
      return true;
    }
    return false;
  }
  
  public static boolean Qe()
  {
    if (b.PZ())
    {
      b.PW();
      return true;
    }
    return false;
  }
  
  public static boolean Qf()
  {
    return (Qh()) || (Qg());
  }
  
  public static boolean Qg()
  {
    int i = g.AT().getInt("ShakeMusicGlobalSwitch", 0);
    x.i("MicroMsg.Music.MusicHelperUtils", "isShakeMusicGlobalUser: %d", new Object[] { Integer.valueOf(i) });
    return i != 0;
  }
  
  public static boolean Qh()
  {
    Object localObject = TimeZone.getDefault();
    TimeZone localTimeZone = TimeZone.getTimeZone("GMT+08:00");
    if (((TimeZone)localObject).getRawOffset() != localTimeZone.getRawOffset()) {
      return false;
    }
    localObject = (TelephonyManager)ad.getContext().getSystemService("phone");
    if (localObject != null)
    {
      localObject = ((TelephonyManager)localObject).getNetworkCountryIso();
      if ((!bi.oW((String)localObject)) && (!((String)localObject).equalsIgnoreCase("cn"))) {
        return false;
      }
    }
    return true;
  }
  
  public static boolean mq(String paramString)
  {
    avq localavq = b.Qa();
    return (localavq != null) && (localavq.rYp.equals(paramString));
  }
  
  public static int[] s(Bitmap paramBitmap)
  {
    Object localObject = Bitmap.createScaledBitmap(paramBitmap, 4, 4, false);
    paramBitmap = new int[16];
    ((Bitmap)localObject).getPixels(paramBitmap, 0, 4, 0, 0, 4, 4);
    float[][] arrayOfFloat = new float[16][];
    int i = 0;
    while (i < 16)
    {
      localObject = new float[3];
      Color.colorToHSV(paramBitmap[i], (float[])localObject);
      arrayOfFloat[i] = localObject;
      i += 1;
    }
    int[] arrayOfInt = new int[8];
    SparseArray localSparseArray = new SparseArray();
    i = 0;
    if (i < 16)
    {
      j = 1;
      for (;;)
      {
        if (j <= 7)
        {
          if (arrayOfFloat[i][0] < 360.0F * (j / 7.0F))
          {
            arrayOfInt[j] += 1;
            localObject = (List)localSparseArray.get(j);
            paramBitmap = (Bitmap)localObject;
            if (localObject == null) {
              paramBitmap = new ArrayList();
            }
            paramBitmap.add(arrayOfFloat[i]);
            localSparseArray.put(j, paramBitmap);
          }
        }
        else
        {
          i += 1;
          break;
        }
        j += 1;
      }
    }
    int k = -1;
    i = 1;
    int m;
    for (int j = 0; i <= 7; j = m)
    {
      m = j;
      if (arrayOfInt[i] > j)
      {
        m = arrayOfInt[i];
        k = i;
      }
      i += 1;
    }
    paramBitmap = O((List)localSparseArray.get(k, new ArrayList()));
    localObject = new float[3];
    if (paramBitmap[2] <= 0.15D)
    {
      localObject[0] = paramBitmap[0];
      localObject[1] = paramBitmap[1];
      paramBitmap[2] += 0.7F;
    }
    for (;;)
    {
      if (localObject[1] > 0.5F) {
        localObject[1] -= 0.1F;
      }
      return new int[] { Color.HSVToColor(paramBitmap), Color.HSVToColor((float[])localObject) };
      localObject[0] = paramBitmap[0];
      localObject[1] = paramBitmap[1];
      if (paramBitmap[2] + 0.5D >= 1.0D) {
        paramBitmap[2] -= 0.5F;
      } else {
        paramBitmap[2] += 0.5F;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/an/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */