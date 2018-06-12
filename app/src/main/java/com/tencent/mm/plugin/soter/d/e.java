package com.tencent.mm.plugin.soter.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.SparseArray;
import com.tencent.d.a.c.f;
import com.tencent.d.b.b.a;
import com.tencent.d.b.f.i;
import com.tencent.mm.plugin.soter.c.h;
import com.tencent.mm.sdk.platformtools.x;

public final class e
  extends i
{
  public e(Context paramContext, com.tencent.d.b.f.e parame)
  {
    super(paramContext, parame);
  }
  
  @SuppressLint({"DefaultLocale"})
  protected final void b(String paramString, int[] paramArrayOfInt)
  {
    x.v("MicroMsg.SoterTaskInitForWX", "alvinluo generateAuthKeyNames");
    int j = paramArrayOfInt.length;
    int i = 0;
    if (i < j)
    {
      int k = paramArrayOfInt[i];
      if (k == 1) {}
      for (String str = h.bFk();; str = String.format("SoterAuthKey_salt%s_scene%d", new Object[] { f.oV(paramString), Integer.valueOf(k) }))
      {
        x.i("MicroMsg.SoterTaskInitForWX", "alvinluo scene: %d, authKeyName: %s", new Object[] { Integer.valueOf(k), str });
        a.cFO().cFQ().put(k, str);
        i += 1;
        break;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/soter/d/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */