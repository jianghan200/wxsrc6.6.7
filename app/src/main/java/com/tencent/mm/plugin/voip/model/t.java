package com.tencent.mm.plugin.voip.model;

import com.tencent.mm.ab.l;
import com.tencent.mm.bk.b;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.voip.b.a;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bzt;
import com.tencent.mm.protocal.c.bzu;
import com.tencent.mm.protocal.c.caf;
import com.tencent.mm.protocal.c.cak;
import com.tencent.mm.protocal.c.cav;
import com.tencent.mm.protocal.c.cax;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.util.LinkedList;

public final class t
{
  j oHa = null;
  caf oNI = new caf();
  private bzu oNJ = null;
  private int oNK = 0;
  
  public t(j paramj)
  {
    this.oHa = paramj;
  }
  
  private void a(bzu parambzu)
  {
    if (parambzu == null)
    {
      a.eT("MicroMsg.Voip.VoipSyncHandle", "failed to pushVoipCmdList , VoipCmdList = null");
      this.oNK += 1;
      return;
    }
    if (this.oNJ == null) {
      this.oNJ = new bzu();
    }
    int i = 0;
    while (i < parambzu.hbF)
    {
      bzt localbzt = (bzt)parambzu.hbG.get(i);
      this.oNJ.hbG.add(localbzt);
      i += 1;
    }
    this.oNJ.hbF = this.oNJ.hbG.size();
  }
  
  private void b(bzu parambzu)
  {
    if ((this.oNJ == null) || (this.oNJ.hbF <= 0)) {
      return;
    }
    int i = 0;
    while (i < this.oNJ.hbF)
    {
      bzt localbzt = (bzt)this.oNJ.hbG.get(i);
      parambzu.hbG.add(localbzt);
      i += 1;
    }
    parambzu.hbF = parambzu.hbG.size();
    bLl();
  }
  
  public final int a(bzu parambzu, boolean paramBoolean, int paramInt)
  {
    if (this.oHa.oJX.kpo == 0)
    {
      a.eT("MicroMsg.Voip.VoipSyncHandle", g.Ac() + "failed to do voip sync , roomid = 0");
      return 0;
    }
    if (this.oHa.oKd)
    {
      a.eT("MicroMsg.Voip.VoipSyncHandle", g.Ac() + "voip syncing, push to cache...");
      a(parambzu);
      return 0;
    }
    this.oHa.oKd = true;
    if (parambzu == null)
    {
      parambzu = new bzu();
      parambzu.hbF = 0;
      parambzu.hbG = new LinkedList();
    }
    for (;;)
    {
      b(parambzu);
      this.oNK = 0;
      if (this.oHa.oKb == null) {
        this.oHa.oKb = "".getBytes();
      }
      a.eU("MicroMsg.Voip.VoipSyncHandle", "____doVoipSync, fromjni:" + paramBoolean + ",cmdList:" + parambzu.hbF + ",syncKey.length:" + this.oHa.oKb.length + ",selector:" + paramInt);
      new com.tencent.mm.plugin.voip.model.a.m(this.oHa.oJX.kpo, parambzu, this.oHa.oKb, this.oHa.oJX.kpp, paramInt).bLp();
      return 0;
    }
  }
  
  public final void a(cak paramcak)
  {
    au.Em().H(new t.1(this, paramcak));
  }
  
  public final void a(cav paramcav, int paramInt)
  {
    a.eU("MicroMsg.Voip.VoipSyncHandle", "onStatusChanged:  status:" + paramcav.hcd);
    if (paramcav.hcd == 1)
    {
      this.oHa.oJw = true;
      if (1 == paramInt)
      {
        paramcav = this.oHa.oJX.oPS;
        if (0L == paramcav.oLs)
        {
          paramcav.oLs = System.currentTimeMillis();
          a.eU("MicroMsg.VoipDailReport", "accept received timestamp:" + paramcav.oLs);
        }
      }
      if (3 == paramInt)
      {
        paramcav = this.oHa.oJX.oPS;
        if (0L == paramcav.oLt)
        {
          paramcav.oLt = System.currentTimeMillis();
          a.eU("MicroMsg.VoipDailReport", "sync accept received timestamp:" + paramcav.oLt);
        }
      }
      a.eU("MicroMsg.Voip.VoipSyncHandle", "zhengxue[DataAccept]onVoipSyncStatus:ACCEPTdata Flag: " + paramInt);
      this.oHa.oJY.aWJ();
      i.bJI().oNa.bLk();
      this.oHa.oJx = true;
      if (this.oHa.oJz == true)
      {
        this.oHa.oJz = false;
        if (this.oHa.oJv != true) {
          break label317;
        }
        a.eU("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus:ACCEPT, pre-connect already success");
        this.oHa.bJT();
      }
      for (;;)
      {
        h.mEJ.h(11519, new Object[] { Integer.valueOf(i.bJI().bKS()), Long.valueOf(i.bJI().bKT()), Long.valueOf(i.bJI().bKU()), Integer.valueOf(2) });
        this.oHa.bJZ();
        this.oHa.bKb();
        return;
        label317:
        if (this.oHa.oJy == true)
        {
          a.eU("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus: ACCEPT, pre-connect already fail");
          this.oHa.o(1, 56536, "");
        }
        else
        {
          a.eU("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus: ACCEPT, pre-connect still connecting...");
        }
      }
    }
    if (paramcav.hcd == 6)
    {
      a.eU("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus: ACKED");
      a.eU("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus: try use pre-connect");
      this.oHa.oJz = true;
      this.oHa.oJX.oON = 1;
      this.oHa.bJZ();
      return;
    }
    if (paramcav.hcd == 8)
    {
      a.eU("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus: ACK BUSY");
      this.oHa.oJX.oPS.oKR = 211;
      this.oHa.oJX.oPS.oKQ = 11;
      this.oHa.oJX.oPS.oLc = 12;
      h.mEJ.h(11519, new Object[] { Integer.valueOf(i.bJI().bKS()), Long.valueOf(i.bJI().bKT()), Long.valueOf(i.bJI().bKU()), Integer.valueOf(3) });
      this.oHa.o(1, 211, "");
      this.oHa.bKb();
      return;
    }
    if (paramcav.hcd == 2)
    {
      a.eU("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus...MM_VOIP_SYNC_STATUS_REJECT");
      this.oHa.oJX.oPS.oKQ = 103;
      this.oHa.oJX.oPS.oLc = 4;
      this.oHa.oJX.oPS.oLj = ((int)(System.currentTimeMillis() - this.oHa.oJX.oPS.beginTime));
      h.mEJ.h(11519, new Object[] { Integer.valueOf(i.bJI().bKS()), Long.valueOf(i.bJI().bKT()), Long.valueOf(i.bJI().bKU()), Integer.valueOf(1) });
      this.oHa.bKb();
      this.oHa.o(4, 0, "");
      return;
    }
    if (paramcav.hcd == 3)
    {
      this.oHa.oJX.oPS.oLc = 5;
      return;
    }
    if (paramcav.hcd == 4)
    {
      a.eU("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus...MM_VOIP_SYNC_STATUS_SHUTDOWN");
      if (this.oHa.mStatus < 6) {
        this.oHa.oJX.oPS.oLd = 1;
      }
      this.oHa.oJX.oPS.oKQ = 110;
      this.oHa.o(6, 0, "");
      this.oHa.bKb();
      return;
    }
    a.eU("MicroMsg.Voip.VoipSyncHandle", "onStatusChanged: unknow status:" + paramcav.hcd);
  }
  
  public final void b(cak paramcak)
  {
    j localj = this.oHa;
    paramcak = paramcak.rfy.siK.toByteArray();
    localj.oJX.oOo = paramcak;
    localj.bKa();
  }
  
  public final void bLl()
  {
    if (this.oNJ == null) {
      return;
    }
    this.oNJ.hbG.clear();
    this.oNJ.hbF = 0;
    this.oNJ = null;
    this.oNK = 0;
  }
  
  public final void c(bhy parambhy)
  {
    int i = a.aV(parambhy.siK.toByteArray());
    a.eU("MicroMsg.Voip.VoipSyncHandle", "voipSync remote status changed, status = " + i);
    parambhy = this.oHa;
    i &= 0xFF;
    if ((8 == i) || (9 == i)) {
      parambhy.oJP = i;
    }
    for (;;)
    {
      if ((1 == i) || (3 == i)) {
        parambhy.yw(2);
      }
      parambhy.oJY.yF(i);
      return;
      parambhy.oJN = i;
      parambhy.oJL = i;
    }
  }
  
  public final void o(l paraml)
  {
    x.i("MicroMsg.Voip.VoipSyncHandle", "____VoipSyncResp");
    this.oHa.oKd = false;
    Object localObject1 = (cax)((com.tencent.mm.plugin.voip.model.a.m)paraml).bLq();
    this.oHa.oJX.parseSyncKeyBuff(this.oHa.oKb, this.oHa.oKb.length);
    int j = this.oHa.oJX.field_statusSyncKey;
    int k = this.oHa.oJX.field_relayDataSyncKey;
    int m = this.oHa.oJX.field_connectingStatusKey;
    this.oHa.oJX.parseSyncKeyBuff(((cax)localObject1).rny.siK.toByteArray(), ((cax)localObject1).rny.siI);
    int n = this.oHa.oJX.field_statusSyncKey;
    int i1 = this.oHa.oJX.field_relayDataSyncKey;
    int i2 = this.oHa.oJX.field_connectingStatusKey;
    x.i("MicroMsg.Voip.VoipSyncHandle", "VoipSyncResp: oldStatusSyncKey:" + j + " oldRelayDataSyncKey:" + k + " oldConnectingStatusSyncKey:" + m);
    x.i("MicroMsg.Voip.VoipSyncHandle", "VoipSyncResp: newStatusSyncKey:" + n + " newRelayDataSyncKey:" + i1 + " newConnectingStatusSyncKey:" + i2);
    this.oHa.oKb = ((cax)localObject1).rny.siK.toByteArray();
    x.i("MicroMsg.Voip.VoipSyncHandle", "voipSync response: continueflag=" + ((cax)localObject1).rlm);
    localObject1 = ((cax)localObject1).sxi.hbG;
    if ((localObject1 != null) && (((LinkedList)localObject1).size() != 0))
    {
      x.i("MicroMsg.Voip.VoipSyncHandle", " syncOnSceneEnd cmdlist size" + ((LinkedList)localObject1).size());
      int i = ((com.tencent.mm.plugin.voip.model.a.m)paraml).bLo();
      x.i("MicroMsg.Voip.VoipSyncHandle", " syncOnSceneEnd cmdlist size:" + ((LinkedList)localObject1).size() + ",selector = " + i);
      i = 0;
      if (i < ((LinkedList)localObject1).size())
      {
        paraml = (bzt)((LinkedList)localObject1).get(i);
        int i3 = paraml.rtM;
        x.i("MicroMsg.Voip.VoipSyncHandle", "__parse sync resp, item cmdid:" + i3);
        if (i3 == 1) {
          if (n > j)
          {
            if (this.oHa.oJX.kpo != 0) {
              break label471;
            }
            a.eT("MicroMsg.Voip.VoipSyncHandle", "voipSyncStatus ignored , roomid = 0");
          }
        }
        for (;;)
        {
          i += 1;
          break;
          label471:
          Object localObject2;
          try
          {
            localObject2 = (cav)new cav().aG(paraml.rtN.siK.toByteArray());
            a.eU("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus in...from user=" + paraml.jTv + ",itemStatus =  " + ((cav)localObject2).hcd);
            a((cav)localObject2, 3);
          }
          catch (IOException paraml)
          {
            x.printErrStackTrace("MicroMsg.Voip.VoipSyncHandle", paraml, "", new Object[0]);
          }
          continue;
          if (i3 == 2)
          {
            if (i1 > k) {
              if (this.oHa.oJX.kpo == 0)
              {
                a.eT("MicroMsg.Voip.VoipSyncHandle", "RelayData ignored , roomid = 0");
              }
              else
              {
                try
                {
                  localObject2 = (cak)new cak().aG(paraml.rtN.siK.toByteArray());
                  a.eU("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncRelayData ...relayType = " + ((cak)localObject2).hcE + ",from user = " + paraml.jTv);
                  if (((cak)localObject2).hcE != 5) {
                    break label696;
                  }
                  a((cak)localObject2);
                }
                catch (IOException paraml)
                {
                  x.printErrStackTrace("MicroMsg.Voip.VoipSyncHandle", paraml, "", new Object[0]);
                }
                continue;
                label696:
                if (((cak)localObject2).hcE == 3)
                {
                  this.oHa.aR(((cak)localObject2).rfy.siK.toByteArray());
                  if ((((cak)localObject2).rfy != null) && (((cak)localObject2).rfy.siK != null)) {
                    this.oNI.suL = ((cak)localObject2);
                  }
                }
                else if (((cak)localObject2).hcE == 2)
                {
                  this.oHa.aQ(((cak)localObject2).rfy.siK.toByteArray());
                  if ((((cak)localObject2).rfy != null) && (((cak)localObject2).rfy.siK != null)) {
                    this.oNI.suK = ((cak)localObject2);
                  }
                }
                else if (((cak)localObject2).hcE == 1)
                {
                  b((cak)localObject2);
                }
              }
            }
          }
          else if ((i3 == 3) && (i2 > m)) {
            if (this.oHa.oJX.kpo == 0)
            {
              x.e("MicroMsg.Voip.VoipSyncHandle", "voipSync(ClientStatus) ignored , roomid = 0");
            }
            else
            {
              try
              {
                localObject2 = new bhy().br(paraml.rtN.siK.toByteArray());
                if (!paraml.jTv.equals(q.GF())) {
                  break label929;
                }
                a.eT("MicroMsg.Voip.VoipSyncHandle", "svr response: local connecting status changed.");
              }
              catch (IOException paraml)
              {
                x.printErrStackTrace("MicroMsg.Voip.VoipSyncHandle", paraml, "", new Object[0]);
              }
              continue;
              label929:
              c((bhy)localObject2);
            }
          }
        }
      }
    }
    x.i("MicroMsg.Voip.VoipSyncHandle", "__parse sync resp end");
    if (((this.oNJ != null) && (this.oNJ.hbF > 0)) || (this.oNK > 0)) {
      a(null, false, 7);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/voip/model/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */