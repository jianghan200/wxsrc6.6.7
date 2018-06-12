package com.tencent.mm.plugin.address.model;

import com.tencent.mm.ab.o;
import com.tencent.mm.ac.d;
import com.tencent.mm.ac.f;
import com.tencent.mm.g.a.mi;
import com.tencent.mm.g.a.mi.a;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.address.d.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class k
  extends c<mi>
  implements com.tencent.mm.ab.e
{
  private mi eXK;
  private d eXL;
  
  public k()
  {
    this.sFo = mi.class.getName().hashCode();
  }
  
  private void A(int paramInt, boolean paramBoolean)
  {
    x.d("MicroMsg.RcptGetAddrEventListener", "setResult errCode[%s], isAccept[%s]", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    this.eXK.bXb.errCode = paramInt;
    if (paramInt != 0) {
      this.eXK.bXb.bXc = false;
    }
    for (;;)
    {
      if (this.eXK.bJX != null) {
        this.eXK.bJX.run();
      }
      au.DF().b(417, this);
      return;
      Object localObject;
      if (!paramBoolean)
      {
        localObject = this.eXL;
        if (localObject != null)
        {
          ((d)localObject).field_brandFlag &= 0xFFFFFFF7;
          f.g((d)localObject);
        }
        this.eXK.bXb.bXc = false;
      }
      else
      {
        localObject = this.eXL;
        if (localObject != null)
        {
          ((d)localObject).field_brandFlag |= 0x8;
          f.g((d)localObject);
        }
        this.eXK.bXb.bXc = true;
        com.tencent.mm.plugin.address.a.a.Zv();
        localObject = com.tencent.mm.plugin.address.a.a.Zx().eXO;
        if (((com.tencent.mm.plugin.address.d.a)localObject).eXW.size() > 0)
        {
          localObject = (b)((com.tencent.mm.plugin.address.d.a)localObject).eXW.getFirst();
          this.eXK.bXb.bXd = ((b)localObject).eYf;
          this.eXK.bXb.userName = ((b)localObject).eYd;
          this.eXK.bXb.bXe = ((b)localObject).eYe;
          this.eXK.bXb.bXf = ((b)localObject).eYb;
          this.eXK.bXb.bXg = ((b)localObject).eXY;
          this.eXK.bXb.bXh = ((b)localObject).eXZ;
          this.eXK.bXb.bXi = ((b)localObject).eYa;
          this.eXK.bXb.bXj = ((b)localObject).eYc;
        }
      }
    }
  }
  
  private boolean a(mi parammi)
  {
    if ((parammi instanceof mi))
    {
      this.eXK = parammi;
      au.DF().a(417, this);
      parammi = new e(this.eXK.bXa.url, this.eXK.bXa.appId, 1);
      au.DF().a(parammi, 0);
    }
    return true;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    x.d("MicroMsg.RcptGetAddrEventListener", "onSceneEnd errType[%s], errCode[%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paraml instanceof e))
    {
      if (paramInt2 == 0) {
        A(paramInt2, true);
      }
    }
    else {
      return;
    }
    A(paramInt2, false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/address/model/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */