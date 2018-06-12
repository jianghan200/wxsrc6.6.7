package com.tencent.mm.protocal;

import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.plugin.normsg.a.b;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.c.asq;
import com.tencent.mm.protocal.c.asr;
import com.tencent.mm.protocal.c.ass;
import com.tencent.mm.protocal.c.bhd;
import com.tencent.mm.protocal.c.bhp;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bup;
import com.tencent.mm.protocal.c.ec;
import com.tencent.mm.protocal.c.el;
import com.tencent.mm.protocal.c.en;
import com.tencent.mm.protocal.c.eo;
import com.tencent.mm.protocal.c.fi;
import com.tencent.mm.protocal.c.fl;
import com.tencent.mm.protocal.c.sx;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bn;
import java.io.IOException;

public final class i
{
  public static final class a
    extends i.f
    implements k.b
  {
    public en qWi = new en();
    public String username;
    
    public final byte[] Ie()
    {
      int j = -1;
      a.gb("");
      int k = this.qWw;
      int i;
      Object localObject1;
      Object localObject2;
      sx localsx;
      Object localObject4;
      Object localObject3;
      int m;
      if (k == 12)
      {
        i = 1;
        x.d("MicroMsg.AutoReq", "summerstatus[%d] clientUpgrade[%d]", new Object[] { Integer.valueOf(k), Integer.valueOf(i) });
        this.qWA = y.cgr();
        if ((10002 == af.exm) && (af.exn > 0))
        {
          af.exn = 0;
          y.J("", "", 0);
        }
        localObject1 = this.qWi.reX;
        ((bhd)localObject1).shX = k.a(this);
        x.i("MicroMsg.AutoReq", "summerauth autoauth toProtoBuf[%d]", new Object[] { Integer.valueOf(this.qWs) });
        ((el)localObject1).dkY = com.tencent.mm.compatible.e.q.zy();
        ((el)localObject1).reQ = b.lFJ.ub(i);
        ((el)localObject1).reR = 0;
        ((el)localObject1).reS = a.DA();
        ((el)localObject1).eJK = bi.fT(ad.getContext());
        ((el)localObject1).hbP = d.DEVICE_NAME;
        ((el)localObject1).reT = bn.cmZ();
        ((el)localObject1).iwP = com.tencent.mm.sdk.platformtools.w.chP();
        ((el)localObject1).iwO = bi.ciX();
        ((el)localObject1).qZe = com.tencent.mm.sdk.platformtools.e.bxk;
        g.Ek();
        localObject2 = (String)g.Ei().dqk.get(18);
        x.d("MicroMsg.AutoReq", "summerecdh ksid:%s, flag:%d", new Object[] { localObject2, Integer.valueOf(((el)localObject1).reP.rgn) });
        ((el)localObject1).reP.rgl.rhZ = new bhy().bq(bi.WP((String)localObject2));
        localObject2 = this.qWi.reW;
        localsx = new sx();
        localsx.rwf = 713;
        localObject4 = new PByteArray();
        localObject3 = new PByteArray();
        k = MMProtocalJni.generateECKey(localsx.rwf, (PByteArray)localObject4, (PByteArray)localObject3);
        localObject4 = ((PByteArray)localObject4).value;
        localObject3 = ((PByteArray)localObject3).value;
        bk((byte[])localObject3);
        m = localsx.rwf;
        if (localObject4 != null) {
          break label613;
        }
        i = -1;
        label384:
        if (localObject3 != null) {
          break label620;
        }
      }
      for (;;)
      {
        x.d("MicroMsg.AutoReq", "summerecdh nid:%d ret:%d, pub len: %d, pri len:%d, pub:%s, pri:%s", new Object[] { Integer.valueOf(m), Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(j), bi.bB((byte[])localObject4), bi.bB((byte[])localObject3) });
        localsx.reV = new bhy().bq((byte[])localObject4);
        ((eo)localObject2).reZ = localsx;
        x.i("MicroMsg.AutoReq", "summerauth auto IMEI:%s SoftType:%s ClientSeqID:%s Signature:%s DeviceName:%s DeviceType:%s Language:%s TimeZone:%s chan[%d,%d,%d]", new Object[] { ((el)localObject1).dkY, ((el)localObject1).reQ, ((el)localObject1).reS, ((el)localObject1).eJK, ((el)localObject1).hbP, ((el)localObject1).reT, ((el)localObject1).iwP, ((el)localObject1).iwO, Integer.valueOf(((el)localObject1).qZe), Integer.valueOf(com.tencent.mm.sdk.platformtools.e.bxk), Integer.valueOf(com.tencent.mm.sdk.platformtools.e.sFz) });
        try
        {
          localObject1 = this.qWi.toByteArray();
          return (byte[])localObject1;
        }
        catch (IOException localIOException)
        {
          x.e("MicroMsg.AutoReq", "summerauth toProtoBuf :%s", new Object[] { bi.i(localIOException) });
        }
        g.Ek();
        i = g.Ei().dqk.Di(46);
        break;
        label613:
        i = localObject4.length;
        break label384;
        label620:
        j = localObject3.length;
      }
      return null;
    }
    
    public final int If()
    {
      return 702;
    }
    
    public final String getUri()
    {
      return "/cgi-bin/micromsg-bin/autoauth";
    }
  }
  
  public static final class b
    extends i.g
    implements k.c
  {
    public final int G(byte[] paramArrayOfByte)
    {
      try
      {
        this.qWn = ((bup)this.qWn.aG(paramArrayOfByte));
        k.a(this, this.qWn.six);
        this.djx = 0;
        if ((this.qWn.six.rfn == 0) && ((this.qWn.srN == null) || (this.qWn.srN.iwE == 0) || (bi.bC(ab.a(this.qWn.srN.rer)))))
        {
          x.e("MicroMsg.MMAuth", "retcode 0 but invalid auth sect resp or invalid uin or invalid session");
          this.qWn.six.rfn = -1;
        }
        paramArrayOfByte = this.qWD;
        x.i("MicroMsg.MMAuth", "summerauthkick auto errmsg[%s]", new Object[] { paramArrayOfByte });
        a.gb(paramArrayOfByte);
        return this.qWn.six.rfn;
      }
      catch (IOException paramArrayOfByte)
      {
        x.e("MicroMsg.MMAuth", "toProtoBuf :%s", new Object[] { bi.i(paramArrayOfByte) });
        this.qWn.six.rfn = -1;
      }
      return -1;
    }
  }
  
  public static abstract interface c
  {
    public abstract int Ia();
    
    public abstract void a(i.f paramf, i.g paramg, int paramInt1, int paramInt2, String paramString);
    
    public abstract com.tencent.mm.network.q aZ(int paramInt1, int paramInt2);
    
    public static final class a
    {
      public static i.c qWj;
    }
  }
  
  public static final class d
    extends i.f
    implements k.b
  {
    public asr qWk = new asr();
    public boolean qWl = false;
    
    public final byte[] Ie()
    {
      int j = -1;
      a.gb("");
      int k = this.qWw;
      int i;
      Object localObject1;
      Object localObject2;
      sx localsx;
      Object localObject4;
      Object localObject3;
      int m;
      if (k == 16)
      {
        i = 1;
        x.d("MicroMsg.ManualReq", "summerstatus[%d] clientUpgrade[%d]", new Object[] { Integer.valueOf(k), Integer.valueOf(i) });
        if ((10002 == af.exm) && (af.exn > 0))
        {
          af.exn = 0;
          y.J("", "", 0);
        }
        this.qWA = y.cgr();
        localObject1 = this.qWk.rUZ;
        ((bhd)localObject1).shX = k.a(this);
        ((asq)localObject1).dkY = com.tencent.mm.compatible.e.q.zy();
        ((asq)localObject1).reQ = b.lFJ.ub(i);
        ((asq)localObject1).reR = 0;
        ((asq)localObject1).reS = a.DA();
        ((asq)localObject1).eJK = bi.fT(ad.getContext());
        ((asq)localObject1).hbP = d.DEVICE_NAME;
        ((asq)localObject1).reT = bn.cmZ();
        ((asq)localObject1).iwP = com.tencent.mm.sdk.platformtools.w.chP();
        ((asq)localObject1).iwO = bi.ciX();
        ((asq)localObject1).qZe = com.tencent.mm.sdk.platformtools.e.bxk;
        if ((10012 == af.exm) && (af.exn > 0)) {
          ((asq)localObject1).qZe = af.exn;
        }
        ((asq)localObject1).rjM = d.qVH;
        ((asq)localObject1).rjL = d.qVI;
        ((asq)localObject1).rUU = d.qVJ;
        ((asq)localObject1).rwh = com.tencent.mm.compatible.e.q.getSimCountryIso();
        g.Ek();
        localObject2 = (String)g.Ei().dqk.get(18);
        x.d("MicroMsg.ManualReq", "summerauth ksid:%s authreq flag:%d", new Object[] { localObject2, Integer.valueOf(((asq)localObject1).reP.rgn) });
        ((asq)localObject1).reP.rgl.rhZ = new bhy().bq(bi.WP((String)localObject2));
        localObject2 = this.qWk.rUY;
        ((ass)localObject2).rhB = new bhy().bq(bi.ciV());
        localsx = new sx();
        localsx.rwf = 713;
        localObject4 = new PByteArray();
        localObject3 = new PByteArray();
        k = MMProtocalJni.generateECKey(localsx.rwf, (PByteArray)localObject4, (PByteArray)localObject3);
        localObject4 = ((PByteArray)localObject4).value;
        localObject3 = ((PByteArray)localObject3).value;
        bk((byte[])localObject3);
        m = localsx.rwf;
        if (localObject4 != null) {
          break label713;
        }
        i = -1;
        label436:
        if (localObject3 != null) {
          break label720;
        }
      }
      for (;;)
      {
        x.d("MicroMsg.ManualReq", "summerecdh nid:%d ret:%d, pub len: %d, pri len:%d, pub:%s, pri:%s", new Object[] { Integer.valueOf(m), Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(j), bi.bB((byte[])localObject4), bi.bB((byte[])localObject3) });
        localsx.reV = new bhy().bq((byte[])localObject4);
        ((ass)localObject2).reZ = localsx;
        x.i("MicroMsg.ManualReq", "summerauth manual IMEI:%s SoftType:%s ClientSeqID:%s Signature:%s DeviceName:%s DeviceType:%s Language:%s TimeZone:%s chan[%d,%d,%d] DeviceBrand:%s DeviceModel:%s OSType:%s RealCountry:%s", new Object[] { ((asq)localObject1).dkY, ((asq)localObject1).reQ, ((asq)localObject1).reS, ((asq)localObject1).eJK, ((asq)localObject1).hbP, ((asq)localObject1).reT, ((asq)localObject1).iwP, ((asq)localObject1).iwO, Integer.valueOf(((asq)localObject1).qZe), Integer.valueOf(com.tencent.mm.sdk.platformtools.e.bxk), Integer.valueOf(com.tencent.mm.sdk.platformtools.e.sFz), ((asq)localObject1).rjM, ((asq)localObject1).rjL, ((asq)localObject1).rUU, ((asq)localObject1).rwh });
        try
        {
          localObject1 = this.qWk.toByteArray();
          return (byte[])localObject1;
        }
        catch (IOException localIOException)
        {
          x.e("MicroMsg.ManualReq", "summerauth toProtoBuf :%s", new Object[] { bi.i(localIOException) });
        }
        if (this.qWl)
        {
          i = 3;
          break;
        }
        g.Ek();
        i = g.Ei().dqk.Di(46);
        break;
        label713:
        i = localObject4.length;
        break label436;
        label720:
        j = localObject3.length;
      }
      return null;
    }
    
    public final int If()
    {
      return 701;
    }
    
    public final String getUri()
    {
      return "/cgi-bin/micromsg-bin/manualauth";
    }
  }
  
  public static final class e
    extends i.g
    implements k.c
  {
    public final int G(byte[] paramArrayOfByte)
    {
      try
      {
        this.qWn = ((bup)this.qWn.aG(paramArrayOfByte));
        k.a(this, this.qWn.six);
        this.djx = 0;
        if ((this.qWn.six.rfn == 0) && ((this.qWn.srN == null) || (this.qWn.srN.iwE == 0) || (bi.bC(ab.a(this.qWn.srN.rer)))))
        {
          x.e("MicroMsg.MMAuth", "retcode 0 but invalid auth sect resp or invalid uin or invalid session");
          this.qWn.six.rfn = -1;
        }
        paramArrayOfByte = this.qWD;
        x.i("MicroMsg.MMAuth", "summerauthkick manual errmsg[%s]", new Object[] { paramArrayOfByte });
        a.gb(paramArrayOfByte);
        return this.qWn.six.rfn;
      }
      catch (IOException paramArrayOfByte)
      {
        x.e("MicroMsg.MMAuth", "toProtoBuf :%s", new Object[] { bi.i(paramArrayOfByte) });
        this.qWn.six.rfn = -1;
      }
      return -1;
    }
  }
  
  public static abstract class f
    extends k.d
    implements k.b
  {
    public byte[] qWm;
    
    public final void bk(byte[] paramArrayOfByte)
    {
      if (paramArrayOfByte != null) {}
      for (;;)
      {
        this.qWm = paramArrayOfByte;
        return;
        paramArrayOfByte = new byte[0];
      }
    }
    
    public abstract String getUri();
  }
  
  public static abstract class g
    extends k.e
    implements k.c
  {
    public int djx = 0;
    public byte[] erT;
    public String erW;
    public bup qWn = new bup();
    public byte[] qWo;
    
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
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */