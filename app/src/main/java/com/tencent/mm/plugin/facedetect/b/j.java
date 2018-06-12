package com.tencent.mm.plugin.facedetect.b;

import com.tencent.mm.bk.b;
import com.tencent.mm.protocal.c.bfx;
import com.tencent.mm.protocal.c.bfy;
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

public final class j
{
  public static final class a
    extends k.d
    implements k.b
  {
    public bfx iMr = new bfx();
    
    public final byte[] Ie()
    {
      this.qWA = y.cgr();
      this.iMr.rhB = new bhy().bq(bi.ciV());
      this.iMr.shX = k.a(this);
      this.qWz = this.iMr.rhB.siK.toByteArray();
      return this.iMr.toByteArray();
    }
    
    public final int If()
    {
      return 931;
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
    public bfy iMs = new bfy();
    
    public final int G(byte[] paramArrayOfByte)
    {
      this.iMs = ((bfy)new bfy().aG(paramArrayOfByte));
      k.a(this, this.iMs.six);
      return this.iMs.six.rfn;
    }
    
    public final int getCmdId()
    {
      return 0;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/facedetect/b/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */