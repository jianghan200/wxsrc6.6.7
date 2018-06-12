package com.tencent.mm.plugin.bbom;

import android.os.RemoteException;
import com.tencent.mm.a.n;
import com.tencent.mm.ab.u;
import com.tencent.mm.bk.b;
import com.tencent.mm.booter.NotifyReceiver.NotifyService;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.g.a.ah;
import com.tencent.mm.g.a.fy;
import com.tencent.mm.g.a.ij;
import com.tencent.mm.g.a.kg;
import com.tencent.mm.g.a.kg.a;
import com.tencent.mm.g.a.po;
import com.tencent.mm.g.a.rn;
import com.tencent.mm.g.a.rn.b;
import com.tencent.mm.g.a.ss;
import com.tencent.mm.g.a.su;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.zero.a.c;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.c.bkd;
import com.tencent.mm.protocal.o.b;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class o
  implements c
{
  public final void a(NotifyReceiver.NotifyService paramNotifyService, int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, long paramLong)
  {
    switch (paramInt)
    {
    default: 
    case 10: 
    case 120: 
    case 174: 
    case 102: 
    case 192: 
    case 268369923: 
    case 241: 
      do
      {
        do
        {
          do
          {
            do
            {
              for (;;)
              {
                return;
                x.d("MicroMsg.NotifyReceiverCallbackImpl", "on direct send notify");
                paramNotifyService = new o.b();
                paramNotifyService.deviceID = q.zz();
                paramArrayOfByte2 = new u(paramNotifyService, 10);
                try
                {
                  if (paramArrayOfByte2.a(10, paramArrayOfByte1, null))
                  {
                    au.DF().a(0, 0, "", new com.tencent.mm.modelsimple.f(paramNotifyService));
                    return;
                  }
                }
                catch (RemoteException paramNotifyService)
                {
                  x.printErrStackTrace("MicroMsg.NotifyReceiverCallbackImpl", paramNotifyService, "", new Object[0]);
                  return;
                }
              }
              NotifyReceiver.NotifyService.eB("NotifyReceiver.dealWithNotify:MM_PKT_VOIP_REQ");
              paramNotifyService = new rn();
              paramNotifyService.ccn.ccp = true;
              a.sFg.m(paramNotifyService);
              paramNotifyService = paramNotifyService.cco.ccr;
              if (!bi.oW(paramNotifyService))
              {
                x.v("MicroMsg.NotifyReceiverCallbackImpl", "voipinvite, exit talkroom first: " + paramNotifyService);
                paramNotifyService = new rn();
                paramNotifyService.ccn.ccq = true;
                a.sFg.m(paramNotifyService);
              }
            } while ((paramArrayOfByte1 == null) || (paramArrayOfByte1.length <= 0));
            if (paramArrayOfByte1[0] == 1)
            {
              x.d("MicroMsg.NotifyReceiverCallbackImpl", "dealWithNotify case MM_VOIP_PUSHTYPE_INVITE, will launch voipUI");
              paramNotifyService = new su();
              paramNotifyService.cdE.bOh = 3;
              paramNotifyService.cdE.cdy = paramArrayOfByte1;
              a.sFg.m(paramNotifyService);
              return;
            }
            if (paramArrayOfByte1[0] == 101)
            {
              x.d("MicroMsg.NotifyReceiverCallbackImpl", "dealWithNotify case MM_PSTN_PUSHTYPE_INVITE");
              paramNotifyService = new ij();
              paramNotifyService.bRR.bRS = paramArrayOfByte1;
              a.sFg.m(paramNotifyService);
              return;
            }
            if (paramArrayOfByte1[0] == 3)
            {
              x.d("MicroMsg.NotifyReceiverCallbackImpl", "dealWithNotify, MM_VOIP_PUSHTYPE_CANCEL");
              paramNotifyService = new su();
              paramNotifyService.cdE.bOh = 9;
              paramNotifyService.cdE.cdy = paramArrayOfByte1;
              a.sFg.m(paramNotifyService);
              return;
            }
            if (paramArrayOfByte1[0] == 2)
            {
              x.d("MicroMsg.NotifyReceiverCallbackImpl", "dealWithNotify, MM_VOIP_PUSHTYPE_ANSWERED");
              paramNotifyService = new su();
              paramNotifyService.cdE.bOh = 10;
              paramNotifyService.cdE.cdy = paramArrayOfByte1;
              a.sFg.m(paramNotifyService);
              return;
            }
          } while (paramArrayOfByte1[0] != 102);
          x.d("MicroMsg.NotifyReceiverCallbackImpl", "dealWithNotify, MM_VOIP_PUSHTYPE_ANSWERED");
          paramNotifyService = new ss();
          paramNotifyService.cdx.cdy = paramArrayOfByte1;
          a.sFg.m(paramNotifyService);
          return;
          x.i("MicroMsg.NotifyReceiverCallbackImpl", "dealWithNotify MMFunc_VoipSync do VoipSync");
          paramNotifyService = new su();
          paramNotifyService.cdE.bOh = 6;
          paramNotifyService.cdE.cdy = paramArrayOfByte1;
          a.sFg.m(paramNotifyService);
          return;
          x.i("MicroMsg.NotifyReceiverCallbackImpl", "dealWithNotify MM_VOIP_CS_PUSHTYPE_SYN do VoipSync");
          return;
          paramNotifyService = new fy();
          paramNotifyService.bOJ.bOK = paramArrayOfByte1;
          a.sFg.m(paramNotifyService);
          return;
          NotifyReceiver.NotifyService.eB("NotifyReceiver.dealWithNotify:MM_PKT_VOIP_REQ");
        } while (bi.bC(paramArrayOfByte1));
        paramNotifyService = new String(paramArrayOfByte1);
        paramArrayOfByte1 = new ah();
        paramArrayOfByte1.bHy.type = 4;
        paramArrayOfByte1.bHy.bHA = paramNotifyService;
        a.sFg.m(paramArrayOfByte1);
        return;
        x.i("MicroMsg.NotifyReceiverCallbackImpl", "jacks do voice notify UI");
      } while (paramArrayOfByte1.length < 8);
      paramNotifyService = new byte[4];
      paramArrayOfByte2 = new byte[4];
      System.arraycopy(paramArrayOfByte1, 0, paramNotifyService, 0, 4);
      System.arraycopy(paramArrayOfByte1, 4, paramArrayOfByte2, 0, 4);
      paramArrayOfByte1 = new kg();
      paramArrayOfByte1.bUD.bUE = n.r(paramNotifyService, 0);
      paramArrayOfByte1.bUD.bUF = n.r(paramArrayOfByte2, 0);
      x.i("MicroMsg.NotifyReceiverCallbackImpl", "notifyId: %d, sequence: %d", new Object[] { Integer.valueOf(paramArrayOfByte1.bUD.bUE), Integer.valueOf(paramArrayOfByte1.bUD.bUF) });
      a.sFg.m(paramArrayOfByte1);
      return;
    }
    if (paramArrayOfByte1 == null)
    {
      paramInt = -1;
      x.i("MicroMsg.NotifyReceiverCallbackImpl", "summerbadcr on MM_PKT_SILENCE_NOTIFY notify respBuf len[%d]", new Object[] { Integer.valueOf(paramInt) });
      com.tencent.mm.plugin.report.f.mDy.a(403L, 38L, 1L, false);
      if (paramArrayOfByte1 == null) {
        break label991;
      }
    }
    label991:
    for (paramNotifyService = new bkd();; paramNotifyService = null)
    {
      try
      {
        paramNotifyService.aG(paramArrayOfByte1);
        x.i("MicroMsg.NotifyReceiverCallbackImpl", "summerbadcr MM_PKT_SILENCE_NOTIFY secureData[%d, %d, %d, %d, %d, %d]", new Object[] { Integer.valueOf(paramNotifyService.sjL), Integer.valueOf(paramNotifyService.sjM), Integer.valueOf(paramNotifyService.sjN), Integer.valueOf(paramNotifyService.sjO), Integer.valueOf(paramNotifyService.sjP), Integer.valueOf(paramNotifyService.sjQ) });
        paramNotifyService = MMProtocalJni.decodeSecureNotifyData(paramArrayOfByte2, paramNotifyService.sjL, paramNotifyService.sjM, paramNotifyService.sjN, paramNotifyService.sjO, paramNotifyService.sjP, paramNotifyService.sjQ, paramNotifyService.sjR, paramNotifyService.rwb.lR);
        if (paramNotifyService == null) {
          break label996;
        }
        x.i("MicroMsg.NotifyReceiverCallbackImpl", "summerbadcr on MM_PKT_SILENCE_NOTIFY data len:%d", new Object[] { Integer.valueOf(paramNotifyService.length) });
        paramArrayOfByte1 = new po();
        paramArrayOfByte1.cav.data = paramNotifyService;
        a.sFg.m(paramArrayOfByte1);
        return;
      }
      catch (Exception paramNotifyService)
      {
        x.e("MicroMsg.NotifyReceiverCallbackImpl", "summerbadcr MM_PKT_SILENCE_NOTIFY secureData parseFrom e: " + paramNotifyService.getMessage());
        com.tencent.mm.plugin.report.f.mDy.a(403L, 39L, 1L, false);
      }
      paramInt = paramArrayOfByte1.length;
      break;
    }
    label996:
    x.e("MicroMsg.NotifyReceiverCallbackImpl", "summerbadcr on MM_PKT_SILENCE_NOTIFY data is null");
    com.tencent.mm.plugin.report.f.mDy.a(403L, 40L, 1L, false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/bbom/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */