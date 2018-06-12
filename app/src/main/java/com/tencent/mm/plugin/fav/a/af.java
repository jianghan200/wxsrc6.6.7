package com.tencent.mm.plugin.fav.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.ua;
import com.tencent.mm.g.a.ua.a;
import com.tencent.mm.model.o;
import com.tencent.mm.model.u;
import com.tencent.mm.model.u.b;
import com.tencent.mm.network.k;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.protocal.c.bv;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.protocal.c.wr;
import com.tencent.mm.protocal.c.xa;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bi;

public final class af
  extends l
  implements k
{
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ = null;
  public g iWJ;
  
  public af(g paramg)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.NetSceneAddFav", "NetSceneAddFavItem %s", new Object[] { Long.valueOf(paramg.field_localId) });
    b.a locala = new b.a();
    locala.dIG = new bu();
    locala.dIH = new bv();
    locala.uri = "/cgi-bin/micromsg-bin/addfavitem";
    locala.dIF = 401;
    locala.dII = 193;
    locala.dIJ = 1000000193;
    this.diG = locala.KT();
    this.iWJ = paramg;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    bu localbu = (bu)this.diG.dID.dIL;
    localbu.rcc = o.l(this.iWJ.field_xml, System.currentTimeMillis());
    localbu.hcE = this.iWJ.field_type;
    localbu.rcd = this.iWJ.field_sourceType;
    this.iWJ.field_xml = g.s(this.iWJ);
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().a(this.iWJ, new String[] { "localId" });
    localbu.rcf = this.iWJ.field_xml;
    localbu.rce = this.iWJ.field_sourceId;
    this.iWJ.Bi("MicroMsg.Fav.NetSceneAddFav");
    this.diJ = parame1;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.NetSceneAddFav", "ADD FavItem, sourceId:%s localId:%d favId:%d", new Object[] { this.iWJ.field_sourceId, Long.valueOf(this.iWJ.field_localId), Integer.valueOf(this.iWJ.field_id) });
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.NetSceneAddFav", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if (((paramInt2 == 0) && (paramInt3 == 0)) || (paramInt3 == 65136))
    {
      paramq = (bv)((com.tencent.mm.ab.b)paramq).dIE.dIL;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.NetSceneAddFav", "fav id %d, local id %d, itemStatus %d, update seq %d", new Object[] { Integer.valueOf(paramq.rbY), Long.valueOf(this.iWJ.field_localId), Integer.valueOf(this.iWJ.field_itemStatus), Integer.valueOf(paramq.rcb) });
      this.iWJ.field_id = paramq.rbY;
      this.iWJ.field_localSeq = paramq.rcb;
      if (this.iWJ.field_itemStatus == 12)
      {
        com.tencent.mm.sdk.platformtools.x.v("MicroMsg.Fav.NetSceneAddFav", "onGYNetEnd wait server upload sent");
        this.iWJ.field_itemStatus = 13;
      }
      if (this.iWJ.field_itemStatus == 9)
      {
        com.tencent.mm.sdk.platformtools.x.v("MicroMsg.Fav.NetSceneAddFav", "onGYNetEnd item done");
        this.iWJ.field_itemStatus = 10;
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().dv(this.iWJ.field_localId);
        com.tencent.mm.plugin.report.service.h.mEJ.h(10659, new Object[] { Integer.valueOf(0), Integer.valueOf(this.iWJ.field_type), Integer.valueOf(0), Long.valueOf(b.b(this.iWJ)), Long.valueOf(h.dr(this.iWJ.field_localId)) });
      }
      paramArrayOfByte = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dz(paramq.rbY);
      if (paramArrayOfByte != null)
      {
        this.iWJ.field_updateSeq = paramArrayOfByte.field_updateSeq;
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().z(paramArrayOfByte);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.NetSceneAddFav", "onGYNetEnd aleady exist, delete old info, favId:%d", new Object[] { Integer.valueOf(paramArrayOfByte.field_id) });
      }
      paramArrayOfByte = u.Hx().ib(this.iWJ.field_sessionId);
      if ((!bi.oW(this.iWJ.field_sessionId)) && (this.iWJ.field_type == 5) && (paramArrayOfByte != null))
      {
        ua localua = new ua();
        localua.cfH.cfI = paramArrayOfByte.getString("prePublishId", "");
        if ((this.iWJ.field_favProto != null) && (this.iWJ.field_favProto.rBG != null)) {
          localua.cfH.url = this.iWJ.field_favProto.rBG.egr;
        }
        if ((bi.oW(localua.cfH.url)) && (this.iWJ.field_favProto != null) && (this.iWJ.field_favProto.rAN != null) && (this.iWJ.field_favProto.rAN.rCn != null)) {
          localua.cfH.url = this.iWJ.field_favProto.rAN.rCn;
        }
        if (bi.oW(localua.cfH.url)) {
          localua.cfH.url = paramArrayOfByte.getString("url", "");
        }
        localua.cfH.cfK = paramArrayOfByte.getString("preUsername", "");
        localua.cfH.cfL = paramArrayOfByte.getString("preChatName", "");
        localua.cfH.cfM = paramArrayOfByte.getInt("preMsgIndex", 0);
        localua.cfH.cfQ = paramArrayOfByte.getInt("sendAppMsgScene", 0);
        localua.cfH.cfR = paramArrayOfByte.getInt("getA8KeyScene", 0);
        localua.cfH.cfS = paramArrayOfByte.getString("referUrl", null);
        localua.cfH.cfT = paramArrayOfByte.getString("adExtStr", null);
        localua.cfH.cfN = "";
        localua.cfH.cfO = "";
        localua.cfH.cfP = 0;
        localua.cfH.cfJ = ("fav_" + com.tencent.mm.model.q.GF() + "_" + this.iWJ.field_id);
        a.sFg.m(localua);
      }
      this.iWJ.field_sessionId = null;
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().a(this.iWJ, new String[] { "localId" });
      b.dh(paramq.rcg);
    }
    if ((paramInt2 == 4) && (paramInt3 == 65135))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.NetSceneAddFav", "fav fail, full size");
      if (!this.iWJ.aLi()) {
        break label955;
      }
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().t(16, this.iWJ.field_localId);
    }
    for (;;)
    {
      b.d(this.iWJ);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      label955:
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().t(6, this.iWJ.field_localId);
    }
  }
  
  public final int getType()
  {
    return 401;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/fav/a/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */