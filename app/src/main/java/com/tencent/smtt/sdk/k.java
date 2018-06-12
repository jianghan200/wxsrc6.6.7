package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Handler;

final class k
  extends Thread
{
  k(Context paramContext, Handler paramHandler) {}
  
  public final void run()
  {
    if (an.a().a(true, this.a) == 0) {
      an.a().b(this.a, true);
    }
    o.a(true).a(this.a, false, false, null);
    bv localbv = bv.a();
    localbv.a(this.a, null);
    boolean bool = localbv.b();
    this.b.sendEmptyMessage(3);
    if (!bool)
    {
      this.b.sendEmptyMessage(2);
      return;
    }
    this.b.sendEmptyMessage(1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/smtt/sdk/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */