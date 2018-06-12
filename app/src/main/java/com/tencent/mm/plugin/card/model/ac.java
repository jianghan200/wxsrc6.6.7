package com.tencent.mm.plugin.card.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.abn;
import com.tencent.mm.protocal.c.abo;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class ac
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  public LinkedList<String> htD;
  public int htF;
  public int htG;
  public int htH;
  
  public ac(String paramString)
  {
    b.a locala = new b.a();
    locala.dIG = new abn();
    locala.dIH = new abo();
    locala.uri = "/cgi-bin/micromsg-bin/getcardserial";
    locala.dIF = 577;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    ((abn)this.diG.dID.dIL).cac = paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneGetCardSerial", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (abo)this.diG.dIE.dIL;
      this.htD = paramq.htD;
      this.htF = paramq.htF;
      this.htG = paramq.htG;
      this.htH = paramq.htH;
    }
    x.i("MicroMsg.NetSceneGetCardSerial", "onGYNetEnd, resp request_time = %d, request_count = %d, refresh_interval = %d,", new Object[] { Integer.valueOf(this.htF), Integer.valueOf(this.htG), Integer.valueOf(this.htH) });
    if (this.htD != null) {
      x.i("MicroMsg.NetSceneGetCardSerial", "onGYNetEnd, resp codes size is " + this.htD.size());
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 577;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/card/model/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */