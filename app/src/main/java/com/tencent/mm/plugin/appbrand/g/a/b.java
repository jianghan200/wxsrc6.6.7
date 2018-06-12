package com.tencent.mm.plugin.appbrand.g.a;

import android.text.TextUtils;
import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.V8Object;

abstract class b
{
  private final String mKey;
  
  b()
  {
    this("");
  }
  
  b(String paramString)
  {
    this.mKey = paramString;
  }
  
  final b a(f paramf)
  {
    if (TextUtils.isEmpty(this.mKey))
    {
      a(paramf, paramf.gek);
      return this;
    }
    V8Object localV8Object = new V8Object(paramf.gek);
    paramf.gek.add(this.mKey, localV8Object);
    a(paramf, localV8Object);
    return this;
  }
  
  protected abstract void a(f paramf, V8Object paramV8Object);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/g/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */