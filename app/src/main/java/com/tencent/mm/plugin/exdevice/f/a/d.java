package com.tencent.mm.plugin.exdevice.f.a;

import android.graphics.Bitmap.CompressFormat;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.c;
import java.io.File;

public final class d
{
  private static final String ixp = e.dgt + "uploaded_photos/";
  private static final String ixq = e.dgt + "temp/";
  
  public static String Ac(String paramString)
  {
    if (bi.oW(paramString)) {}
    for (String str = "";; str = new File(aHr(), str).getAbsolutePath())
    {
      c.c(paramString, 640, 640, Bitmap.CompressFormat.JPEG, 100, str);
      System.currentTimeMillis();
      return str;
      str = ac.ce(paramString);
      str = str + "_t";
    }
  }
  
  public static File aHr()
  {
    File localFile = new File(ixp);
    if ((!localFile.exists()) || (!localFile.isDirectory())) {
      localFile.mkdirs();
    }
    return localFile;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/exdevice/f/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */