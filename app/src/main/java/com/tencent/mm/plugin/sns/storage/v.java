package com.tencent.mm.plugin.sns.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;

public final class v
{
  public static boolean Lr(String paramString)
  {
    return (paramString != null) && (paramString.startsWith("sns_table_"));
  }
  
  public static boolean ND(String paramString)
  {
    return (paramString != null) && (paramString.startsWith("ad_table_"));
  }
  
  public static long NE(String paramString)
  {
    if (bi.oW(paramString)) {
      return 0L;
    }
    if (paramString.startsWith("ad_table_")) {
      return bi.WV(paramString.substring(9));
    }
    if (paramString.startsWith("sns_table_")) {
      return bi.WV(paramString.substring(10));
    }
    return bi.WV(paramString);
  }
  
  public static int NF(String paramString)
  {
    if (bi.oW(paramString)) {
      return 0;
    }
    if (paramString.startsWith("ad_table_")) {
      return bi.WU(paramString.substring(9));
    }
    return bi.WU(paramString.substring(10));
  }
  
  public static boolean NG(String paramString)
  {
    if (paramString.startsWith("ad_table_")) {
      if (bi.WV(paramString.substring(9)) == 0L) {}
    }
    while (bi.WV(paramString.substring(10)) != 0L)
    {
      return true;
      return false;
    }
    return false;
  }
  
  public static boolean NH(String paramString)
  {
    return !NG(paramString);
  }
  
  public static int ae(String paramString1, String paramString2, String paramString3)
  {
    int k = 0;
    paramString1 = af(paramString1, paramString2, paramString3);
    int j = k;
    int i;
    if (!bi.oW(paramString1))
    {
      paramString1 = paramString1.split("&");
      i = 0;
    }
    for (;;)
    {
      j = k;
      if (i < paramString1.length)
      {
        if ((paramString1[i] != null) && (paramString1[i].contains("voteResultIndex="))) {
          j = Integer.valueOf(paramString1[i].substring(16)).intValue();
        }
      }
      else {
        return j;
      }
      i += 1;
    }
  }
  
  public static String af(String paramString1, String paramString2, String paramString3)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramString1 != null)
    {
      localStringBuilder.append(paramString1);
      if (paramString2 == null) {
        break label72;
      }
      label22:
      localStringBuilder.append(paramString2);
      if (paramString3 == null) {
        break label78;
      }
    }
    for (;;)
    {
      localStringBuilder.append(paramString3);
      if (localStringBuilder.length() <= 0) {
        break label84;
      }
      return ad.getContext().getSharedPreferences("SnsAdVote", 0).getString(localStringBuilder.toString(), "");
      paramString1 = "";
      break;
      label72:
      paramString2 = "";
      break label22;
      label78:
      paramString3 = "";
    }
    label84:
    return "";
  }
  
  public static String ah(String paramString, long paramLong)
  {
    return paramString + paramLong;
  }
  
  public static String ai(String paramString, long paramLong)
  {
    return paramString + paramLong;
  }
  
  public static int eN(String paramString1, String paramString2)
  {
    g.Eg();
    return ae(paramString1, paramString2, a.Dg());
  }
  
  public static void g(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    if (TextUtils.isEmpty(paramString1)) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramString1 != null)
    {
      label21:
      localStringBuilder.append(paramString1);
      if (paramString2 == null) {
        break label125;
      }
      label32:
      localStringBuilder.append(paramString2);
      if (paramString3 == null) {
        break label131;
      }
    }
    for (;;)
    {
      localStringBuilder.append(paramString3);
      if (localStringBuilder.length() <= 0) {
        break;
      }
      paramString1 = ad.getContext().getSharedPreferences("SnsAdVote", 0).edit();
      paramString1.putString(localStringBuilder.toString(), "voteResultIndex=" + paramInt1 + "&isUpdate=" + paramInt2);
      paramString1.commit();
      return;
      paramString1 = "";
      break label21;
      label125:
      paramString2 = "";
      break label32;
      label131:
      paramString3 = "";
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */