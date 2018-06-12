package com.tencent.tencentmap.mapsdk.a;

import android.os.Environment;
import java.io.File;

public class qe
{
  public static boolean a = false;
  public static final String b = a() + "/js/nicolas/xkun/dynamic_map";
  
  public static String a()
  {
    File localFile = Environment.getExternalStorageDirectory();
    String str = "/sdcard";
    if (localFile != null) {
      str = localFile.getPath();
    }
    return str;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/qe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */