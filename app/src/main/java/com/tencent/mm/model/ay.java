package com.tencent.mm.model;

import com.tencent.mm.protocal.c.ajn;
import com.tencent.mm.protocal.c.ajo;
import com.tencent.mm.protocal.c.bhp;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.fl;
import com.tencent.mm.protocal.k;
import com.tencent.mm.protocal.k.b;
import com.tencent.mm.protocal.k.c;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.protocal.y;
import com.tencent.mm.sdk.platformtools.bi;

public final class ay
{
  public static final class a
    extends k.d
    implements k.b
  {
    public ajn dBS = new ajn();
    
    public final byte[] Ie()
    {
      this.qWA = y.cgr();
      this.dBS.rhB = new bhy().bq(bi.ciV());
      this.dBS.shX = k.a(this);
      return this.dBS.toByteArray();
    }
    
    public final int If()
    {
      return 616;
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
    public ajo dBT = new ajo();
    
    public final int G(byte[] paramArrayOfByte)
    {
      this.dBT = ((ajo)new ajo().aG(paramArrayOfByte));
      k.a(this, this.dBT.six);
      return this.dBT.six.rfn;
    }
    
    public final int getCmdId()
    {
      return 0;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/model/ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */