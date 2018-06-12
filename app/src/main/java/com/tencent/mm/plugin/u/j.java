package com.tencent.mm.plugin.u;

import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ag.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class j
{
  long aeq;
  public long aqC;
  boolean hEj;
  ag ldC;
  ag ldD;
  ag ldE;
  long ldF;
  boolean ldG = false;
  public k ldH;
  boolean ldI = false;
  a ldJ;
  private ag.a ldK = new j.1(this);
  private ag.a ldL = new ag.a()
  {
    public final boolean handleMessage(Message paramAnonymousMessage)
    {
      switch (paramAnonymousMessage.what)
      {
      case 5: 
      case 6: 
      default: 
        return false;
      case 1: 
        if (j.this.ldH.bdz())
        {
          j.this.aqC = j.this.ldH.aqC;
          j.a(j.this, j.this.ldC, SystemClock.elapsedRealtime(), 0L);
          return false;
        }
        j.this.ldh.obtainMessage(5, -1, -1).sendToTarget();
        return false;
      case 2: 
        paramAnonymousMessage = j.this.ldg;
        long l = bi.bI(paramAnonymousMessage.lcY);
        if ((paramAnonymousMessage.lcY > 0L) && (l >= 30L))
        {
          x.w("MicroMsg.PlayTimeLine", "%s do some work delay 30ms!!![%d, %d]", new Object[] { paramAnonymousMessage.avA(), Long.valueOf(paramAnonymousMessage.lcY), Long.valueOf(l) });
          paramAnonymousMessage.lcZ = 0L;
        }
        if (d.sB(j.this.ldH.state))
        {
          j.this.ldE.obtainMessage(9).sendToTarget();
          j.this.ldC.removeMessages(2);
          return false;
        }
        int j = j.this.ldH.v(j.this.aeq, j.this.ldF);
        if (d.sy(j)) {
          j.this.ldE.obtainMessage(2).sendToTarget();
        }
        if (j == 7) {}
        for (int i = 1; i != 0; i = 0)
        {
          j.this.ldE.obtainMessage(7).sendToTarget();
          j.this.ldC.removeMessages(2);
          return false;
        }
        if (d.sD(j))
        {
          j.a(j.this, j.this.ldC, SystemClock.elapsedRealtime(), 0L);
          j.this.ldg.lcY = bi.VG();
          return false;
        }
        if (j.this.state == 3) {
          j.a(j.this, j.this.ldC, SystemClock.elapsedRealtime(), j.this.ldg.lcZ);
        }
        for (;;)
        {
          j.this.ldg.lcY = bi.VG();
          return false;
          if (j.this.state == 5) {
            j.a(j.this, j.this.ldC, SystemClock.elapsedRealtime(), 0L);
          } else if (j.this.state == 1) {
            j.a(j.this, j.this.ldC, SystemClock.elapsedRealtime(), 0L);
          } else if (j.this.state == 0) {
            j.a(j.this, j.this.ldC, SystemClock.elapsedRealtime(), 0L);
          } else if (j.this.state == 6) {
            j.a(j.this, j.this.ldC, SystemClock.elapsedRealtime(), 0L);
          } else {
            j.this.ldC.removeMessages(2);
          }
        }
      case 3: 
        j.this.sH(3);
        j.this.ldH.start();
        j.a(j.this, j.this.ldC, SystemClock.elapsedRealtime(), 0L);
        return false;
      case 4: 
        j.this.sH(4);
        j.a(j.this, j.this.ldC, SystemClock.elapsedRealtime(), 0L);
        j.this.ldH.pause();
        return false;
      }
      j.this.ldH.release();
      j.this.ldG = true;
      j.this.ldE.obtainMessage(0).sendToTarget();
      return false;
    }
  };
  private ag.a ldM = new ag.a()
  {
    public final boolean handleMessage(Message paramAnonymousMessage)
    {
      if (j.this.ldJ == null) {
        return false;
      }
      switch (paramAnonymousMessage.what)
      {
      case 5: 
      case 6: 
      default: 
        return false;
      case 1: 
        if (!j.this.ldJ.bdz()) {
          j.this.ldJ = null;
        }
        j.a(j.this, j.this.ldD, SystemClock.elapsedRealtime(), 0L);
        return false;
      case 2: 
        if (d.sB(j.this.ldJ.state))
        {
          j.this.ldE.obtainMessage(9).sendToTarget();
          j.this.ldD.removeMessages(2);
          return false;
        }
        if (d.sy(j.this.ldJ.v(j.this.aeq, j.this.ldF))) {
          j.this.ldE.sendMessageDelayed(j.this.ldE.obtainMessage(2), 10L);
        }
        if (j.this.state == 3)
        {
          j.a(j.this, j.this.ldD, SystemClock.elapsedRealtime(), j.this.ldg.lcZ);
          return false;
        }
        if (j.this.state == 5)
        {
          j.a(j.this, j.this.ldD, SystemClock.elapsedRealtime(), 0L);
          return false;
        }
        if (j.this.state == 1)
        {
          j.a(j.this, j.this.ldD, SystemClock.elapsedRealtime(), 0L);
          return false;
        }
        if (j.this.state == 0)
        {
          j.a(j.this, j.this.ldD, SystemClock.elapsedRealtime(), 0L);
          return false;
        }
        j.this.ldD.removeMessages(2);
        return false;
      case 3: 
        j.this.ldJ.start();
        j.a(j.this, j.this.ldD, SystemClock.elapsedRealtime(), 0L);
        return false;
      case 4: 
        j.a(j.this, j.this.ldD, SystemClock.elapsedRealtime(), 0L);
        j.this.ldJ.pause();
        return false;
      }
      j.this.ldJ.release();
      j.this.ldI = true;
      j.this.ldE.obtainMessage(0).sendToTarget();
      return false;
    }
  };
  public g ldg;
  ag ldh;
  int state;
  
  public j(ag paramag, Looper paramLooper1, Looper paramLooper2, Looper paramLooper3)
  {
    this.ldh = paramag;
    this.hEj = false;
    this.ldg = new g(this.hEj);
    this.ldE = new ag(paramLooper1, this.ldK);
    this.ldH = new k(this.ldg, this.ldh);
    this.ldC = new ag(paramLooper2, this.ldL);
    if (paramLooper3 != null)
    {
      this.ldJ = new a(this.ldg, this.ldh);
      this.ldD = new ag(paramLooper3, this.ldM);
    }
  }
  
  private void a(ag paramag, long paramLong1, long paramLong2)
  {
    if (d.sB(this.state)) {}
    for (;;)
    {
      return;
      try
      {
        Thread localThread = paramag.getLooper().getThread();
        if (localThread != null)
        {
          boolean bool = localThread.isAlive();
          if (!bool) {
            continue;
          }
        }
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
    paramag.removeMessages(2);
    paramLong1 = paramLong1 + paramLong2 - SystemClock.elapsedRealtime();
    if (paramLong1 <= 0L)
    {
      paramag.sendEmptyMessage(2);
      return;
    }
    paramag.sendEmptyMessageDelayed(2, paramLong1);
  }
  
  public final void bdB()
  {
    x.i("MicroMsg.VideoPlayerImpl", "%s reset extractor time[%d]", new Object[] { this.ldg.avA(), Long.valueOf(this.ldg.lcW) });
    if (this.ldH != null)
    {
      this.ldH.w(this.ldg.lcW, -1L);
      this.ldH.bdx();
      this.ldH.ldk = 0L;
    }
  }
  
  public final void bdC()
  {
    if (this.ldH != null)
    {
      x.i("MicroMsg.VideoPlayerImpl", "%s player flush surface", new Object[] { this.ldg.avA() });
      this.ldH.setState(10);
      a(this.ldC, SystemClock.elapsedRealtime(), 0L);
    }
  }
  
  public final void pause()
  {
    setState(4);
    this.ldC.obtainMessage(4).sendToTarget();
    if (this.ldJ != null) {
      this.ldD.obtainMessage(4).sendToTarget();
    }
  }
  
  public final void release()
  {
    setState(9);
    this.ldE.removeMessages(2);
    this.ldE.removeMessages(9);
    this.ldC.removeMessages(1);
    this.ldC.removeMessages(2);
    this.ldC.removeMessages(3);
    this.ldC.removeMessages(4);
    this.ldC.removeMessages(6);
    this.ldC.removeCallbacksAndMessages(null);
    try
    {
      this.ldH.setState(9);
      Object localObject = this.ldH;
      x.i("MicroMsg.VideoTrackDataSource", "%s isConfigureSurface [%b]", new Object[] { ((k)localObject).avA(), Boolean.valueOf(((k)localObject).ldO) });
      if ((((k)localObject).ldO) && (com.tencent.mm.compatible.util.d.fT(19))) {
        this.ldH.ll();
      }
      this.ldC.obtainMessage(7).sendToTarget();
      if (this.ldD != null)
      {
        this.ldD.removeMessages(1);
        this.ldD.removeMessages(2);
        this.ldD.removeMessages(3);
        this.ldD.removeMessages(4);
        this.ldD.removeMessages(6);
        this.ldD.obtainMessage(7).sendToTarget();
      }
      localObject = this.ldg;
      ((g)localObject).lcT = 0L;
      ((g)localObject).lcU = 0L;
      ((g)localObject).lcV = -1L;
      ((g)localObject).aeq = 0L;
      ((g)localObject).lcW = 0L;
      ((g)localObject).lcX = 0L;
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.VideoPlayerImpl", localException, "release error %s", new Object[] { localException.toString() });
      }
    }
  }
  
  public final void sG(int paramInt)
  {
    x.i("MicroMsg.VideoPlayerImpl", "%s seek to [%d] is precision[%b]", new Object[] { this.ldg.avA(), Integer.valueOf(paramInt), Boolean.valueOf(true) });
    this.ldH.pause();
    if (this.ldJ != null) {
      this.ldJ.pause();
    }
    if (paramInt >= this.aqC)
    {
      x.i("MicroMsg.VideoPlayerImpl", "seekTo %d, duration %d ", new Object[] { Integer.valueOf(paramInt), Long.valueOf(this.aqC) });
      setState(6);
      this.ldE.obtainMessage(9).sendToTarget();
      return;
    }
    long l = this.ldH.sF(paramInt);
    boolean bool;
    if ((l >= 0L) && (l < paramInt))
    {
      bool = true;
      x.i("MicroMsg.VideoPlayerImpl", "%s can seek precision[%b] after seek [%d, %d]", new Object[] { this.ldg.avA(), Boolean.valueOf(bool), Long.valueOf(l), Integer.valueOf(paramInt) });
      this.ldH.setState(6);
      setState(6);
      if (!bool) {
        break label238;
      }
    }
    label238:
    for (this.ldg.lcV = paramInt;; this.ldg.lcV = l)
    {
      sH(6);
      a(this.ldC, SystemClock.elapsedRealtime(), 0L);
      return;
      bool = false;
      break;
    }
  }
  
  final void sH(int paramInt)
  {
    x.i("MicroMsg.VideoPlayerImpl", "%s update positions state %d timeline[%d %d %d]", new Object[] { this.ldg.avA(), Integer.valueOf(paramInt), Long.valueOf(this.ldg.lcT), Long.valueOf(this.ldg.lcU), Long.valueOf(this.ldg.aeq) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      this.ldF = this.ldg.lcT;
      this.aeq = this.ldg.aeq;
      x.i("MicroMsg.VideoPlayerImpl", "%s update positions end state[%d] ms[%d, %d]", new Object[] { this.ldg.avA(), Integer.valueOf(paramInt), Long.valueOf(this.ldF), Long.valueOf(this.aeq) });
      return;
      g localg;
      if (this.ldg.lcU > 0L)
      {
        localg = this.ldg;
        localg.aeq += this.ldg.lcU - this.ldg.lcT;
        this.ldg.lcU = 0L;
      }
      this.ldg.lcT = SystemClock.elapsedRealtime();
      continue;
      if (this.ldg.lcT <= 0L)
      {
        this.ldg.lcU = 0L;
      }
      else
      {
        this.ldg.lcU = SystemClock.elapsedRealtime();
        continue;
        this.ldg.aeq = this.ldg.lcV;
        this.ldg.lcT = SystemClock.elapsedRealtime();
        this.ldg.lcU = 0L;
        localg = this.ldg;
        this.ldg.lcX = 0L;
        localg.lcW = 0L;
        continue;
        this.ldg.aeq = this.ldg.lcV;
        localg = this.ldg;
        this.ldg.lcU = 0L;
        localg.lcT = 0L;
        localg = this.ldg;
        this.ldg.lcX = 0L;
        localg.lcW = 0L;
        continue;
        this.ldg.aeq = this.ldg.lcV;
        localg = this.ldg;
        this.ldg.lcU = 0L;
        localg.lcT = 0L;
      }
    }
  }
  
  protected final void setState(int paramInt)
  {
    x.i("MicroMsg.VideoPlayerImpl", "%s set state old %d new %d stack %s", new Object[] { this.ldg.avA(), Integer.valueOf(this.state), Integer.valueOf(paramInt), bi.cjd() });
    this.state = paramInt;
    this.ldg.lcY = 0L;
  }
  
  public final void start()
  {
    setState(3);
    this.ldC.obtainMessage(3).sendToTarget();
    if (this.ldJ != null) {
      this.ldD.obtainMessage(3).sendToTarget();
    }
  }
  
  public final void stop()
  {
    setState(8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/u/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */