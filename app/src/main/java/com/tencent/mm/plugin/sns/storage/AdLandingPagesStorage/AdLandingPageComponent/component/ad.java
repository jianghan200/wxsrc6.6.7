package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Environment;
import android.support.v4.content.d;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.tencent.mm.a.e;
import com.tencent.mm.loader.stub.b;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.ak;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

public final class ad
{
  private static Typeface nGd = null;
  
  public static void I(Activity paramActivity)
  {
    x.i("LandingPageUtil", "setFullScreen");
    int i = 514;
    if (!ak.gw(paramActivity)) {
      i = 1542;
    }
    for (;;)
    {
      int j = i;
      if (Build.VERSION.SDK_INT >= 19) {
        j = i | 0x1000;
      }
      paramActivity.getWindow().getDecorView().setSystemUiVisibility(j);
      return;
      x.i("LandingPageUtil", "has cut out");
    }
  }
  
  public static void J(Activity paramActivity)
  {
    x.i("LandingPageUtil", "exitFullScreen");
    int i = paramActivity.getWindow().getDecorView().getSystemUiVisibility();
    paramActivity.getWindow().getDecorView().setSystemUiVisibility(i & 0xF9F9);
  }
  
  public static String Na(String paramString)
  {
    String str;
    if (bi.oW(paramString)) {
      str = "";
    }
    String[] arrayOfString;
    do
    {
      do
      {
        return str;
        str = paramString;
      } while (!paramString.contains("_"));
      arrayOfString = paramString.split("_");
      str = paramString;
    } while (arrayOfString.length <= 0);
    return arrayOfString[(arrayOfString.length - 1)];
  }
  
  public static boolean Nb(String paramString)
  {
    return (paramString != null) && (paramString.length() >= 102400);
  }
  
  public static String Nc(String paramString)
  {
    if (bi.oW(paramString)) {
      paramString = "";
    }
    for (;;)
    {
      return paramString;
      File localFile = new File(b.duO.replace("/data/user/0", "/data/data"), "tmpLargeCanvasDir");
      if (!localFile.exists()) {
        localFile.mkdirs();
      }
      try
      {
        byte[] arrayOfByte = paramString.getBytes("UTF-8");
        paramString = new File(localFile, System.currentTimeMillis()).getAbsolutePath();
        int i = e.b(paramString, arrayOfByte, arrayOfByte.length);
        if (i == 0) {}
      }
      catch (Exception paramString)
      {
        for (;;)
        {
          x.e("LandingPageUtil", "writeTempCanvasXmlToLocal fail");
        }
      }
    }
    return "";
  }
  
  public static String Nd(String paramString)
  {
    if (bi.oW(paramString)) {
      return "";
    }
    try
    {
      File localFile = new File(paramString);
      if (!localFile.exists()) {
        return "";
      }
      paramString = e.ct(paramString);
      localFile.delete();
      return paramString;
    }
    catch (Exception paramString)
    {
      x.e("LandingPageUtil", "readTempCanvasXmlFromLocalAndDeleteIt fail");
    }
    return "";
  }
  
  public static int au(float paramFloat)
  {
    int j = (int)paramFloat;
    int i = j;
    if (paramFloat - j > 0.001D) {
      i = j + 1;
    }
    return i;
  }
  
  public static int[] ee(Context paramContext)
  {
    paramContext = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    Point localPoint;
    int j;
    if (Build.VERSION.SDK_INT >= 13)
    {
      localPoint = new Point();
      paramContext.getRealSize(localPoint);
      j = localPoint.x;
    }
    for (int i = localPoint.y;; i = paramContext.getHeight())
    {
      return new int[] { j, i };
      j = paramContext.getWidth();
    }
  }
  
  public static void ef(Context paramContext)
  {
    d.O(paramContext).a(new Intent("com.tencent.mm.adlanding.set_uioption"));
  }
  
  public static Typeface eg(Context paramContext)
  {
    if (nGd == null) {
      nGd = Typeface.createFromAsset(paramContext.getAssets(), "fonts/WeChatNum.ttf");
    }
    return nGd;
  }
  
  public static Bitmap getBitmap(String paramString)
  {
    String str = Environment.getExternalStorageDirectory().toString() + "/tencent/MicroMsg/sns_ad_landingpages";
    paramString = "adId" + "_image_" + ac.ce(paramString);
    paramString = str + "/" + paramString;
    if (FileOp.cn(paramString)) {
      return BackwardSupportUtil.b.e(paramString, 1.0F);
    }
    return null;
  }
  
  public static String l(String paramString, String... paramVarArgs)
  {
    try
    {
      URI localURI = new URI(paramString);
      Object localObject = new StringBuilder();
      int j = paramVarArgs.length;
      int i = 0;
      while (i < j)
      {
        ((StringBuilder)localObject).append(paramVarArgs[i]).append("&");
        i += 1;
      }
      if (((StringBuilder)localObject).length() > 1)
      {
        paramVarArgs = ((StringBuilder)localObject).deleteCharAt(((StringBuilder)localObject).length() - 1);
        localObject = localURI.getQuery();
        if (localObject == null) {}
        for (paramVarArgs = paramVarArgs.toString();; paramVarArgs = (String)localObject + "&" + paramVarArgs.toString()) {
          return new URI(localURI.getScheme(), localURI.getAuthority(), localURI.getPath(), paramVarArgs, localURI.getFragment()).toString();
        }
      }
      return paramString;
    }
    catch (URISyntaxException paramVarArgs)
    {
      x.printErrStackTrace("LandingPageUtil", paramVarArgs, "", new Object[0]);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */