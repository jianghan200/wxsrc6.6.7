package com.tencent.smtt.utils;

import java.io.File;

final class l
  implements j.a
{
  public final boolean a(File paramFile1, File paramFile2)
  {
    return (paramFile1.length() == paramFile2.length()) && (paramFile1.lastModified() == paramFile2.lastModified());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/smtt/utils/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */