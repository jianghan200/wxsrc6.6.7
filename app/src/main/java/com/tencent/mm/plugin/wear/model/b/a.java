package com.tencent.mm.plugin.wear.model.b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.sdk.platformtools.ad;

public final class a
{
  public static void L(Bundle paramBundle)
  {
    Intent localIntent = new Intent();
    localIntent.setPackage(ad.getContext().getPackageName());
    localIntent.setAction("com.tencent.mm.wear.message");
    localIntent.putExtras(paramBundle);
    ad.getContext().sendBroadcast(localIntent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wear/model/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */