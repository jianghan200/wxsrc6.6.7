package com.tencent.mm.plugin.hp.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.util.Base64;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.boots.a.c;
import com.tencent.mm.plugin.hp.d.c.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.bsw;
import com.tencent.mm.protocal.c.oo;
import com.tencent.mm.protocal.c.op;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
  extends l
  implements k
{
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  String kmP;
  String kmQ;
  private LinkedList<bsw> kmR = new LinkedList();
  private boolean kmS = true;
  com.tencent.mm.plugin.hp.d.b kmT;
  
  public a()
  {
    this("", "", null, false);
  }
  
  public a(String paramString1, String paramString2, List<bsw> paramList)
  {
    this(paramString1, paramString2, paramList, true);
  }
  
  private a(String paramString1, String paramString2, List<bsw> paramList, boolean paramBoolean)
  {
    Object localObject1 = new b.a();
    ((b.a)localObject1).dIG = new oo();
    ((b.a)localObject1).dIH = new op();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/checktinkerupdate";
    ((b.a)localObject1).dIF = 922;
    ((b.a)localObject1).dII = 0;
    ((b.a)localObject1).dIJ = 0;
    this.diG = ((b.a)localObject1).KT();
    if (!paramBoolean)
    {
      String str = "tinker_id_" + com.tencent.mm.loader.stub.a.baseRevision();
      if (com.tencent.mm.loader.stub.a.PATCH_REV == null) {}
      for (paramString1 = "";; paramString1 = "tinker_id_" + com.tencent.mm.loader.stub.a.PATCH_REV)
      {
        LinkedList localLinkedList = new LinkedList();
        long l1 = 0L;
        try
        {
          long l2 = com.tencent.mm.kernel.a.Dz() & 0xFFFFFFFF;
          l1 = l2;
          x.i("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "uin is %s", new Object[] { bi.Xf(String.valueOf(l2)) });
          l1 = l2;
        }
        catch (Exception paramString2)
        {
          for (;;)
          {
            Object localObject2;
            x.printErrStackTrace("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", paramString2, "tinker patch manager get uin failed.", new Object[0]);
            continue;
            int i = 2;
          }
        }
        localLinkedList.add(jdMethod_do("code-version", com.tencent.mm.sdk.platformtools.d.CLIENT_VERSION));
        localLinkedList.add(jdMethod_do("code-reversion", com.tencent.mm.sdk.platformtools.d.REV));
        localLinkedList.add(jdMethod_do("sdk", String.valueOf(Build.VERSION.SDK_INT)));
        localLinkedList.add(jdMethod_do("os-name", com.tencent.mm.protocal.d.qVK));
        localLinkedList.add(jdMethod_do("device-brand", com.tencent.mm.protocal.d.qVH));
        localLinkedList.add(jdMethod_do("device-name", com.tencent.mm.protocal.d.DEVICE_NAME));
        localLinkedList.add(jdMethod_do("uin", String.valueOf(l1)));
        if (!ao.isWifi(ad.getContext())) {
          break;
        }
        i = 3;
        localLinkedList.add(jdMethod_do("network", String.valueOf(i)));
        localObject2 = ((c)com.tencent.mm.kernel.g.l(c.class)).aua();
        localObject1 = paramString1;
        paramString2 = str;
        paramList = localLinkedList;
        if (localObject2 == null) {
          break label467;
        }
        localObject2 = ((List)localObject2).iterator();
        for (;;)
        {
          localObject1 = paramString1;
          paramString2 = str;
          paramList = localLinkedList;
          if (!((Iterator)localObject2).hasNext()) {
            break;
          }
          paramString2 = (com.tencent.mm.plugin.boots.a.a)((Iterator)localObject2).next();
          localLinkedList.add(jdMethod_do(Integer.toHexString(paramString2.field_key), String.valueOf(paramString2.field_dau)));
        }
      }
    }
    localObject1 = paramString2;
    paramString2 = paramString1;
    label467:
    this.kmP = paramString2;
    this.kmQ = ((String)localObject1);
    this.kmR.addAll(paramList);
    this.kmS = paramBoolean;
  }
  
  private static bsw jdMethod_do(String paramString1, String paramString2)
  {
    bsw localbsw = new bsw();
    localbsw.aAL = paramString1;
    localbsw.value = paramString2;
    return localbsw;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.d("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "doScene");
    this.diJ = parame1;
    parame1 = (oo)this.diG.dID.dIL;
    parame1.rsP = this.kmP;
    parame1.rsQ = this.kmQ;
    parame1.rsR = this.kmR;
    a.1 local1;
    if (this.kmS)
    {
      local1 = new a.1(this, parame1);
      parame1 = ad.getContext().getSharedPreferences("tinker_patch_share_config", 4).getString("tinker_node", "");
      if (bi.oW(parame1)) {
        break label339;
      }
    }
    label339:
    for (;;)
    {
      try
      {
        Object localObject = new op();
        ((op)localObject).aG(Base64.decode(parame1.getBytes(), 0));
        if (((op)localObject).rsS != null) {
          if (com.tencent.mm.loader.stub.a.PATCH_REV == null)
          {
            parame1 = "";
            String str1 = "tinker_id_" + com.tencent.mm.loader.stub.a.baseRevision();
            String str2 = ad.getContext().getSharedPreferences("tinker_patch_share_config", 4).getString("tinker_base_id", "");
            localObject = new com.tencent.mm.plugin.hp.d.b(((op)localObject).rsS);
            x.i("Tinker.TinkerUtils", "LastResponse PID:%s current PID:%s last baseId:%s current baseId:%s", new Object[] { ((com.tencent.mm.plugin.hp.d.b)localObject).knj, parame1, str2, str1 });
            if ((!bi.oW(((com.tencent.mm.plugin.hp.d.b)localObject).knj)) && (!((com.tencent.mm.plugin.hp.d.b)localObject).knj.equalsIgnoreCase(parame1)) && (!bi.oW(str1)) && (str1.equalsIgnoreCase(str2)))
            {
              local1.a(true, (com.tencent.mm.plugin.hp.d.b)localObject);
              return a(parame, this.diG, this);
            }
          }
          else
          {
            parame1 = "tinker_id_" + com.tencent.mm.loader.stub.a.PATCH_REV;
            continue;
          }
        }
        local1.a(false, null);
      }
      catch (Exception parame1)
      {
        x.printErrStackTrace("Tinker.TinkerUtils", parame1, "parse tinker update Response failed.", new Object[0]);
        h.mEJ.a(614L, 73L, 1L, false);
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "errType:%d errCode:%d errMsg:%s ", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramArrayOfByte = (op)((com.tencent.mm.ab.b)paramq).dIE.dIL;
      paramq = paramArrayOfByte.rsS;
      if (paramq != null) {
        if (!this.kmS) {}
      }
    }
    for (;;)
    {
      try
      {
        com.tencent.mm.plugin.hp.tinker.g.at(ad.getContext(), new String(Base64.encode(paramArrayOfByte.toByteArray(), 0)));
        com.tencent.mm.plugin.hp.tinker.g.G(ad.getContext(), 0);
        x.d("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "node is no empty. try to process");
        paramq = new com.tencent.mm.plugin.hp.d.b(paramq);
        x.d("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "node is no empty. new TinkerSyncResponse finish");
        new com.tencent.mm.plugin.hp.b.e(paramq).fL(this.kmS);
        x.d("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "node is no empty. end process");
        com.tencent.mm.plugin.hp.b.a.cJ(4, 0);
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
      }
      catch (Exception paramArrayOfByte)
      {
        x.printErrStackTrace("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", paramArrayOfByte, "save node failed.", new Object[0]);
        h.mEJ.a(614L, 72L, 1L, false);
        continue;
      }
      x.i("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "check from setting about ui. ");
      continue;
      if (paramString.equalsIgnoreCase("no baseid matched"))
      {
        com.tencent.mm.plugin.hp.b.a.cJ(1, 0);
        label235:
        if (this.kmT == null) {
          break label400;
        }
        if (com.tencent.mm.loader.stub.a.PATCH_REV != null) {
          break label402;
        }
      }
      label400:
      label402:
      for (paramq = "";; paramq = "tinker_id_" + com.tencent.mm.loader.stub.a.PATCH_REV)
      {
        if ((bi.oW(this.kmT.knj)) || (this.kmT.knj.equalsIgnoreCase(paramq))) {
          break label423;
        }
        paramInt1 = ad.getContext().getSharedPreferences("tinker_patch_share_config", 4).getInt("tinker_node_retry_time", 0);
        if (paramInt1 < 4) {
          break label425;
        }
        com.tencent.mm.plugin.hp.tinker.g.at(ad.getContext(), "");
        com.tencent.mm.plugin.hp.tinker.g.G(ad.getContext(), 0);
        x.i("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "retry time over %d time, then clear node and count", new Object[] { Integer.valueOf(paramInt1) });
        h.mEJ.a(614L, 74L, 1L, false);
        break;
        if (paramString.equalsIgnoreCase("no update for this patch"))
        {
          com.tencent.mm.plugin.hp.b.a.cJ(2, 0);
          break label235;
        }
        if (paramString.equalsIgnoreCase("no sutable patch available"))
        {
          com.tencent.mm.plugin.hp.b.a.cJ(3, 0);
          break label235;
        }
        com.tencent.mm.plugin.hp.b.a.cJ(5, 0);
        break label235;
        break;
      }
      label423:
      continue;
      label425:
      new com.tencent.mm.plugin.hp.b.e(this.kmT).fL(this.kmS);
      h.mEJ.a(614L, 70L, 1L, false);
      paramInt1 += 1;
      com.tencent.mm.plugin.hp.tinker.g.G(ad.getContext(), paramInt1);
      x.d("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "add retry time %d", new Object[] { Integer.valueOf(paramInt1) });
      continue;
      x.d("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "check tinker update failed.");
      com.tencent.mm.plugin.hp.b.a.cJ(5, paramInt2);
    }
  }
  
  public final int getType()
  {
    return 922;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/hp/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */