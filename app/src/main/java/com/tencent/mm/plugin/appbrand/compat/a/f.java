package com.tencent.mm.plugin.appbrand.compat.a;

import android.content.Intent;
import com.tencent.mm.kernel.c.a;
import java.io.File;
import java.util.Map;
import java.util.Properties;

public abstract interface f
  extends a
{
  public abstract Properties A(File paramFile);
  
  public abstract String adP();
  
  public abstract int adQ();
  
  public abstract Intent adR();
  
  public abstract Map<String, String> adS();
  
  public abstract boolean bc(String paramString1, String paramString2);
  
  public abstract String v(Map<String, String> paramMap);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/compat/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */