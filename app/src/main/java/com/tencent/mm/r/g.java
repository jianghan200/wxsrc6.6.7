package com.tencent.mm.r;

import android.os.Looper;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.ads;
import com.tencent.mm.protocal.c.adt;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class g
  extends l
  implements k
{
  private b diG;
  private ads diH;
  adt diI;
  com.tencent.mm.ab.e diJ = null;
  d diK;
  private String diL = null;
  private ag handler = new ag(Looper.getMainLooper());
  private int retryCount = 0;
  
  public g(d paramd)
  {
    if (paramd == null) {}
    do
    {
      return;
      this.diK = paramd;
      x.d("MicroMsg.NetSceneGetFuncMsg", "new NetSceneGetFuncMsg, cgi: %s, cmdId: %s, functionMsgId: %s", new Object[] { paramd.field_cgi, Integer.valueOf(paramd.field_cmdid), paramd.field_functionmsgid });
      b.a locala = new b.a();
      locala.dIG = new ads();
      locala.dIH = new adt();
      locala.dIF = 825;
      locala.uri = paramd.field_cgi;
      locala.dII = paramd.field_cmdid;
      locala.dIJ = 0;
      this.diG = locala.KT();
      this.diH = ((ads)this.diG.dID.dIL);
      this.diH.rIe = paramd.field_functionmsgid;
    } while (paramd.field_custombuff == null);
    this.diH.rIf = paramd.field_custombuff;
  }
  
  private void Cd()
  {
    this.handler.postDelayed(new g.1(this), this.diK.field_retryinterval * 1000);
  }
  
  protected final int Cc()
  {
    return 6;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    if (this.diK != null)
    {
      x.i("MicroMsg.NetSceneGetFuncMsg", "doScene, functionMsgId: %s", new Object[] { this.diK.field_functionmsgid });
      this.diK.field_status = 1;
    }
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  protected final int a(q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    this.diI = ((adt)((b)paramq).dIE.dIL);
    this.diL = this.diI.rIf;
    x.i("MicroMsg.NetSceneGetFuncMsg", "onGYNetEnd, errType: %s, errCode: %s, errMsg: %s, opCode: %s, responseCustomBuff==null: %s, response.version: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Integer.valueOf(this.diI.qZc), Boolean.valueOf(bi.oW(this.diL)), Long.valueOf(this.diI.rIg) });
    if (!bi.oW(this.diL))
    {
      this.diH = ((ads)this.diG.dID.dIL);
      this.diH.rIf = this.diL;
    }
    if ((paramInt2 != 0) && (paramInt3 != 0))
    {
      if (paramInt2 == 4)
      {
        x.i("MicroMsg.NetSceneGetFuncMsg", "server error");
        if (this.diI.qZc != 1)
        {
          Cd();
          return;
        }
        x.i("MicroMsg.NetSceneGetFuncMsg", "onGYNetEnd, stop retry, directly return");
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
      }
      x.i("MicroMsg.NetSceneGetFuncMsg", "onGYNetEnd, local error");
      h.mEJ.a(this.diK.field_reportid, this.diK.field_failkey, 1L, false);
      if (this.retryCount < 2)
      {
        x.i("MicroMsg.NetSceneGetFuncMsg", "onGYNetEnd, retry, retryCount: %s", new Object[] { Integer.valueOf(this.retryCount) });
        this.retryCount += 1;
        Cd();
        return;
      }
      x.i("MicroMsg.NetSceneGetFuncMsg", "onGYNetEnd, reach retry limit, directly return");
      h.mEJ.a(this.diK.field_reportid, this.diK.field_finalfailkey, 1L, false);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    h.mEJ.a(this.diK.field_reportid, this.diK.field_successkey, 1L, false);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 825;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/r/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */