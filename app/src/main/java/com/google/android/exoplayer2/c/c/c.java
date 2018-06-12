package com.google.android.exoplayer2.c.c;

import com.google.android.exoplayer2.c.e;
import com.google.android.exoplayer2.c.f;
import com.google.android.exoplayer2.c.g;
import com.google.android.exoplayer2.c.j.a;
import com.google.android.exoplayer2.i.j;
import com.google.android.exoplayer2.i.t;

public final class c
  implements com.google.android.exoplayer2.c.d
{
  public static final g aiU = new c.1();
  private static final int amG = t.aE("ID3");
  private final long amH;
  private boolean amK;
  private final d amR;
  private final j amS;
  
  public c()
  {
    this(0L);
  }
  
  public c(long paramLong)
  {
    this.amH = paramLong;
    this.amR = new d();
    this.amS = new j(200);
  }
  
  public final int a(e parame)
  {
    int i = parame.read(this.amS.data, 0, 200);
    if (i == -1) {
      return -1;
    }
    this.amS.setPosition(0);
    this.amS.cZ(i);
    if (!this.amK)
    {
      this.amR.aih = this.amH;
      this.amK = true;
    }
    this.amR.b(this.amS);
    return 0;
  }
  
  public final void a(f paramf)
  {
    this.amR.a(paramf, new u.d());
    paramf.jU();
    new j.a(-9223372036854775807L);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/exoplayer2/c/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */