package com.tencent.mm.plugin.downloader.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class b
{
  public static void a(long paramLong, float paramFloat, int paramInt)
  {
    x.d("MicroMsg.FileDownloadSP", "speed = " + paramFloat);
    int i = Math.round(100.0F * paramFloat);
    String str1 = i + "_" + paramInt;
    x.d("MicroMsg.FileDownloadSP", "speedStr = " + str1);
    SharedPreferences localSharedPreferences = ad.getContext().getSharedPreferences("download_pref", 0);
    String str2;
    if (localSharedPreferences != null)
    {
      str2 = localSharedPreferences.getString(String.valueOf(paramLong), "");
      if (!bi.oW(str2)) {
        break label187;
      }
    }
    for (str1 = "1_" + str1 + "|";; str1 = str2 + (paramInt + 1) + "_" + str1 + "|")
    {
      x.d("MicroMsg.FileDownloadSP", "saveDownloadSpeed, speedStr = " + str1);
      localSharedPreferences.edit().putString(String.valueOf(paramLong), str1).apply();
      return;
      label187:
      String[] arrayOfString = str2.split("\\|");
      paramInt = bi.getInt(arrayOfString[(arrayOfString.length - 1)].split("_")[0], 0);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/downloader/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */