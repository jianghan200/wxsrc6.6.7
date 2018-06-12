package com.tencent.mm.plugin.collect.b;

import android.app.Dialog;
import android.content.Context;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.op;
import com.tencent.mm.g.a.op.a;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;

public final class u
  extends com.tencent.mm.sdk.b.c<op>
{
  Dialog eBX;
  
  public u()
  {
    this.sFo = op.class.getName().hashCode();
  }
  
  private boolean a(op paramop)
  {
    x.i("MicroMsg.ScanMaterialCodeListener", "scan material code type: %s", new Object[] { Integer.valueOf(paramop.bZx.type) });
    if ((paramop.bZx.YC == null) || (paramop.bZx.YC.get() == null))
    {
      x.i("MicroMsg.ScanMaterialCodeListener", "context has destroyed");
      paramop.bZx.bJX.run();
      return false;
    }
    Object localObject = (Context)paramop.bZx.YC.get();
    if (paramop.bZx.type == 0)
    {
      this.eBX = com.tencent.mm.wallet_core.ui.g.a((Context)localObject, false, null);
      localObject = new k(paramop.bZx.bZz, paramop.bZx.scene);
      com.tencent.mm.kernel.g.DF().a(1800, new u.1(this, paramop));
      com.tencent.mm.kernel.g.DF().a((l)localObject, 0);
      return false;
    }
    if (paramop.bZx.type == 1)
    {
      this.eBX = com.tencent.mm.wallet_core.ui.g.a((Context)localObject, false, null);
      localObject = new com.tencent.mm.plugin.collect.reward.a.c(paramop.bZx.bZz, paramop.bZx.scene);
      com.tencent.mm.kernel.g.DF().a(2811, new u.2(this, paramop));
      com.tencent.mm.kernel.g.DF().a((l)localObject, 0);
      return false;
    }
    x.w("MicroMsg.ScanMaterialCodeListener", "unknown type: %d", new Object[] { Integer.valueOf(paramop.bZx.type) });
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/collect/b/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */