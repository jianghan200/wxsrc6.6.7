package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.mm.bu.a;
import com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX.Req;
import com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX.Resp;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;

public final class as
  implements ad
{
  private static k<ad, Bundle> tNy = new as.1();
  private Context context;
  private final Map<String, ShowMessageFromWX.Req> tNB = new HashMap();
  
  public as(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public static void ah(Bundle paramBundle)
  {
    tNy.ci(paramBundle);
    tNy.doNotify();
  }
  
  public final void a(String paramString1, WXMediaMessage paramWXMediaMessage, String paramString2, String paramString3)
  {
    x.d("MicroMsg.WXAppMessageShower", "request pkg = %s, openId = %s", new Object[] { paramString1, paramString3 });
    a.post(new as.2(this, paramWXMediaMessage, paramString3, paramString1, paramString2));
  }
  
  public final void ag(Bundle paramBundle)
  {
    String str = Uri.parse(paramBundle.getString("_mmessage_content")).getQueryParameter("appid");
    x.d("MicroMsg.WXAppMessageShower", "handleResp, appid = " + str);
    paramBundle = new ShowMessageFromWX.Resp(paramBundle);
    x.i("MicroMsg.WXAppMessageShower", "handleResp, errCode = " + paramBundle.errCode + ", type = " + paramBundle.getType());
    if ((ShowMessageFromWX.Req)this.tNB.get(paramBundle.transaction) == null)
    {
      x.e("MicroMsg.WXAppMessageShower", "invalid resp, check transaction failed, transaction=" + paramBundle.transaction);
      return;
    }
    this.tNB.remove(paramBundle.transaction);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/chatting/as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */