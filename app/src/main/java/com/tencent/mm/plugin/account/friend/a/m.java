package com.tencent.mm.plugin.account.friend.a;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.tencent.mm.sdk.platformtools.ad;
import java.net.URLEncoder;
import java.util.List;
import org.apache.http.NameValuePair;

public final class m
{
  public static String ae(List<NameValuePair> paramList)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int j = paramList.size();
    int i = 0;
    while (i < j)
    {
      NameValuePair localNameValuePair = (NameValuePair)paramList.get(i);
      if (!TextUtils.isEmpty(localNameValuePair.getName()))
      {
        if (i != 0) {
          localStringBuilder.append("&");
        }
        localStringBuilder.append(URLEncoder.encode(localNameValuePair.getName(), "UTF-8"));
        localStringBuilder.append("=");
        if (!TextUtils.isEmpty(localNameValuePair.getValue())) {
          localStringBuilder.append(URLEncoder.encode(localNameValuePair.getValue(), "UTF-8"));
        }
      }
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  public static boolean cl(Context paramContext)
  {
    Intent localIntent1 = new Intent("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
    Intent localIntent2 = new Intent("com.tencent.mm.gms.ACTION_CHOOSE_ACCOUNT");
    return (paramContext.getPackageManager().resolveActivity(localIntent2, 0) != null) && (paramContext.getPackageManager().resolveActivity(localIntent1, 0) != null) && (Build.VERSION.SDK_INT >= 8) && (!paramContext.getSharedPreferences(ad.chY(), 0).getBoolean("googleauth", false));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/account/friend/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */