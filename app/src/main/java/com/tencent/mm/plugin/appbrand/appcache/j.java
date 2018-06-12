package com.tencent.mm.plugin.appbrand.appcache;

import android.os.Looper;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.d.c;
import com.tencent.mm.sdk.d.d;
import com.tencent.mm.sdk.platformtools.x;

public final class j
  extends d
  implements Runnable
{
  private final String ffA;
  private final c ffB = new j.1(this);
  private final c ffC = new j.2(this);
  final c ffD = new c()
  {
    public final void enter()
    {
      super.enter();
      x.i("MicroMsg.LibIncrementalTestCase[incremental]", "FetchNewestLibAndDoIncremental enter");
      ac.cv(true);
      g.Eh().dpP.a(1168, new j.3.1(this));
    }
  };
  private final int ffz;
  
  public j(int paramInt, String paramString)
  {
    super("LibIncrementalTestCase", Looper.getMainLooper());
    this.ffz = paramInt;
    this.ffA = paramString;
  }
  
  protected final void abD()
  {
    super.abD();
    x.i("MicroMsg.LibIncrementalTestCase[incremental]", "TestCase onQuitting");
  }
  
  public final void run()
  {
    a(this.ffB);
    a(this.ffC);
    a(this.ffD);
    b(this.ffB);
    start();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */