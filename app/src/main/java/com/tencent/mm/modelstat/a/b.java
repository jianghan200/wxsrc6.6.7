package com.tencent.mm.modelstat.a;

import android.os.Bundle;
import com.tencent.mm.sdk.platformtools.x;

public final class b
{
  public static Bundle no(String paramString)
  {
    x.v("MicroMsg.WebViewMMReportUtil", "create webview bundle name[%s]", new Object[] { paramString });
    Bundle localBundle = new Bundle();
    localBundle.putString("mm_event_class", paramString);
    return localBundle;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/modelstat/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */