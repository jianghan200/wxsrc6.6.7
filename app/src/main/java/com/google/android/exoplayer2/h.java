package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.g.e;
import com.google.android.exoplayer2.g.g;
import com.google.android.exoplayer2.i.a;
import com.google.android.exoplayer2.i.t;
import com.google.android.exoplayer2.source.f.b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

final class h
  implements f
{
  private final r[] acG;
  final g acH;
  private final com.google.android.exoplayer2.g.f acI;
  private final Handler acJ;
  private final i acK;
  final CopyOnWriteArraySet<q.a> acL;
  private final w.b acM;
  private final w.a acN;
  boolean acO;
  boolean acP;
  int acQ;
  int acR;
  int acS;
  boolean acT;
  w acU;
  Object acV;
  com.google.android.exoplayer2.source.m acW;
  com.google.android.exoplayer2.g.f acX;
  p acY;
  i.b acZ;
  int ada;
  int adb;
  long adc;
  private int repeatMode;
  
  @SuppressLint({"HandlerLeak"})
  public h(r[] paramArrayOfr, g paramg, m paramm)
  {
    new StringBuilder("Init ").append(Integer.toHexString(System.identityHashCode(this))).append(" [ExoPlayerLib/2.5.4] [").append(t.aCH).append("]");
    boolean bool;
    if (paramArrayOfr.length > 0)
    {
      bool = true;
      a.ap(bool);
      this.acG = ((r[])a.Z(paramArrayOfr));
      this.acH = ((g)a.Z(paramg));
      this.acP = false;
      this.repeatMode = 0;
      this.acQ = 1;
      this.acL = new CopyOnWriteArraySet();
      this.acI = new com.google.android.exoplayer2.g.f(new e[paramArrayOfr.length]);
      this.acU = w.aeW;
      this.acM = new w.b();
      this.acN = new w.a();
      this.acW = com.google.android.exoplayer2.source.m.asH;
      this.acX = this.acI;
      this.acY = p.aew;
      if (Looper.myLooper() == null) {
        break label243;
      }
    }
    label243:
    for (Looper localLooper = Looper.myLooper();; localLooper = Looper.getMainLooper())
    {
      this.acJ = new h.1(this, localLooper);
      this.acZ = new i.b(0L);
      this.acK = new i(paramArrayOfr, paramg, paramm, this.acP, this.repeatMode, this.acJ, this.acZ, this);
      return;
      bool = false;
      break;
    }
  }
  
  private int iE()
  {
    if ((this.acU.isEmpty()) || (this.acR > 0)) {
      return this.ada;
    }
    return this.acU.a(this.acZ.adJ.arU, this.acN, false).adO;
  }
  
  private long q(long paramLong)
  {
    long l = b.n(paramLong);
    paramLong = l;
    if (!this.acZ.adJ.kF())
    {
      this.acU.a(this.acZ.adJ.arU, this.acN, false);
      paramLong = l + b.n(this.acN.aeY);
    }
    return paramLong;
  }
  
  public final void a(q.a parama)
  {
    this.acL.add(parama);
  }
  
  public final void a(com.google.android.exoplayer2.source.f paramf)
  {
    Iterator localIterator;
    if ((!this.acU.isEmpty()) || (this.acV != null))
    {
      this.acU = w.aeW;
      this.acV = null;
      localIterator = this.acL.iterator();
      while (localIterator.hasNext()) {
        localIterator.next();
      }
    }
    if (this.acO)
    {
      this.acO = false;
      this.acW = com.google.android.exoplayer2.source.m.asH;
      this.acX = this.acI;
      this.acH.X(null);
      localIterator = this.acL.iterator();
      while (localIterator.hasNext()) {
        localIterator.next();
      }
    }
    this.acS += 1;
    this.acK.handler.obtainMessage(0, 1, 0, paramf).sendToTarget();
  }
  
  public final void a(f.c... paramVarArgs)
  {
    i locali = this.acK;
    if (!locali.released)
    {
      locali.adp += 1;
      locali.handler.obtainMessage(11, paramVarArgs).sendToTarget();
    }
  }
  
  public final void af(boolean paramBoolean)
  {
    if (this.acP != paramBoolean)
    {
      this.acP = paramBoolean;
      Object localObject = this.acK.handler;
      if (paramBoolean) {}
      for (int i = 1;; i = 0)
      {
        ((Handler)localObject).obtainMessage(1, i, 0).sendToTarget();
        localObject = this.acL.iterator();
        while (((Iterator)localObject).hasNext()) {
          ((q.a)((Iterator)localObject).next()).b(paramBoolean, this.acQ);
        }
      }
    }
  }
  
  public final void b(q.a parama)
  {
    this.acL.remove(parama);
  }
  
  public final void b(f.c... paramVarArgs)
  {
    this.acK.b(paramVarArgs);
  }
  
  public final int getBufferedPercentage()
  {
    if (this.acU.isEmpty()) {}
    long l1;
    long l2;
    do
    {
      return 0;
      l1 = getBufferedPosition();
      l2 = getDuration();
    } while ((l1 == -9223372036854775807L) || (l2 == -9223372036854775807L));
    if (l2 == 0L) {
      return 100;
    }
    return t.u((int)(l1 * 100L / l2), 0, 100);
  }
  
  public final long getBufferedPosition()
  {
    if ((this.acU.isEmpty()) || (this.acR > 0)) {
      return this.adc;
    }
    return q(this.acZ.adN);
  }
  
  public final long getCurrentPosition()
  {
    if ((this.acU.isEmpty()) || (this.acR > 0)) {
      return this.adc;
    }
    return q(this.acZ.adM);
  }
  
  public final long getDuration()
  {
    if (this.acU.isEmpty()) {
      return -9223372036854775807L;
    }
    if ((!this.acU.isEmpty()) && (this.acR == 0) && (this.acZ.adJ.kF())) {}
    for (int i = 1; i != 0; i = 0)
    {
      f.b localb = this.acZ.adJ;
      this.acU.a(localb.arU, this.acN, false);
      return b.n(this.acN.ar(localb.arV, localb.arW));
    }
    return b.n(this.acU.a(iE(), this.acM, 0L).aet);
  }
  
  public final int iB()
  {
    return this.acQ;
  }
  
  public final boolean iC()
  {
    return this.acP;
  }
  
  public final boolean iD()
  {
    return this.acT;
  }
  
  public final void release()
  {
    new StringBuilder("Release ").append(Integer.toHexString(System.identityHashCode(this))).append(" [ExoPlayerLib/2.5.4] [").append(t.aCH).append("] [").append(j.iO()).append("]");
    this.acK.release();
    this.acJ.removeCallbacksAndMessages(null);
  }
  
  public final void seekTo(long paramLong)
  {
    int j = iE();
    if ((j < 0) || ((!this.acU.isEmpty()) && (j >= this.acU.iU()))) {
      throw new l(this.acU, j, paramLong);
    }
    this.acR += 1;
    this.ada = j;
    if (this.acU.isEmpty())
    {
      this.adb = 0;
      if (paramLong != -9223372036854775807L) {
        break label260;
      }
      this.adc = 0L;
      this.acK.a(this.acU, j, -9223372036854775807L);
    }
    for (;;)
    {
      return;
      this.acU.a(j, this.acM, 0L);
      if (paramLong == -9223372036854775807L) {}
      int i;
      for (long l1 = this.acM.afl;; l1 = b.o(paramLong))
      {
        i = this.acM.afj;
        long l2 = this.acM.afm + l1;
        for (l1 = this.acU.a(i, this.acN, false).aet; (l1 != -9223372036854775807L) && (l2 >= l1) && (i < this.acM.afk); l1 = ((w)localObject).a(i, this.acN, false).aet)
        {
          l2 -= l1;
          localObject = this.acU;
          i += 1;
        }
      }
      this.adb = i;
      break;
      label260:
      this.adc = paramLong;
      this.acK.a(this.acU, j, b.o(paramLong));
      Object localObject = this.acL.iterator();
      while (((Iterator)localObject).hasNext()) {
        ((q.a)((Iterator)localObject).next()).iS();
      }
    }
  }
  
  public final void stop()
  {
    this.acK.handler.sendEmptyMessage(5);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/exoplayer2/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */