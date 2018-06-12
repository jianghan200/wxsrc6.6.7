package com.google.android.exoplayer2;

import com.google.android.exoplayer2.b.e;
import com.google.android.exoplayer2.i.f;
import com.google.android.exoplayer2.source.i;

public abstract class a
  implements r, s
{
  private final int aci;
  public t acj;
  public i ack;
  public long acl;
  public boolean acm;
  public boolean acn;
  public int index;
  public int state;
  
  public a(int paramInt)
  {
    this.aci = paramInt;
    this.acm = true;
  }
  
  public final int a(k paramk, e parame, boolean paramBoolean)
  {
    int i = this.ack.b(paramk, parame, paramBoolean);
    if (i == -4)
    {
      if (parame.jy())
      {
        this.acm = true;
        if (this.acn) {
          return -4;
        }
        return -3;
      }
      parame.aih += this.acl;
    }
    for (;;)
    {
      return i;
      if (i == -5)
      {
        parame = paramk.aep;
        if (parame.aek != Long.MAX_VALUE) {
          paramk.aep = parame.u(parame.aek + this.acl);
        }
      }
    }
  }
  
  public final void a(t paramt, Format[] paramArrayOfFormat, i parami, long paramLong1, boolean paramBoolean, long paramLong2)
  {
    if (this.state == 0) {}
    for (boolean bool = true;; bool = false)
    {
      com.google.android.exoplayer2.i.a.ap(bool);
      this.acj = paramt;
      this.state = 1;
      ae(paramBoolean);
      a(paramArrayOfFormat, parami, paramLong2);
      b(paramLong1, paramBoolean);
      return;
    }
  }
  
  public void a(Format[] paramArrayOfFormat, long paramLong) {}
  
  public final void a(Format[] paramArrayOfFormat, i parami, long paramLong)
  {
    if (!this.acn) {}
    for (boolean bool = true;; bool = false)
    {
      com.google.android.exoplayer2.i.a.ap(bool);
      this.ack = parami;
      this.acm = false;
      this.acl = paramLong;
      a(paramArrayOfFormat, paramLong);
      return;
    }
  }
  
  public void ae(boolean paramBoolean) {}
  
  public void b(long paramLong, boolean paramBoolean) {}
  
  public void d(int paramInt, Object paramObject) {}
  
  public final void disable()
  {
    boolean bool = true;
    if (this.state == 1) {}
    for (;;)
    {
      com.google.android.exoplayer2.i.a.ap(bool);
      this.state = 0;
      this.ack = null;
      this.acn = false;
      ix();
      return;
      bool = false;
    }
  }
  
  public final int getState()
  {
    return this.state;
  }
  
  public final int getTrackType()
  {
    return this.aci;
  }
  
  public final s ip()
  {
    return this;
  }
  
  public f iq()
  {
    return null;
  }
  
  public final i ir()
  {
    return this.ack;
  }
  
  public final boolean is()
  {
    return this.acm;
  }
  
  public final void it()
  {
    this.acn = true;
  }
  
  public final boolean iu()
  {
    return this.acn;
  }
  
  public final void iv()
  {
    this.ack.kC();
  }
  
  public int iw()
  {
    return 0;
  }
  
  public void ix() {}
  
  public final void m(long paramLong)
  {
    this.acn = false;
    this.acm = false;
    b(paramLong, false);
  }
  
  public void onStarted() {}
  
  public void onStopped() {}
  
  public final void setIndex(int paramInt)
  {
    this.index = paramInt;
  }
  
  public final void start()
  {
    boolean bool = true;
    if (this.state == 1) {}
    for (;;)
    {
      com.google.android.exoplayer2.i.a.ap(bool);
      this.state = 2;
      onStarted();
      return;
      bool = false;
    }
  }
  
  public final void stop()
  {
    if (this.state == 2) {}
    for (boolean bool = true;; bool = false)
    {
      com.google.android.exoplayer2.i.a.ap(bool);
      this.state = 1;
      onStopped();
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/exoplayer2/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */