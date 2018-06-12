package com.tencent.mm.plugin.talkroom.component;

import com.tencent.mm.e.b.c;
import com.tencent.mm.e.b.c.a;
import com.tencent.mm.plugin.talkroom.model.a;
import com.tencent.mm.sdk.platformtools.x;

public final class f
  extends d.a
{
  private c bDp;
  private c.a bEs = new c.a()
  {
    public final void aN(int paramAnonymousInt1, int paramAnonymousInt2) {}
    
    public final void s(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
    {
      x.d("MicroMsg.MicRecoder", "pcm len: " + paramAnonymousInt);
      if (paramAnonymousInt <= 0) {
        x.e("MicroMsg.MicRecoder", "pcm data too low");
      }
      do
      {
        return;
        f.a(f.this, paramAnonymousArrayOfByte, paramAnonymousInt);
        paramAnonymousInt = f.a(f.this).Send(paramAnonymousArrayOfByte, (short)paramAnonymousInt);
      } while (paramAnonymousInt >= 0);
      x.e("MicroMsg.MicRecoder", "send failed, ret: " + paramAnonymousInt);
    }
  };
  private v2engine ovu;
  private short ovv;
  private short ovw;
  
  public f(v2engine paramv2engine)
  {
    this.ovu = paramv2engine;
  }
  
  public final void Sn()
  {
    this.bDp = new c(a.ovJ, 1, 2);
    this.bDp.t(8, false);
    this.bDp.bEb = this.bEs;
    this.bDp.ey(20);
    this.bDp.wn();
    this.ovw = 0;
    this.ovv = 0;
  }
  
  public final void bGP()
  {
    if (this.bDp != null)
    {
      this.bDp.we();
      this.bDp = null;
    }
  }
  
  public final int bGQ()
  {
    if (this.ovw < this.ovv) {
      this.ovw = this.ovv;
    }
    if (this.ovw == 0) {
      return 0;
    }
    int i = (short)(this.ovv * 100 / this.ovw);
    this.ovv = 0;
    return i;
  }
  
  public final void release()
  {
    bGP();
  }
  
  public final void start() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/talkroom/component/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */