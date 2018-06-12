package com.tencent.mm.s;

import android.util.SparseArray;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.HashMap;

public final class c
  implements ar
{
  private static c dlL;
  private a dlM;
  
  private c()
  {
    if (a.dlr == null) {
      a.dlr = new a();
    }
    this.dlM = a.dlr;
  }
  
  public static a Cp()
  {
    g.Eg().Ds();
    if (dlL == null)
    {
      c localc = new c();
      dlL = localc;
      localc.dlM.init();
    }
    return dlL.dlM;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void bn(boolean paramBoolean)
  {
    this.dlM.init();
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    a locala = this.dlM;
    locala.dlt.clear();
    b localb = locala.dls;
    x.d("MicroMsg.NewBadgeDecoder", "[carl] decoder.clear()");
    localb.dlB.clear();
    localb.dlD.clear();
    localb.dlC.clear();
    localb.dlE.clear();
    locala.initialized = false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/s/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */