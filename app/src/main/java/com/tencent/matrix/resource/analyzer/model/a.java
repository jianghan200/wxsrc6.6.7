package com.tencent.matrix.resource.analyzer.model;

import com.tencent.matrix.resource.a.a.b;
import java.io.File;
import java.io.Serializable;

public final class a
  implements Serializable
{
  public final File brs;
  public final String brt;
  public final String mActivityName;
  
  public a(File paramFile, String paramString1, String paramString2)
  {
    this.brs = ((File)b.e(paramFile, "hprofFile"));
    this.brt = ((String)b.e(paramString1, "refKey"));
    this.mActivityName = ((String)b.e(paramString2, "activityName"));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/resource/analyzer/model/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */