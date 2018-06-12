package com.tencent.smtt.utils;

import java.io.InputStream;
import java.util.zip.ZipEntry;

final class k
  implements j.b
{
  k(String paramString) {}
  
  public final boolean a(InputStream paramInputStream, ZipEntry paramZipEntry, String paramString)
  {
    try
    {
      boolean bool = j.a(paramInputStream, paramZipEntry, this.a, paramString);
      return bool;
    }
    catch (Exception paramInputStream)
    {
      throw new Exception("copyFileIfChanged Exception", paramInputStream);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/smtt/utils/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */