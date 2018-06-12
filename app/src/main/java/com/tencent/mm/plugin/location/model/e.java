package com.tencent.mm.plugin.location.model;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.view.View;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public final class e
{
  public static String a(LocationInfo paramLocationInfo)
  {
    if (paramLocationInfo.bWB == null) {
      paramLocationInfo.bWB = "";
    }
    return "<msg><location x=\"" + paramLocationInfo.kCw + "\" y=\"" + paramLocationInfo.kCx + "\" scale=\"" + paramLocationInfo.kCy + "\" label=\"" + bi.WS(paramLocationInfo.kCz) + "\" poiname=\"" + bi.WS(paramLocationInfo.bWB) + "\" maptype=\"0\" /></msg>";
  }
  
  public static String a(String paramString1, String paramString2, View paramView)
  {
    x.d("MicroMsg.MapUtil", "w h " + paramView.getWidth() + " " + (paramView.getHeight() / 2 + 20));
    String str = paramString1 + paramString2 + ".png";
    Bitmap localBitmap = Bitmap.createBitmap(paramView.getWidth(), (int)(paramView.getHeight() * 0.7D), Bitmap.Config.ARGB_8888);
    paramView.draw(new Canvas(localBitmap));
    try
    {
      x.d("MicroMsg.MapUtil", "saveMyBitmap " + paramString2);
      paramString1 = new File(paramString1 + paramString2 + ".png");
      paramString1.createNewFile();
      try
      {
        paramString1 = new FileOutputStream(paramString1);
        x.d("MicroMsg.MapUtil", "h " + localBitmap.getHeight() + " w:" + localBitmap.getWidth() + " ");
        localBitmap.compress(Bitmap.CompressFormat.PNG, 100, paramString1);
        if (paramString1 == null) {}
      }
      catch (FileNotFoundException paramString1)
      {
        try
        {
          paramString1.flush();
          paramString1.close();
          localBitmap.recycle();
          return str;
          paramString1 = paramString1;
          x.printErrStackTrace("MicroMsg.MapUtil", paramString1, "", new Object[0]);
          paramString1 = null;
        }
        catch (IOException paramString1)
        {
          for (;;)
          {
            x.printErrStackTrace("MicroMsg.MapUtil", paramString1, "", new Object[0]);
          }
        }
      }
      return null;
    }
    catch (IOException paramString1)
    {
      x.printErrStackTrace("MicroMsg.MapUtil", paramString1, "", new Object[0]);
    }
  }
  
  public static PackageInfo aB(Context paramContext, String paramString)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 1);
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      x.printErrStackTrace("MicroMsg.MapUtil", paramContext, "", new Object[0]);
      return null;
    }
    catch (ActivityNotFoundException paramContext)
    {
      x.printErrStackTrace("MicroMsg.MapUtil", paramContext, "", new Object[0]);
    }
    return null;
  }
  
  public static boolean k(double paramDouble1, double paramDouble2)
  {
    return (Math.abs(paramDouble2) <= 180.0D) && (Math.abs(paramDouble1) <= 90.0D);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/location/model/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */