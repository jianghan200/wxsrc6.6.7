package com.tencent.mm.plugin.wallet_index.ui;

import android.content.Context;
import android.os.Bundle;
import com.tencent.mm.opensdk.channel.MMessageActV2;
import com.tencent.mm.opensdk.channel.MMessageActV2.Args;
import com.tencent.mm.opensdk.modelpay.PayReq.Options;
import com.tencent.mm.opensdk.modelpay.PayResp;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class e
{
  public static boolean a(Context paramContext, String paramString, PayResp paramPayResp, PayReq.Options paramOptions)
  {
    x.d("MicroMsg.PayCallbackHelper", "callback, packageName = " + paramString);
    String str;
    if ((paramOptions == null) || (bi.oW(paramOptions.callbackClassName)))
    {
      str = paramString + ".wxapi.WXPayEntryActivity";
      if ((paramOptions != null) && (paramOptions.callbackFlags != -1)) {
        break label186;
      }
    }
    label186:
    for (int i = 268435456;; i = paramOptions.callbackFlags)
    {
      x.d("MicroMsg.PayCallbackHelper", "callback, cbPkg = " + paramString + ", cbCls = " + str + ", cbFlags(hex) = " + Integer.toHexString(i));
      paramOptions = new Bundle();
      paramOptions.putString("wx_token_key", "com.tencent.mm.openapi.token");
      if (paramPayResp != null) {
        paramPayResp.toBundle(paramOptions);
      }
      paramPayResp = new MMessageActV2.Args();
      paramPayResp.targetPkgName = paramString;
      paramPayResp.targetClassName = str;
      paramPayResp.bundle = paramOptions;
      paramPayResp.flags = i;
      return MMessageActV2.send(paramContext, paramPayResp);
      str = paramOptions.callbackClassName;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_index/ui/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */