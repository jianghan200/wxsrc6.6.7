package com.tencent.mm.plugin.appbrand.g.a;

import com.eclipsesource.v8.JavaCallback;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Function;
import com.eclipsesource.v8.V8Object;
import com.eclipsesource.v8.utils.V8ObjectUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicInteger;

final class e
  extends b
{
  final AtomicInteger gea = new AtomicInteger(0);
  final HashMap<Integer, a> geb = new HashMap();
  
  protected final void a(final f paramf, V8Object paramV8Object)
  {
    paramV8Object.registerJavaMethod(new JavaCallback()
    {
      public final Object invoke(V8Object paramAnonymousV8Object, V8Array paramAnonymousV8Array)
      {
        if ((paramAnonymousV8Array.length() <= 0) || (paramAnonymousV8Array.getType(0) != 7)) {
          return null;
        }
        V8Function localV8Function = (V8Function)paramAnonymousV8Array.getObject(0);
        int i;
        if (paramAnonymousV8Array.length() > 1)
        {
          if (paramAnonymousV8Array.getType(1) != 1) {
            return null;
          }
          i = paramAnonymousV8Array.getInteger(1);
          if (paramAnonymousV8Array.length() <= 2) {
            break label188;
          }
          paramAnonymousV8Object = V8ObjectUtils.toList(paramAnonymousV8Array);
        }
        label188:
        for (paramAnonymousV8Object = V8ObjectUtils.toV8Array(paramf.gek, paramAnonymousV8Object.subList(2, paramAnonymousV8Object.size() - 1));; paramAnonymousV8Object = new V8Array(paramf.gek))
        {
          paramAnonymousV8Array = e.this;
          f localf = paramf;
          Timer localTimer = new Timer();
          Integer localInteger = Integer.valueOf(paramAnonymousV8Array.gea.addAndGet(1));
          paramAnonymousV8Object = new e.a(paramAnonymousV8Array, localTimer, localInteger.intValue(), localV8Function, paramAnonymousV8Object);
          localTimer.schedule(new e.5(paramAnonymousV8Array, localf, paramAnonymousV8Object), i);
          paramAnonymousV8Array.geb.put(localInteger, paramAnonymousV8Object);
          return Integer.valueOf(localInteger.intValue());
          i = 0;
          break;
        }
      }
    }, "setTimeout");
    paramV8Object.registerJavaMethod(new e.2(this, paramf), "setInterval");
    paramV8Object.registerJavaMethod(new e.3(this), "clearTimeout");
    paramV8Object.registerJavaMethod(new e.4(this), "clearInterval");
  }
  
  private final class a
  {
    V8Function geg;
    V8Array geh;
    Timer gei;
    boolean gej = false;
    int id;
    
    public a(Timer paramTimer, int paramInt, V8Function paramV8Function, V8Array paramV8Array)
    {
      this.geg = paramV8Function;
      this.geh = paramV8Array;
      this.id = paramInt;
      this.gei = paramTimer;
    }
    
    public final void cX(boolean paramBoolean)
    {
      if (!this.geg.isReleased()) {
        this.geg.call(null, this.geh);
      }
      if (paramBoolean) {
        cleanup();
      }
    }
    
    final void cleanup()
    {
      e.this.geb.remove(Integer.valueOf(this.id));
      this.geg.release();
      this.geh.release();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/g/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */