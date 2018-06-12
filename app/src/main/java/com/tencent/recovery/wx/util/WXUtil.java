package com.tencent.recovery.wx.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.recovery.util.Util;
import java.util.UUID;

public class WXUtil
{
  public static final String Hk(int paramInt)
  {
    return "KeyConfigHttpCode[" + paramInt + "]";
  }
  
  public static final String Hl(int paramInt)
  {
    return "KeyPatchHttpCode[" + paramInt + "]";
  }
  
  public static final String acm(String paramString)
  {
    if (paramString.contains("?")) {
      return paramString + "uuid=" + UUID.randomUUID().toString();
    }
    return paramString + "?uuid=" + UUID.randomUUID().toString();
  }
  
  public static String hp(Context paramContext)
  {
    return paramContext.getSharedPreferences(paramContext.getPackageName() + "_preferences", 0).getString("last_login_uin", "0");
  }
  
  public static String hq(Context paramContext)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences(paramContext.getPackageName() + "_preferences", 0);
    Object localObject2 = localSharedPreferences.getString("login_weixin_username", "");
    Object localObject1 = localObject2;
    if (Util.oW((String)localObject2)) {
      localObject1 = localSharedPreferences.getString("login_user_name", "");
    }
    localObject2 = localObject1;
    if (Util.oW((String)localObject1)) {
      localObject2 = String.valueOf(Util.hl(paramContext));
    }
    return (String)localObject2;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/recovery/wx/util/WXUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */