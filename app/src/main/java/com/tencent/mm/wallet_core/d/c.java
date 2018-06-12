package com.tencent.mm.wallet_core.d;

import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.sdk.platformtools.x;

public abstract class c<T extends d>
  implements e
{
  public int rtType;
  public e uXI;
  T uXJ;
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.d("MicroMsg.IDelayQueryOrder", "errType: %d, errCode: %d, errMsg: %s scene %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paraml });
    if (((paraml instanceof d)) && (!a(paramInt1, paramInt2, (d)paraml)) && (this.uXI != null) && (this.uXJ != null) && ((this.uXJ instanceof l))) {
      this.uXI.a(paramInt1, paramInt2, paramString, (l)this.uXJ);
    }
  }
  
  public abstract void a(d paramd);
  
  public abstract boolean a(int paramInt1, int paramInt2, T paramT);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/wallet_core/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */