package com.tencent.mm.plugin.appbrand.g.a;

import android.util.Pair;
import com.eclipsesource.v8.JavaVoidCallback;
import com.tencent.xweb.d;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class i
{
  j fef;
  public final HashMap<Integer, f> geA = new HashMap();
  private a geB = new i.4(this);
  private final AtomicInteger gez = new AtomicInteger(0);
  
  public i(j paramj)
  {
    this.fef = paramj;
  }
  
  public final int a(Pair<String, String>... paramVarArgs)
  {
    int j = this.gez.addAndGet(1);
    f localf = new f(this.geB);
    Object localObject1 = new i.2(this, j);
    localf.gem.r(new f.5(localf, (JavaVoidCallback)localObject1, "postMessage"));
    localObject1 = new i.1(this, localf);
    localf.gem.gex = ((d)localObject1);
    int i = 0;
    while (i < 5)
    {
      Object localObject2 = paramVarArgs[i];
      if ((localObject2 != null) && (((Pair)localObject2).second != null) && (((String)((Pair)localObject2).second).length() != 0))
      {
        localObject1 = (String)((Pair)localObject2).first;
        localObject2 = (String)((Pair)localObject2).second;
        localf.gem.r(new f.4(localf, (String)localObject2, (String)localObject1));
      }
      i += 1;
    }
    this.geA.put(Integer.valueOf(j), localf);
    return j;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/g/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */