package com.tencent.mm.plugin.fav.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.auj;
import com.tencent.mm.protocal.c.auk;
import com.tencent.mm.protocal.c.aul;
import com.tencent.mm.protocal.c.aum;
import com.tencent.mm.protocal.c.wb;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.LinkedList;

public final class al
  extends l
  implements k
{
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ = null;
  public int iXb;
  public f iXc;
  private LinkedList<aum> iXd;
  private LinkedList<auj> iXe;
  public String iXf;
  private int scene;
  public int type;
  
  public al(int paramInt, f paramf)
  {
    this(paramInt, paramf.field_modItem.iXe, paramf.field_modItem.rBr, 1);
    this.iXc = paramf;
  }
  
  public al(int paramInt, LinkedList<auj> paramLinkedList, LinkedList<aum> paramLinkedList1)
  {
    this(paramInt, paramLinkedList, paramLinkedList1, 0);
  }
  
  private al(int paramInt1, LinkedList<auj> paramLinkedList, LinkedList<aum> paramLinkedList1, int paramInt2)
  {
    b.a locala = new b.a();
    locala.dIG = new auk();
    locala.dIH = new aul();
    locala.uri = "/cgi-bin/micromsg-bin/modfavitem";
    locala.dIF = 426;
    locala.dII = 216;
    locala.dIJ = 1000000216;
    this.diG = locala.KT();
    this.iXd = paramLinkedList1;
    this.iXe = paramLinkedList;
    this.iXb = paramInt1;
    this.type = paramInt2;
  }
  
  public al(int paramInt, LinkedList<auj> paramLinkedList, LinkedList<aum> paramLinkedList1, String paramString)
  {
    this(paramInt, paramLinkedList, paramLinkedList1, 0);
    this.iXf = paramString;
  }
  
  public al(int paramInt, LinkedList<auj> paramLinkedList, LinkedList<aum> paramLinkedList1, String paramString, byte paramByte)
  {
    this(paramInt, paramLinkedList, paramLinkedList1, 0);
    this.iXf = paramString;
    this.scene = 1;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    if ((this.scene == 0) && ((this.iXe == null) || (this.iXe.size() == 0))) {
      return -1;
    }
    auk localauk = (auk)this.diG.dID.dIL;
    localauk.rXC = this.iXe.size();
    if (this.iXd != null) {
      localauk.rXE = this.iXd.size();
    }
    for (localauk.rgH = this.iXd;; localauk.rgH = new LinkedList())
    {
      if (!bi.oW(this.iXf)) {
        localauk.rXF = this.iXf;
      }
      localauk.rXC = this.iXe.size();
      localauk.rXD = this.iXe;
      localauk.rbY = this.iXb;
      localauk.otY = this.scene;
      this.diJ = parame1;
      return a(parame, this.diG, this);
      localauk.rXE = 0;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.Fav.NetSceneModFavItem", "favId: " + this.iXb + ", netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
    b.d(((ae)g.n(ae.class)).getFavItemInfoStorage().dz(this.iXb));
  }
  
  public final long aLO()
  {
    if (this.iXc == null) {
      return -1L;
    }
    return this.iXc.field_localId;
  }
  
  public final int aLP()
  {
    if (this.iXc == null) {
      return -1;
    }
    return this.iXc.field_type;
  }
  
  public final int getType()
  {
    return 426;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/fav/a/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */