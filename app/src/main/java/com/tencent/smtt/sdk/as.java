package com.tencent.smtt.sdk;

import java.io.File;
import java.io.FileFilter;

class as
  implements FileFilter
{
  as(ar paramar) {}
  
  public boolean accept(File paramFile)
  {
    return paramFile.getName().endsWith(".dex");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/smtt/sdk/as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */