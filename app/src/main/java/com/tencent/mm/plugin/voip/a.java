package com.tencent.mm.plugin.voip;

import android.content.Context;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.g.a.su;
import com.tencent.mm.g.a.su.a;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.voip.model.i;
import com.tencent.mm.plugin.voip.model.j;
import com.tencent.mm.plugin.voip.model.m;
import com.tencent.mm.plugin.voip.model.n.a;
import com.tencent.mm.plugin.voip.model.q;
import com.tencent.mm.plugin.voip.model.r;
import com.tencent.mm.plugin.voip.model.s;
import com.tencent.mm.plugin.voip.model.t;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.protocal.c.caa;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ay;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class a
  extends com.tencent.mm.sdk.b.c<su>
{
  public a()
  {
    this.sFo = su.class.getName().hashCode();
  }
  
  private static boolean a(su paramsu)
  {
    boolean bool = true;
    int i = 1;
    int j = 1;
    if ((!(paramsu instanceof su)) || (!au.HX())) {}
    for (;;)
    {
      return false;
      Object localObject1;
      Object localObject2;
      switch (paramsu.cdE.bOh)
      {
      case 7: 
      case 8: 
      default: 
        return false;
      case 1: 
        i.bJI();
        localObject1 = r.OG(paramsu.cdE.content);
        if (localObject1 != null) {
          if (((n.a)localObject1).bKi())
          {
            paramsu.cdF.type = 2;
            return false;
          }
        }
        break;
      case 2: 
        paramsu.cdF.cdG = i.bJI().bCI;
        return false;
      case 5: 
        if (com.tencent.mm.p.a.BQ())
        {
          com.tencent.mm.ui.base.h.i(paramsu.cdE.context, R.l.multitalk_in_tip, R.l.app_tip);
          return false;
        }
        if (paramsu.cdE.cdz == 2)
        {
          q.aK(paramsu.cdE.context, paramsu.cdE.talker);
          return false;
        }
        if (paramsu.cdE.cdz == 3)
        {
          q.aL(paramsu.cdE.context, paramsu.cdE.talker);
          return false;
        }
        if (paramsu.cdE.cdz == 4)
        {
          q.aM(paramsu.cdE.context, paramsu.cdE.talker);
          return false;
        }
        break;
      case 3: 
        localObject1 = i.bJI();
        localObject2 = paramsu.cdE.cdy;
        if ((localObject2 != null) && (localObject2.length >= 10) && (localObject2[0] == 1))
        {
          paramsu = new byte[localObject2.length - 1];
          System.arraycopy(localObject2, 1, paramsu, 0, paramsu.length);
          localObject2 = ((r)localObject1).oNa.oHa.oJX.oPS;
          ((m)localObject2).oLw = System.currentTimeMillis();
          com.tencent.mm.plugin.voip.b.a.eV("MicroMsg.VoipDailReport", "devin:recvInvite:" + ((m)localObject2).oLw);
          try
          {
            paramsu = (caa)new caa().aG(paramsu);
            x.d("MicroMsg.Voip.VoipService", "doTaskCallin in onInviteNotify");
            if (!((r)localObject1).oNa.bLd())
            {
              com.tencent.mm.plugin.report.service.h.mEJ.a(11523, true, true, new Object[] { Integer.valueOf(paramsu.rxG), Long.valueOf(paramsu.rxH), Integer.valueOf(paramsu.svK), Integer.valueOf(0), Long.valueOf(System.currentTimeMillis()) });
              ((r)localObject1).a(paramsu);
              return false;
            }
          }
          catch (IOException paramsu)
          {
            x.printErrStackTrace("MicroMsg.Voip.VoipService", paramsu, "", new Object[0]);
            return false;
          }
          com.tencent.mm.plugin.report.service.h.mEJ.a(11523, true, true, new Object[] { Integer.valueOf(paramsu.rxG), Long.valueOf(paramsu.rxH), Integer.valueOf(paramsu.svK), Integer.valueOf(0), Long.valueOf(System.currentTimeMillis()) });
          return false;
          if (((n.a)localObject1).oLD == n.a.oLK) {}
          for (i = j; i != 0; i = 0)
          {
            paramsu.cdF.type = 3;
            return false;
          }
        }
        break;
      case 4: 
        paramsu = paramsu.cdF;
        localObject1 = i.bJI();
        localObject2 = ad.getContext();
        if ((((r)localObject1).bCI) && (((r)localObject1).oNl) && (!((r)localObject1).oNm))
        {
          x.d("MicroMsg.Voip.VoipService", "isVideoCalling " + ((r)localObject1).oNc + " isAudioCalling " + ((r)localObject1).oNd);
          if (!bi.oW(((r)localObject1).talker))
          {
            au.HU();
            if (com.tencent.mm.model.c.FR().Yg(((r)localObject1).talker) != null) {
              r.a((Context)localObject2, ((r)localObject1).talker, true, ((r)localObject1).oNc, true);
            }
          }
        }
        for (;;)
        {
          paramsu.cdH = bool;
          return false;
          bool = false;
        }
      case 6: 
        localObject1 = i.bJI();
        paramsu = paramsu.cdE.cdy;
        if (paramsu == null)
        {
          x.i("MicroMsg.Voip.VoipService", "sidney:notify content null");
          return false;
        }
        x.i("MicroMsg.Voip.VoipService", "____voipNotify with data size:" + paramsu.length);
        j = ByteBuffer.wrap(paramsu, 0, 4).getInt();
        long l = ByteBuffer.wrap(paramsu, 4, 8).getLong();
        x.i("MicroMsg.Voip.VoipService", "voipNotify roomid:" + j + " roomkey:" + l);
        if (((r)localObject1).oNn == null)
        {
          localObject2 = ((r)localObject1).oNa;
          x.i("MicroMsg.Voip.VoipServiceEx", "current roomid:%d, params roomid:%d", new Object[] { Integer.valueOf(((s)localObject2).oHa.oJX.kpo), Integer.valueOf(j) });
          if ((j != 0) && (((s)localObject2).oHa.oJX.kpo == j)) {}
          while (i == 0)
          {
            x.e("MicroMsg.Voip.VoipService", "voipSyncStatus ignored , not current roomid");
            return false;
            i = 0;
          }
        }
        if (paramsu.length > 12) {
          ((r)localObject1).b(r.R(paramsu, paramsu.length - 12), j, l);
        }
        paramsu = ((r)localObject1).oNa;
        com.tencent.mm.plugin.voip.b.a.eU("MicroMsg.Voip.VoipServiceEx", g.Ac() + " need doSync by notify, status:" + paramsu.oHa.mStatus);
        paramsu.oHa.oKa.a(null, false, 7);
        return false;
      case 9: 
        localObject1 = i.bJI();
        localObject2 = paramsu.cdE.cdy;
        if ((!bi.bC((byte[])localObject2)) && (localObject2[0] == 3)) {
          try
          {
            x.i("MicroMsg.Voip.VoipService", "onCancelNotify");
            paramsu = new byte[localObject2.length - 1];
            System.arraycopy(localObject2, 1, paramsu, 0, paramsu.length);
            localObject2 = new caa();
            ((caa)localObject2).aG(paramsu);
            ((r)localObject1).yH(((caa)localObject2).rxG);
            if ((((r)localObject1).oNn != null) && (((caa)localObject2).rxG == ((r)localObject1).oNn.rxG) && (!((r)localObject1).ltH.ciq()))
            {
              ((r)localObject1).oNn = null;
              ((r)localObject1).oNo = 0L;
              ((r)localObject1).ltH.SO();
            }
            paramsu = ((r)localObject1).oNa;
            x.i("MicroMsg.Voip.VoipServiceEx", "onCancelInviteNotify, roomId: %s", new Object[] { Integer.valueOf(((caa)localObject2).rxG) });
            if ((paramsu.oHa.oKc != null) && (((caa)localObject2).rxG == paramsu.oHa.oKc.rxG))
            {
              paramsu.bLi();
              paramsu.oHa.shutdown();
              return false;
            }
          }
          catch (Exception paramsu)
          {
            x.e("MicroMsg.Voip.VoipService", "onCancelNotify error: %s", new Object[] { paramsu.getMessage() });
            return false;
          }
        }
        break;
      case 10: 
        localObject1 = i.bJI();
        localObject2 = paramsu.cdE.cdy;
        if ((!bi.bC((byte[])localObject2)) && (localObject2[0] == 2)) {
          try
          {
            x.i("MicroMsg.Voip.VoipService", "onAnswerNotify");
            paramsu = new byte[localObject2.length - 1];
            System.arraycopy(localObject2, 1, paramsu, 0, paramsu.length);
            localObject2 = new caa();
            ((caa)localObject2).aG(paramsu);
            paramsu = ((r)localObject1).oNa;
            x.i("MicroMsg.Voip.VoipServiceEx", "onAnswerNotify, roomId: %s", new Object[] { Integer.valueOf(((caa)localObject2).rxG) });
            if (((caa)localObject2).rxG == paramsu.oHa.oKc.rxG) {
              if (paramsu.oHa.bXc)
              {
                x.i("MicroMsg.Voip.VoipServiceEx", "onAnswerNotify, already accept, ignore it");
                return false;
              }
            }
          }
          catch (Exception paramsu)
          {
            x.e("MicroMsg.Voip.VoipService", "onAnswerNotify error: %s", new Object[] { paramsu.getMessage() });
            return false;
          }
        }
        break;
      }
    }
    x.i("MicroMsg.Voip.VoipServiceEx", "onAnswerNotify, not accept, hangout");
    paramsu.bLi();
    paramsu.oHa.shutdown();
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/voip/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */