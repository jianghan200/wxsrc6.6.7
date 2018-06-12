package com.tencent.mm.plugin.card.model;

import android.text.TextUtils;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.fm;
import com.tencent.mm.protocal.c.fn;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;

public final class r
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  private int hwY = 0;
  
  public r(LinkedList<String> paramLinkedList)
  {
    b.a locala = new b.a();
    locala.dIG = new fm();
    locala.dIH = new fn();
    locala.uri = "/cgi-bin/micromsg-bin/batchdelcarditem";
    locala.dIF = 560;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    ((fm)this.diG.dID.dIL).rgw = paramLinkedList;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneBatchDelCardItem", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = ((fn)this.diG.dIE.dIL).rgx;
      if (paramq != null) {
        break label111;
      }
      paramInt1 = 0;
      x.i("MicroMsg.NetSceneBatchDelCardItem", "onGYNetEnd, resp list count = %d", new Object[] { Integer.valueOf(paramInt1) });
      if ((paramq != null) && (paramq.size() != 0)) {
        break label120;
      }
      x.e("MicroMsg.NetSceneBatchDelCardItem", "onGYNetEnd fail, resp list is null");
    }
    for (;;)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      label111:
      paramInt1 = paramq.size();
      break;
      label120:
      this.hwY = 0;
      paramq = paramq.iterator();
      label240:
      while (paramq.hasNext())
      {
        paramArrayOfByte = (String)paramq.next();
        boolean bool;
        if (TextUtils.isEmpty(paramArrayOfByte))
        {
          x.e("MicroMsg.NetSceneBatchDelCardItem", "processDelCardItem fail, id is null");
          bool = false;
        }
        for (;;)
        {
          if (bool) {
            break label240;
          }
          this.hwY += 1;
          break;
          CardInfo localCardInfo = new CardInfo();
          localCardInfo.field_card_id = paramArrayOfByte;
          bool = am.axi().a(localCardInfo, new String[0]);
          x.i("MicroMsg.NetSceneBatchDelCardItem", "processDelCardItem, delRet = %b", new Object[] { Boolean.valueOf(bool) });
        }
      }
      x.d("MicroMsg.NetSceneBatchDelCardItem", "onGYNetEnd, %d fail items", new Object[] { Integer.valueOf(this.hwY) });
    }
  }
  
  public final int getType()
  {
    return 560;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/model/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */