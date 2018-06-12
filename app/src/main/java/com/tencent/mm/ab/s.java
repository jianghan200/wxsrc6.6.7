package com.tencent.mm.ab;

import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.f;
import com.tencent.mm.plugin.zero.a.e;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.c.abt;
import com.tencent.mm.protocal.c.asr;
import com.tencent.mm.protocal.c.ass;
import com.tencent.mm.protocal.c.awa;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.en;
import com.tencent.mm.protocal.c.eo;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.g.a;
import com.tencent.mm.protocal.i.a;
import com.tencent.mm.protocal.i.c;
import com.tencent.mm.protocal.i.c.a;
import com.tencent.mm.protocal.i.d;
import com.tencent.mm.protocal.k.a;
import com.tencent.mm.protocal.k.b;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.q.a;
import com.tencent.mm.protocal.u.a;
import com.tencent.mm.protocal.y;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public final class s
  extends g.a
{
  private static e dJX;
  private k.d dIT;
  private byte[] dJY;
  private int type;
  
  public s(k.d paramd, int paramInt)
  {
    this.dIT = paramd;
    this.type = paramInt;
  }
  
  public static void a(e parame)
  {
    dJX = parame;
  }
  
  public static boolean a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, k.d paramd, ByteArrayOutputStream paramByteArrayOutputStream, boolean paramBoolean)
  {
    int i;
    if (bi.bC(paramArrayOfByte1))
    {
      if (paramArrayOfByte1 == null) {}
      for (i = -1;; i = paramArrayOfByte1.length)
      {
        x.e("MicroMsg.RemoteReq", "reqToBufNoRSA session is null :%d", new Object[] { Integer.valueOf(i) });
        return false;
      }
    }
    PByteArray localPByteArray = new PByteArray();
    try
    {
      k.b localb = (k.b)paramd;
      byte[] arrayOfByte = localb.Ie();
      if (arrayOfByte == null) {
        return false;
      }
      if (localb.cgo())
      {
        paramByteArrayOutputStream.write(arrayOfByte);
        return true;
      }
      y localy = y.cgr();
      i = 6;
      if (paramBoolean) {
        i = 7;
      }
      if (MMProtocalJni.pack(arrayOfByte, localPByteArray, paramArrayOfByte1, paramArrayOfByte2, paramd.qWv, paramd.qWs, localb.If(), localy.ver, localy.qXe.getBytes(), localy.qXf.getBytes(), paramArrayOfByte3, i))
      {
        x.d("MicroMsg.RemoteReq", "reqToBuf using protobuf ok, len:%d, flag:%d", new Object[] { Integer.valueOf(localPByteArray.value.length), Integer.valueOf(i) });
        paramByteArrayOutputStream.write(localPByteArray.value);
        return true;
      }
      return false;
    }
    catch (Exception paramArrayOfByte1)
    {
      x.e("MicroMsg.RemoteReq", "protobuf build exception, check now! :" + paramArrayOfByte1.getMessage());
      x.printErrStackTrace("MicroMsg.RemoteReq", paramArrayOfByte1, "", new Object[0]);
    }
    return false;
  }
  
  public static byte[][] a(long paramLong, com.tencent.mm.bk.a parama1, com.tencent.mm.bk.a parama2)
  {
    if (paramLong == 0L) {
      x.w("MicroMsg.RemoteReq", "summerauth toRsaAesByteArray autoauth uin is invalid!");
    }
    try
    {
      parama1 = parama1.toByteArray();
      if (bi.bC(parama1))
      {
        x.e("MicroMsg.RemoteReq", "summerauth toRsaAesByteArray reqToBuf rsaReqDataBuf is null and ret false");
        return null;
      }
    }
    catch (IOException parama1)
    {
      for (;;)
      {
        x.e("MicroMsg.RemoteReq", "summerauth toRsaAesByteArray reqToBuf rsaReqData toProtoBuf exception:%s", new Object[] { bi.i(parama1) });
        parama1 = null;
      }
      try
      {
        parama2 = parama2.toByteArray();
        if (bi.bC(parama2))
        {
          x.e("MicroMsg.RemoteReq", "summerauth toRsaAesByteArray reqToBuf aesReqDataBuf is null and ret false");
          return null;
        }
      }
      catch (IOException parama2)
      {
        for (;;)
        {
          x.e("MicroMsg.RemoteReq", "summerauth toRsaAesByteArray reqToBuf aesReqData toProtoBuf exception:%s", new Object[] { bi.i(parama2) });
          parama2 = null;
        }
      }
    }
    return tmp111_107;
  }
  
  public final byte[] DE()
  {
    return this.dIT.bjP;
  }
  
  public final int Df()
  {
    return this.dIT.qWs;
  }
  
  public final void J(byte[] paramArrayOfByte)
  {
    k.d locald = this.dIT;
    if (paramArrayOfByte != null) {}
    for (;;)
    {
      locald.bjP = paramArrayOfByte;
      return;
      paramArrayOfByte = new byte[0];
    }
  }
  
  public final String LA()
  {
    switch (this.type)
    {
    default: 
      return "";
    }
    return ((i.d)this.dIT).qWk.rUY.rhU;
  }
  
  public final boolean LB()
  {
    return this.dIT.LB();
  }
  
  public final byte[] Lv()
  {
    return this.dJY;
  }
  
  public final String Lw()
  {
    return this.dIT.qWu;
  }
  
  public final String Lx()
  {
    return this.dIT.qWv;
  }
  
  public final int Ly()
  {
    return this.dIT.qWw;
  }
  
  public final byte[] Lz()
  {
    x.d("MicroMsg.RemoteReq", "dkrsa getpass type:%d", new Object[] { Integer.valueOf(this.type) });
    switch (this.type)
    {
    default: 
      if (dJX != null)
      {
        byte[] arrayOfByte = dJX.a(this.dIT, this.type);
        if (arrayOfByte != null) {
          return arrayOfByte;
        }
      }
      break;
    case 701: 
      return ((i.d)this.dIT).qWk.rUY.rhB.siK.toByteArray();
    case 702: 
      return ((i.a)this.dIT).qWi.reW.reY.siK.toByteArray();
    case 381: 
      return ((q.a)this.dIT).qWS.rhB.siK.toByteArray();
    case 126: 
      return ((u.a)this.dIT).qWY.rhB.siK.toByteArray();
    }
    if (this.dIT.qWz != null) {
      return this.dIT.qWz;
    }
    return DE();
  }
  
  public final boolean a(int paramInt1, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, int paramInt2, boolean paramBoolean)
  {
    PByteArray localPByteArray = new PByteArray();
    x.d("MicroMsg.RemoteReq", "reqToBuf jType: %d, stack: %s", new Object[] { Integer.valueOf(paramInt1), bi.cjd() });
    switch (paramInt1)
    {
    default: 
      if (!(this.dIT instanceof k.b))
      {
        x.f("MicroMsg.RemoteReq", "all protocal should implemented with protobuf");
        return false;
      }
      break;
    case 268369922: 
      try
      {
        this.dJY = ((k.b)this.dIT).Ie();
        this.dIT.bufferSize = this.dJY.length;
        return true;
      }
      catch (Exception paramArrayOfByte1)
      {
        x.printErrStackTrace("MicroMsg.RemoteReq", paramArrayOfByte1, "", new Object[0]);
        return false;
      }
    }
    k.b localb;
    byte[] arrayOfByte2;
    long l;
    y localy;
    byte[] arrayOfByte1;
    label230:
    int i;
    try
    {
      localb = (k.b)this.dIT;
      arrayOfByte2 = localb.Ie();
      if (arrayOfByte2 == null) {
        return false;
      }
      if (localb.cgo())
      {
        this.dJY = arrayOfByte2;
        this.dIT.bufferSize = this.dJY.length;
        return true;
      }
      l = this.dIT.qWs;
      if ((!com.tencent.mm.sdk.a.b.chp()) || (l != 0L)) {
        break label1033;
      }
      l = d.qVM;
      localy = this.dIT.qWA;
      arrayOfByte1 = paramArrayOfByte1;
      if (localy.cgu()) {
        break label1036;
      }
      arrayOfByte1 = new byte[0];
    }
    catch (Exception paramArrayOfByte1)
    {
      label471:
      label484:
      x.e("MicroMsg.RemoteReq", "protobuf build exception, check now! :" + paramArrayOfByte1.getMessage());
      x.printErrStackTrace("MicroMsg.RemoteReq", paramArrayOfByte1, "", new Object[0]);
      return false;
    }
    if (paramInt2 != 0)
    {
      if ((!localy.cgu()) || (!bi.bC(arrayOfByte1))) {
        break label1079;
      }
      x.e("MicroMsg.RemoteReq", "dksession jType %d session should not null", new Object[] { Integer.valueOf(paramInt1) });
      return false;
      paramArrayOfByte1 = ((i.d)this.dIT).qWk;
      paramArrayOfByte1 = a(l, paramArrayOfByte1.rUY, paramArrayOfByte1.rUZ);
      paramInt2 = 1;
      break label1063;
      x.d("MicroMsg.RemoteReq", "summerauth reqToBuf rsaReqData uin[%d]", new Object[] { Long.valueOf(l) });
      if (l == 0L) {
        if (i.c.a.qWj != null) {
          break label471;
        }
      }
      for (paramInt2 = -1;; paramInt2 = i.c.a.qWj.Ia())
      {
        g.Ek();
        g.Eg();
        i = com.tencent.mm.kernel.a.Df();
        x.w("MicroMsg.RemoteReq", "summerauth autoauth uin[%d] is invalid! uinForProtocal[%d] accountUin[%d]", new Object[] { Long.valueOf(l), Integer.valueOf(paramInt2), Integer.valueOf(i) });
        f.mDy.a(148L, 54L, 1L, true);
        if (paramInt2 != 0) {
          f.mDy.a(148L, 55L, 1L, true);
        }
        if (i != 0) {
          f.mDy.a(148L, 56L, 1L, true);
        }
        paramArrayOfByte1 = ((i.a)this.dIT).qWi;
        paramArrayOfByte1 = a(l, paramArrayOfByte1.reW, paramArrayOfByte1.reX);
        paramInt2 = 1;
        break;
      }
      if (MMProtocalJni.packHybrid(localPByteArray, paramArrayOfByte2, this.dIT.qWv, (int)l, localb.If(), localy.ver, paramArrayOfByte3, paramArrayOfByte1, localy.qXe.getBytes(), localy.qXf.getBytes(), Lz(), i))
      {
        x.d("MicroMsg.RemoteReq", "MMEncryptCheckResUpdate reqToBuf packHybrid EncryptCheckResUpdate using protobuf ok, len:%d, flag:%d", new Object[] { Integer.valueOf(localPByteArray.value.length), Integer.valueOf(i) });
        this.dJY = localPByteArray.value;
      }
      for (;;)
      {
        this.dIT.bufferSize = this.dJY.length;
        break;
        if (MMProtocalJni.packDoubleHybrid(localPByteArray, paramArrayOfByte2, this.dIT.qWv, (int)l, localb.If(), localy.ver, paramArrayOfByte3, paramArrayOfByte1, localy.qXe.getBytes(), localy.qXf.getBytes(), Lz(), i))
        {
          x.d("MicroMsg.RemoteReq", "summer reqToBuf packDoubleHybrid AutoAuth using protobuf ok, len:%d, flag:%d", new Object[] { Integer.valueOf(localPByteArray.value.length), Integer.valueOf(i) });
          this.dJY = localPByteArray.value;
        }
      }
    }
    else
    {
      if (this.dIT.qWy != null)
      {
        paramInt2 = 6;
        if (paramBoolean) {
          paramInt2 = 7;
        }
        if (!this.dIT.qWy.a(localPByteArray, paramInt1, paramArrayOfByte2, paramArrayOfByte3, paramInt2)) {
          break label1117;
        }
        this.dJY = localPByteArray.value;
        this.dIT.bufferSize = this.dJY.length;
        x.d("MicroMsg.RemoteReq", "reqToBuf using req.getReqPackControl() ok, len:%d", new Object[] { Integer.valueOf(localPByteArray.value.length) });
        break label1117;
      }
      if ((paramInt1 == 775) || (!localy.cgu()) || (!bi.bC(arrayOfByte1))) {
        break label1119;
      }
      x.e("MicroMsg.RemoteReq", "dksession jType %d session should not null", new Object[] { Integer.valueOf(paramInt1) });
      return false;
    }
    for (;;)
    {
      label875:
      x.d("MicroMsg.RemoteReq", "dkrsa use session :%s  type:%d, flag:%d, ecdh:[%s]", new Object[] { arrayOfByte1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), bi.bB(paramArrayOfByte3) });
      if (MMProtocalJni.pack(arrayOfByte2, localPByteArray, arrayOfByte1, paramArrayOfByte2, this.dIT.qWv, (int)l, localb.If(), localy.ver, localy.qXe.getBytes(), localy.qXf.getBytes(), paramArrayOfByte3, paramInt2))
      {
        x.d("MicroMsg.RemoteReq", "reqToBuf using protobuf ok, len:%d, flag:%d", new Object[] { Integer.valueOf(localPByteArray.value.length), Integer.valueOf(paramInt2) });
        this.dJY = localPByteArray.value;
      }
      this.dIT.bufferSize = this.dJY.length;
      label1033:
      label1036:
      label1063:
      label1079:
      label1117:
      label1119:
      do
      {
        paramInt2 = i;
        break label875;
        break;
        paramArrayOfByte1 = null;
        switch (paramInt1)
        {
        }
        paramInt2 = 0;
        i = 6;
        if (!paramBoolean) {
          break label230;
        }
        i = 7;
        break label230;
        if (paramArrayOfByte1 == null) {
          return false;
        }
        paramArrayOfByte3 = paramArrayOfByte1[0];
        paramArrayOfByte1 = paramArrayOfByte1[1];
        switch (paramInt1)
        {
        }
        break label484;
        return true;
        return true;
      } while (paramInt1 != 775);
      paramInt2 = i & 0xFFFFFFFD & 0xFFFFFFFB;
    }
  }
  
  public final void eK(int paramInt)
  {
    this.dIT.eK(paramInt);
  }
  
  public final int getClientVersion()
  {
    return this.dIT.qWt;
  }
  
  public final int getCmdId()
  {
    return this.dIT.getCmdId();
  }
  
  public final String getPassword()
  {
    switch (this.type)
    {
    default: 
      return "";
    case 701: 
      return ((i.d)this.dIT).qWk.rUY.rhI;
    }
    return ((u.a)this.dIT).qWY.rhI;
  }
  
  public final String getUserName()
  {
    switch (this.type)
    {
    default: 
      return "";
    case 702: 
      return ((i.a)this.dIT).username;
    case 701: 
      return ((i.d)this.dIT).qWk.rUY.hbL;
    }
    return ((u.a)this.dIT).qWY.hbL;
  }
  
  public final void hq(int paramInt)
  {
    this.dIT.qWt = paramInt;
  }
  
  public final void hr(int paramInt)
  {
    this.dIT.qWw = paramInt;
  }
  
  public final void ki(String paramString)
  {
    this.dIT.qWu = paramString;
  }
  
  public final void kj(String paramString)
  {
    this.dIT.qWv = paramString;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ab/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */