package com.tencent.mm.plugin.fav.ui;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;

public final class j
{
  public static boolean BC(String paramString)
  {
    if (bi.oW(paramString)) {}
    while (paramString.equals(ad.getContext().getResources().getString(m.i.location_sub_title_location_with_bracket))) {
      return false;
    }
    return true;
  }
  
  public static String C(Context paramContext, int paramInt)
  {
    int i = paramInt / 1000;
    if (i <= 0) {
      return paramContext.getString(m.i.favorite_voice_length, new Object[] { Integer.valueOf(0) });
    }
    paramInt = i / 60;
    i %= 60;
    if (paramInt == 0) {
      return paramContext.getString(m.i.favorite_voice_length, new Object[] { Integer.valueOf(i) });
    }
    return paramContext.getString(m.i.favorite_video_length, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
  }
  
  public static String D(Context paramContext, int paramInt)
  {
    return "[" + paramContext.getResources().getString(paramInt) + "]";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */