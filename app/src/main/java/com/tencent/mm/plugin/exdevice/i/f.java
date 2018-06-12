package com.tencent.mm.plugin.exdevice.i;

import com.tencent.mm.plugin.exdevice.b.c;
import com.tencent.mm.plugin.exdevice.b.e;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.plugin.exdevice.model.ae;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.platformtools.x;

public final class f
  extends ae
{
  private e izA;
  private a izB;
  private int mErrorCode;
  
  public f(int paramInt1, long paramLong, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    this.izA = new e(paramLong, paramInt2, paramInt3, paramArrayOfByte);
    this.mErrorCode = paramInt1;
  }
  
  public final boolean a(m paramm, d paramd)
  {
    boolean bool;
    if (!u.aHF().cR(this.izA.hjj))
    {
      x.e("MicroMsg.exdevice.MMInitTaskExcuter", "This device send other cmd before do auth, device id = %d", new Object[] { Long.valueOf(this.izA.hjj) });
      this.izA.a(-2, "", new byte[0], new byte[0], 0, 0);
      this.izB = new a(this.izA, paramd);
      bool = this.izB.b(paramm);
      x.i("MicroMsg.exdevice.MMInitTaskExcuter", "init start task : %b", new Object[] { Boolean.valueOf(bool) });
      return bool;
    }
    if ((-5 == this.mErrorCode) || (-3 == this.mErrorCode) || (-4 == this.mErrorCode))
    {
      x.e("MicroMsg.exdevice.MMInitTaskExcuter", "Error Code = %d, reply errorcode to device and close channel", new Object[] { Integer.valueOf(this.mErrorCode) });
      this.izA.a(-1, "", new byte[0], new byte[0], 0, 0);
      this.izB = new a(this.izA, paramd);
      bool = this.izB.b(paramm);
      x.i("MicroMsg.exdevice.MMInitTaskExcuter", "init start task : %b", new Object[] { Boolean.valueOf(bool) });
      return bool;
    }
    Object localObject = (com.tencent.mm.plugin.exdevice.e.f)this.izA.aGD();
    if (localObject == null)
    {
      x.e("MicroMsg.exdevice.MMInitTaskExcuter", "Init Request parse failed, Tell device before stop this task");
      this.izA.a(-4, "", new byte[0], new byte[0], 0, 0);
      this.izB = new a(this.izA, paramd);
      bool = this.izB.b(paramm);
      x.i("MicroMsg.exdevice.MMInitTaskExcuter", "init start task : %b", new Object[] { Boolean.valueOf(bool) });
      return bool;
    }
    if (((com.tencent.mm.plugin.exdevice.e.f)localObject).iwV != null) {}
    for (byte[] arrayOfByte = ((com.tencent.mm.plugin.exdevice.e.f)localObject).iwV.toByteArray();; arrayOfByte = null)
    {
      if (((com.tencent.mm.plugin.exdevice.e.f)localObject).iwU != null) {}
      for (localObject = ((com.tencent.mm.plugin.exdevice.e.f)localObject).iwU.toByteArray();; localObject = null)
      {
        ad.aHl();
        int i = com.tencent.mm.plugin.exdevice.model.d.aGM();
        switch (i)
        {
        default: 
          x.e("MicroMsg.exdevice.MMInitTaskExcuter", "initScene = %d, Cannot start init response", new Object[] { Integer.valueOf(i) });
        }
        this.izA.a(0, null, (byte[])localObject, arrayOfByte, i, (int)(com.tencent.mm.plugin.exdevice.j.b.aIs() / 1000L));
        this.izB = new a(this.izA, paramd);
        return this.izB.b(paramm);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/exdevice/i/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */