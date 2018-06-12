package com.tencent.mm.aa;

import android.content.ContentValues;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.network.k;
import com.tencent.mm.protocal.c.aeb;
import com.tencent.mm.protocal.c.aec;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import java.io.IOException;
import java.io.OutputStream;

final class m
  extends l
  implements k
{
  private String dHB;
  private int dHF;
  private String dHH;
  private int dHX;
  private OutputStream dHY = null;
  private String dHZ;
  private com.tencent.mm.ab.e diJ;
  private String username;
  
  public m(String paramString)
  {
    this.username = paramString;
    if (ab.gY(paramString)) {
      this.username = ab.XV(paramString);
    }
    x.i("MicroMsg.NetSceneGetHDHeadImg", "init Headimage in_username:" + paramString + " out_username" + this.username);
    this.dHF = 480;
    this.dHX = 480;
    this.dHH = "jpg";
  }
  
  private int H(byte[] paramArrayOfByte)
  {
    try
    {
      if (this.dHY == null) {
        this.dHY = FileOp.jx(this.dHZ);
      }
      this.dHY.write(paramArrayOfByte);
      return paramArrayOfByte.length;
    }
    catch (IOException paramArrayOfByte)
    {
      x.e("MicroMsg.NetSceneGetHDHeadImg", "exception:%s", new Object[] { bi.i(paramArrayOfByte) });
    }
    return -1;
  }
  
  private void KA()
  {
    try
    {
      if (this.dHY != null)
      {
        this.dHY.flush();
        this.dHY.close();
        this.dHY = null;
      }
      return;
    }
    catch (IOException localIOException)
    {
      x.e("MicroMsg.NetSceneGetHDHeadImg", "exception:%s", new Object[] { bi.i(localIOException) });
    }
  }
  
  public static void ae(String paramString1, String paramString2)
  {
    q.Kp().ad(paramString1, paramString2);
  }
  
  protected final int Cc()
  {
    return 10;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    int j = 0;
    this.diJ = parame1;
    if ((this.username == null) || (this.username.length() == 0))
    {
      x.e("MicroMsg.NetSceneGetHDHeadImg", "username is null");
      return -1;
    }
    if (this.username.endsWith("@qqim"))
    {
      x.e("MicroMsg.NetSceneGetHDHeadImg", "never try get qq user hd.");
      return -1;
    }
    Object localObject1 = q.KI();
    this.dHB = q.Kp().c(this.username, true, false);
    if (FileOp.cn(this.dHB))
    {
      x.i("MicroMsg.NetSceneGetHDHeadImg", "The HDAvatar of " + this.username + " is already exists");
      return 0;
    }
    this.dHZ = (this.dHB + ".tmp");
    parame1 = ((i)localObject1).ka(this.username);
    Object localObject2;
    if (parame1 == null)
    {
      FileOp.deleteFile(this.dHZ);
      parame1 = new h();
      parame1.username = this.username;
      parame1.dHH = this.dHH;
      parame1.dHF = this.dHF;
      parame1.dHG = this.dHX;
      parame1.bWA = -1;
      localObject2 = parame1.wH();
      ((i)localObject1).dCZ.insert("hdheadimginfo", "username", (ContentValues)localObject2);
      localObject1 = new b.a();
      ((b.a)localObject1).dIG = new aeb();
      ((b.a)localObject1).dIH = new aec();
      ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/gethdheadimg";
      ((b.a)localObject1).dIF = 158;
      ((b.a)localObject1).dII = 47;
      ((b.a)localObject1).dIJ = 1000000047;
      localObject1 = ((b.a)localObject1).KT();
      localObject2 = (aeb)((com.tencent.mm.ab.b)localObject1).dID.dIL;
      if (ab.gY(this.username)) {
        break label608;
      }
      ((aeb)localObject2).hbL = this.username;
      ((aeb)localObject2).rIp = 1;
    }
    for (;;)
    {
      x.d("MicroMsg.NetSceneGetHDHeadImg", "inUser:" + this.username + " outUser:" + ((aeb)localObject2).hbL + " outType:" + ((aeb)localObject2).rIp);
      ((aeb)localObject2).rIm = this.dHF;
      ((aeb)localObject2).rIn = this.dHX;
      ((aeb)localObject2).rIo = this.dHH;
      ((aeb)localObject2).rdV = parame1.dHI;
      ((aeb)localObject2).rdW = parame1.dHJ;
      return a(parame, (com.tencent.mm.network.q)localObject1, this);
      localObject2 = this.dHZ;
      int i = j;
      if (parame1 != null)
      {
        i = j;
        if (localObject2 != null)
        {
          if (((String)localObject2).length() != 0) {
            break label541;
          }
          i = j;
        }
      }
      for (;;)
      {
        if (i == 0)
        {
          FileOp.deleteFile(this.dHZ);
          parame1.reset();
          parame1.username = this.username;
          parame1.dHH = this.dHH;
          parame1.dHF = this.dHF;
          parame1.dHG = this.dHX;
          ((i)localObject1).a(this.username, parame1);
        }
        break;
        label541:
        i = j;
        if (parame1.Kv().equals(this.dHH))
        {
          i = j;
          if (parame1.dHF == this.dHF)
          {
            i = j;
            if (parame1.dHG == this.dHX)
            {
              i = j;
              if (FileOp.mI((String)localObject2) == parame1.dHJ) {
                i = 1;
              }
            }
          }
        }
      }
      label608:
      if (this.username.equals(com.tencent.mm.model.q.GF() + "@bottle"))
      {
        ((aeb)localObject2).hbL = com.tencent.mm.model.q.GF();
        ((aeb)localObject2).rIp = 2;
      }
      else
      {
        ((aeb)localObject2).hbL = this.username;
        ((aeb)localObject2).rIp = 2;
      }
    }
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    if ((this.username == null) || (this.username.length() == 0)) {
      return l.b.dJn;
    }
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    paramArrayOfByte = (aec)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    x.d("MicroMsg.NetSceneGetHDHeadImg", "errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 4) && (paramInt3 != 0))
    {
      x.e("MicroMsg.NetSceneGetHDHeadImg", "errType:" + paramInt2 + " errCode:" + paramInt3);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      KA();
      return;
    }
    if ((paramInt2 == 4) || (paramInt2 == 5))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      x.e("MicroMsg.NetSceneGetHDHeadImg", "ErrType:" + paramInt2);
      KA();
      return;
    }
    paramInt1 = paramq.Id().qWB;
    if ((paramInt1 == -4) || (paramInt1 == -54) || (paramInt1 == -55)) {
      x.e("MicroMsg.NetSceneGetHDHeadImg", "retcode == " + paramInt1);
    }
    for (paramInt1 = 1; paramInt1 != 0; paramInt1 = 0)
    {
      x.e("MicroMsg.NetSceneGetHDHeadImg", "handleCertainError");
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      KA();
      return;
    }
    int i = -1;
    paramInt1 = i;
    if (paramArrayOfByte.rtW != null)
    {
      paramInt1 = i;
      if (paramArrayOfByte.rtW.siK != null) {
        paramInt1 = H(paramArrayOfByte.rtW.siK.lR);
      }
    }
    if (paramInt1 < 0)
    {
      x.e("MicroMsg.NetSceneGetHDHeadImg", "appendBuf fail");
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      KA();
      return;
    }
    paramq = q.KI();
    h localh = paramq.ka(this.username);
    localh.dHJ = (paramInt1 + paramArrayOfByte.rdW);
    localh.dHI = paramArrayOfByte.rdV;
    paramq.a(this.username, localh);
    if (localh.dHJ >= localh.dHI) {}
    for (paramInt1 = 1;; paramInt1 = 0)
    {
      if (paramInt1 != 0) {
        break label479;
      }
      x.i("MicroMsg.NetSceneGetHDHeadImg", "%d doScene again info[%s %d %d]", new Object[] { Integer.valueOf(hashCode()), this.username, Integer.valueOf(localh.dHJ), Integer.valueOf(localh.dHI) });
      if (a(this.dIX, this.diJ) >= 0) {
        break;
      }
      this.diJ.a(3, -1, "", this);
      return;
    }
    label479:
    FileOp.av(this.dHZ, this.dHB);
    ae(this.dHB, this.username);
    KA();
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  protected final void cancel()
  {
    super.cancel();
    KA();
  }
  
  public final int getType()
  {
    return 158;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/aa/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */