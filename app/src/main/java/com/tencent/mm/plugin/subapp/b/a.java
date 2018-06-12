package com.tencent.mm.plugin.subapp.b;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.afw;
import com.tencent.mm.protocal.c.afx;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class a
  extends l
  implements k
{
  private RandomAccessFile aBA;
  private int dHI;
  private com.tencent.mm.ab.e diJ;
  private String filePath;
  private int hjW;
  String url;
  
  public a(String paramString)
  {
    this.url = paramString;
    this.hjW = 0;
    this.dHI = 0;
    this.filePath = null;
    this.aBA = null;
  }
  
  private boolean d(String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    if (paramInt == 0)
    {
      if ((this.aBA != null) || (this.filePath != null))
      {
        x.e("MicroMsg.NetSceneGetPSMImg", "writeFile param error");
        return false;
      }
      this.filePath = com.tencent.mm.pluginsdk.h.a.a.Ts(paramString);
      if (this.filePath == null)
      {
        x.e("MicroMsg.NetSceneGetPSMImg", "writeFile getPath From url failed:[" + paramString + "]");
        return false;
      }
    }
    try
    {
      this.aBA = new RandomAccessFile(this.filePath, "rw");
      return false;
    }
    catch (Exception paramString)
    {
      try
      {
        this.aBA.seek(paramInt);
        this.aBA.write(paramArrayOfByte, 0, paramArrayOfByte.length);
        return true;
      }
      catch (IOException paramString)
      {
        x.e("MicroMsg.NetSceneGetPSMImg", "writeFile write file error [" + this.filePath + "]  e:" + paramString.getMessage());
      }
      paramString = paramString;
      x.e("MicroMsg.NetSceneGetPSMImg", "writeFile open file error [" + this.filePath + "] e:" + paramString.getMessage());
      return false;
    }
  }
  
  protected final int Cc()
  {
    return 10;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    parame1 = new b.a();
    parame1.dIG = new afw();
    parame1.dIH = new afx();
    parame1.uri = "/cgi-bin/micromsg-bin/getpsmimg";
    parame1.dIF = 141;
    parame1.dII = 29;
    parame1.dIJ = 1000000029;
    parame1 = parame1.KT();
    afw localafw = (afw)parame1.dID.dIL;
    localafw.URL = this.url;
    localafw.rjC = this.hjW;
    x.v("MicroMsg.NetSceneGetPSMImg", "doscene url:[" + this.url + "] + offset:" + this.hjW + " totallen:" + this.dHI);
    return a(parame, parame1, this);
  }
  
  protected final int a(q paramq)
  {
    paramq = ((afw)((com.tencent.mm.ab.b)paramq).dID.dIL).URL;
    int i;
    if (paramq == null) {
      i = 0;
    }
    while (i == 0)
    {
      x.e("MicroMsg.NetSceneGetPSMImg", "security checked failed : url invalid:" + this.url);
      return l.b.dJn;
      if (paramq.indexOf("weixin://") != 0) {
        i = 0;
      } else {
        i = 1;
      }
    }
    if ((this.hjW < 0) || (this.dHI < 0))
    {
      x.e("MicroMsg.NetSceneGetPSMImg", "security checked failed : offset:" + this.hjW + " total:" + this.dHI);
      return l.b.dJn;
    }
    if (this.hjW == 0)
    {
      if (this.dHI != 0)
      {
        x.e("MicroMsg.NetSceneGetPSMImg", "security checked failed : offset:" + this.hjW + " total:" + this.dHI);
        return l.b.dJn;
      }
    }
    else if (this.hjW >= this.dHI)
    {
      x.e("MicroMsg.NetSceneGetPSMImg", "security checked failed : offset:" + this.hjW + " total:" + this.dHI);
      return l.b.dJn;
    }
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      x.e("MicroMsg.NetSceneGetPSMImg", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
    do
    {
      return;
      paramq = (afx)((com.tencent.mm.ab.b)paramq).dIE.dIL;
      x.d("MicroMsg.NetSceneGetPSMImg", "onGYNetEnd url:[" + this.url + "] + offset:" + this.hjW + " Resp[ totallen:" + paramq.rjB + " bufSize:" + paramq.rtW.siI + " ]");
      if (paramq.rjB > 0) {
        this.dHI = paramq.rjB;
      }
      if (!d(this.url, paramq.rtW.siK.lR, this.hjW))
      {
        this.diJ.a(3, -1, paramString, this);
        return;
      }
      paramInt1 = this.hjW;
      this.hjW = (paramq.rtW.siI + paramInt1);
      if (this.dHI <= this.hjW)
      {
        x.d("MicroMsg.NetSceneGetPSMImg", "down url:[" + this.url + "] final size: " + this.dHI);
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
      }
    } while (a(this.dIX, this.diJ) >= 0);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 141;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/subapp/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */