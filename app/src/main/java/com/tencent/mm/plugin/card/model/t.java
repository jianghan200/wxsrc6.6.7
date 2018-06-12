package com.tencent.mm.plugin.card.model;

import android.text.TextUtils;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.card.d.f;
import com.tencent.mm.protocal.c.bqs;
import com.tencent.mm.protocal.c.fu;
import com.tencent.mm.protocal.c.fv;
import com.tencent.mm.protocal.c.lg;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class t
  extends com.tencent.mm.ab.l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  public LinkedList<CardInfo> hxb = new LinkedList();
  
  public t(LinkedList<lg> paramLinkedList, bqs parambqs, int paramInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new fu();
    ((b.a)localObject).dIH = new fv();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/batchgetcarditembytpinfo";
    ((b.a)localObject).dIF = 699;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (fu)this.diG.dID.dIL;
    ((fu)localObject).dzs = paramLinkedList;
    ((fu)localObject).qZR = parambqs;
    ((fu)localObject).cae = paramInt;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      x.e("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd, batch get fail, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    paramq = ((fv)this.diG.dIE.dIL).hwU;
    if (TextUtils.isEmpty(paramq))
    {
      x.e("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd fail, resp json_ret is null");
      this.diJ.a(4, -1, null, this);
      return;
    }
    paramq = f.xO(paramq);
    if (paramq != null)
    {
      com.tencent.mm.plugin.card.d.l.azQ();
      this.hxb.addAll(paramq);
    }
    this.diJ.a(0, 0, paramString, this);
  }
  
  public final int getType()
  {
    return 699;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/card/model/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */