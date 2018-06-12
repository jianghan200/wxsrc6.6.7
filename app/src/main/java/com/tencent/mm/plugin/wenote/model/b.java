package com.tencent.mm.plugin.wenote.model;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bhp;
import com.tencent.mm.protocal.c.fl;
import com.tencent.mm.protocal.c.wj;
import com.tencent.mm.protocal.c.wp;
import com.tencent.mm.protocal.c.wq;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class b
  extends l
  implements k
{
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ = null;
  public int qnu = 1;
  private String qnv = "";
  private wj qnw = null;
  private LinkedList<wj> qnx = new LinkedList();
  public int qny = 0;
  
  public b(int paramInt1, int paramInt2, String paramString, LinkedList<wj> paramLinkedList, wj paramwj)
  {
    this.qnx = paramLinkedList;
    this.qnw = paramwj;
    this.qnv = paramString;
    this.qnu = paramInt2;
    this.qny = paramInt1;
    paramString = new b.a();
    paramString.dIG = new wp();
    paramString.dIH = new wq();
    paramString.uri = "/cgi-bin/micromsg-bin/favsecurity ";
    paramString.dIF = 921;
    paramString.dII = 0;
    paramString.dIJ = 0;
    this.diG = paramString.KT();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    wp localwp = (wp)this.diG.dID.dIL;
    localwp.jRb = this.qnu;
    localwp.rBO = this.qnw;
    localwp.rBN = this.qnx;
    localwp.rBM = this.qnv;
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  protected final int a(q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneCheckNoteSecurity", "netId %d errType %d errCode %d errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramq = (wq)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    if (paramInt2 != 0)
    {
      x.i("MicroMsg.NetSceneCheckNoteSecurity", "NetSceneCheckNoteSecurity,errType:%d,fail", new Object[] { Integer.valueOf(paramInt2) });
      this.diJ.a(paramInt2, -1, paramString, this);
      return;
    }
    if ((paramq == null) || (paramq.six == null))
    {
      x.i("MicroMsg.NetSceneCheckNoteSecurity", "NetSceneCheckNoteSecurity,response == null,ok");
      this.diJ.a(paramInt2, 0, paramString, this);
      return;
    }
    if (paramq.six.rfn != 0)
    {
      x.i("MicroMsg.NetSceneCheckNoteSecurity", "NetSceneCheckNoteSecurity,baseresponse.ret != 0,ok");
      this.diJ.a(paramInt2, 0, paramString, this);
      return;
    }
    if (paramq.rBP > 0)
    {
      x.i("MicroMsg.NetSceneCheckNoteSecurity", "NetSceneCheckNoteSecurity,SecurityResult > 0,fail");
      this.diJ.a(paramInt2, -1, paramString, this);
      return;
    }
    x.i("MicroMsg.NetSceneCheckNoteSecurity", "NetSceneCheckNoteSecurity,SecurityResult = 0,fail");
    this.diJ.a(paramInt2, 0, paramString, this);
  }
  
  public final int getType()
  {
    return 921;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wenote/model/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */