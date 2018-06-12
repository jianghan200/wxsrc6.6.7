package com.tencent.mm.modelsimple;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.s;
import com.tencent.mm.network.k;
import com.tencent.mm.protocal.c.bqy;
import com.tencent.mm.protocal.c.bqz;
import com.tencent.mm.protocal.c.bra;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.bd;
import java.util.HashSet;

public final class z
  extends l
  implements k
{
  private static HashSet<Long> egt = new HashSet();
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  private final String toUserName;
  
  public z(String paramString, int paramInt)
  {
    this.toUserName = paramString;
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bqz();
    ((b.a)localObject).dIH = new bra();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/statusnotify";
    ((b.a)localObject).dIF = 251;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bqz)this.diG.dID.dIL;
    ((bqz)localObject).jTv = com.tencent.mm.model.q.GF();
    ((bqz)localObject).spd = paramInt;
    ((bqz)localObject).jTu = paramString;
    ((bqz)localObject).rdo = System.currentTimeMillis();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneStatusNotify", "toUserName = " + paramString);
  }
  
  private z(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    this.toUserName = paramString1;
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bqz();
    ((b.a)localObject).dIH = new bra();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/statusnotify";
    ((b.a)localObject).dIF = 251;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bqz)this.diG.dID.dIL;
    ((bqz)localObject).jTv = com.tencent.mm.model.q.GF();
    ((bqz)localObject).spd = paramInt;
    ((bqz)localObject).jTu = paramString1;
    ((bqz)localObject).rdo = System.currentTimeMillis();
    ((bqz)localObject).spg = new bqy();
    ((bqz)localObject).spg.jPe = paramString2;
    ((bqz)localObject).spg.spc = paramString3;
  }
  
  public static void S(String paramString, int paramInt)
  {
    if (bi.oW(paramString)) {}
    while ((!g.Eg().Dx()) || ((s.hO(paramString)) && (!s.hj(paramString)))) {
      return;
    }
    paramString = new z(paramString, paramInt);
    g.Eh().dpP.a(paramString, 0);
  }
  
  public static void a(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    if ((bi.oW(paramString1)) || (s.hO(paramString1))) {}
    while (!g.Eg().Dx()) {
      return;
    }
    paramString1 = new z(paramString1, paramInt, paramString2, paramString3);
    g.Eh().dpP.a(paramString1, 0);
  }
  
  public static void w(bd parambd)
  {
    g.Ek();
    if (!((Boolean)g.Ei().DT().get(aa.a.sVp, Boolean.valueOf(true))).booleanValue()) {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneStatusNotify", "[MicroMsg.MultiTerminalSyncMgr]autoSyncState close");
    }
    do
    {
      return;
      if (egt.contains(Long.valueOf(parambd.field_msgId)))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneStatusNotify", "[MicroMsg.MultiTerminalSyncMgr]sendSyncMultiTerminalCmd: has send cmd: msgSvrId:%d, msgLocalId:%d", new Object[] { Long.valueOf(parambd.field_msgId), Long.valueOf(parambd.field_msgId) });
        return;
      }
      egt.add(Long.valueOf(parambd.field_msgId));
    } while (!g.Eg().Dx());
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<![CDATA[<downloadList>");
    localStringBuilder.append("<downloadItem>");
    localStringBuilder.append("<username>");
    localStringBuilder.append(parambd.field_talker);
    localStringBuilder.append("</username>");
    localStringBuilder.append("<msgsvrid>");
    localStringBuilder.append(parambd.field_msgSvrId);
    localStringBuilder.append("</msgsvrid>");
    localStringBuilder.append("</downloadItem>");
    localStringBuilder.append("</downloadList>]]>");
    String str = localStringBuilder.toString();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneStatusNotify", "[MicroMsg.MultiTerminalSyncMgr]sendSyncMultiTerminalCmd:msgID:%d,  %s", new Object[] { Long.valueOf(parambd.field_msgId), localStringBuilder });
    parambd = new z(com.tencent.mm.model.q.GF(), 11, "DownloadFile", str);
    g.Eh().dpP.a(parambd, 0);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    if ((paramInt2 != 0) || (paramInt3 != 0)) {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneStatusNotify", "StatusNotify Error. userName=" + this.toUserName);
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 251;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/modelsimple/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */