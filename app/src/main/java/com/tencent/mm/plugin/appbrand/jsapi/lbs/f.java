package com.tencent.mm.plugin.appbrand.jsapi.lbs;

import android.os.Looper;
import android.os.Message;
import com.tencent.mm.plugin.appbrand.b.b.a;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.a.a;
import com.tencent.mm.plugin.appbrand.r.b.a.b;
import com.tencent.mm.sdk.d.c;
import com.tencent.mm.sdk.d.d;

final class f
  extends d
  implements b.a
{
  final l fFa;
  final b fRp;
  int fRq = 0;
  final c fRr = new c()
  {
    public final void enter()
    {
      super.enter();
      a.b.aoC().b(f.this.fRp);
      com.tencent.mm.plugin.appbrand.page.a.t(f.this.fFa.fdO).ln(f.this.fRq);
    }
    
    public final String getName()
    {
      return f.this.mName + "$StateNotListening";
    }
    
    public final boolean j(Message paramAnonymousMessage)
    {
      if (1 == paramAnonymousMessage.what)
      {
        f.this.b(f.this.fRs);
        return true;
      }
      return super.j(paramAnonymousMessage);
    }
  };
  final c fRs = new c()
  {
    public final void enter()
    {
      super.enter();
      a.b.aoC().a(f.this.fRp);
      f.this.fRq = com.tencent.mm.plugin.appbrand.page.a.t(f.this.fFa.fdO).a(a.a.glM);
    }
    
    public final void exit()
    {
      super.exit();
      a.b.aoC().b(f.this.fRp);
    }
    
    public final String getName()
    {
      return f.this.mName + "$StateListening";
    }
    
    public final boolean j(Message paramAnonymousMessage)
    {
      if (2 == paramAnonymousMessage.what)
      {
        f.this.b(f.this.fRr);
        return true;
      }
      if (3 == paramAnonymousMessage.what)
      {
        f.this.b(f.this.fRt);
        return true;
      }
      return super.j(paramAnonymousMessage);
    }
  };
  final c fRt = new c()
  {
    public final String getName()
    {
      return f.this.mName + "$StateListeningButSuspend";
    }
    
    public final boolean j(Message paramAnonymousMessage)
    {
      if (2 == paramAnonymousMessage.what)
      {
        f.this.b(f.this.fRr);
        return true;
      }
      if (4 == paramAnonymousMessage.what)
      {
        f.this.b(f.this.fRs);
        return true;
      }
      return super.j(paramAnonymousMessage);
    }
  };
  
  f(l paraml)
  {
    super("AppBrand$RuntimeLocationUpdateStateManager[" + paraml.mAppId + "]", Looper.getMainLooper());
    this.fFa = paraml;
    this.fRp = new b(paraml);
    paraml.fdO.fcL.a(this);
    a(this.fRr);
    a(this.fRs);
    a(this.fRt);
    b(this.fRr);
  }
  
  public final void a(com.tencent.mm.plugin.appbrand.b.a parama)
  {
    if (parama == com.tencent.mm.plugin.appbrand.b.a.fjh) {
      quit();
    }
    do
    {
      return;
      if (parama == com.tencent.mm.plugin.appbrand.b.a.fjg)
      {
        Dd(3);
        return;
      }
    } while (parama != com.tencent.mm.plugin.appbrand.b.a.fje);
    Dd(4);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/lbs/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */