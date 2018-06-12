package com.tencent.mm.plugin.websearch.api;

import android.content.Context;
import com.tencent.mm.kernel.c.a;
import java.util.Map;

public abstract interface f
  extends a
{
  public abstract void a(Context paramContext, int paramInt, String paramString1, String paramString2, Map<String, String> paramMap, String paramString3);
  
  public abstract void a(Context paramContext, String paramString1, String paramString2, Map<String, String> paramMap);
  
  public abstract void b(Context paramContext, int paramInt, String paramString1, String paramString2);
  
  public abstract void b(Context paramContext, String paramString1, String paramString2, Map<String, String> paramMap);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/websearch/api/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */