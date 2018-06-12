package com.tencent.mm.plugin.multitalk.a;

import android.os.SystemClock;
import com.tencent.mm.compatible.b.f;
import com.tencent.mm.compatible.b.f.a;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver.a;
import com.tencent.mm.plugin.voip.model.a;
import com.tencent.mm.plugin.voip.video.i;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  implements f.a, HeadsetPlugReceiver.a
{
  boolean bTv = false;
  com.tencent.mm.compatible.util.b epT = new com.tencent.mm.compatible.util.b(ad.getContext());
  com.tencent.mm.plugin.voip.model.b kpV = null;
  private final Object kpW = new Object();
  HeadsetPlugReceiver kqe = new HeadsetPlugReceiver();
  private boolean kqi = false;
  private boolean kqj = false;
  final Object lsX = new Object();
  private int lsY;
  g.a lsZ = new g.a();
  
  private boolean bfM()
  {
    boolean bool1;
    if ((o.bgN().koX.alf()) && (!this.kqj))
    {
      bool1 = true;
      bool2 = bool1;
      if (o.bgN().koX.alf())
      {
        bool2 = bool1;
        if (!this.kqj) {
          if (!o.bgN().lto) {
            break label140;
          }
        }
      }
    }
    label140:
    for (boolean bool2 = true;; bool2 = false)
    {
      x.i("MicroMsg.MT.MultiTalkAudioPlayer", "isSpeakerAfterBluetoothDisconnected: isHeadsetPlugged: %s, isHandsFree: %s, isHandsFreeUIStatus: %s, isRingStop: %s, isBluetoothConnected: %s, isSpeaker: %s", new Object[] { Boolean.valueOf(this.kqj), Boolean.valueOf(o.bgN().ltn), Boolean.valueOf(o.bgN().lto), Boolean.valueOf(o.bgN().koX.alf()), Boolean.valueOf(this.kqi), Boolean.valueOf(bool2) });
      return bool2;
      bool1 = false;
      break;
    }
  }
  
  public final int a(a parama, int paramInt1, int paramInt2)
  {
    synchronized (this.lsX)
    {
      if (this.bTv)
      {
        x.d("MicroMsg.MT.MultiTalkAudioPlayer", "startPlay, already start");
        return -1;
      }
      x.i("MicroMsg.MT.MultiTalkAudioPlayer", "startPlay %s", new Object[] { Integer.valueOf(hashCode()) });
      if (this.kpV == null)
      {
        this.kpV = new com.tencent.mm.plugin.voip.model.b();
        this.kpV.X(paramInt1, paramInt2, 0);
      }
      this.kpV.r(ad.getContext(), false);
      this.kpV.oHi = parama;
      au.HV().a(this);
      this.kqj = au.HV().yK();
      this.kqi = au.HV().yE();
      x.i("MicroMsg.MT.MultiTalkAudioPlayer", "startPlay, isHeadsetPlugged: %b, isBluetoothConnected: %b %s", new Object[] { Boolean.valueOf(this.kqj), Boolean.valueOf(this.kqi), Integer.valueOf(hashCode()) });
      x.i("MicroMsg.MT.MultiTalkAudioPlayer", "set start play");
      this.bTv = true;
      this.lsZ.dgA = SystemClock.elapsedRealtime();
      paramInt1 = this.kpV.bJt();
      x.i("MicroMsg.MT.MultiTalkAudioPlayer", "startPlaying cost: " + this.lsZ.Ad());
      this.epT.requestFocus();
      this.kqe.a(ad.getContext(), this);
      if ((this.kqj) || (this.kqi))
      {
        o.bgN().gF(false);
        if (this.kqi) {
          au.HV().yB();
        }
      }
      x.i("MicroMsg.MT.MultiTalkAudioPlayer", "finish start play: %s", new Object[] { Integer.valueOf(paramInt1) });
      return paramInt1;
    }
  }
  
  public final void ew(int paramInt)
  {
    x.i("MicroMsg.MT.MultiTalkAudioPlayer", "onBluetoothHeadsetStateChange, status: %d, isStart: %s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(this.bTv) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      this.lsY = paramInt;
      return;
      this.kqi = true;
      au.HV().yB();
      continue;
      if (paramInt != this.lsY)
      {
        this.kqi = true;
        o.bgN().gF(false);
        fT(false);
        o.bgN().gK(false);
        continue;
        if (paramInt != this.lsY)
        {
          this.kqi = false;
          boolean bool = bfM();
          fT(bool);
          o.bgN().gK(bool);
          o.bgN().gF(true);
          continue;
          if (paramInt != this.lsY)
          {
            this.kqi = false;
            au.HV().yC();
            bool = bfM();
            fT(bool);
            o.bgN().gK(bool);
            o.bgN().gF(true);
          }
        }
      }
    }
  }
  
  public final void fT(boolean paramBoolean)
  {
    x.i("MicroMsg.MT.MultiTalkAudioPlayer", "setSpeakerPhoneOn, isSpeakerPhoneOn: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    au.HV().aY(paramBoolean);
    if ((this.kpV != null) && (this.kpV.oGX)) {
      this.kpV.iJ(paramBoolean);
    }
  }
  
  public final void fV(boolean paramBoolean)
  {
    boolean bool3 = false;
    boolean bool2;
    boolean bool1;
    if (this.kqj != paramBoolean)
    {
      this.kqj = paramBoolean;
      x.i("MicroMsg.MT.MultiTalkAudioPlayer", "onHeadsetState: isHeadsetPlugged: %s, isHandsFree: %s, isHandsFreeUIStatus: %s, isRingStop: %s, isBluetoothConnected: %s", new Object[] { Boolean.valueOf(this.kqj), Boolean.valueOf(o.bgN().ltn), Boolean.valueOf(o.bgN().lto), Boolean.valueOf(o.bgN().koX.alf()), Boolean.valueOf(this.kqi) });
      if ((!o.bgN().koX.alf()) || (this.kqj)) {
        break label186;
      }
      bool2 = true;
      if (paramBoolean) {
        o.bgN().gF(false);
      }
      bool1 = bool2;
      if (o.bgN().koX.alf())
      {
        bool1 = bool2;
        if (!this.kqj)
        {
          if (!o.bgN().lto) {
            break label191;
          }
          bool1 = true;
        }
      }
      label152:
      if (!this.kqi) {
        break label196;
      }
      bool1 = bool3;
    }
    label186:
    label191:
    label196:
    for (;;)
    {
      fT(bool1);
      o.bgN().gK(bool1);
      if (!paramBoolean) {
        o.bgN().gF(true);
      }
      return;
      bool2 = false;
      break;
      bool1 = false;
      break label152;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/multitalk/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */