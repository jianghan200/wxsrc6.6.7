package com.tencent.tmassistantsdk.util;

import android.content.Context;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Field;

public class Res
{
  private static final String TAG = "Res";
  protected final String RclassName;
  protected Context ctx;
  
  public Res(Context paramContext)
  {
    this.ctx = paramContext;
    this.RclassName = (this.ctx.getPackageName() + ".R");
  }
  
  private int reflectResouce(String paramString1, String paramString2)
  {
    if ((this.RclassName == null) || (paramString1 == null) || (paramString2 == null)) {
      return 0;
    }
    try
    {
      paramString1 = Class.forName(this.RclassName + "$" + paramString1);
      int i = bi.getInt(paramString1.getField(paramString2).get(paramString1.newInstance()).toString(), -1);
      return i;
    }
    catch (Exception paramString1)
    {
      x.printErrStackTrace("Res", paramString1, "", new Object[0]);
    }
    return -1;
  }
  
  public int drawable(String paramString)
  {
    return reflectResouce("drawable", paramString);
  }
  
  public int id(String paramString)
  {
    return reflectResouce("id", paramString);
  }
  
  public int layout(String paramString)
  {
    return reflectResouce("layout", paramString);
  }
  
  public int string(String paramString)
  {
    return reflectResouce("string", paramString);
  }
  
  public int style(String paramString)
  {
    return reflectResouce("style", paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tmassistantsdk/util/Res.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */