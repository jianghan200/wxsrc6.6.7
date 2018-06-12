package com.tencent.mm.pluginsdk.e;

import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;

public final class a
{
  public static Bundle SJ(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("key_scene", 1);
    paramString = paramString.split("&");
    if ((paramString == null) || (paramString.length == 0))
    {
      x.e("MicroMsg.MallManager", "getWapPayBundle arrKeys == null || arrKeys.length == 0");
      return localBundle;
    }
    HashMap localHashMap = new HashMap();
    int i = 0;
    while (i < paramString.length)
    {
      Object localObject = paramString[i];
      if (!TextUtils.isEmpty((CharSequence)localObject))
      {
        localObject = ((String)localObject).split("=");
        if ((localObject != null) && (localObject.length == 2)) {
          localHashMap.put(localObject[0], localObject[1]);
        }
      }
      i += 1;
    }
    localBundle.putString("_wxapi_payreq_appid", b("appid", localHashMap));
    localBundle.putString("_wxapi_payreq_partnerid", b("partnerid", localHashMap));
    localBundle.putString("_wxapi_payreq_prepayid", b("prepayid", localHashMap));
    localBundle.putString("_wxapi_payreq_noncestr", b("noncestr", localHashMap));
    localBundle.putString("_wxapi_payreq_timestamp", b("timestamp", localHashMap));
    localBundle.putString("_wxapi_payreq_packagevalue", b("package", localHashMap));
    localBundle.putString("_wxapi_payreq_sign", b("sign", localHashMap));
    localBundle.putString("_wxapi_payreq_sign_type", b("signtype", localHashMap));
    localBundle.putString("_wxapi_payreq_extdata", b("extdata", localHashMap));
    localBundle.putString("_wxapi_payoptions_callback_classname", "");
    localBundle.putInt("_wxapi_payoptions_callback_flags", -1);
    return localBundle;
  }
  
  private static String b(String paramString, HashMap<String, String> paramHashMap)
  {
    String str = (String)paramHashMap.get(paramString);
    paramHashMap = str;
    if (TextUtils.isEmpty(str))
    {
      x.e("MicroMsg.MallManager", "getWapPayKey key: " + paramString + " value is empty");
      paramHashMap = "";
    }
    return paramHashMap;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/pluginsdk/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */