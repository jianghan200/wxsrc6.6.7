package com.tencent.mm.ab;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.RemoteException;
import com.tencent.mm.model.av;
import com.tencent.mm.network.j;
import com.tencent.mm.network.q;
import com.tencent.mm.network.r;
import com.tencent.mm.network.r.a;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.report.f;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.c.awb;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bkc;
import com.tencent.mm.protocal.c.sx;
import com.tencent.mm.protocal.g;
import com.tencent.mm.protocal.h;
import com.tencent.mm.protocal.i.c;
import com.tencent.mm.protocal.i.c.a;
import com.tencent.mm.protocal.i.f;
import com.tencent.mm.protocal.i.g;
import com.tencent.mm.protocal.u.a;
import com.tencent.mm.protocal.u.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class t
  extends r.a
{
  private q dJM;
  g dJZ;
  h dKa;
  ag handler;
  
  public t(q paramq) {}
  
  public t(q paramq, ag paramag)
  {
    this.dJM = paramq;
    this.dJZ = new s(paramq.KV(), paramq.getType());
    this.dKa = new u(paramq.Id(), paramq.getType());
    this.handler = paramag;
  }
  
  public final int KP()
  {
    return this.dJM.KP();
  }
  
  public final boolean KW()
  {
    return this.dJM.KW();
  }
  
  public final g LC()
  {
    return this.dJZ;
  }
  
  public final h LD()
  {
    return this.dKa;
  }
  
  public final int LE()
  {
    int j = -1;
    int i = getType();
    x.d("MicroMsg.RemoteReqResp", "summerauth decodeAndRetriveAccInfo type:%d", new Object[] { Integer.valueOf(i) });
    switch (i)
    {
    default: 
      return -1;
    case 701: 
    case 702: 
      return av.b(this.dJM);
    }
    Object localObject2 = this.dJM;
    Object localObject1 = (u.a)((q)localObject2).KV();
    u.b localb = (u.b)((q)localObject2).Id();
    x.i("MicroMsg.MMReqRespReg2", "summerauth decodeAndRetriveAccInfo type:%d, stack[%s]", new Object[] { Integer.valueOf(126), bi.cjd() });
    if (localb.djx != 0) {
      x.d("MicroMsg.MMReqRespReg2", "summerauth decodeAndRetriveAccInfo resp just decoded and ret result:%d", new Object[] { Integer.valueOf(localb.djx) });
    }
    for (;;)
    {
      return localb.djx;
      Object localObject3 = localb.qWZ.rZo;
      if (localObject3 != null)
      {
        int k = ((bkc)localObject3).reH;
        localObject2 = ((bkc)localObject3).req;
        localObject3 = ab.a(((bkc)localObject3).rer);
        int m = ((sx)localObject2).reV.siI;
        int n = ((sx)localObject2).rwf;
        label223:
        byte[] arrayOfByte2;
        if (localObject3 == null)
        {
          i = -1;
          x.d("MicroMsg.MMReqRespReg2", "summerauth svr ecdh key len:%d, nid:%d sessionKey len:%d, sessionKey：%s", new Object[] { Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i), bi.Xf(bi.bB((byte[])localObject3)) });
          byte[] arrayOfByte1 = ab.a(((sx)localObject2).reV);
          arrayOfByte2 = ((u.a)localObject1).qWm;
          localObject1 = null;
          if (bi.bC(arrayOfByte1)) {
            break label610;
          }
          m = arrayOfByte1.length;
          localObject1 = bi.Xf(bi.bB(arrayOfByte1));
          if (arrayOfByte2 != null) {
            break label596;
          }
          i = -1;
          label318:
          x.d("MicroMsg.MMReqRespReg2", "summerauth svrPubKey len:%d value:%s prikey len:%d, values:%s", new Object[] { Integer.valueOf(m), localObject1, Integer.valueOf(i), bi.Xf(bi.bB(arrayOfByte2)) });
          localObject1 = new PByteArray();
          m = MMProtocalJni.computerKeyWithAllStr(((sx)localObject2).rwf, arrayOfByte1, arrayOfByte2, (PByteArray)localObject1, 0);
          localObject1 = ((PByteArray)localObject1).value;
          if (localObject1 != null) {
            break label603;
          }
          i = -1;
          label400:
          x.i("MicroMsg.MMReqRespReg2", "summerauth ComputerKeyWithAllStr ret:%d, agreedECDHKey len: %d, values:%s", new Object[] { Integer.valueOf(m), Integer.valueOf(i), bi.Xf(bi.bB((byte[])localObject1)) });
          label437:
          if (localObject1 == null) {
            break label620;
          }
          localObject2 = localObject1;
          label446:
          localb.qWo = ((byte[])localObject2);
          if ((k & 0x4) == 0) {
            break label690;
          }
          x.d("MicroMsg.MMReqRespReg2", "summerauth must decode session key");
          if (bi.bC((byte[])localObject1)) {
            break label666;
          }
          localObject1 = MMProtocalJni.aesDecrypt((byte[])localObject3, (byte[])localObject1);
          if (localObject3 != null) {
            break label628;
          }
          i = -1;
          label490:
          localObject2 = bi.bB((byte[])localObject3);
          if (localObject1 != null) {
            break label635;
          }
        }
        for (;;)
        {
          x.d("MicroMsg.MMReqRespReg2", "summerauth aesDecrypt sessionKey len:%d, value:%s, session len:%d, value:%s", new Object[] { Integer.valueOf(i), localObject2, Integer.valueOf(j), bi.Xf(bi.bB((byte[])localObject1)) });
          if (bi.bC((byte[])localObject1)) {
            break label642;
          }
          x.d("MicroMsg.MMReqRespReg2", "summerauth decode session key succ session:%s", new Object[] { bi.Xf(bi.bB((byte[])localObject1)) });
          localb.bl((byte[])localObject1);
          localb.djx = 1;
          break;
          i = localObject3.length;
          break label223;
          label596:
          i = arrayOfByte2.length;
          break label318;
          label603:
          i = localObject1.length;
          break label400;
          label610:
          x.w("MicroMsg.MMReqRespReg2", "summerauth svr ecdh key is null!");
          break label437;
          label620:
          localObject2 = new byte[0];
          break label446;
          label628:
          i = localObject3.length;
          break label490;
          label635:
          j = localObject1.length;
        }
        label642:
        x.d("MicroMsg.MMReqRespReg2", "summerauth decode session key failed ret null!");
        localb.bl(new byte[0]);
        localb.djx = 2;
        continue;
        label666:
        x.d("MicroMsg.MMReqRespReg2", "summerauth decode session key failed as agreedECDHKey is null!");
        localb.bl(new byte[0]);
        localb.djx = 2;
        continue;
        label690:
        x.d("MicroMsg.MMReqRespReg2", "summerauth not need decode session key");
        localb.bl((byte[])localObject3);
        localb.djx = 1;
      }
      else
      {
        x.d("MicroMsg.MMReqRespReg2", "summerauth decodeAndRetriveAccInfo sect null and decode failed!");
        localb.bl(new byte[0]);
        localb.djx = 2;
      }
    }
  }
  
  public final int Lb()
  {
    return this.dJM.hashCode();
  }
  
  public final void a(com.tencent.mm.network.d paramd, final j paramj, final int paramInt1, final int paramInt2)
  {
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        t localt = new t(new k(), t.this.handler);
        try
        {
          paramj.a(localt, paramInt1, paramInt2, "");
          return;
        }
        catch (RemoteException localRemoteException)
        {
          x.e("MicroMsg.RemoteReqResp", "exception:%s", new Object[] { bi.i(localRemoteException) });
        }
      }
    });
  }
  
  public final void a(final j paramj, final int paramInt1, final int paramInt2)
  {
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        int k = av.Ib().getInt("key_auth_update_version", 0);
        int j;
        Object localObject;
        if (k <= 637665332)
        {
          i = 701;
          j = i;
          if (k == 0)
          {
            localObject = ad.getContext().getSharedPreferences("ticket_prefs", 4);
            if (!bi.oW(((SharedPreferences)localObject).getString("_auth_ticket", ""))) {
              break label296;
            }
            x.i("MicroMsg.RemoteReqResp", "summerauth dealWithAutoAuth revise to autoauth");
            f.mDy.a(148L, 50L, 1L, true);
            j = 702;
          }
          label81:
          x.i("MicroMsg.RemoteReqResp", "summerauth dealWithAutoAuth updateVersion:%d, clientVersion:%d WLOGIN_BUG_VERSION:%d, newAuthType:%d", new Object[] { Integer.valueOf(k), Integer.valueOf(com.tencent.mm.protocal.d.qVN), Integer.valueOf(637665332), Integer.valueOf(j) });
          if (j == 701) {
            f.mDy.a(148L, 48L, 1L, true);
          }
          if (((t.a(t.this).getType() != 702) && (t.a(t.this).getType() != 701)) || (((i.g)t.a(t.this).Id()).djx != 2)) {
            break label386;
          }
        }
        label296:
        label386:
        for (int i = 1;; i = 0)
        {
          x.i("MicroMsg.RemoteReqResp", "summerauth dealWithAutoAuth old type:%d new auth type:%d, reqFlag:%d", new Object[] { Integer.valueOf(t.a(t.this).getType()), Integer.valueOf(j), Integer.valueOf(i) });
          localObject = i.c.a.qWj.aZ(j, i);
          if (localObject == null) {}
          for (localObject = null;; localObject = new t((q)localObject, t.this.handler))
          {
            try
            {
              paramj.a((r)localObject, paramInt1, paramInt2, "");
              return;
            }
            catch (RemoteException localRemoteException)
            {
              x.e("MicroMsg.RemoteReqResp", "exception:%s", new Object[] { bi.i(localRemoteException) });
              return;
            }
            i = 702;
            break;
            f.mDy.a(148L, 49L, 1L, true);
            x.i("MicroMsg.RemoteReqResp", "summerauth dealWithAutoAuth keep manual as old [%s]", new Object[] { bi.Xf(((SharedPreferences)localObject).getString("_auth_ticket", "")) });
            j = i;
            break label81;
          }
        }
      }
    });
  }
  
  public final void a(j paramj, final int paramInt1, final int paramInt2, final String paramString)
  {
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        x.d("MicroMsg.RemoteReqResp", "summerauth doAutoAuthEnd type:%d, stack[%s]", new Object[] { Integer.valueOf(t.a(t.this).getType()), bi.cjd() });
        i.f localf = (i.f)t.a(t.this).KV();
        i.g localg = (i.g)t.a(t.this).Id();
        if (localg == null)
        {
          x.f("MicroMsg.RemoteReqResp", "null auth.resp");
          return;
        }
        i.c.a.qWj.a(localf, localg, paramInt1, paramInt2, paramString);
      }
    });
  }
  
  public final int getType()
  {
    return this.dJM.getType();
  }
  
  public final String getUri()
  {
    return this.dJM.getUri();
  }
  
  public final void kk(String paramString) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ab/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */