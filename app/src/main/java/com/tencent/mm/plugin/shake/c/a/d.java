package com.tencent.mm.plugin.shake.c.a;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class d
{
  public float cXm = -85.0F;
  public float cXn = -1000.0F;
  Map<String, Object> htT = new HashMap();
  int mXk = 0;
  long mXl = 0L;
  String mXm = "";
  
  public d()
  {
    this.htT.clear();
  }
  
  public final void putValue(String paramString, Object paramObject)
  {
    if (TextUtils.isEmpty(paramString)) {
      return;
    }
    this.htT.put(paramString, paramObject);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/shake/c/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */