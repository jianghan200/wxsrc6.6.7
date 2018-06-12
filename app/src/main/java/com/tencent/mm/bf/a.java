package com.tencent.mm.bf;

import android.os.Build.VERSION;
import com.tencent.mm.w.a.f;

public final class a
{
  public static int cbg()
  {
    if (Build.VERSION.SDK_INT < 19) {
      return a.f.notification_icon;
    }
    return a.f.notification_icon_gray;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/bf/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */