package com.tencent.pb.common.b;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.tencent.pb.common.c.c;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;
import junit.framework.Assert;

public final class e
  implements b
{
  private static e vcg = null;
  private Vector<d> dJu = new Vector();
  private Vector<d> dJv = new Vector();
  private final Handler handler = new e.1(this, Looper.getMainLooper());
  private final SparseArray<Set<b>> vch = new SparseArray();
  private d vci = null;
  
  private void Lk()
  {
    if (this.dJv.size() > 0)
    {
      d locald = (d)this.dJv.get(0);
      int i = 1;
      while (i < this.dJv.size())
      {
        this.dJv.get(i);
        i += 1;
      }
      if (cEo())
      {
        this.dJv.remove(locald);
        b(locald);
      }
    }
  }
  
  private void b(d paramd)
  {
    int i;
    if (cEo())
    {
      this.dJu.add(paramd);
      if (paramd.vbZ == null)
      {
        c.x("MicroMsg.Voip", new Object[] { paramd.TAG2, "dosene reqData is null cmd=" + paramd.vcb });
        i = -1;
        if (i < 0)
        {
          c.x("MicroMsg.Voip", new Object[] { "doSceneImp do scene failed, ret %d,", Integer.valueOf(i) });
          this.handler.post(new e.2(this, paramd));
        }
      }
    }
    for (;;)
    {
      Lk();
      return;
      paramd.vbY = this;
      i locali = new i(paramd);
      i = f.cEq().a(null, locali, paramd.vcb, paramd.cEm(), paramd.vbZ, paramd.vcc);
      if (i >= 0) {
        paramd.mHandler.postDelayed(paramd.dJQ, 60000L);
      }
      c.d("MicroMsg.Voip", new Object[] { "NETTASK_SEND dosene:cmd ", paramd.cEm(), Integer.valueOf(i) });
      break;
      this.dJv.add(paramd);
    }
  }
  
  public static e cEn()
  {
    if (vcg == null) {}
    try
    {
      if (vcg == null) {
        vcg = new e();
      }
      return vcg;
    }
    finally {}
  }
  
  private boolean cEo()
  {
    return this.dJu.size() < 20;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, d paramd)
  {
    this.dJu.remove(paramd);
    Lk();
    this.handler.post(new e.3(this, paramd, paramInt1, paramInt2, paramString));
  }
  
  public final void a(int paramInt, b paramb)
  {
    if (this.vch.get(paramInt) == null) {
      this.vch.put(paramInt, new HashSet());
    }
    if (!((Set)this.vch.get(paramInt)).contains(paramb)) {
      ((Set)this.vch.get(paramInt)).add(paramb);
    }
  }
  
  public final boolean a(d paramd)
  {
    if (!h.isNetworkConnected())
    {
      int i = paramd.getType();
      if ((i == 102) || (i == 104) || (i == 103))
      {
        c.x("MicroMsg.Voip", new Object[] { "doScene do retain mReissueNetScene" });
        this.vci = paramd;
      }
    }
    Assert.assertTrue(true);
    if (paramd == null) {
      return false;
    }
    b(paramd);
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/pb/common/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */