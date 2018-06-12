package com.tencent.mm.plugin.z;

import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.a;
import com.tencent.mm.model.aq;
import com.tencent.mm.model.au;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;

public final class e
  implements aq, a.a
{
  public static e lsG;
  public int bTr;
  private String cXR;
  private i.a dVu = new e.1(this);
  public c lsH = new c();
  public byte[] lsI;
  String lsJ;
  String lsK;
  int lsL;
  public long lsM;
  long lsN;
  long lsO;
  long lsP;
  boolean lsQ = false;
  final com.tencent.mm.ab.e lsR = new e.2(this);
  
  public final void HK()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgSynchronizeServer", "receive onNotifyUserStatusChange, needWaitExtLoginCallback[%b], isWebWXOnline:[%b]", new Object[] { Boolean.valueOf(this.lsQ), Boolean.valueOf(a.gI(com.tencent.mm.kernel.g.Eg().dpx)) });
    if ((this.lsQ) && (a.gI(com.tencent.mm.kernel.g.Eg().dpx)))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgSynchronizeServer", "onNotifyUserStatusChange need send msgSynchronize appMsg.");
      au.HU();
      com.tencent.mm.model.c.b(this);
      this.lsQ = false;
      bfE();
    }
  }
  
  public final void a(String paramString1, int paramInt1, String paramString2, int paramInt2, long paramLong1, long paramLong2)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgSynchronizeServer", "onMsgSynchronizePackFinish filePath:%s, conversationSize:%d", new Object[] { paramString1, Integer.valueOf(paramInt1) });
    this.lsN = paramInt2;
    this.lsO = paramLong1;
    this.lsP = paramLong2;
    this.cXR = paramString2;
    paramString2 = "MSG_SYNCHRONIZE_" + paramInt1 + "_" + bi.VF();
    i locali = new i();
    locali.dPV = this.dVu;
    locali.field_mediaId = paramString2;
    locali.field_fullpath = paramString1;
    locali.field_fileType = com.tencent.mm.modelcdntran.b.MediaType_FILE;
    locali.field_talker = ((String)com.tencent.mm.plugin.backup.g.d.asG().asH().DT().get(2, null));
    locali.field_priority = com.tencent.mm.modelcdntran.b.dOk;
    if (!com.tencent.mm.modelcdntran.g.ND().c(locali))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgSynchronizeServer", "msgSynchronize addSendTask failed. clientid:%s", new Object[] { paramString2 });
      h.mEJ.a(466L, 2L, 1L, false);
      h.mEJ.h(14108, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(this.bTr) });
    }
  }
  
  final void bfE()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MsgSynchronizeServer", "msgSynchronize start send AppMsg.");
    au.DF().a(222, this.lsR);
    d locald = new d(this.lsJ, this.lsK, this.lsL, this.cXR);
    au.DF().a(locald, 0);
  }
  
  public final void onCancel()
  {
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MsgSynchronizeServer", "MsgSynchronizeServer cancel, Caller:%s", new Object[] { aj.cin() });
    this.lsH.lsA = true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/z/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */