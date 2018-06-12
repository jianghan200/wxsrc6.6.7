package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.os.Looper;
import android.widget.Toast;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.g.a;
import com.tencent.mm.ab.g.b;
import com.tencent.mm.ab.g.c;
import com.tencent.mm.ab.g.d;
import com.tencent.mm.compatible.b.f;
import com.tencent.mm.compatible.b.f.a;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.ad;
import com.tencent.mm.model.ae;
import com.tencent.mm.model.au;
import com.tencent.mm.modelvoice.n;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.sdk.platformtools.SensorController;
import com.tencent.mm.sdk.platformtools.SensorController.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.chatting.b.ao;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class d
  implements g.a, g.b, g.c, g.d, f.a, ae, com.tencent.mm.modelvoice.c, SensorController.a
{
  private static SensorController hlW;
  public com.tencent.mm.ui.chatting.c.a bAG;
  private int bCK;
  private boolean bCM = false;
  public Context context;
  public boolean hlZ;
  private az hma;
  long hmb = -1L;
  private boolean hmg = false;
  boolean hnA = false;
  public com.tencent.mm.ab.g iWF;
  private List<bd> tHe;
  public long tHf = -1L;
  private com.tencent.mm.ui.base.o tHg;
  ao tHh;
  public com.tencent.mm.ui.base.o tHi;
  public boolean tHj;
  public boolean tHk = true;
  public boolean tHl = false;
  private long tHm = 0L;
  private long tHn = 0L;
  public boolean tHo = false;
  private boolean tHp = false;
  public com.tencent.mm.sdk.b.c tHq = new d.1(this);
  private ag tHr = new d.2(this, Looper.getMainLooper());
  private ag tHs = new d.3(this, Looper.getMainLooper());
  
  public d(com.tencent.mm.ui.chatting.c.a parama, ao paramao, String paramString)
  {
    this.context = parama.tTq.getContext();
    this.bAG = parama;
    this.tHh = paramao;
    if (hlW == null) {
      hlW = new SensorController(this.context.getApplicationContext());
    }
    if (this.hma == null) {
      this.hma = new az(this.context.getApplicationContext());
    }
    aai(paramString);
    com.tencent.mm.sdk.b.a.sFg.b(this.tHq);
    au.vv().a(this);
  }
  
  private void avj()
  {
    ah.A(new d.5(this));
  }
  
  private void csN()
  {
    int k = this.tHe.size();
    int i = 0;
    int j = -1;
    if (i < k)
    {
      if (((bd)this.tHe.get(i)).field_msgId != this.tHf) {
        break label98;
      }
      j = i;
    }
    label98:
    for (;;)
    {
      i += 1;
      break;
      if (j != -1) {
        this.tHe.remove(j);
      }
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AutoPlay", "remove voice msg : size = " + this.tHe.size());
      return;
    }
  }
  
  private boolean isScreenEnable()
  {
    if (this.bAG != null) {
      return this.bAG.tTq.getController().tmb;
    }
    return false;
  }
  
  public final void D(bd parambd)
  {
    if ((this.tHk) && (this.tHe.isEmpty())) {}
    do
    {
      do
      {
        return;
      } while ((parambd == null) || (!parambd.ckz()) || (parambd.field_isSend == 1) || (parambd.field_talker == null) || (!parambd.field_talker.equals(this.bAG.getTalkerUserName())) || (!au.DF().foreground) || (!this.bAG.eaR));
      if (q.G(parambd))
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AutoPlay", "should not in this route");
        return;
      }
      ao(parambd);
    } while ((this.hnA) || (this.iWF.isPlaying()) || (!bi.ci(this.context)));
    bhU();
  }
  
  public final void EG(int paramInt)
  {
    for (;;)
    {
      if (this.context == null) {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AutoPlay", "context is null");
      }
      bd localbd;
      do
      {
        int i;
        do
        {
          return;
          if (this.bAG == null)
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AutoPlay", "add next failed: null mChattingContext");
            return;
          }
          i = ((com.tencent.mm.ui.chatting.b.b.g)this.bAG.O(com.tencent.mm.ui.chatting.b.b.g.class)).getCount();
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AutoPlay", "position : " + paramInt + "adapter getCount = " + i);
        } while ((paramInt < 0) || (paramInt >= i));
        localbd = ((com.tencent.mm.ui.chatting.b.b.g)this.bAG.O(com.tencent.mm.ui.chatting.b.b.g.class)).ES(paramInt);
      } while (localbd == null);
      if ((localbd.ckz()) && (localbd.field_isSend == 0) && (!q.F(localbd)) && (!q.G(localbd))) {
        ao(localbd);
      }
      paramInt += 1;
    }
  }
  
  public final void HB()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AutoPlay", "phone or record stop, resume and do nothing");
    this.tHp = false;
  }
  
  public final void HC()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AutoPlay", "phone comming or record start, stop play");
    this.tHp = true;
    csQ();
    csL();
    try
    {
      if (hlW != null) {
        hlW.ciL();
      }
      if (this.hma != null) {
        this.hma.ciM();
      }
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.AutoPlay", localException, "reset sensor error: %s", new Object[] { localException.getMessage() });
    }
  }
  
  public final void a(int paramInt, bd parambd)
  {
    if (parambd == null) {
      return;
    }
    csL();
    au.HU();
    Boolean localBoolean = (Boolean)com.tencent.mm.model.c.DT().get(4115, null);
    if ((localBoolean == null) || (!localBoolean.booleanValue()))
    {
      au.HU();
      com.tencent.mm.model.c.DT().set(4115, Boolean.valueOf(true));
      csR();
      this.tHi = com.tencent.mm.ui.base.s.a(this.bAG.tTq.getActivity(), this.context.getString(R.l.chatting_music_volumn_change), 4000L);
    }
    if ((this.iWF.isPlaying()) && (parambd.field_msgId == this.tHf))
    {
      csQ();
      return;
    }
    ao(parambd);
    if ((parambd.field_isSend == 0) && (!q.F(parambd))) {
      EG(paramInt + 1);
    }
    bhU();
  }
  
  public final void aai(String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AutoPlay", "changeTalker, isResumeFromDisableScreen: %b", new Object[] { Boolean.valueOf(this.tHl) });
    if ((this.tHl) || (this.context == null)) {
      return;
    }
    this.tHe = new LinkedList();
    this.hnA = false;
    this.tHf = -1L;
    this.hlZ = false;
    this.hmb = -1L;
    this.tHj = false;
    this.bCK = 0;
    if (com.tencent.mm.model.s.hB(paramString))
    {
      this.bCK = 1;
      this.iWF = new com.tencent.mm.e.a.a(this.context, 1);
      return;
    }
    this.bCK = 0;
    this.iWF = new com.tencent.mm.e.a.a(this.context, 0);
  }
  
  public final void ao(bd parambd)
  {
    if (parambd == null) {}
    do
    {
      return;
      au.HU();
      if (com.tencent.mm.model.c.isSDCardAvailable()) {
        break;
      }
    } while (this.tHe.size() <= 0);
    this.tHe.clear();
    com.tencent.mm.ui.base.s.gH(this.context);
    return;
    int j = this.tHe.size();
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        break label92;
      }
      if (((bd)this.tHe.get(i)).field_msgId == parambd.field_msgId) {
        break;
      }
      i += 1;
    }
    label92:
    if ((this.tHj) || (this.tHe.size() == 0)) {
      this.tHe.add(parambd);
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AutoPlay", "add voice msg :" + this.tHe.size());
  }
  
  public final void b(int paramInt, bd parambd)
  {
    if (parambd == null) {
      return;
    }
    csL();
    au.HU();
    Boolean localBoolean = (Boolean)com.tencent.mm.model.c.DT().get(4115, null);
    if ((localBoolean == null) || (!localBoolean.booleanValue()))
    {
      au.HU();
      com.tencent.mm.model.c.DT().set(4115, Boolean.valueOf(true));
      csR();
      this.tHi = com.tencent.mm.ui.base.s.a(this.bAG.tTq.getActivity(), this.context.getString(R.l.chatting_music_volumn_change), 4000L);
    }
    if ((this.iWF.isPlaying()) && (parambd.field_msgId == this.tHf))
    {
      csQ();
      return;
    }
    ao(parambd);
    if ((parambd.field_isSend == 0) && (!q.F(parambd))) {
      EG(paramInt + 1);
    }
    bhU();
  }
  
  public final void bhU()
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AutoPlay", "play next: size = " + this.tHe.size());
    if (this.tHe.size() <= 0)
    {
      this.tHr.sendEmptyMessageDelayed(0, 1000L);
      return;
    }
    if (!f.yz().yK())
    {
      f.yz();
      if (f.yH())
      {
        f.yz().a(this);
        int i = f.yz().yB();
        this.bCM = true;
        if ((i != -1) && (i != 0))
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AutoPlay", "play next: ret = " + i);
          this.tHs.sendEmptyMessageDelayed(0, 1000L);
          return;
        }
      }
    }
    csO();
  }
  
  public final void bz(boolean paramBoolean)
  {
    com.tencent.mm.sdk.platformtools.x.w("MicroMsg.AutoPlay", "voice play pause. %b", new Object[] { Boolean.valueOf(paramBoolean) });
    onStop();
  }
  
  public final void csL()
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AutoPlay", "clear play list, stack: %s", new Object[] { bi.cjd() });
    if (this.tHg != null) {
      this.tHg.dismiss();
    }
    this.tHe.clear();
  }
  
  public final void csM()
  {
    this.hnA = false;
    bhU();
  }
  
  public final void csO()
  {
    int i;
    bd localbd;
    try
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AutoPlay", "realPlayNext play next: size = " + this.tHe.size());
      if (this.tHe.size() <= 0)
      {
        this.tHr.sendEmptyMessageDelayed(0, 1000L);
        return;
      }
      long l = ((bd)this.tHe.get(0)).field_createTime;
      int k = this.tHe.size();
      i = 1;
      int j = 0;
      if (i < k)
      {
        if (l <= ((bd)this.tHe.get(i)).field_createTime) {
          break label849;
        }
        l = ((bd)this.tHe.get(i)).field_createTime;
        j = i;
        break label853;
      }
      localbd = (bd)this.tHe.get(j);
      if (localbd == null) {
        break label852;
      }
      if (localbd == null) {
        break label323;
      }
      if ((localbd.ckz()) || (localbd.cmp()) || (localbd.cmq())) {
        break label860;
      }
      if (!localbd.cmr()) {
        break label323;
      }
    }
    catch (Exception localException)
    {
      label197:
      d.4 local4;
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.AutoPlay", localException, "", new Object[0]);
      return;
    }
    Assert.assertTrue(bool1);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AutoPlay", "start play msg: %d", new Object[] { Long.valueOf(localbd.field_msgId) });
    if (!hlW.sIY)
    {
      hlW.a(this);
      local4 = new d.4(this);
      if (!this.hma.Q(local4)) {
        break label329;
      }
    }
    label323:
    label329:
    for (this.hmb = 0L;; this.hmb = -1L)
    {
      au.HU();
      if ((com.tencent.mm.model.c.isSDCardAvailable()) || (bi.oW(localbd.field_imgPath))) {
        break label339;
      }
      this.tHe.clear();
      com.tencent.mm.ui.base.s.gH(this.context);
      return;
      bool1 = false;
      break;
    }
    label339:
    au.HU();
    Object localObject;
    if ((com.tencent.mm.model.c.isSDCardAvailable()) && (this.tHh.hmc))
    {
      if (this.tHg != null) {
        this.tHg.dismiss();
      }
      bool1 = f.yz().yK();
      boolean bool2 = f.yz().yE();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AutoPlay", "alvinluo isHeadsetPluged: %b, isBluetoothOn: %b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if ((!bool1) && (bool2)) {
        this.tHg = com.tencent.mm.ui.base.s.a(this.bAG.tTq.getActivity(), R.k.tipsbar_bluetooth_icon, this.context.getString(R.l.chatfooter_SpeakerOff_bluetooth_now));
      }
    }
    else
    {
      af.Wp("keep_app_silent");
      q.H(localbd);
      this.iWF.aJ(true);
      this.tHh.acquireWakeLock();
      if ((f.yz().yK()) || (f.yz().yE()))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AutoPlay", "headset plugged: %b, bluetoothon: %b", new Object[] { Boolean.valueOf(f.yz().yK()), Boolean.valueOf(f.yz().yE()) });
        this.hlZ = false;
      }
      localObject = localbd.field_imgPath;
      if (this.bCK != 1) {
        break label779;
      }
      localObject = com.tencent.mm.plugin.subapp.c.h.aY((String)localObject, false);
      label568:
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AutoPlay", "startplay");
      bool1 = q.or(localbd.field_imgPath);
      if (!bool1) {
        com.tencent.mm.plugin.report.service.h.mEJ.a(111L, 175L, 1L, false);
      }
      if ((!bool1) || (!this.iWF.a((String)localObject, this.hlZ, true, -1))) {
        break label789;
      }
      localObject = this.iWF;
      if (this.tHe.size() <= 1) {
        break label866;
      }
    }
    label779:
    label789:
    label849:
    label852:
    label853:
    label860:
    label866:
    for (boolean bool1 = true;; bool1 = false)
    {
      ((com.tencent.mm.ab.g)localObject).aL(bool1);
      this.iWF.a(this);
      this.iWF.a(this);
      this.iWF.a(this);
      this.iWF.a(this);
      this.tHf = localbd.field_msgId;
      this.tHn = new n(localbd.field_content).time;
      this.tHm = System.currentTimeMillis();
      for (;;)
      {
        avj();
        this.tHl = false;
        return;
        this.tHg = com.tencent.mm.ui.base.s.a(this.bAG.tTq.getActivity(), R.k.tipsbar_receiver_icon, this.context.getString(R.l.chatfooter_SpeakerOff_now));
        break;
        localObject = q.getFullPath((String)localObject);
        break label568;
        this.tHf = -1L;
        if (this.bCM)
        {
          f.yz().yC();
          this.bCM = false;
        }
        f.yz().b(this);
        csL();
        Toast.makeText(this.context, this.context.getString(R.l.chatting_play_err), 0).show();
      }
      break label853;
      return;
      i += 1;
      break;
      bool1 = true;
      break label197;
    }
  }
  
  public final void csP()
  {
    if ((this.iWF != null) && (this.iWF.isPlaying()))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AutoPlay", "switchSpeaker, isSpeakerOn: %b, isPlaying: %b", new Object[] { Boolean.valueOf(this.hlZ), Boolean.valueOf(this.iWF.isPlaying()) });
      this.iWF.aK(this.hlZ);
    }
  }
  
  public final void csQ()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AutoPlay", "stop play");
    af.Wq("keep_app_silent");
    this.iWF.stop();
  }
  
  public final void csR()
  {
    if (this.tHi != null) {
      this.tHi.dismiss();
    }
  }
  
  public final void dK(boolean paramBoolean)
  {
    boolean bool = true;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AutoPlay", "onSensorEvent, isON:" + paramBoolean + "  hasSkip:" + this.hmg + " tick:" + bi.bI(this.hmb) + "  lt:" + this.hmb);
    if (this.hmg) {
      if (!paramBoolean)
      {
        paramBoolean = bool;
        this.hmg = paramBoolean;
      }
    }
    do
    {
      do
      {
        return;
        paramBoolean = false;
        break;
        if (this.context == null)
        {
          hlW.ciL();
          return;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AutoPlay", "isScreenOn: %s", new Object[] { Boolean.valueOf(isScreenEnable()) });
        if ((!paramBoolean) && (this.hmb != -1L) && (bi.bI(this.hmb) > 400L))
        {
          this.hmg = true;
          return;
        }
        this.hmg = false;
      } while (this.iWF.vZ());
      if (au.HV().yE())
      {
        csR();
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AutoPlay", "onSensorEvent, connecting bluetooth, omit sensor event");
        return;
      }
      if (this.tHh.hmc)
      {
        this.hlZ = false;
        if (this.tHf != -1L) {
          setScreenEnable(paramBoolean);
        }
        for (this.tHl = paramBoolean;; this.tHl = true)
        {
          csP();
          return;
          setScreenEnable(true);
        }
      }
      if (this.tHf == -1L) {
        break label309;
      }
    } while (isScreenEnable() == paramBoolean);
    setScreenEnable(paramBoolean);
    this.tHl = paramBoolean;
    new al(new d.6(this, paramBoolean), false).J(50L, 50L);
    label309:
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AutoPlay", "onSensorEvent, isResumeFromDisableScreen:%b", new Object[] { Boolean.valueOf(this.tHl) });
  }
  
  public final void ew(int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AutoPlay", "onBluetoothHeadsetStateChange, status: %d, isRequestStartBluetooth: %b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(this.bCM) });
    switch (paramInt)
    {
    }
    do
    {
      do
      {
        return;
      } while (!this.tHs.hasMessages(0));
      this.tHs.removeMessages(0);
      this.tHs.sendEmptyMessage(0);
      return;
      if (this.tHs.hasMessages(0)) {
        this.tHs.removeMessages(0);
      }
    } while (!this.bCM);
    f.yz().yC();
    this.bCM = false;
  }
  
  public final boolean isPlaying()
  {
    return this.iWF.isPlaying();
  }
  
  public final void onError()
  {
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AutoPlay", "voice play error");
    csQ();
    bhU();
  }
  
  public final void onStop()
  {
    int i = 1;
    com.tencent.mm.sdk.platformtools.x.w("MicroMsg.AutoPlay", "voice play stop. %d, %d, %d, %b, %b, %s", new Object[] { Long.valueOf(this.tHf), Long.valueOf(this.tHn), Long.valueOf(bi.bH(this.tHm)), Boolean.valueOf(this.tHp), Boolean.valueOf(this.tHo), bi.cjd() });
    com.tencent.mm.plugin.report.service.h localh;
    long l1;
    long l2;
    long l3;
    if (this.tHf > 0L)
    {
      localh = com.tencent.mm.plugin.report.service.h.mEJ;
      l1 = this.tHf;
      l2 = this.tHn;
      l3 = bi.bH(this.tHm);
      if (this.tHp) {
        break label261;
      }
      if (!this.tHo) {
        break label256;
      }
    }
    for (;;)
    {
      localh.h(15160, new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3), Integer.valueOf(i) });
      this.tHp = false;
      this.tHo = false;
      this.tHh.releaseWakeLock();
      csN();
      if (this.bCM)
      {
        f.yz().yC();
        this.bCM = false;
      }
      f.yz().b(this);
      if (this.tHe.isEmpty())
      {
        hlW.ciL();
        this.hma.ciM();
      }
      avj();
      this.tHf = -1L;
      csR();
      this.tHl = false;
      return;
      label256:
      i = 2;
      continue;
      label261:
      i = 3;
    }
  }
  
  public final void release()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AutoPlay", "alvinluo AutoPlay release");
    if (this.hma != null) {
      this.hma.ciM();
    }
  }
  
  final void setScreenEnable(boolean paramBoolean)
  {
    if (this.bAG != null) {
      this.bAG.tTq.getController().setScreenEnable(paramBoolean);
    }
  }
  
  public final void wd()
  {
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.AutoPlay", "voice play completion isSpeakerOn %b, %d, %d", new Object[] { Boolean.valueOf(this.hlZ), Long.valueOf(this.tHf), Long.valueOf(this.tHn) });
    com.tencent.mm.plugin.report.service.h.mEJ.h(15160, new Object[] { Long.valueOf(this.tHf), Long.valueOf(this.tHn), Long.valueOf(this.tHn), Integer.valueOf(0) });
    if (this.context != null)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AutoPlay", "stop play complete");
      af.Wq("keep_app_silent");
      this.tHh.releaseWakeLock();
      csN();
      if ((this.tHe.isEmpty()) && (this.bCM))
      {
        f.yz().yC();
        this.bCM = false;
      }
      f.yz().b(this);
      if (this.tHe.isEmpty())
      {
        hlW.ciL();
        this.hma.ciM();
      }
      avj();
      this.tHf = -1L;
      csR();
      this.tHh.releaseWakeLock();
      bhU();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/chatting/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */