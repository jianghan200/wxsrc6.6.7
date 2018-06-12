package com.tencent.mm.plugin.appbrand.g.a;

import com.eclipsesource.v8.JavaCallback;
import com.eclipsesource.v8.JavaVoidCallback;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8ArrayBuffer;
import com.eclipsesource.v8.V8Object;

final class c
  extends b
{
  a gdW;
  
  c(a parama)
  {
    this.gdW = parama;
  }
  
  protected final void a(f paramf, V8Object paramV8Object)
  {
    paramV8Object.registerJavaMethod(new JavaCallback()
    {
      public final Object invoke(V8Object paramAnonymousV8Object, V8Array paramAnonymousV8Array)
      {
        return Integer.valueOf(c.this.gdW.aky());
      }
    }, "getNativeBufferId");
    paramV8Object.registerJavaMethod(new c.2(this, paramf), "getNativeBuffer");
    paramV8Object.registerJavaMethod(new JavaVoidCallback()
    {
      public final void invoke(V8Object paramAnonymousV8Object, V8Array paramAnonymousV8Array)
      {
        if ((paramAnonymousV8Array.length() < 2) || (paramAnonymousV8Array.getType(0) != 1) || (paramAnonymousV8Array.getType(1) != 10)) {}
        do
        {
          return;
          paramAnonymousV8Object = (V8ArrayBuffer)paramAnonymousV8Array.get(1);
        } while (paramAnonymousV8Object == null);
        c.this.gdW.a(paramAnonymousV8Array.getInteger(0), paramAnonymousV8Object.getBackingStore());
        paramAnonymousV8Object.release();
      }
    }, "setNativeBuffer");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/g/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */