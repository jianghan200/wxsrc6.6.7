package com.tencent.mm.plugin.exdevice.h;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class a
{
  public static boolean A(String paramString, long paramLong)
  {
    x.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "addToSharedPreferences, key = %s, deviceId = %d", new Object[] { paramString, Long.valueOf(paramLong) });
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "key is null or nil");
      return false;
    }
    SharedPreferences localSharedPreferences = ad.getContext().getSharedPreferences("exdevice_pref", 0);
    if (localSharedPreferences == null)
    {
      x.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "null == sp");
      return false;
    }
    b(localSharedPreferences);
    String str1 = String.valueOf(paramLong);
    String str2 = localSharedPreferences.getString(paramString, new String());
    x.i("MicroMsg.exdevice.Util", "addDeviceToDeviceList, device = %s, device list = %s", new Object[] { str1, str2 });
    if ((bi.oW(str1)) || (str2 == null))
    {
      x.e("MicroMsg.exdevice.Util", "Error parameters!!!");
      str1 = null;
    }
    while (str1 == null)
    {
      x.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "addDeviceToDeviceList failed!!!");
      return false;
      String str3 = new String();
      str2 = str3 + str2;
      str1 = str2 + str1;
      str1 = str1 + "|";
      x.i("MicroMsg.exdevice.Util", "add device to device list successful, new device list = %s", new Object[] { str1 });
    }
    if (!localSharedPreferences.edit().putString(paramString, str1).commit())
    {
      x.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "sp.edit().putString().commit() Failed!!!");
      return false;
    }
    x.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "add to sharepreference successful, new device list is %s", new Object[] { str1 });
    return true;
  }
  
  public static long[] Aj(String paramString)
  {
    x.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "getListFromSharedPreferences, key = %s", new Object[] { paramString });
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "key is null or nil");
      return null;
    }
    Object localObject = ad.getContext().getSharedPreferences("exdevice_pref", 0);
    if (localObject == null)
    {
      x.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "null == sp");
      return null;
    }
    b((SharedPreferences)localObject);
    try
    {
      localObject = ((SharedPreferences)localObject).getString(paramString, new String()).split("\\|");
      if ((localObject == null) || (localObject.length == 0))
      {
        x.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "null == strDeviceList || 0 == strDeviceList.length");
        return null;
      }
    }
    catch (Exception paramString)
    {
      x.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "split failed!!!, %s", new Object[] { paramString.getMessage() });
      return null;
    }
    long[] arrayOfLong = new long[localObject.length];
    int m = localObject.length;
    int j = 0;
    i = 0;
    if (j < m)
    {
      paramString = localObject[j];
      for (;;)
      {
        try
        {
          x.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "parse %s to long", new Object[] { paramString });
          k = paramString.length();
          if (k != 0) {
            continue;
          }
        }
        catch (Exception paramString)
        {
          try
          {
            arrayOfLong[i] = bi.getLong(paramString, 0L);
            i = k;
          }
          catch (Exception paramString)
          {
            for (;;)
            {
              int k;
              i = k;
            }
          }
          paramString = paramString;
        }
        j += 1;
        break;
        k = i + 1;
        x.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "try pase string device id to long failed : " + paramString.getMessage());
      }
    }
    if (i == 0) {
      return null;
    }
    return arrayOfLong;
  }
  
  public static boolean B(String paramString, long paramLong)
  {
    x.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "removeFromSharedPreferences, key = %s, deviceId = %d", new Object[] { paramString, Long.valueOf(paramLong) });
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "key is null or nil");
      return false;
    }
    SharedPreferences localSharedPreferences = ad.getContext().getSharedPreferences("exdevice_pref", 0);
    if (localSharedPreferences == null)
    {
      x.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "null == sp");
      return false;
    }
    b(localSharedPreferences);
    String str = b.cF(String.valueOf(paramLong), localSharedPreferences.getString(paramString, new String()));
    if (str == null)
    {
      x.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "remove device from device list failed!!!");
      return false;
    }
    if (str.length() == 0) {}
    for (boolean bool = localSharedPreferences.edit().remove(paramString).commit(); !bool; bool = localSharedPreferences.edit().putString(paramString, str).commit())
    {
      x.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "sp.edit().putString().commit()");
      return false;
    }
    x.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "remove from sharepreference successful, new device list is %s", new Object[] { str });
    return true;
  }
  
  private static void b(SharedPreferences paramSharedPreferences)
  {
    int i = 0;
    x.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "tryToClearDirtyData");
    if (Build.VERSION.SDK_INT < 11) {
      return;
    }
    if (paramSharedPreferences == null)
    {
      x.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "null == aSP");
      return;
    }
    while (i < 2)
    {
      String str = new String[] { "conneted_device", "shut_down_device" }[i];
      try
      {
        if (paramSharedPreferences.getStringSet(str, null) != null)
        {
          x.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "find dirty data, remove it, key = %s", new Object[] { str });
          if (!paramSharedPreferences.edit().remove(str).commit()) {
            x.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "remove dirty data failed!!!");
          }
        }
        i += 1;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
  }
  
  public static boolean z(String paramString, long paramLong)
  {
    x.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "isItemInSharedPreferences, key = %s, device id = %d", new Object[] { paramString, Long.valueOf(paramLong) });
    if (bi.oW(paramString)) {
      x.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "key is null or nil");
    }
    SharedPreferences localSharedPreferences;
    do
    {
      return false;
      localSharedPreferences = ad.getContext().getSharedPreferences("exdevice_pref", 0);
      if (localSharedPreferences == null)
      {
        x.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "null == sp");
        return false;
      }
      b(localSharedPreferences);
    } while (!b.cE(String.valueOf(paramLong), localSharedPreferences.getString(paramString, new String())));
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/exdevice/h/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */