package com.tencent.mm.pluginsdk.f;

import android.content.ClipData;
import android.content.Context;
import android.os.Build.VERSION;

public final class a
{
  public static void a(Context paramContext, CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      new b();
      ((android.content.ClipboardManager)paramContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(paramCharSequence1, paramCharSequence2));
      return;
    }
    new c();
    ((android.text.ClipboardManager)paramContext.getSystemService("clipboard")).setText(paramCharSequence2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/pluginsdk/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */