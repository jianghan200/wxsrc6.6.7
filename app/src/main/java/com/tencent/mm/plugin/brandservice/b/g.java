package com.tencent.mm.plugin.brandservice.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bgj;
import com.tencent.mm.protocal.c.bgk;
import com.tencent.mm.protocal.c.if;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class g
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public g(LinkedList<if> paramLinkedList, int paramInt1, int paramInt2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bgj();
    ((b.a)localObject).dIH = new bgk();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/reportshow";
    ((b.a)localObject).dIF = 2645;
    ((b.a)localObject).dII = 176;
    ((b.a)localObject).dIJ = 1000000176;
    this.diG = ((b.a)localObject).KT();
    localObject = (bgj)this.diG.dID.dIL;
    ((bgj)localObject).shp = paramLinkedList;
    ((bgj)localObject).shq = paramInt1;
    ((bgj)localObject).shr = paramInt2;
    x.i("MicroMsg.NetSceneReportBizListShowInfo", "reportshow report_list size %d,enter_pos %d,exit_pos %d", new Object[] { Integer.valueOf(((bgj)localObject).shp.size()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 2645;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/brandservice/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */