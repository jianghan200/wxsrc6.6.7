package com.tencent.mm.ab;

import android.os.Looper;
import com.tencent.mm.bk.b;
import com.tencent.mm.g.a.hc;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.c.abu;
import com.tencent.mm.protocal.c.awb;
import com.tencent.mm.protocal.c.bem;
import com.tencent.mm.protocal.c.bhp;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bkc;
import com.tencent.mm.protocal.c.bup;
import com.tencent.mm.protocal.c.ec;
import com.tencent.mm.protocal.h.a;
import com.tencent.mm.protocal.i.g;
import com.tencent.mm.protocal.k.c;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.protocal.q.b;
import com.tencent.mm.protocal.u.b;
import com.tencent.mm.protocal.y;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class u
  extends h.a
{
  private static a dKg;
  private byte[] ccH;
  private k.e dKf;
  private int type;
  
  public u(k.e parame, int paramInt)
  {
    this.dKf = parame;
    this.type = paramInt;
  }
  
  public static void a(a parama)
  {
    dKg = parama;
  }
  
  public static byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, PInt paramPInt, bhp parambhp)
  {
    PByteArray localPByteArray2 = new PByteArray();
    paramPInt.value = -1;
    PByteArray localPByteArray1 = new PByteArray();
    PInt localPInt1 = new PInt(0);
    PInt localPInt2 = new PInt(0);
    PInt localPInt3 = new PInt(255);
    try
    {
      boolean bool1 = MMProtocalJni.unpack(localPByteArray1, paramArrayOfByte1, paramArrayOfByte2, localPByteArray2, paramPInt, localPInt1, localPInt2, localPInt3);
      x.i("MicroMsg.RemoteResp", "bufToRespNoRSA unpack ret[%b], noticeid[%d], headExtFlags[%d]", new Object[] { Boolean.valueOf(bool1), Integer.valueOf(localPInt2.value), Integer.valueOf(localPInt3.value) });
      if (localPInt2.value != 0)
      {
        paramArrayOfByte1 = new hc();
        paramArrayOfByte1.bQo.bQp = localPInt2.value;
        boolean bool2 = a.sFg.m(paramArrayOfByte1);
        x.i("MicroMsg.RemoteResp", "summerdiz bufToRespNoRSA publish GetDisasterInfoEvent noticeid[%d] publish[%b]", new Object[] { Integer.valueOf(localPInt2.value), Boolean.valueOf(bool2) });
      }
      if (bool1)
      {
        if ((paramPInt.value == -13) || (paramPInt.value == -102) || (paramPInt.value == 62535))
        {
          x.e("MicroMsg.RemoteResp", "unpack failed. error:%d", new Object[] { Integer.valueOf(paramPInt.value) });
          return null;
        }
        int i = paramPInt.value;
        if (i == 62534)
        {
          try
          {
            paramArrayOfByte1 = new String(localPByteArray1.value);
            x.i("MicroMsg.RemoteResp", "bufToRespNoRSA -3002 ERR_IDCDISASTER, errStr:%s", new Object[] { paramArrayOfByte1 });
            new ag(Looper.getMainLooper()).post(new Runnable()
            {
              public final void run()
              {
                if ((!bi.oW(this.dKh)) && (u.LN() != null)) {
                  u.LN().cW(this.dKh);
                }
              }
            });
            return null;
          }
          catch (Exception paramArrayOfByte1)
          {
            x.e("MicroMsg.RemoteResp", "parse string err while MM_ERR_IDCDISASTER");
          }
        }
        else
        {
          x.i("MicroMsg.RemoteResp", "fuckwifi bufToRespNoRSA using protobuf ok jtype:%d enType:%d ", new Object[] { Integer.valueOf(110), Integer.valueOf(localPInt1.value) });
          parambhp.aG(localPByteArray1.value);
          return localPByteArray1.value;
        }
      }
      else
      {
        x.e("MicroMsg.RemoteResp", "unpack failed.");
      }
    }
    catch (Exception paramArrayOfByte1)
    {
      x.printErrStackTrace("MicroMsg.RemoteResp", paramArrayOfByte1, "parseFrom unbuild exception, check now!", new Object[0]);
      x.e("MicroMsg.RemoteResp", "exception:%s", new Object[] { bi.i(paramArrayOfByte1) });
    }
    return null;
  }
  
  public final byte[] DE()
  {
    switch (this.type)
    {
    default: 
      return new byte[0];
    case 701: 
    case 702: 
      return ((i.g)this.dKf).erT;
    }
    return ((u.b)this.dKf).erT;
  }
  
  public final int Df()
  {
    switch (this.type)
    {
    default: 
      return 0;
    case 701: 
    case 702: 
      return ((i.g)this.dKf).qWn.srN.iwE;
    }
    return ((u.b)this.dKf).qWZ.iwE;
  }
  
  public final int LF()
  {
    return this.dKf.qWC;
  }
  
  public final String LG()
  {
    return this.dKf.qWD;
  }
  
  public final int LH()
  {
    return this.dKf.qWB;
  }
  
  public final byte[] LI()
  {
    switch (this.type)
    {
    }
    for (;;)
    {
      return new byte[0];
      if (((i.g)this.dKf).qWn.srN.res != null)
      {
        return ((i.g)this.dKf).qWn.srN.res.siK.toByteArray();
        bkc localbkc = ((u.b)this.dKf).qWZ.rZo;
        if ((localbkc != null) && (localbkc.res != null)) {
          return localbkc.res.siK.toByteArray();
        }
        x.d("MicroMsg.RemoteResp", "summerauth MMFunc_NewReg SecAuthRegKeySect is null");
      }
    }
  }
  
  public final String LJ()
  {
    if (this.type == 381)
    {
      bem localbem = ((q.b)this.dKf).qWT.rGq;
      if (localbem != null) {
        return bi.oV(localbem.sge);
      }
    }
    return "";
  }
  
  public final String LK()
  {
    if (this.type == 381)
    {
      bem localbem = ((q.b)this.dKf).qWT.rGq;
      if (localbem != null) {
        return bi.oV(localbem.sgd);
      }
    }
    return "";
  }
  
  public final int LL()
  {
    if (this.type == 381) {
      return ((q.b)this.dKf).qWT.rFA;
    }
    return 0;
  }
  
  public final String LM()
  {
    switch (this.type)
    {
    default: 
      return "";
    case 701: 
    case 702: 
      return ((i.g)this.dKf).erW;
    }
    return ((u.b)this.dKf).qWZ.hbL;
  }
  
  public final byte[] Lm()
  {
    return this.ccH;
  }
  
  public final byte[] Lo()
  {
    switch (this.type)
    {
    default: 
      return new byte[0];
    case 701: 
    case 702: 
      return ((i.g)this.dKf).qWo;
    }
    return ((u.b)this.dKf).qWo;
  }
  
  public final boolean a(int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    PByteArray localPByteArray1 = new PByteArray();
    if (!(this.dKf instanceof k.c))
    {
      x.f("MicroMsg.RemoteResp", "all protocal should implemented with protobuf");
      return false;
    }
    PByteArray localPByteArray2 = new PByteArray();
    PInt localPInt2 = new PInt(0);
    k.c localc = (k.c)this.dKf;
    PInt localPInt3 = new PInt(0);
    PInt localPInt1 = new PInt(0);
    PInt localPInt4 = new PInt(255);
    for (;;)
    {
      int i;
      try
      {
        if (localc.cgo())
        {
          paramInt = localc.G(paramArrayOfByte1);
          x.d("MicroMsg.RemoteResp", "rawData using protobuf ok");
          this.dKf.qWB = paramInt;
          if (bi.oW(af.exp)) {
            break;
          }
          this.dKf.qWD = af.exp;
          break;
        }
        boolean bool = MMProtocalJni.unpack(localPByteArray2, paramArrayOfByte1, paramArrayOfByte2, localPByteArray1, localPInt2, localPInt3, localPInt1, localPInt4);
        x.i("MicroMsg.RemoteResp", "bufToResp unpack ret[%b], jType[%d], noticeid[%d], headExtFlags[%d]", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt), Integer.valueOf(localPInt1.value), Integer.valueOf(localPInt4.value) });
        if (!bool) {
          break label811;
        }
        this.dKf.qWC = localPInt4.value;
        if ((paramInt != 701) && (paramInt != 702) && (10001 == af.exm) && (af.exn > 0))
        {
          if (af.exn == 2) {
            y.J("", "", 0);
          }
          af.exn = 0;
          localPInt2.value = -13;
          x.w("MicroMsg.RemoteResp", "dkcert dktest set session timeout once !");
        }
        if ((localPInt2.value == -13) || (localPInt2.value == -102) || (localPInt2.value == 62535) || (localPInt2.value == 62534) || (localPInt2.value == 62533))
        {
          this.dKf.qWB = localPInt2.value;
          i = localPInt2.value;
          if (i == 62534) {}
          try
          {
            this.dKf.qWD = new String(localPByteArray2.value);
            x.i("MicroMsg.RemoteResp", "jType [%d], ret value[%d], noticeId[%s], msg[%s]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(localPInt2.value), localPInt1, this.dKf.qWD });
            this.dKf.bufferSize = paramArrayOfByte1.length;
            this.ccH = localPByteArray1.value;
            if (!bi.oW(af.exp)) {
              this.dKf.qWD = af.exp;
            }
            if (localPInt1.value == 0) {
              break label835;
            }
            paramArrayOfByte1 = new hc();
            paramArrayOfByte1.bQo.bQp = localPInt1.value;
            if ((paramInt == 701) && (this.dKf.qWB == 0))
            {
              x.i("MicroMsg.RemoteResp", "summerdiz publish GetDisasterInfoEvent MMFunc_ManualAuth ok [%d]", new Object[] { Integer.valueOf(localPInt1.value) });
              paramArrayOfByte1.bQo.bQq = true;
            }
            bool = a.sFg.m(paramArrayOfByte1);
            x.i("MicroMsg.RemoteResp", "summerdiz publish GetDisasterInfoEvent noticeid[%d] publish[%b]", new Object[] { Integer.valueOf(localPInt1.value), Boolean.valueOf(bool) });
            localPInt1.value = 0;
          }
          catch (Exception paramArrayOfByte2)
          {
            x.e("MicroMsg.RemoteResp", "parse string err while MM_ERR_IDCDISASTER");
            continue;
          }
        }
        i = localc.G(localPByteArray2.value);
      }
      catch (Exception paramArrayOfByte1)
      {
        x.printErrStackTrace("MicroMsg.RemoteResp", paramArrayOfByte1, "from Protobuf unbuild exception, check now!", new Object[0]);
        x.e("MicroMsg.RemoteResp", "exception:%s", new Object[] { bi.i(paramArrayOfByte1) });
        if (localPInt1.value != 0)
        {
          paramArrayOfByte1 = new hc();
          paramArrayOfByte1.bQo.bQp = localPInt1.value;
          bool = a.sFg.m(paramArrayOfByte1);
          x.i("MicroMsg.RemoteResp", "summerdiz publish GetDisasterInfoEvent noticeid[%d] publish[%b]", new Object[] { Integer.valueOf(localPInt1.value), Boolean.valueOf(bool) });
          localPInt1.value = 0;
        }
        return false;
      }
      x.i("MicroMsg.RemoteResp", "bufToResp using protobuf ok jType:%d, enType:%d errCode:%d, len:%d, headExtFlags:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(localPInt3.value), Integer.valueOf(i), Integer.valueOf(localPByteArray2.value.length), Integer.valueOf(this.dKf.qWC) });
      this.dKf.qWB = i;
      continue;
      label811:
      x.e("MicroMsg.RemoteResp", "unpack return false jType[%d]", new Object[] { Integer.valueOf(paramInt) });
    }
    return true;
    label835:
    return true;
  }
  
  public final int getCmdId()
  {
    return this.dKf.getCmdId();
  }
  
  public final void hs(int paramInt)
  {
    this.dKf.qWB = paramInt;
  }
  
  public final void kl(String paramString)
  {
    this.dKf.qWD = paramString;
  }
  
  public static abstract interface a
  {
    public abstract void cW(String paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ab/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */