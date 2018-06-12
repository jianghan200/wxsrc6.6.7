package com.tencent.mm.plugin.talkroom.model;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Looper;
import android.os.RemoteException;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.c.am;
import com.tencent.mm.model.ae;
import com.tencent.mm.model.au;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.talkroom.component.TalkRoomService;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.bsl;
import com.tencent.mm.protocal.c.bsm;
import com.tencent.mm.protocal.c.bsn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ab.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.az;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class g
  implements com.tencent.mm.ab.e, com.tencent.mm.ax.a, com.tencent.mm.ax.c, ae
{
  public static final int[] oxg = { 80, 8080, 16285 };
  public static final byte[][] oxh = { { 101, -30, 76, 27 }, { 112, 64, -19, -29 }, { 120, -52, -55, -58 } };
  private final ServiceConnection hKe = new g.1(this);
  private int kpo;
  private long kpp;
  private int owR = 0;
  private int owS = 0;
  private boolean owT = false;
  public String owU;
  private int owV;
  private int owW;
  private int owX;
  private LinkedList<bsl> owY = new LinkedList();
  private com.tencent.mm.plugin.talkroom.component.a owZ;
  private com.tencent.mm.plugin.talkroom.component.b oxa;
  private com.tencent.mm.plugin.talkroom.component.e oxb;
  private com.tencent.mm.plugin.talkroom.component.d oxc;
  private ab oxd;
  private al oxe;
  private i oxf = new i();
  public boolean oxi = false;
  private int state = 0;
  
  public g()
  {
    TalkRoomReceiver.init();
  }
  
  private int a(PByteArray paramPByteArray, String paramString)
  {
    if (this.owZ != null)
    {
      int[] arrayOfInt = new int[1];
      try
      {
        paramPByteArray.value = this.owZ.e(arrayOfInt, paramString);
        return arrayOfInt[0];
      }
      catch (RemoteException paramPByteArray)
      {
        for (;;)
        {
          arrayOfInt[0] = -99999;
          x.printErrStackTrace("MicroMsg.TalkRoomServer", paramPByteArray, "", new Object[0]);
        }
      }
    }
    return -99;
  }
  
  private boolean bHd()
  {
    if (bHb() == 1) {
      b(b.bGS().ovZ);
    }
    while (this.owS > 0)
    {
      x.i("MicroMsg.TalkRoomServer", "addListener has init before");
      return true;
      a(b.bGS().ovZ);
    }
    au.DF().a(332, this);
    au.DF().a(334, this);
    au.DF().a(336, this);
    au.DF().a(335, this);
    b.bGU().a(this);
    au.vv().a(this);
    this.owS = 1;
    if (this.owZ != null) {}
    try
    {
      this.owZ.Close();
      this.owZ.uninitLive();
      Intent localIntent = new Intent(com.tencent.mm.sdk.platformtools.ad.getContext(), TalkRoomService.class);
      com.tencent.mm.sdk.platformtools.ad.getContext().bindService(localIntent, this.hKe, 1);
      this.oxa = new g.2(this);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException, "", new Object[0]);
      }
    }
  }
  
  private void bHe()
  {
    if (this.oxb != null) {}
    try
    {
      this.oxb.release();
      this.oxb = null;
      if (this.oxc == null) {}
    }
    catch (RemoteException localRemoteException1)
    {
      try
      {
        this.oxc.release();
        this.oxc = null;
        if (this.oxd != null)
        {
          this.oxd.SO();
          this.oxd = null;
        }
        if (this.oxe != null)
        {
          this.oxe.SO();
          this.oxe = null;
        }
        return;
        localRemoteException1 = localRemoteException1;
        x.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException1, "", new Object[0]);
      }
      catch (RemoteException localRemoteException2)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException2, "", new Object[0]);
        }
      }
    }
  }
  
  private void bHf()
  {
    for (;;)
    {
      long l;
      try
      {
        f localf = b.bGW();
        if (localf.owO != 0L)
        {
          l = bi.bI(localf.owO) / 1000L;
          if (l < 2L)
          {
            localf.owz += 1;
            localf.owO = 0L;
          }
        }
        else
        {
          if (this.oxc != null) {
            this.oxc.bGP();
          }
          if (this.oxb != null) {
            this.oxb.bGR();
          }
          this.state = 2;
          return;
        }
        if (l < 6L)
        {
          localf.owA += 1;
          continue;
        }
        if (l >= 11L) {
          break label142;
        }
      }
      catch (RemoteException localRemoteException)
      {
        x.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException, "", new Object[0]);
        return;
      }
      localRemoteException.owB += 1;
      continue;
      label142:
      if (l < 21L) {
        localRemoteException.owC += 1;
      } else if (l < 31L) {
        localRemoteException.owD += 1;
      } else if (l < 41L) {
        localRemoteException.owE += 1;
      } else if (l < 51L) {
        localRemoteException.owF += 1;
      } else if (l < 61L) {
        localRemoteException.owG += 1;
      } else {
        localRemoteException.owH += 1;
      }
    }
  }
  
  private boolean bHg()
  {
    int i = -99999;
    try
    {
      int j = this.owZ.bGN();
      i = j;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException, "", new Object[0]);
      }
    }
    x.i("MicroMsg.TalkRoomServer", "engine.protocalInit");
    if ((i < 0) && (i != -3))
    {
      this.owZ = null;
      x.f("MicroMsg.TalkRoomServer", "engine.protocalInit error %d", new Object[] { Integer.valueOf(i) });
      this.oxf.i("enterTalkRoom protocalInit failed", 3, -1);
      return false;
    }
    return true;
  }
  
  private void bHh()
  {
    if (this.owZ == null)
    {
      x.e("MicroMsg.TalkRoomServer", "the engine should not be null.");
      return;
    }
    this.oxb = this.owZ.a(new g.6(this));
    this.oxb.start();
    this.oxc = this.owZ.bGO();
    this.oxc.start();
  }
  
  private void bHi()
  {
    if (this.owY.size() == 0)
    {
      x.e("MicroMsg.TalkRoomServer", "engine. talk relay addr list is empty");
      this.oxf.b(3, -1, "engine.talk relay addr list empty");
    }
    for (;;)
    {
      return;
      int[] arrayOfInt1 = new int[this.owY.size()];
      int[] arrayOfInt2 = new int[this.owY.size()];
      x.i("MicroMsg.TalkRoomServer", "talk relay addr cnt %d", new Object[] { Integer.valueOf(this.owY.size()) });
      int i = 0;
      while (i < this.owY.size())
      {
        arrayOfInt1[i] = ((bsl)this.owY.get(i)).spR;
        arrayOfInt2[i] = ((bsl)this.owY.get(i)).sed;
        x.i("MicroMsg.TalkRoomServer", "add talk relay addr %s %d", new Object[] { yb(((bsl)this.owY.get(i)).spR), Integer.valueOf(((bsl)this.owY.get(i)).sed) });
        i += 1;
      }
      x.i("MicroMsg.TalkRoomServer", "engine.Open myRoomMemId %d, roomId %d, roomKey %d", new Object[] { Integer.valueOf(this.owW), Integer.valueOf(this.kpo), Long.valueOf(this.kpp) });
      try
      {
        com.tencent.mm.plugin.talkroom.component.a locala = this.owZ;
        com.tencent.mm.plugin.talkroom.component.b localb = this.oxa;
        au.HU();
        i = locala.a(localb, com.tencent.mm.model.c.Df(), this.owW, this.kpo, this.kpp, arrayOfInt1, arrayOfInt2, 0);
        if ((i >= 0) || (i == -3)) {
          continue;
        }
        x.e("MicroMsg.TalkRoomServer", "engine.Open error %d", new Object[] { Integer.valueOf(i) });
        this.oxf.b(3, i, "engine.Open error");
        return;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException, "", new Object[0]);
          i = -99999;
        }
      }
    }
  }
  
  private void iz(boolean paramBoolean)
  {
    if (bi.oW(this.owU)) {}
    ai localai;
    do
    {
      return;
      au.HU();
      localai = com.tencent.mm.model.c.FW().Yq(this.owU);
    } while (localai == null);
    if (paramBoolean) {}
    for (int i = 5;; i = 6)
    {
      localai.at(com.tencent.mm.plugin.messenger.foundation.a.a.a.a(localai, i, localai.field_conversationTime));
      au.HU();
      com.tencent.mm.model.c.FW().a(localai, this.owU);
      return;
    }
  }
  
  private void xZ(int paramInt)
  {
    if (this.owZ != null) {
      try
      {
        this.state = 1;
        this.owT = false;
        if (!bHg()) {
          return;
        }
        bHe();
        bHi();
        bHh();
        if (this.oxd != null)
        {
          x.w("MicroMsg.TalkRoomServer", "enter talkroom not first time");
          return;
        }
        this.oxd = new ab(new g.5(this));
        ab localab = this.oxd;
        ab.sGv = true;
        localab.dkB = 50000L;
        localab.ts = bi.VG();
        boolean bool = ab.fY(localab.dkB);
        localab.SO();
        ab.sGs.put(Integer.valueOf(localab.sGr), localab);
        if ((ab.cWE == null) || (!bool)) {
          return;
        }
        x.v("MicroMsg.MAlarmHandler", "prepare bumper");
        ab.cWE.prepare();
        return;
      }
      catch (RemoteException localRemoteException)
      {
        x.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException, "", new Object[0]);
        return;
      }
    }
    if (paramInt == 0)
    {
      this.oxf.i("bind talkroomService timeout", 3, -1);
      return;
    }
    new ag().postDelayed(new g.4(this, paramInt), 50L);
  }
  
  private void ya(int paramInt)
  {
    if (paramInt > this.owV)
    {
      this.owV = paramInt;
      if (this.state >= 3) {
        this.oxf.iA(311);
      }
      bHf();
    }
  }
  
  private static String yb(int paramInt)
  {
    try
    {
      String str = InetAddress.getByAddress(new byte[] { (byte)(paramInt >>> 24 & 0xFF), (byte)(paramInt >>> 16 & 0xFF), (byte)(paramInt >>> 8 & 0xFF), (byte)(paramInt & 0xFF) }).getHostAddress();
      return str;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.TalkRoomServer", localException, "", new Object[0]);
    }
    return null;
  }
  
  public final void HB()
  {
    x.v("MicroMsg.TalkRoomServer", "yy talkroom onResume");
    if (bi.oW(this.owU)) {
      x.d("MicroMsg.TalkRoomServer", "pause");
    }
    i locali;
    i.3 local3;
    for (;;)
    {
      this.oxi = false;
      locali = this.oxf;
      local3 = new i.3(locali);
      if (Looper.myLooper() != Looper.getMainLooper()) {
        break;
      }
      local3.run();
      return;
      bHf();
    }
    locali.handler.post(local3);
  }
  
  public final void HC()
  {
    x.v("MicroMsg.TalkRoomServer", "yy talkroom onPause");
    try
    {
      if (bi.oW(this.owU)) {
        x.d("MicroMsg.TalkRoomServer", "pause");
      }
      for (;;)
      {
        this.oxi = true;
        i locali = this.oxf;
        local2 = new i.2(locali);
        if (Looper.myLooper() != Looper.getMainLooper()) {
          break;
        }
        local2.run();
        return;
        if (this.oxc != null) {
          this.oxc.bGP();
        }
        if (this.oxb != null) {
          this.oxb.bAf();
        }
        this.state = 2;
      }
    }
    catch (RemoteException localRemoteException)
    {
      i.2 local2;
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException, "", new Object[0]);
      }
      localRemoteException.handler.post(local2);
    }
  }
  
  public final void Sn()
  {
    x.i("MicroMsg.TalkRoomServer", "resumeRecord in state %d", new Object[] { Integer.valueOf(this.state) });
    if (this.state != 4) {
      return;
    }
    f localf = b.bGW();
    localf.owP = true;
    localf.owO = bi.VG();
    try
    {
      this.oxc.Sn();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      x.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException, "", new Object[0]);
    }
  }
  
  public final short So()
  {
    if (this.oxc == null) {
      return 0;
    }
    try
    {
      int i = this.oxc.bGQ();
      return (short)i;
    }
    catch (RemoteException localRemoteException)
    {
      x.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException, "", new Object[0]);
    }
    return 0;
  }
  
  public final short Sp()
  {
    if (this.oxb == null) {
      return 0;
    }
    try
    {
      int i = this.oxb.bGQ();
      return (short)i;
    }
    catch (RemoteException localRemoteException)
    {
      x.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException, "", new Object[0]);
    }
    return 0;
  }
  
  public final boolean Sq()
  {
    x.i("MicroMsg.TalkRoomServer", "seizeMic");
    if (this.state != 2)
    {
      x.i("MicroMsg.TalkRoomServer", "seizeMic  not int the appropriate state");
      if (this.state == 0) {
        this.oxf.b(3, -1, "seizeMic in outside room state");
      }
      return false;
    }
    if (this.oxb != null) {}
    try
    {
      this.oxb.bAf();
      this.state = 3;
      com.tencent.mm.plugin.talkroom.b.d locald = new com.tencent.mm.plugin.talkroom.b.d(this.kpo, this.kpp, 1, this.owU, bHb());
      au.DF().a(locald, 0);
      b.bGW().owN = bi.VG();
      b.bGW().owQ = true;
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException, "", new Object[0]);
      }
    }
  }
  
  public final void Sr()
  {
    x.i("MicroMsg.TalkRoomServer", "putAwayMic");
    Object localObject = b.bGW();
    if ((((f)localObject).owQ) && (!((f)localObject).owP)) {
      ((f)localObject).owK += 1;
    }
    ((f)localObject).owP = false;
    ((f)localObject).owQ = false;
    if (this.state < 3)
    {
      x.w("MicroMsg.TalkRoomServer", "putAwayMic  err, isnot getting or has not got mic");
      return;
    }
    if (this.oxe != null)
    {
      this.oxe.SO();
      this.oxe = null;
    }
    bHf();
    localObject = new com.tencent.mm.plugin.talkroom.b.d(this.kpo, this.kpp, 2, this.owU, bHb());
    au.DF().a((l)localObject, 0);
  }
  
  public final boolean Ss()
  {
    return this.oxi;
  }
  
  public final void T(String paramString, int paramInt)
  {
    x.i("MicroMsg.TalkRoomServer", "enterTalkRoom %s scene %d", new Object[] { paramString, Integer.valueOf(paramInt) });
    this.owR = paramInt;
    bHd();
    if (paramString.equals(this.owU))
    {
      x.d("MicroMsg.TalkRoomServer", "enterTalkRoom %s has enter the talkroom", new Object[] { paramString });
      if (this.state == 2) {
        this.oxf.St();
      }
      return;
    }
    x.d("MicroMsg.TalkRoomServer", "%s enter the talkroom", new Object[] { paramString });
    this.owU = paramString;
    Object localObject = new com.tencent.mm.plugin.talkroom.b.a(this.owU, bHb());
    au.DF().a((l)localObject, 0);
    b.bGS().owb = new f();
    b.bGW().owL = bi.VG();
    b.bGW().owI = paramString;
    if (bHb() == 0) {
      b.bGS().ovZ.kGt = true;
    }
    localObject = this.oxf;
    paramString = new i.11((i)localObject, paramString);
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      paramString.run();
      return;
    }
    ((i)localObject).handler.post(paramString);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.TalkRoomServer", "type:%d  errType:%d  errCode:%d", new Object[] { Integer.valueOf(paraml.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    paramString = (com.tencent.mm.plugin.talkroom.b.f)paraml;
    if ((paramString.bHj() == null) || (!paramString.bHj().equals(this.owU))) {
      x.w("MicroMsg.TalkRoomServer", "%s, now :%s this is the old sceneEnd, abandon it!!", new Object[] { paramString.bHj(), this.owU });
    }
    label326:
    label788:
    do
    {
      do
      {
        return;
        if ((paramInt1 == 0) && (paramInt2 == 0)) {
          break label326;
        }
        if (paraml.getType() == 332)
        {
          b.bGW().xY(2);
          if (paramInt1 == 4) {
            b.bGW().owJ = paramInt2;
          }
          this.oxf.i("cgi enter failed : errType:" + paramInt1 + " errCode:" + paramInt2, paramInt1, paramInt2);
          aZL();
          return;
        }
        if (paraml.getType() != 334) {
          break;
        }
      } while (((com.tencent.mm.plugin.talkroom.b.d)paraml).actionType != 1);
      paramString = b.bGW();
      paramString.ows += 1;
      paramString.owN = 0L;
      bHf();
      x.w("MicroMsg.TalkRoomServer", "onSceneEnd SeizeMicFailed");
      if ((paramInt1 == 4) && ((paramInt2 == 311) || (paramInt2 == 340)))
      {
        this.oxf.iA(paramInt2);
        return;
      }
      this.oxf.b(paramInt1, paramInt2, "TalkMicAction failed!!");
      return;
      if (paraml.getType() == 336)
      {
        this.owT = false;
        this.oxf.b(paramInt1, paramInt2, "TalkGetMember failed!!");
        aZL();
        return;
      }
      if (paraml.getType() == 335)
      {
        this.oxf.b(paramInt1, paramInt2, "TalkNoop failed!!");
        aZL();
        return;
      }
      Object localObject;
      if (paraml.getType() == 332)
      {
        b.bGW().xY(1);
        paraml = (com.tencent.mm.plugin.talkroom.b.a)paraml;
        this.kpo = paraml.kpo;
        this.kpp = paraml.kpp;
        this.owV = paraml.owV;
        this.owW = paraml.owW;
        this.owY = paraml.owY;
        localObject = b.bGW();
        paramInt1 = this.kpo;
        long l = this.kpp;
        ((f)localObject).kpo = paramInt1;
        ((f)localObject).kpp = l;
        paraml = paraml.oxr;
        b.bGU().a(this.owU, paraml, null, null, paramString.bHk());
        xZ(100);
        return;
      }
      if (paraml.getType() == 334)
      {
        paramString = (com.tencent.mm.plugin.talkroom.b.d)paraml;
        if (paramString.actionType == 1)
        {
          paraml = b.bGW();
          if (paraml.owN != 0L)
          {
            paraml.owq = ((bi.bI(paraml.owN) + paraml.owq * paraml.owM) / (paraml.owM + 1));
            paraml.owM += 1;
            paraml.owr += 1;
            paraml.owN = 0L;
          }
          x.i("MicroMsg.TalkRoomServer", "dealWithSeizeMic seize Mic successFul");
          if (paramString.owV < this.owV)
          {
            x.w("MicroMsg.TalkRoomServer", "micSeq is smaller seizeSeq %d, now %d", new Object[] { Integer.valueOf(paramString.owV), Integer.valueOf(this.owV) });
            bHf();
            this.oxf.iA(311);
            return;
          }
          this.owV = paramString.owV;
          paramInt1 = -99999;
          try
          {
            paramInt2 = this.owZ.SetCurrentMicId(this.owV);
            paramInt1 = paramInt2;
          }
          catch (RemoteException paramString)
          {
            for (;;)
            {
              x.printErrStackTrace("MicroMsg.TalkRoomServer", paramString, "", new Object[0]);
            }
            paramString = this.oxf;
            paraml = new i.6(paramString);
            if (Looper.myLooper() != Looper.getMainLooper()) {
              break label788;
            }
          }
          if (this.state != 3)
          {
            x.i("MicroMsg.TalkRoomServer", "dealWithSeizeMic not in getting mic state");
            return;
          }
          paraml.run();
          for (;;)
          {
            this.state = 4;
            if (paramInt1 < 0) {
              x.e("MicroMsg.TalkRoomServer", "SetCurrentMicId err: %d ", new Object[] { Integer.valueOf(paramInt1) });
            }
            if (this.oxe != null) {
              break;
            }
            this.oxe = new al(new g.3(this), true);
            this.oxe.J(5000L, 5000L);
            return;
            paramString.handler.post(paraml);
          }
        }
        x.i("MicroMsg.TalkRoomServer", "putaway Mic successFul");
        return;
      }
      if (paraml.getType() == 336)
      {
        localObject = (com.tencent.mm.plugin.talkroom.b.c)paraml;
        LinkedList localLinkedList = ((com.tencent.mm.plugin.talkroom.b.c)localObject).oxr;
        b.bGU().a(this.owU, localLinkedList, null, null, paramString.bHk());
        ya(((com.tencent.mm.plugin.talkroom.b.c)localObject).owV);
        this.owT = false;
        this.oxf.nr(bHc());
      }
    } while ((paraml.getType() != 335) || (this.state != 0));
    this.oxf.b(3, -1, "talknoop success but in outside room state");
  }
  
  /* Error */
  public final void a(com.tencent.mm.ax.d paramd)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 92	com/tencent/mm/plugin/talkroom/model/g:oxf	Lcom/tencent/mm/plugin/talkroom/model/i;
    //   4: astore_2
    //   5: aload_1
    //   6: monitorenter
    //   7: aload_2
    //   8: getfield 846	com/tencent/mm/plugin/talkroom/model/i:cWy	Ljava/util/List;
    //   11: aload_1
    //   12: invokeinterface 851 2 0
    //   17: ifeq +17 -> 34
    //   20: aload_1
    //   21: monitorexit
    //   22: aload_0
    //   23: getfield 92	com/tencent/mm/plugin/talkroom/model/g:oxf	Lcom/tencent/mm/plugin/talkroom/model/i;
    //   26: aload_0
    //   27: invokevirtual 837	com/tencent/mm/plugin/talkroom/model/g:bHc	()Ljava/lang/String;
    //   30: invokevirtual 840	com/tencent/mm/plugin/talkroom/model/i:nr	(Ljava/lang/String;)V
    //   33: return
    //   34: aload_2
    //   35: getfield 846	com/tencent/mm/plugin/talkroom/model/i:cWy	Ljava/util/List;
    //   38: aload_1
    //   39: invokeinterface 854 2 0
    //   44: pop
    //   45: aload_1
    //   46: monitorexit
    //   47: goto -25 -> 22
    //   50: astore_2
    //   51: aload_1
    //   52: monitorexit
    //   53: aload_2
    //   54: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	55	0	this	g
    //   0	55	1	paramd	com.tencent.mm.ax.d
    //   4	31	2	locali	i
    //   50	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   7	22	50	finally
    //   34	47	50	finally
    //   51	53	50	finally
  }
  
  public final void aZL()
  {
    x.i("MicroMsg.TalkRoomServer", "exitTalkRoom");
    iz(false);
    if (bi.oW(this.owU)) {
      x.i("MicroMsg.TalkRoomServer", "exitTalkRoom: has exited");
    }
    for (;;)
    {
      return;
      Object localObject1 = b.bGW();
      if (((f)localObject1).owL != 0L) {
        ((f)localObject1).owp = ((int)(bi.bI(((f)localObject1).owL) / 1000L));
      }
      this.state = 0;
      this.owT = false;
      int i = this.kpo;
      long l = this.kpp;
      if (this.kpo != 0)
      {
        localObject1 = this.owU;
        localObject1 = new com.tencent.mm.plugin.talkroom.b.b(i, l, (String)localObject1, bHb());
        au.DF().a((l)localObject1, 0);
        if (this.owZ == null) {}
      }
      try
      {
        i = this.owZ.Close();
        if (i < 0) {
          x.e("MicroMsg.TalkRoomServer", "engine.Close error %d", new Object[] { Integer.valueOf(i) });
        }
        localObject2 = new PByteArray();
        if (a((PByteArray)localObject2, r.gT(this.owU)) == 0)
        {
          localObject1 = new String(((PByteArray)localObject2).value);
          x.i("MicroMsg.TalkRoomServer", "getStatis==> pba.len %d, info: %s", new Object[] { Integer.valueOf(((PByteArray)localObject2).value.length), localObject1 });
          localObject2 = new LinkedList();
          bsn localbsn = new bsn();
          localbsn.rSt = 10402;
          localbsn.spT = new bhz().VO((String)localObject1);
          localObject1 = new bsn();
          ((bsn)localObject1).rSt = 10404;
          ((bsn)localObject1).spT = new bhz().VO(b.bGW().toString());
          ((LinkedList)localObject2).add(localbsn);
          ((LinkedList)localObject2).add(localObject1);
          localObject1 = new com.tencent.mm.plugin.talkroom.b.g((LinkedList)localObject2, bHb());
          au.DF().a((l)localObject1, 0);
        }
        this.owU = "";
        this.kpo = 0;
        this.kpp = 0L;
        this.owV = 0;
        this.owW = 0;
        this.owX = 0;
        this.owY.clear();
        bHe();
        localObject1 = this.oxf;
        localObject2 = new i.12((i)localObject1);
        if (Looper.myLooper() == Looper.getMainLooper())
        {
          ((Runnable)localObject2).run();
          localObject1 = b.bGS().ovZ;
          ((c)localObject1).mHandler.post(new c.1((c)localObject1));
          this.owS = 0;
          au.DF().b(332, this);
          au.DF().b(334, this);
          au.DF().b(336, this);
          au.DF().b(335, this);
          b.bGU().b(this);
          au.vv().b(this);
          b(b.bGS().ovZ);
          if (this.owZ == null) {}
        }
        else
        {
          try
          {
            i = this.owZ.uninitLive();
            com.tencent.mm.sdk.platformtools.ad.getContext().unbindService(this.hKe);
            localObject1 = new Intent(com.tencent.mm.sdk.platformtools.ad.getContext(), TalkRoomService.class);
            com.tencent.mm.sdk.platformtools.ad.getContext().stopService((Intent)localObject1);
            this.owZ = null;
            if (i >= 0) {
              continue;
            }
            x.e("MicroMsg.TalkRoomServer", "engine.uninitLive error %d", new Object[] { Integer.valueOf(i) });
            return;
          }
          catch (RemoteException localRemoteException2)
          {
            x.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException2, "", new Object[0]);
          }
          localObject1 = "";
        }
      }
      catch (RemoteException localRemoteException1)
      {
        for (;;)
        {
          Object localObject2;
          x.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException1, "", new Object[0]);
          i = -99999;
          continue;
          localRemoteException1.handler.post((Runnable)localObject2);
          continue;
          i = -99999;
        }
      }
    }
  }
  
  public final List aZp()
  {
    return b.bGU().np(this.owU);
  }
  
  public final void b(com.tencent.mm.ax.d paramd)
  {
    i locali = this.oxf;
    try
    {
      locali.cWy.remove(paramd);
      return;
    }
    finally {}
  }
  
  public final int bHb()
  {
    if ((this.owR == 1) || ((com.tencent.mm.ay.d.elh != null) && (com.tencent.mm.ay.d.elh.nt(this.owU)))) {
      return 1;
    }
    return 0;
  }
  
  public final String bHc()
  {
    Iterator localIterator = b.bGU().np(this.owU).iterator();
    while (localIterator.hasNext())
    {
      bsm localbsm = (bsm)localIterator.next();
      if (localbsm.spS == this.owX) {
        return localbsm.hbL;
      }
    }
    return null;
  }
  
  public final void iA(boolean paramBoolean)
  {
    x.i("MicroMsg.TalkRoomServer", "reConnect talkRoomUsername: %s", new Object[] { this.owU });
    if ((bi.oW(this.owU)) || (this.state < 2)) {}
    for (;;)
    {
      return;
      Object localObject = b.bGW();
      ((f)localObject).owv += 1;
      if ((!paramBoolean) || (bHg())) {
        try
        {
          bHh();
          bHf();
          this.state = 1;
        }
        catch (RemoteException localRemoteException1)
        {
          try
          {
            if (this.owZ != null) {
              this.owZ.Close();
            }
            if (this.kpo != 0) {
              bHi();
            }
            if (!paramBoolean)
            {
              localObject = this.oxf;
              local4 = new i.4((i)localObject);
              if (Looper.myLooper() == Looper.getMainLooper())
              {
                local4.run();
                return;
                localRemoteException1 = localRemoteException1;
                x.e("MicroMsg.TalkRoomServer", localRemoteException1.toString());
                x.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException1, "", new Object[0]);
              }
            }
          }
          catch (RemoteException localRemoteException2)
          {
            i.4 local4;
            for (;;)
            {
              x.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException2, "", new Object[0]);
            }
            localRemoteException2.handler.post(local4);
          }
        }
      }
    }
  }
  
  public final void p(String paramString1, String paramString2, String paramString3)
  {
    if (!paramString1.equals(this.owU)) {
      return;
    }
    paramString1 = this.oxf;
    paramString2 = new i.10(paramString1, paramString2, paramString3);
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      paramString2.run();
      return;
    }
    paramString1.handler.post(paramString2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/talkroom/model/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */