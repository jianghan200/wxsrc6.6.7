package com.tencent.mm.protocal;

import com.tencent.mm.protocal.c.abt;
import com.tencent.mm.protocal.c.abu;
import com.tencent.mm.protocal.c.bhp;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.fl;
import com.tencent.mm.sdk.platformtools.bi;

public final class q
{
  public static final class a
    extends k.d
    implements k.b
  {
    public abt qWS = new abt();
    
    public final byte[] Ie()
    {
      this.qWA = y.cgt();
      this.qWS.rhB = new bhy().bq(bi.ciV());
      this.qWS.rGp = y.cgr().ver;
      this.qWS.shX = k.a(this);
      return this.qWS.toByteArray();
    }
    
    public final int If()
    {
      return 381;
    }
    
    public final int getCmdId()
    {
      return 179;
    }
  }
  
  public static final class b
    extends k.e
    implements k.c
  {
    public abu qWT = new abu();
    
    public final int G(byte[] paramArrayOfByte)
    {
      this.qWT = ((abu)new abu().aG(paramArrayOfByte));
      k.a(this, this.qWT.six);
      return this.qWT.six.rfn;
    }
    
    public final int getCmdId()
    {
      return 1000000179;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */