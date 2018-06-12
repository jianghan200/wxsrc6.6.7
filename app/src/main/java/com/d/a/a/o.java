package com.d.a.a;

import android.os.Environment;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

final class o
{
  private static String bju;
  private static final SimpleDateFormat bjv = new SimpleDateFormat("yyyy-MM-dd,HH:mm:ss", Locale.US);
  private static final SimpleDateFormat bjw = new SimpleDateFormat("yyyMMddHHmmss", Locale.US);
  
  protected static boolean q(String paramString1, String paramString2)
  {
    String str = null;
    if (bju == null)
    {
      boolean bool1;
      if (Environment.getExternalStorageState().equals("mounted"))
      {
        File localFile = new File(Environment.getExternalStorageDirectory() + "/" + y.bmM);
        boolean bool2 = localFile.exists();
        bool1 = bool2;
        if (!bool2) {
          bool1 = localFile.mkdir();
        }
        if (bool1) {
          str = localFile.toString();
        }
        bju = str;
      }
      while (!bool1)
      {
        return false;
        bju = null;
        bool1 = false;
      }
    }
    try
    {
      paramString1 = new FileWriter(bju + "/" + paramString1 + ".txt", true);
      paramString1.write("\n" + bjv.format(new Date()) + ',' + paramString2);
      paramString1.flush();
      paramString1.close();
      return true;
    }
    catch (Exception paramString1) {}
    return false;
  }
  
  protected static String sB()
  {
    return bjw.format(new Date());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/d/a/a/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */