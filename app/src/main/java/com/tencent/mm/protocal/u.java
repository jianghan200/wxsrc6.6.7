package com.tencent.mm.protocal;

import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.c.awa;
import com.tencent.mm.protocal.c.awb;
import com.tencent.mm.protocal.c.bhp;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.fl;
import com.tencent.mm.protocal.c.sx;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.e;
import com.tencent.mm.sdk.platformtools.x;

public final class u
{
  public static final class a
    extends k.d
    implements k.b
  {
    public awa qWY = new awa();
    public byte[] qWm;
    
    public final byte[] Ie()
    {
      int j = -1;
      this.qWA = y.cgr();
      this.qWY.rhB = new bhy().bq(bi.ciV());
      this.qWY.shX = k.a(this);
      this.qWY.rYW = e.sFz;
      sx localsx = new sx();
      localsx.rwf = 713;
      Object localObject2 = new PByteArray();
      Object localObject1 = new PByteArray();
      int k = MMProtocalJni.generateECKey(localsx.rwf, (PByteArray)localObject2, (PByteArray)localObject1);
      byte[] arrayOfByte = ((PByteArray)localObject2).value;
      localObject2 = ((PByteArray)localObject1).value;
      int m;
      int i;
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        this.qWm = ((byte[])localObject1);
        m = localsx.rwf;
        if (arrayOfByte != null) {
          break label245;
        }
        i = -1;
        label141:
        if (localObject2 != null) {
          break label252;
        }
      }
      for (;;)
      {
        x.d("MicroMsg.MMReg2.Req", "summerecdh nid:%d ret:%d, pub len: %d, pri len:%d, pub:%s, pri:%s", new Object[] { Integer.valueOf(m), Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(j), bi.bB(arrayOfByte), bi.bB((byte[])localObject2) });
        localsx.reV = new bhy().bq(arrayOfByte);
        this.qWY.reZ = localsx;
        return this.qWY.toByteArray();
        localObject1 = new byte[0];
        break;
        label245:
        i = arrayOfByte.length;
        break label141;
        label252:
        j = localObject2.length;
      }
    }
    
    public final int If()
    {
      return 126;
    }
    
    public final int getCmdId()
    {
      return 0;
    }
  }
  
  public static final class b
    extends k.e
    implements k.c
  {
    public int djx = 0;
    public byte[] erT;
    public awb qWZ = new awb();
    public byte[] qWo;
    
    public final int G(byte[] paramArrayOfByte)
    {
      this.djx = 0;
      this.qWZ = ((awb)new awb().aG(paramArrayOfByte));
      k.a(this, this.qWZ.six);
      this.djx = 0;
      return this.qWZ.six.rfn;
    }
    
    public final void bl(byte[] paramArrayOfByte)
    {
      if (paramArrayOfByte != null) {}
      for (;;)
      {
        this.erT = paramArrayOfByte;
        return;
        paramArrayOfByte = new byte[0];
      }
    }
    
    public final int getCmdId()
    {
      return 0;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */