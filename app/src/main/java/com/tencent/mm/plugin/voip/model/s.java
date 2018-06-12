package com.tencent.mm.plugin.voip.model;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Looper;
import android.telephony.TelephonyManager;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.voip.model.a.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bn;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public final class s
  implements j.a
{
  private static int fNP = -1;
  private static int oNv = -1;
  static int oNw = 20;
  WifiManager bnh;
  public j oHa = k.bKc();
  WifiInfo oNA;
  private al oNB = new al(Looper.getMainLooper(), new s.1(this), false);
  private byte[] oNC = new byte['Ǵ'];
  al oND = new al(Looper.getMainLooper(), new s.2(this), true);
  al oNE = new al(Looper.getMainLooper(), new s.3(this), true);
  al oNF = new al(Looper.getMainLooper(), new s.4(this), true);
  private Object oNs = new Object();
  com.tencent.mm.plugin.voip.video.i oNt;
  int oNu = 0;
  public String oNx;
  int oNy;
  Timer oNz = null;
  
  public s()
  {
    this.oHa.a(this);
    this.oNt = new com.tencent.mm.plugin.voip.video.i(ad.getContext());
  }
  
  public static void a(int paramInt1, long paramLong, int paramInt2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, String paramString)
  {
    com.tencent.mm.plugin.voip.b.a.eU("MicroMsg.Voip.VoipServiceEx", "doAck roomId " + paramInt1 + "  roomKey " + paramLong + " status " + paramInt2);
    if ((paramInt1 != 0) && (paramLong != 0L)) {
      new com.tencent.mm.plugin.voip.model.a.a(paramInt1, paramLong, paramInt2, paramArrayOfByte1, paramArrayOfByte2, paramString).bLp();
    }
  }
  
  public static boolean bLe()
  {
    return ((TelephonyManager)ad.getContext().getSystemService("phone")).getCallState() != 0;
  }
  
  public final boolean bJP()
  {
    return this.oHa.bJP();
  }
  
  public final boolean bLd()
  {
    return this.oHa.oJX.kpo != 0;
  }
  
  public final void bLf()
  {
    if (this.oHa.bJP()) {
      com.tencent.mm.plugin.voip.b.a.eT("MicroMsg.Voip.VoipServiceEx", "checkStartup failed, stauts = " + this.oHa.mStatus);
    }
    com.tencent.mm.plugin.voip.b.a.eT("MicroMsg.Voip.VoipServiceEx", "checkStartup...devicekey = " + bn.cmZ());
    this.oHa.bJL();
    x.d("MicroMsg.Voip.VoipServiceEx", "reset");
    this.oHa.reset();
    this.oNE.SO();
    this.oNB.SO();
    this.oND.SO();
    this.oNF.SO();
    this.oNu = 0;
    au.HU();
    q.fd(com.tencent.mm.model.c.DU().cmX());
  }
  
  public final int bLg()
  {
    if (!this.oHa.bJP())
    {
      com.tencent.mm.plugin.voip.b.a.eT("MicroMsg.Voip.VoipServiceEx", "Failed to cancel call ,as not in calling.");
      return -1;
    }
    x.i("MicroMsg.Voip.VoipServiceEx", "cancelCallEx, roomId:%d, msgID:%d, inviteId:%d", new Object[] { Integer.valueOf(this.oHa.oJX.kpo), Integer.valueOf(this.oHa.oJX.oOh), Integer.valueOf(this.oHa.oJX.kpr) });
    synchronized (this.oNs)
    {
      if ((this.oHa.oJX.kpo == 0) && (this.oHa.oJX.kpr == 0))
      {
        com.tencent.mm.plugin.voip.b.a.eT("MicroMsg.Voip.VoipServiceEx", "Failed to cancel call with roomid = 0 and inviteId = 0 ");
        return -1;
      }
    }
    Object localObject3 = this.oHa.oJX.iT(true);
    int i;
    long l;
    if (((String)localObject3).length() > 0)
    {
      i = this.oHa.oJX.kpo;
      l = this.oHa.oJX.kpp;
      int j = this.oHa.oJX.oOh;
      new com.tencent.mm.plugin.voip.model.a.c(i, l, this.oHa.oJX.kFn, (String)localObject3, this.oHa.oJX.kpr).bLp();
    }
    localObject3 = this.oHa.oJX.oPS;
    ((m)localObject3).oLl = ((int)(System.currentTimeMillis() - ((m)localObject3).oLv));
    com.tencent.mm.plugin.voip.b.a.eV("MicroMsg.VoipDailReport", "devin:cancelInvite:" + ((m)localObject3).oLl);
    if ((this.oHa.oJX.oOz == 0) && (this.oHa.oJX.oOA == 0)) {
      this.oHa.bJM();
    }
    this.oHa.yv(this.oNt.bMk());
    this.oHa.oJX.oPS.oLA = this.oHa.oJY.bKD();
    localObject3 = v2protocal.bLy();
    String str1 = this.oHa.oJX.bLz();
    String str2 = this.oHa.oJX.bLB();
    String str3 = this.oHa.oJX.bLA();
    String str4 = this.oHa.oJX.bLC();
    if (str1.length() > 0)
    {
      i = this.oHa.oJX.kpo;
      l = this.oHa.oJX.kpp;
      i = this.oHa.oJX.oOh;
      String str5 = this.oHa.oJX.kFn;
      new com.tencent.mm.plugin.voip.model.a.l((String)localObject3, str1, str3, str2, str4).bLp();
    }
    this.oHa.bJK();
    reset();
    this.oHa.oJX.kpo = 0;
    this.oHa.oJX.kpr = 0;
    return 0;
  }
  
  public final int bLh()
  {
    x.i("MicroMsg.Voip.VoipServiceEx", "reject");
    if (!this.oHa.bJO())
    {
      com.tencent.mm.plugin.voip.b.a.eT("MicroMsg.Voip.VoipServiceEx", "Failed to reject with calling, status =" + this.oHa.mStatus);
      return -1;
    }
    synchronized (this.oNs)
    {
      if (this.oHa.oJX.kpo == 0)
      {
        com.tencent.mm.plugin.voip.b.a.eT("MicroMsg.Voip.VoipServiceEx", "Failed to reject with roomid = 0. ");
        return -1;
      }
    }
    this.oHa.oJX.oPS.bKf();
    com.tencent.mm.plugin.voip.b.a.eV("MicroMsg.Voip.VoipServiceEx", " reject, status:" + this.oHa.mStatus + " roomid:" + this.oHa.oJX.kpo);
    int i = this.oHa.oJX.netType;
    int j = this.oHa.oJX.kpo;
    long l = this.oHa.oJX.kpp;
    new b(2, i, j, new byte[0], new byte[0], l, false, false).bLp();
    if ((this.oHa.oJX.oOz == 0) && (this.oHa.oJX.oOA == 0)) {
      this.oHa.bJM();
    }
    this.oHa.yv(this.oNt.bMk());
    this.oHa.oJX.oPS.oLA = this.oHa.oJY.bKD();
    this.oHa.oJX.iT(true);
    String str1 = v2protocal.bLy();
    String str2 = this.oHa.oJX.bLz();
    String str3 = this.oHa.oJX.bLB();
    String str4 = this.oHa.oJX.bLA();
    String str5 = this.oHa.oJX.bLC();
    com.tencent.mm.plugin.voip.b.a.eV("MicroMsg.Voip.VoipServiceEx", "devin: statreport");
    if (str2.length() > 0)
    {
      com.tencent.mm.plugin.voip.b.a.eV("MicroMsg.Voip.VoipServiceEx", "devin: reject() newdialInfo.length() > 0");
      i = this.oHa.oJX.kpo;
      l = this.oHa.oJX.kpp;
      i = this.oHa.oJX.oOh;
      String str6 = this.oHa.oJX.kFn;
      new com.tencent.mm.plugin.voip.model.a.l(str1, str2, str4, str3, str5).bLp();
    }
    for (;;)
    {
      this.oHa.bJK();
      reset();
      this.oHa.oJX.kpo = 0;
      return 0;
      com.tencent.mm.plugin.voip.b.a.eV("MicroMsg.Voip.VoipServiceEx", "devin: reject() newdialInfo.length() <= 0");
    }
  }
  
  public final int bLi()
  {
    com.tencent.mm.plugin.voip.b.a.eU("MicroMsg.Voip.VoipServiceEx", "hangUp,status:" + this.oHa.mStatus + " roomid:" + this.oHa.oJX.kpo + ",threadid = " + Thread.currentThread().getId());
    this.oHa.oJZ.bKe();
    if (this.oHa.oJX.oPS.oLa == 1)
    {
      ??? = this.oHa.oJX.oPS;
      if (((m)???).oLr != 0L) {
        break label528;
      }
      ((m)???).oLk = 0;
    }
    for (;;)
    {
      if (((m)???).oLk < 0)
      {
        ((m)???).oLk = 0;
        com.tencent.mm.plugin.voip.b.a.eT("MicroMsg.VoipDailReport", "devin:endTalk, iCallTime Err, rest 0");
      }
      com.tencent.mm.plugin.voip.b.a.eU("MicroMsg.VoipDailReport", "devin:endTalk:" + ((m)???).oLk);
      synchronized (this.oNs)
      {
        int i = this.oHa.oJX.oPS.oLc;
        if ((this.oHa.oJX.kpo != 0) || (8 == i) || (9 == i) || (10 == i) || (11 == i) || (12 == i) || (99 == i))
        {
          this.oHa.oJY.bKB();
          com.tencent.mm.plugin.voip.b.a.eU("MicroMsg.Voip.VoipServiceEx", "steve:hangUp, uninitGLRender before protocalUninit first!!");
          String str1 = this.oHa.oJX.iT(true);
          if (str1.length() > 0)
          {
            new com.tencent.mm.plugin.voip.model.a.i(this.oHa.oJX.kpo, this.oHa.oJX.kpp, str1).bLp();
            com.tencent.mm.plugin.voip.b.a.eT("MicroMsg.Voip.VoipServiceEx", "devin: shutdown cgi ");
          }
          this.oHa.oJX.oPS.oLA = this.oHa.oJY.bKD();
          this.oHa.yv(this.oNt.bMk());
          str1 = v2protocal.bLy();
          String str2 = this.oHa.oJX.bLz();
          String str3 = this.oHa.oJX.bLB();
          String str4 = this.oHa.oJX.bLA();
          String str5 = this.oHa.oJX.bLC();
          if (str2.length() > 0)
          {
            i = this.oHa.oJX.kpo;
            long l = this.oHa.oJX.kpp;
            i = this.oHa.oJX.oOh;
            String str6 = this.oHa.oJX.kFn;
            new com.tencent.mm.plugin.voip.model.a.l(str1, str2, str4, str3, str5).bLp();
            com.tencent.mm.plugin.voip.b.a.eT("MicroMsg.Voip.VoipServiceEx", "devin: statreport cgi ");
          }
          this.oHa.bJK();
          reset();
          this.oHa.oJX.kpo = 0;
          com.tencent.mm.plugin.voip.b.a.eV("MicroMsg.Voip.VoipServiceEx", "hangUp over");
          return 0;
          label528:
          ((m)???).oLk = ((int)((System.currentTimeMillis() - ((m)???).oLr) / 1000L));
          continue;
        }
        com.tencent.mm.plugin.voip.b.a.eT("MicroMsg.Voip.VoipServiceEx", "call hangUp roomId == 0 ");
      }
    }
  }
  
  public final int bLj()
  {
    x.i("MicroMsg.Voip.VoipServiceEx", "ignoreInvite");
    if (!this.oHa.bJO())
    {
      com.tencent.mm.plugin.voip.b.a.eT("MicroMsg.Voip.VoipServiceEx", "Failed to ignore with calling, status =" + this.oHa.mStatus);
      return -1;
    }
    synchronized (this.oNs)
    {
      if (this.oHa.oJX.kpo == 0)
      {
        com.tencent.mm.plugin.voip.b.a.eT("MicroMsg.Voip.VoipServiceEx", "Failed to reject with roomid = 0. ");
        return -1;
      }
    }
    int i = this.oHa.oJX.netType;
    int j = this.oHa.oJX.kpo;
    long l = this.oHa.oJX.kpp;
    new b(3, i, j, new byte[0], new byte[0], l, false, false).bLp();
    reset();
    this.oHa.oJX.kpo = 0;
    return 0;
  }
  
  public final void bLk()
  {
    com.tencent.mm.plugin.voip.b.a.eU("MicroMsg.Voip.VoipServiceEx", "devincdai: voip reset timecount");
    this.oNB.SO();
    this.oNB.J(60000L, 60000L);
  }
  
  public final int cn(String paramString, int paramInt)
  {
    x.i("MicroMsg.Voip.VoipServiceEx", "call username:%s, callType:%d, inviteType:%d", new Object[] { paramString, Integer.valueOf(0), Integer.valueOf(paramInt) });
    if (bi.oW(paramString))
    {
      com.tencent.mm.plugin.voip.b.a.eT("MicroMsg.Voip.VoipServiceEx", "Failed call without valid username.");
      return -1;
    }
    if (this.oHa.bJP())
    {
      com.tencent.mm.plugin.voip.b.a.eT("MicroMsg.Voip.VoipServiceEx", "Failed call withing calling.");
      return -1;
    }
    this.oHa.oJX.oOk = 1;
    this.oHa.oJX.kFn = paramString;
    com.tencent.mm.plugin.voip.b.a.eV("MicroMsg.Voip.VoipServiceEx", com.tencent.mm.compatible.util.g.Ac() + "call username:" + paramString);
    if (this.oHa.oJX.lkO)
    {
      com.tencent.mm.plugin.voip.b.a.eT("MicroMsg.Voip.VoipServiceEx", com.tencent.mm.compatible.util.g.Ac() + "v2protocal already init.");
      this.oHa.oJX.iT(false);
      this.oHa.oJX.reset();
    }
    if (this.oHa.oJX.bGN() < 0)
    {
      com.tencent.mm.plugin.voip.b.a.eT("MicroMsg.Voip.VoipServiceEx", "Failed to init v2protocol.");
      return -1;
    }
    if (this.oHa.oJX.oPT != null) {
      this.oHa.oJX.oPT.oHa = this.oHa;
    }
    if (v2protocal.oPU != null) {
      v2protocal.oPU.a(this.oHa);
    }
    this.oNE.J(50000L, 50000L);
    this.oHa.oJX.kpr = ((int)System.currentTimeMillis());
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramString);
    new com.tencent.mm.plugin.voip.model.a.g(localArrayList, this.oHa.oJX.field_peerId, this.oHa.oJX.field_capInfo, this.oHa.oJX.netType, paramInt, this.oHa.oJX.kpr).bLp();
    this.oHa.setStatus(2);
    this.oHa.oJZ.oKv = 1;
    this.oNB.J(60000L, 60000L);
    this.oHa.oJX.oPS.oLv = System.currentTimeMillis();
    this.oHa.oJX.oPS.beginTime = System.currentTimeMillis();
    this.oHa.oJX.oPS.oLb = paramInt;
    x.d("MicroMsg.Voip.VoipServiceEx", "iRoomType " + this.oHa.oJX.oPS.oLb);
    return 0;
  }
  
  protected final void finalize()
  {
    stop();
    super.finalize();
  }
  
  public final void o(int paramInt1, int paramInt2, String paramString)
  {
    x.i("MicroMsg.Voip.VoipServiceEx", "onFinishVoIP finishType: " + paramInt1);
    switch (paramInt1)
    {
    case 2: 
    case 3: 
    default: 
      return;
    case 4: 
      bLi();
      this.oHa.oJY.onReject();
      return;
    case 5: 
      bLi();
      this.oHa.oJY.bKy();
      return;
    case 6: 
      bLi();
      this.oHa.oJY.bKA();
      return;
    }
    bLi();
    this.oHa.oJY.onError(paramInt2, paramString);
  }
  
  public final void reset()
  {
    x.d("MicroMsg.Voip.VoipServiceEx", "reset");
    this.oHa.reset();
    this.oNE.SO();
    this.oNB.SO();
    this.oND.SO();
    this.oNF.SO();
    if (this.oNz != null)
    {
      this.oNz.cancel();
      this.oNz = null;
    }
    this.oNu = 0;
    i.bJI().oMr = null;
  }
  
  public final int setNetSignalValue(int paramInt1, int paramInt2)
  {
    return this.oHa.oJX.setNetSignalValue(paramInt1, paramInt2);
  }
  
  public final void stop()
  {
    x.i("MicroMsg.Voip.VoipServiceEx", "stop");
    reset();
    this.oHa.a(null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/voip/model/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */