package com.tencent.mm.ui.tools;

import android.content.Context;
import com.tencent.mm.bp.a;
import com.tencent.mm.w.a.f;

public final class r
{
  public static int hd(Context paramContext)
  {
    if (Float.compare(a.fe(paramContext), 1.125F) > 0) {
      return a.f.unread_count_shape_large;
    }
    return a.f.unread_count_shape;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/tools/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */