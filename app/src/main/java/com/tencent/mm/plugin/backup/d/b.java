package com.tencent.mm.plugin.backup.d;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.plugin.backup.a.d;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.ev;
import com.tencent.mm.protocal.c.ex;
import com.tencent.mm.protocal.c.pw;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class b
  extends l
  implements k
{
  public com.tencent.mm.ab.b diG;
  protected com.tencent.mm.ab.e diJ;
  
  public b(LinkedList<pw> paramLinkedList, String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new ev();
    ((b.a)localObject).dIH = new ex();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/bakchatcreateqrcode";
    ((b.a)localObject).dIF = 704;
    this.diG = ((b.a)localObject).KT();
    localObject = (ev)this.diG.dID.dIL;
    ((ev)localObject).rfh = paramLinkedList.size();
    ((ev)localObject).rfi = paramLinkedList;
    ((ev)localObject).rfk = com.tencent.mm.model.q.GF();
    ((ev)localObject).rfj = com.tencent.mm.compatible.e.q.getDeviceID(ad.getContext());
    ((ev)localObject).rfl = paramString;
    ((ev)localObject).hbZ = 0L;
    ((ev)localObject).otY = 2;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.BackupCreateQRCodeScene", "err: %d, %d, %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    paramq = (ex)this.diG.dIE.dIL;
    x.i("MicroMsg.BackupCreateQRCodeScene", "onGYNetEnd QRCodeUrl:%s", new Object[] { paramq.rfp });
    d.X(paramq.reV.siK.lR);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 704;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/backup/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */