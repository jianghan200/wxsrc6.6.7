package com.tencent.mm.plugin.wallet_core.c.a;

import android.content.Context;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.Orders.DiscountInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders.Promotions;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.azi;
import com.tencent.mm.protocal.c.azj;
import com.tencent.mm.protocal.c.azm;
import com.tencent.mm.protocal.c.azt;
import com.tencent.mm.protocal.c.azu;
import com.tencent.mm.protocal.c.azv;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class c
  extends m
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public Orders pjG;
  public int pjR = 0;
  
  public c(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new azt();
    ((b.a)localObject).dIH = new azu();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/payibgjsgettransaction";
    ((b.a)localObject).dIF = 1565;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (azt)this.diG.dID.dIL;
    ((azt)localObject).jQb = paramString1;
    ((azt)localObject).rsx = paramString4;
    ((azt)localObject).rsw = paramString2;
    ((azt)localObject).rsy = paramString5;
    ((azt)localObject).rsz = paramString6;
    ((azt)localObject).rhq = paramString3;
    ((azt)localObject).rrC = paramString7;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.i("MicroMsg.NetSceneIbgGetTransaction", "hy: get h5 transaction: errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    azu localazu = (azu)((b)paramq).dIE.dIL;
    int i = paramInt2;
    paramq = paramString;
    if (paramInt2 == 0)
    {
      i = paramInt2;
      paramq = paramString;
      if (paramInt1 == 0)
      {
        i = localazu.iwS;
        paramq = localazu.iwT;
      }
    }
    x.i("MicroMsg.NetSceneIbgGetTransaction", "resp.IsUseNewPage: %s", new Object[] { Integer.valueOf(localazu.scv) });
    this.pjR = localazu.scv;
    this.pjG = new Orders();
    this.pjG.pjA = 1;
    if ((localazu == null) || (localazu.scs == null)) {
      x.e("MicroMsg.NetSceneIbgGetTransaction", "hy: info not valid");
    }
    for (;;)
    {
      paramString = paramq;
      if (bi.oW(paramq)) {
        paramString = ad.getContext().getString(a.i.wallet_data_err);
      }
      this.diJ.a(paramInt1, i, paramString, this);
      return;
      this.pjG.mBj = localazu.scs.scy;
      paramString = new Orders.Commodity();
      paramString.bOe = localazu.scs.myq;
      paramString.desc = localazu.scs.dWh;
      paramString.hUL = (localazu.scs.scy / 100.0D);
      paramString.lNO = String.valueOf(localazu.scs.scA);
      paramString.lNP = localazu.scs.scB;
      paramString.lNT = localazu.scs.scx;
      paramString.lNR = localazu.scs.scw;
      paramString.lNV = localazu.scs.lNV;
      paramString.lNK = localazu.scs.scz;
      paramString.ppw = (localazu.scs.scC / 100.0D);
      Object localObject1;
      if (localazu.sct != null)
      {
        paramString.lNW = localazu.sct.rnD;
        localObject1 = new Orders.Promotions();
        ((Orders.Promotions)localObject1).name = localazu.sct.scd;
        ((Orders.Promotions)localObject1).lNW = localazu.sct.rnD;
        paramString.ppx = localazu.sct.rnD;
        ((Orders.Promotions)localObject1).lRX = localazu.sct.huW;
        paramString.poW = localazu.sct.scb;
        ((Orders.Promotions)localObject1).type = Orders.ppu;
        if (!bi.oW(((Orders.Promotions)localObject1).name))
        {
          paramString.ppF.add(localObject1);
          paramString.ppG = true;
        }
      }
      Object localObject2;
      Object localObject3;
      for (this.pjG.poW = localazu.sct.scb; (localazu.scs.scD != null) && (localazu.scs.scD.size() > 0); this.pjG.poW = 0)
      {
        paramString.ppz = new ArrayList();
        localObject1 = localazu.scs.scD.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (azm)((Iterator)localObject1).next();
          localObject3 = new Orders.DiscountInfo();
          ((Orders.DiscountInfo)localObject3).mwP = ((azm)localObject2).sce;
          paramString.ppz.add(localObject3);
        }
        x.i("MicroMsg.NetSceneIbgGetTransaction", "hy: no biz info");
      }
      if ((localazu.scu != null) && (localazu.scu.size() > 0))
      {
        paramString.ppF = new ArrayList();
        localObject1 = localazu.scu.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (azi)((Iterator)localObject1).next();
          localObject3 = new Orders.Promotions();
          ((Orders.Promotions)localObject3).type = Orders.ppv;
          ((Orders.Promotions)localObject3).url = ((azi)localObject2).url;
          ((Orders.Promotions)localObject3).name = ((azi)localObject2).bSc;
          ((Orders.Promotions)localObject3).lRX = ((azi)localObject2).bWP;
          ((Orders.Promotions)localObject3).poG = ((azi)localObject2).pwk;
          ((Orders.Promotions)localObject3).ppS = bi.getInt(((azi)localObject2).type, 0);
          ((Orders.Promotions)localObject3).title = ((azi)localObject2).title;
          ((Orders.Promotions)localObject3).pji = ((azi)localObject2).pqc;
          ((Orders.Promotions)localObject3).ppT = ((int)((azi)localObject2).pqd);
          ((Orders.Promotions)localObject3).ppV = ((azi)localObject2).poH;
          ((Orders.Promotions)localObject3).ppU = ((int)((azi)localObject2).pqe);
          ((Orders.Promotions)localObject3).poD = ((azi)localObject2).pqf;
          ((Orders.Promotions)localObject3).poE = ((azi)localObject2).pqg;
          ((Orders.Promotions)localObject3).ppW = ((azi)localObject2).sbY;
          ((Orders.Promotions)localObject3).ppX = ((azi)localObject2).sbZ;
          ((Orders.Promotions)localObject3).poF = ((azi)localObject2).pqh;
          ((Orders.Promotions)localObject3).ppY = ((azi)localObject2).sca;
          paramString.ppF.add(localObject3);
        }
      }
      this.pjG.ppf = new ArrayList();
      this.pjG.ppf.add(paramString);
      this.pjG.poY = localazu.scs.scB;
      x.i("MicroMsg.NetSceneIbgGetTransaction", "formatOrders finish, mOrder.commoditys.size: %s, mOrder: %s", new Object[] { Integer.valueOf(this.pjG.ppf.size()), this.pjG });
    }
  }
  
  public final int getType()
  {
    return 1565;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */