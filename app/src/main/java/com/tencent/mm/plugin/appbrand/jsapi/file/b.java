package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.l;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

abstract class b<T extends d>
  extends a
{
  private static final ThreadPoolExecutor fQa = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingDeque());
  private final T fPZ;
  
  public b(T paramT)
  {
    this.fPZ = paramT;
    this.fPZ.fQc = this;
  }
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    fQa.submit(new b.1(this, paraml, paramJSONObject, paramInt));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/file/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */