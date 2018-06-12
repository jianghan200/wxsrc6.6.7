package com.tencent.mm.compatible.j;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.tencent.mm.compatible.a.a;
import com.tencent.mm.sdk.platformtools.x;

public final class b
{
  public static boolean k(Activity paramActivity)
  {
    Intent localIntent = new Intent("android.media.action.VIDEO_CAPTURE");
    localIntent.putExtra("android.intent.extra.videoQuality", 0);
    a.a(8, new b.1(localIntent));
    try
    {
      paramActivity.startActivityForResult(localIntent, 4372);
      return true;
    }
    catch (ActivityNotFoundException paramActivity)
    {
      x.printErrStackTrace("MicroMsg.TakeVideoUtil", paramActivity, "", new Object[0]);
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/compatible/j/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */