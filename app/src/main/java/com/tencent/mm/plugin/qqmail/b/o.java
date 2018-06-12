package com.tencent.mm.plugin.qqmail.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.f;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.a;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.bvw;
import com.tencent.mm.protocal.c.bvx;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Random;

public final class o
  extends l
  implements k
{
  private String bWQ;
  private int dHI = 0;
  private int dHJ = 0;
  private f dVg;
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public String filePath = null;
  
  public o(String paramString1, String paramString2, f paramf)
  {
    this.filePath = paramString1;
    this.bWQ = (paramString2 + "_" + System.nanoTime() + "_" + Math.abs(new Random().nextInt() / 2));
    this.dVg = paramf;
    x.i("MicroMsg.NetSceneUploadFie", "msgId: %s, filePath: %s", new Object[] { this.bWQ, this.filePath });
  }
  
  protected final int Cc()
  {
    return 640;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    if (bi.oW(this.filePath))
    {
      x.e("MicroMsg.NetSceneUploadFie", "doScene, filePath is null");
      return -1;
    }
    if (!com.tencent.mm.a.e.cn(this.filePath))
    {
      x.e("MicroMsg.NetSceneUploadFie", "doScene, file: %s not exist", new Object[] { this.filePath });
      return -1;
    }
    if (this.dHI == 0)
    {
      this.dHI = com.tencent.mm.a.e.cm(this.filePath);
      x.i("MicroMsg.NetSceneUploadFie", "doScene, totalLen: %d", new Object[] { Integer.valueOf(this.dHI) });
    }
    int i = Math.min(this.dHI - this.dHJ, 32768);
    x.i("MicroMsg.NetSceneUploadFie", "doScene, startPos: %d, dataLen: %d", new Object[] { Integer.valueOf(this.dHJ), Integer.valueOf(i) });
    parame1 = com.tencent.mm.a.e.e(this.filePath, this.dHJ, i);
    if (parame1 == null)
    {
      x.e("MicroMsg.NetSceneUploadFie", "doScene, read file buf is null");
      return -1;
    }
    x.i("MicroMsg.NetSceneUploadFie", "doScene, buf.length: %d", new Object[] { Integer.valueOf(parame1.length) });
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bvw();
    ((b.a)localObject).dIH = new bvx();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/uploadfile";
    ((b.a)localObject).dIF = 484;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bvw)this.diG.dID.dIL;
    ((bvw)localObject).rcc = this.bWQ;
    ((bvw)localObject).rdV = this.dHI;
    ((bvw)localObject).rdW = this.dHJ;
    ((bvw)localObject).rdX = i;
    ((bvw)localObject).rtW = ab.O(parame1);
    i = a(parame, this.diG, this);
    x.i("MicroMsg.NetSceneUploadFie", "doScene, ret: %d", new Object[] { Integer.valueOf(i) });
    return i;
  }
  
  protected final int a(q paramq)
  {
    if ((bi.oW(this.filePath)) || (!com.tencent.mm.a.e.cn(this.filePath)))
    {
      x.e("MicroMsg.NetSceneUploadFie", "securityVerificationChecked failed, file not exist");
      return l.b.dJn;
    }
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneUploadFie", "onGYNetEnd, netId: %d, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0)) {
      if (this.diJ != null) {
        this.diJ.a(paramInt2, paramInt3, paramString, this);
      }
    }
    do
    {
      do
      {
        do
        {
          return;
          paramq = (bvx)((b)paramq).dIE.dIL;
          paramArrayOfByte = paramq.rcc;
          x.i("MicroMsg.NetSceneUploadFie", "onGYNetEnd, clientId: %s, totalLen: %d, attachId: %s", new Object[] { paramq.rcc, Integer.valueOf(paramq.rdV), paramq.ruD });
        } while (!paramArrayOfByte.equals(this.bWQ));
        this.dHJ = paramq.rdW;
        if (this.dHJ >= this.dHI) {
          break;
        }
        x.i("MicroMsg.NetSceneUploadFie", "onGYNetEnd, startPos: %d, totalLen: %d, continue to upload", new Object[] { Integer.valueOf(this.dHJ), Integer.valueOf(this.dHI) });
        if (a(this.dIX, this.diJ) >= 0) {
          break;
        }
        x.e("MicroMsg.NetSceneUploadFie", "continue to upload fail");
        if (this.diJ != null) {
          this.diJ.a(paramInt2, paramInt3, paramString, this);
        }
      } while (this.dVg == null);
      this.dVg.a(this.dHJ, this.dHI, this);
      return;
      paramq = paramq.ruD;
      x.i("MicroMsg.NetSceneUploadFie", "onGYNetEnd, finish upload, startPos: %d, totalLen: %d, attachId: %s", new Object[] { Integer.valueOf(this.dHJ), Integer.valueOf(this.dHI), paramq });
      if (this.diJ != null) {
        this.diJ.a(paramInt2, paramInt3, paramString, this);
      }
    } while (this.dVg == null);
    this.dVg.a(this.dHJ, this.dHI, this);
  }
  
  protected final void a(l.a parama) {}
  
  public final bvx boq()
  {
    if (this.diG != null) {
      return (bvx)this.diG.dIE.dIL;
    }
    return null;
  }
  
  public final int getType()
  {
    return 484;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/qqmail/b/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */