package com.google.android.exoplayer2.c.c;

import com.google.android.exoplayer2.c.d;
import com.google.android.exoplayer2.c.e;
import com.google.android.exoplayer2.c.f;
import com.google.android.exoplayer2.c.g;
import com.google.android.exoplayer2.c.j.a;
import com.google.android.exoplayer2.i.j;
import com.google.android.exoplayer2.i.t;

public final class a
  implements d
{
  public static final g aiU = new a.1();
  private static final int amG = t.aE("ID3");
  private final long amH;
  private final b amI;
  private final j amJ;
  private boolean amK;
  
  public a()
  {
    this(0L);
  }
  
  public a(long paramLong)
  {
    this.amH = paramLong;
    this.amI = new b();
    this.amJ = new j(2786);
  }
  
  public final int a(e parame)
  {
    int i = parame.read(this.amJ.data, 0, 2786);
    if (i == -1) {
      return -1;
    }
    this.amJ.setPosition(0);
    this.amJ.cZ(i);
    if (!this.amK)
    {
      this.amI.aih = this.amH;
      this.amK = true;
    }
    this.amI.b(this.amJ);
    return 0;
  }
  
  public final void a(f paramf)
  {
    this.amI.a(paramf, new u.d());
    paramf.jU();
    new j.a(-9223372036854775807L);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/exoplayer2/c/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */