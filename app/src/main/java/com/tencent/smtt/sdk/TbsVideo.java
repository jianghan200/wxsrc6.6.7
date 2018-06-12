package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.e.a.a.b;

public class TbsVideo
{
  public static boolean canUseTbsPlayer(Context paramContext)
  {
    return be.a(paramContext).a();
  }
  
  public static boolean canUseYunbo(Context paramContext)
  {
    return (be.a(paramContext).a()) && (QbSdk.canUseVideoFeatrue(paramContext, 1));
  }
  
  public static void openVideo(Context paramContext, String paramString)
  {
    openVideo(paramContext, paramString, null);
  }
  
  public static void openVideo(Context paramContext, String paramString, Bundle paramBundle)
  {
    if (TextUtils.isEmpty(paramString)) {
      return;
    }
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    localBundle.putString("videoUrl", paramString);
    paramString = new Intent("com.tencent.smtt.tbs.video.PLAY");
    paramString.setFlags(268435456);
    paramString.setPackage(paramContext.getPackageName());
    paramString.putExtra("extraData", localBundle);
    paramContext.startActivity(paramString);
  }
  
  public static boolean openYunboVideo(Context paramContext, String paramString, Bundle paramBundle, b paramb)
  {
    if (canUseYunbo(paramContext)) {
      return be.a(paramContext).a(paramString, paramBundle, paramb);
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/smtt/sdk/TbsVideo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */