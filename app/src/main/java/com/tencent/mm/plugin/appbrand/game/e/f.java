package com.tencent.mm.plugin.appbrand.game.e;

import android.support.v4.e.i.a;
import java.util.concurrent.ConcurrentLinkedQueue;

public abstract class f<T>
  implements i.a<T>
{
  public ConcurrentLinkedQueue<T> fDo = new ConcurrentLinkedQueue();
  
  public abstract T agm();
  
  public T bW()
  {
    Object localObject2 = this.fDo.poll();
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = agm();
    }
    return (T)localObject1;
  }
  
  public final boolean j(T paramT)
  {
    return this.fDo.offer(paramT);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/game/e/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */