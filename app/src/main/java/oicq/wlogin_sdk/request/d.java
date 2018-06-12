package oicq.wlogin_sdk.request;

import java.lang.reflect.Array;
import oicq.wlogin_sdk.a.a;
import oicq.wlogin_sdk.a.ab;
import oicq.wlogin_sdk.a.ac;
import oicq.wlogin_sdk.a.ad;
import oicq.wlogin_sdk.a.af;
import oicq.wlogin_sdk.a.ah;
import oicq.wlogin_sdk.a.ai;
import oicq.wlogin_sdk.a.ak;
import oicq.wlogin_sdk.a.al;
import oicq.wlogin_sdk.a.am;
import oicq.wlogin_sdk.a.ap;
import oicq.wlogin_sdk.a.e;
import oicq.wlogin_sdk.a.f;
import oicq.wlogin_sdk.a.g;
import oicq.wlogin_sdk.a.h;
import oicq.wlogin_sdk.a.j;
import oicq.wlogin_sdk.a.l;
import oicq.wlogin_sdk.a.m;
import oicq.wlogin_sdk.a.n;
import oicq.wlogin_sdk.a.o;
import oicq.wlogin_sdk.a.p;
import oicq.wlogin_sdk.a.q;
import oicq.wlogin_sdk.a.s;
import oicq.wlogin_sdk.a.t;
import oicq.wlogin_sdk.a.u;
import oicq.wlogin_sdk.a.v;
import oicq.wlogin_sdk.a.w;
import oicq.wlogin_sdk.a.x;
import oicq.wlogin_sdk.a.z;
import oicq.wlogin_sdk.tools.ErrMsg;
import oicq.wlogin_sdk.tools.util;

public class d
{
  protected static int vIh = 0;
  int vHZ = 4096;
  int vIa = 0;
  int vIb = 27;
  int vIc = 0;
  public int vId = 15;
  protected int vIe = 0;
  protected byte[] vIf = new byte[this.vHZ];
  protected int vIg = 8001;
  protected int vIi = 0;
  protected int vIj = 0;
  protected int vIk = 0;
  protected int vIl = 0;
  protected int vIm = 0;
  byte vIn;
  protected i vIo;
  
  private int a(s params)
  {
    long l3 = 4294967295L;
    o localo = new o();
    p localp = new p();
    l locall = new l();
    q localq = new q();
    e locale = new e();
    t localt = new t();
    oicq.wlogin_sdk.a.d locald = new oicq.wlogin_sdk.a.d();
    m localm = new m();
    u localu = new u();
    Object localObject10 = new w();
    Object localObject9 = new x();
    j localj = new j();
    Object localObject6 = new h();
    n localn = new n();
    Object localObject8 = new z();
    Object localObject1 = new v();
    Object localObject2 = new ad();
    Object localObject3 = new ab();
    Object localObject4 = new af();
    Object localObject5 = new ap();
    ak localak = new ak();
    Object localObject7 = new al();
    am localam = new am();
    byte[] arrayOfByte2 = null;
    byte[] arrayOfByte3 = null;
    byte[] arrayOfByte4 = null;
    byte[] arrayOfByte5 = null;
    byte[] arrayOfByte6 = null;
    byte[] arrayOfByte1 = null;
    byte[] arrayOfByte7 = null;
    byte[] arrayOfByte8 = null;
    ac localac = new ac();
    byte[] arrayOfByte9 = params.cKd();
    int i = arrayOfByte9.length;
    localo.z(arrayOfByte9, 2, i);
    localp.z(arrayOfByte9, 2, i);
    locall.z(arrayOfByte9, 2, i);
    localq.z(arrayOfByte9, 2, i);
    int j = localt.z(arrayOfByte9, 2, i);
    if (j < 0) {
      return j;
    }
    if (locale.z(arrayOfByte9, 2, i) >= 0) {
      arrayOfByte1 = locale.cKd();
    }
    if (localj.z(arrayOfByte9, 2, i) >= 0) {
      util.a(this.vIo._context, localj.cKd());
    }
    if (locald.z(arrayOfByte9, 2, i) >= 0) {
      arrayOfByte2 = locald.cKd();
    }
    if (localm.z(arrayOfByte9, 2, i) >= 0) {
      arrayOfByte3 = localm.cKd();
    }
    if (localu.z(arrayOfByte9, 2, i) >= 0) {
      arrayOfByte4 = localu.cKd();
    }
    if (((a)localObject10).z(arrayOfByte9, 2, i) >= 0) {
      arrayOfByte5 = ((a)localObject10).cKd();
    }
    if (((a)localObject9).z(arrayOfByte9, 2, i) >= 0) {
      arrayOfByte6 = ((a)localObject9).cKd();
    }
    if (((a)localObject8).z(arrayOfByte9, 2, i) >= 0)
    {
      arrayOfByte7 = new byte[((z)localObject8).vJt];
      System.arraycopy(((z)localObject8).vIf, ((z)localObject8).vIU + 2, arrayOfByte7, 0, arrayOfByte7.length);
      arrayOfByte8 = new byte[((z)localObject8).vJu];
      System.arraycopy(((z)localObject8).vIf, ((z)localObject8).vIU + 2 + ((z)localObject8).vJt + 2, arrayOfByte8, 0, arrayOfByte8.length);
    }
    label636:
    long l1;
    if (((a)localObject7).z(arrayOfByte9, 2, i) >= 0)
    {
      localObject10 = new h();
      localObject9 = new n();
      localObject8 = new am();
      params = new ah();
      localObject7 = ((a)localObject7).cKd();
      j = localObject7.length;
      if (((a)localObject10).z((byte[])localObject7, 2, j) < 0)
      {
        params = null;
        if ((params == null) || (params.length <= 0)) {
          break label1362;
        }
        this.vIo.vIR = ((byte[])params.clone());
        util.gz("fast data:", util.cg(params));
      }
    }
    else
    {
      params = (byte[][])Array.newInstance(Byte.TYPE, new int[] { 7, 0 });
      if (localac.z(arrayOfByte9, 2, i) >= 0) {
        params[0] = localac.cKd();
      }
      j = localn.z(arrayOfByte9, 2, i);
      if ((((a)localObject6).z(arrayOfByte9, 2, i) >= 0) && (j >= 0))
      {
        this.vIo.vIq = localn.cKd();
        this.vIo.vIP = bV(((a)localObject6).cKd());
        params[1] = ((byte[])this.vIo.vIP.clone());
      }
      if (((a)localObject3).z(arrayOfByte9, 2, i) >= 0)
      {
        localObject6 = new byte[((ab)localObject3).vJw];
        System.arraycopy(((ab)localObject3).vIf, ((ab)localObject3).vIU + 2, localObject6, 0, localObject6.length);
        params[2] = localObject6;
      }
      if (((a)localObject4).z(arrayOfByte9, 2, i) >= 0) {
        params[3] = ((a)localObject4).cKd();
      }
      if (((a)localObject5).z(arrayOfByte9, 2, i) >= 0) {
        params[4] = ((a)localObject5).cKd();
      }
      if (localak.z(arrayOfByte9, 2, i) >= 0) {
        params[5] = localak.cKd();
      }
      if (localam.z(arrayOfByte9, 2, i) >= 0) {
        params[6] = localam.cKd();
      }
      if (((a)localObject1).z(arrayOfByte9, 2, i) < 0) {
        break label1398;
      }
      if (this.vIo.vIx != -1L) {
        break label1375;
      }
      l1 = util.ad(((v)localObject1).vIf, ((v)localObject1).vIU);
      label918:
      l3 = 0xFFFFFFFF & util.ad(((v)localObject1).vIf, ((v)localObject1).vIU + 4);
    }
    for (;;)
    {
      if ((((a)localObject2).z(arrayOfByte9, 2, i) >= 0) && (((ad)localObject2).cKh() != 0)) {}
      for (long l2 = ((ad)localObject2).cKh();; l2 = 2160000L)
      {
        if (l2 < l1) {
          l2 = l1;
        }
        for (;;)
        {
          localObject1 = this.vIo;
          long l4 = this.vIo._uin;
          long l5 = this.vIo.vIv;
          long l6 = i.cKc();
          long l7 = i.cKc();
          long l8 = i.cKc();
          localObject2 = new byte[2];
          System.arraycopy(localt.vIf, localt.vIU, localObject2, 0, 2);
          localObject3 = new byte[1];
          System.arraycopy(localt.vIf, localt.vIU + 2, localObject3, 0, 1);
          localObject4 = new byte[1];
          System.arraycopy(localt.vIf, localt.vIU + 2 + 1, localObject4, 0, 1);
          localObject5 = new byte[localt.vJr];
          System.arraycopy(localt.vIf, localt.vIU + 2 + 1 + 1 + 1, localObject5, 0, localt.vJr);
          ((i)localObject1).a(l4, l5, l3, l6, l1 + l7, l2 + l8, (byte[])localObject2, (byte[])localObject3, (byte[])localObject4, (byte[])localObject5, locall.cKd(), localo.cKd(), localq.cKd(), localp.cKd(), arrayOfByte1, arrayOfByte3, arrayOfByte2, arrayOfByte4, arrayOfByte5, arrayOfByte6, arrayOfByte7, arrayOfByte8, params);
          return 0;
          if (((a)localObject9).z((byte[])localObject7, 2, j) < 0)
          {
            params = null;
            break;
          }
          if (((a)localObject8).z((byte[])localObject7, 2, j) < 0)
          {
            params = null;
            break;
          }
          localObject7 = ((a)localObject10).cKa();
          localObject9 = ((a)localObject9).cKa();
          localObject8 = ((a)localObject8).cKa();
          localObject10 = params.cc(this.vIo.vIz);
          params = new byte[localObject7.length + 3 + localObject9.length + localObject8.length + localObject10.length];
          params[0] = 64;
          util.B(params, 1, 4);
          System.arraycopy(localObject7, 0, params, 3, localObject7.length);
          j = localObject7.length + 3;
          System.arraycopy(localObject9, 0, params, j, localObject9.length);
          j = localObject9.length + j;
          System.arraycopy(localObject8, 0, params, j, localObject8.length);
          System.arraycopy(localObject10, 0, params, j + localObject8.length, localObject10.length);
          break;
          label1362:
          this.vIo.vIR = new byte[0];
          break label636;
          label1375:
          l1 = this.vIo.vIx;
          break label918;
        }
      }
      label1398:
      l1 = 3600L;
    }
  }
  
  public final int X(byte[] paramArrayOfByte, int paramInt)
  {
    int i = 64534;
    int j = 0;
    if (paramInt <= this.vId + 2) {
      i = 64527;
    }
    for (;;)
    {
      return i;
      this.vIe = (paramInt - this.vId - 2);
      if (paramInt > this.vHZ)
      {
        this.vHZ = (paramInt + 128);
        this.vIf = new byte[this.vHZ];
      }
      this.vIa = paramInt;
      System.arraycopy(paramArrayOfByte, 0, this.vIf, 0, paramInt);
      paramArrayOfByte = this.vIf;
      paramInt = this.vId + 1;
      paramArrayOfByte = oicq.wlogin_sdk.tools.d.decrypt(paramArrayOfByte, paramInt, this.vIe, this.vIo.vIs);
      if (paramArrayOfByte == null) {}
      for (paramInt = 64534; paramInt >= 0; paramInt = j)
      {
        return x(this.vIf, this.vId + 1, this.vIe);
        this.vIe = paramArrayOfByte.length;
        if (paramArrayOfByte.length + this.vId + 2 > this.vHZ)
        {
          this.vHZ = (paramArrayOfByte.length + this.vId + 2);
          byte[] arrayOfByte = new byte[this.vHZ];
          System.arraycopy(this.vIf, 0, arrayOfByte, 0, this.vIa);
          this.vIf = arrayOfByte;
        }
        this.vIa = 0;
        System.arraycopy(paramArrayOfByte, 0, this.vIf, paramInt, paramArrayOfByte.length);
        paramInt = this.vIa;
        int k = this.vId;
        this.vIa = (paramArrayOfByte.length + (k + 2) + paramInt);
      }
    }
  }
  
  public final int Y(byte[] paramArrayOfByte, int paramInt)
  {
    this.vIn = paramArrayOfByte[paramInt];
    return paramArrayOfByte[paramInt] & 0xFF;
  }
  
  public final void a(int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4, int paramInt5, int paramInt6, byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    int j = vIh + 1;
    vIh = j;
    this.vIa = 0;
    util.A(this.vIf, this.vIa, 2);
    this.vIa += 1;
    util.B(this.vIf, this.vIa, this.vIb + 2 + i);
    this.vIa += 2;
    util.B(this.vIf, this.vIa, paramInt1);
    this.vIa += 2;
    util.B(this.vIf, this.vIa, paramInt2);
    this.vIa += 2;
    util.B(this.vIf, this.vIa, j);
    this.vIa += 2;
    util.C(this.vIf, this.vIa, (int)paramLong);
    this.vIa += 4;
    util.A(this.vIf, this.vIa, 3);
    this.vIa += 1;
    util.A(this.vIf, this.vIa, 0);
    this.vIa += 1;
    util.A(this.vIf, this.vIa, paramInt3);
    this.vIa += 1;
    util.C(this.vIf, this.vIa, paramInt4);
    this.vIa += 4;
    util.C(this.vIf, this.vIa, paramInt5);
    this.vIa += 4;
    util.C(this.vIf, this.vIa, paramInt6);
    this.vIa += 4;
    if (this.vIa + i + 1 > this.vHZ)
    {
      this.vHZ = (this.vIa + i + 1 + 128);
      byte[] arrayOfByte = new byte[this.vHZ];
      System.arraycopy(this.vIf, 0, arrayOfByte, 0, this.vIa);
      this.vIf = arrayOfByte;
    }
    System.arraycopy(paramArrayOfByte, 0, this.vIf, this.vIa, i);
    this.vIa = (i + this.vIa);
    util.A(this.vIf, this.vIa, 3);
    this.vIa += 1;
  }
  
  public final byte[] bV(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    byte[] arrayOfByte = new byte[paramArrayOfByte.length + this.vIo.vIq.length];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, paramArrayOfByte.length);
    System.arraycopy(this.vIo.vIq, 0, arrayOfByte, paramArrayOfByte.length, this.vIo.vIq.length);
    return arrayOfByte;
  }
  
  public final byte[] bW(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length < 16)) {
      return null;
    }
    paramArrayOfByte = (byte[])paramArrayOfByte.clone();
    int i = paramArrayOfByte.length - 16;
    byte[] arrayOfByte = new byte[i];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, i);
    this.vIo.vIq = new byte[16];
    System.arraycopy(paramArrayOfByte, i, this.vIo.vIq, 0, 16);
    return arrayOfByte;
  }
  
  public final byte[] cKa()
  {
    byte[] arrayOfByte = new byte[this.vIa];
    System.arraycopy(this.vIf, 0, arrayOfByte, 0, this.vIa);
    return arrayOfByte;
  }
  
  public final void cKb()
  {
    this.vIo.vIO.cKi();
  }
  
  final byte[] v(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[paramArrayOfByte.length + 4];
    util.B(arrayOfByte, 0, paramInt1);
    util.B(arrayOfByte, 2, paramInt2);
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 4, paramArrayOfByte.length);
    paramArrayOfByte = oicq.wlogin_sdk.tools.d.b(arrayOfByte, arrayOfByte.length, this.vIo.vIs);
    arrayOfByte = new byte[paramArrayOfByte.length + this.vIo.vIs.length];
    System.arraycopy(this.vIo.vIs, 0, arrayOfByte, 0, this.vIo.vIs.length);
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, this.vIo.vIs.length, paramArrayOfByte.length);
    return arrayOfByte;
  }
  
  public final void w(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    ai localai = new ai();
    if (localai.z(paramArrayOfByte, paramInt1, paramInt2) >= 0)
    {
      paramArrayOfByte = this.vIo.vIO;
      byte[] arrayOfByte = new byte[localai.vJD];
      System.arraycopy(localai.vIf, localai.vIU + 6, arrayOfByte, 0, localai.vJD);
      paramArrayOfByte.title = new String(arrayOfByte);
      paramArrayOfByte = this.vIo.vIO;
      arrayOfByte = new byte[localai.vJE];
      System.arraycopy(localai.vIf, localai.vIU + 8 + localai.vJD, arrayOfByte, 0, localai.vJE);
      paramArrayOfByte.message = new String(arrayOfByte);
      paramArrayOfByte = this.vIo.vIO;
      arrayOfByte = new byte[localai.vJF];
      System.arraycopy(localai.vIf, localai.vIU + 12 + localai.vJD + localai.vJE, arrayOfByte, 0, localai.vJF);
      paramArrayOfByte.vJM = new String(arrayOfByte);
      return;
    }
    this.vIo.vIO.cKi();
  }
  
  public int x(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    f localf = new f();
    g localg = new g();
    s locals = new s();
    int i;
    if ((this.vIl == 2064) && (this.vIm == 9)) {
      i = 0;
    }
    while (paramInt2 < 5)
    {
      return 64527;
      if ((this.vIl == 2064) && (this.vIm == 10)) {
        i = 1;
      } else if ((this.vIl == 2064) && (this.vIm == 2)) {
        i = 2;
      } else if ((this.vIl == 2064) && (this.vIm == 13)) {
        i = 4;
      } else {
        return 64524;
      }
    }
    int j = Y(paramArrayOfByte, paramInt1 + 2);
    cKb();
    int k = paramInt1 + 5;
    switch (j)
    {
    default: 
      w(paramArrayOfByte, k, this.vIa - k - 1);
      return j;
    case 0: 
      if (i == 1) {
        if (this.vIo.vIr == null) {
          return 64530;
        }
      }
      for (paramInt1 = locals.b(paramArrayOfByte, k, this.vIa - k - 1, this.vIo.vIr); paramInt1 < 0; paramInt1 = locals.b(paramArrayOfByte, k, this.vIa - k - 1, this.vIo.vIq))
      {
        util.adN("119 can not decrypt, ret=" + paramInt1);
        return paramInt1;
      }
      paramInt1 = a(locals);
      if (paramInt1 < 0)
      {
        util.adN("parse 119 failed, ret=" + paramInt1);
        return paramInt1;
      }
      return 0;
    case 1: 
      w(paramArrayOfByte, k, this.vIa - k - 1);
      return j;
    }
    paramInt2 = localf.z(paramArrayOfByte, k, this.vIa - k - 1);
    paramInt1 = paramInt2;
    if (paramInt2 >= 0)
    {
      this.vIo.vIt = localf;
      paramInt2 = localg.z(paramArrayOfByte, k, this.vIa - k - 1);
      paramInt1 = paramInt2;
      if (paramInt2 >= 0)
      {
        this.vIo.vIu = localg;
        return j;
      }
    }
    return paramInt1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/oicq/wlogin_sdk/request/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */