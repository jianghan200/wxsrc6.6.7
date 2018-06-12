package com.tencent.mm.plugin.soter_mp.a;

import android.app.Activity;
import com.tencent.mm.plugin.soter_mp.b.d;
import com.tencent.mm.plugin.soter_mp.b.e;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;

public final class a
  extends Enum<a>
{
  public static c a(Activity paramActivity, d paramd, e parame)
  {
    if (((paramd.oot & 0x1) != 0) && (com.tencent.d.a.a.hy(ad.getContext()))) {
      return new b(new WeakReference(paramActivity), paramd, parame);
    }
    x.e("MicroMsg.SoterControllerFactory", "hy: no matching: %d", new Object[] { Byte.valueOf(paramd.oot) });
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/soter_mp/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */