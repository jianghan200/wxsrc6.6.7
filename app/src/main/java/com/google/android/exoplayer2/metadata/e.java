package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.k;
import java.util.Arrays;

public final class e
  extends com.google.android.exoplayer2.a
  implements Handler.Callback
{
  private boolean apY;
  private final k apy;
  private a aqA;
  private final c aqs;
  private final a aqt;
  private final Handler aqu;
  private final d aqv;
  private final Metadata[] aqw;
  private final long[] aqx;
  private int aqy;
  private int aqz;
  
  public e(a parama, Looper paramLooper)
  {
    this(parama, paramLooper, c.aqr);
  }
  
  private e(a parama, Looper paramLooper, c paramc)
  {
    super(4);
    this.aqt = ((a)com.google.android.exoplayer2.i.a.Z(parama));
    if (paramLooper == null) {}
    for (parama = null;; parama = new Handler(paramLooper, this))
    {
      this.aqu = parama;
      this.aqs = ((c)com.google.android.exoplayer2.i.a.Z(paramc));
      this.apy = new k();
      this.aqv = new d();
      this.aqw = new Metadata[5];
      this.aqx = new long[5];
      return;
    }
  }
  
  private void b(Metadata paramMetadata)
  {
    this.aqt.a(paramMetadata);
  }
  
  private void kt()
  {
    Arrays.fill(this.aqw, null);
    this.aqy = 0;
    this.aqz = 0;
  }
  
  protected final void a(Format[] paramArrayOfFormat, long paramLong)
  {
    this.aqA = this.aqs.h(paramArrayOfFormat[0]);
  }
  
  public final int b(Format paramFormat)
  {
    if (this.aqs.g(paramFormat)) {
      return 4;
    }
    return 0;
  }
  
  protected final void b(long paramLong, boolean paramBoolean)
  {
    kt();
    this.apY = false;
  }
  
  public final void c(long paramLong1, long paramLong2)
  {
    if ((!this.apY) && (this.aqz < 5))
    {
      this.aqv.clear();
      if (a(this.apy, this.aqv, false) == -4)
      {
        if (!this.aqv.jy()) {
          break label140;
        }
        this.apY = true;
      }
    }
    if ((this.aqz > 0) && (this.aqx[this.aqy] <= paramLong1))
    {
      Metadata localMetadata = this.aqw[this.aqy];
      if (this.aqu == null) {
        break label246;
      }
      this.aqu.obtainMessage(0, localMetadata).sendToTarget();
    }
    for (;;)
    {
      this.aqw[this.aqy] = null;
      this.aqy = ((this.aqy + 1) % 5);
      this.aqz -= 1;
      return;
      label140:
      if (this.aqv.jx()) {
        break;
      }
      this.aqv.aek = this.apy.aep.aek;
      this.aqv.jE();
      try
      {
        int i = (this.aqy + this.aqz) % 5;
        this.aqw[i] = this.aqA.a(this.aqv);
        this.aqx[i] = this.aqv.aih;
        this.aqz += 1;
      }
      catch (b localb)
      {
        throw com.google.android.exoplayer2.e.a(localb, this.index);
      }
      label246:
      b(localb);
    }
  }
  
  public final boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      throw new IllegalStateException();
    }
    b((Metadata)paramMessage.obj);
    return true;
  }
  
  public final boolean hv()
  {
    return true;
  }
  
  public final boolean iT()
  {
    return this.apY;
  }
  
  protected final void ix()
  {
    kt();
    this.aqA = null;
  }
  
  public static abstract interface a
  {
    public abstract void a(Metadata paramMetadata);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/exoplayer2/metadata/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */