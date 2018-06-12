package com.tencent.mm.plugin.card.d;

import android.content.Context;
import android.os.Build.VERSION;

public final class p
{
  public static void R(Context paramContext, String paramString)
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      new n();
      ((android.content.ClipboardManager)paramContext.getSystemService("clipboard")).setText(paramString);
      return;
    }
    new o();
    ((android.text.ClipboardManager)paramContext.getSystemService("clipboard")).setText(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/card/d/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */