package com.tencent.mm.bz;

import android.content.Context;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.xweb.WebView;

public final class a
{
  public static boolean hi(Context paramContext)
  {
    if ((WebView.isX5()) && (WebView.getUsingTbsCoreVersion(paramContext) <= 36541))
    {
      x.i("XWebUtil", "lower version of x5 not support source type ");
      return false;
    }
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/bz/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */