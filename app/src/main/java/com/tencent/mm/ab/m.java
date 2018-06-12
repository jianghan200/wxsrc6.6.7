package com.tencent.mm.ab;

import com.tencent.mm.model.av;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.amt;
import com.tencent.mm.protocal.c.avs;
import com.tencent.mm.protocal.c.iz;
import com.tencent.mm.sdk.platformtools.x;

public abstract class m
  extends l
  implements k
{
  protected int dJp = 3;
  private boolean dJq = false;
  
  public abstract void Ld();
  
  public abstract e Le();
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    if ((paramInt2 == 4) && (paramInt3 == 65235))
    {
      x.i("MicroMsg.NetSceneIDCRedirectBase", "alvinluo NetScene pre process MM_ERR_IDC_REDIRECT redirectCount: %d", new Object[] { Integer.valueOf(this.dJp) });
      if (paramq != null)
      {
        x.i("MicroMsg.NetSceneIDCRedirectBase", "update idc info");
        av.a(true, c(paramq), d(paramq), e(paramq));
      }
      this.dJp -= 1;
      if (this.dJp <= 0)
      {
        Ld();
        this.dJq = false;
        return;
      }
      x.d("MicroMsg.NetSceneIDCRedirectBase", "redirect IDC");
      a(this.dIX, Le());
      return;
    }
    a(paramInt2, paramInt3, paramString, paramq);
  }
  
  public abstract void a(int paramInt1, int paramInt2, String paramString, q paramq);
  
  public abstract iz c(q paramq);
  
  public abstract avs d(q paramq);
  
  public abstract amt e(q paramq);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ab/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */