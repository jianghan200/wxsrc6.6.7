package com.google.android.exoplayer2.c.c;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c.f;
import com.google.android.exoplayer2.c.k;
import com.google.android.exoplayer2.i.j;
import java.util.Collections;
import java.util.List;

public final class g
  implements h
{
  private int alP;
  private final List<u.a> anh;
  private final k[] ani;
  private boolean anj;
  private int ank;
  private long anl;
  
  public g(List<u.a> paramList)
  {
    this.anh = paramList;
    this.ani = new k[paramList.size()];
  }
  
  private boolean c(j paramj, int paramInt)
  {
    if (paramj.me() == 0) {
      return false;
    }
    if (paramj.readUnsignedByte() != paramInt) {
      this.anj = false;
    }
    this.ank -= 1;
    return this.anj;
  }
  
  public final void a(f paramf, u.d paramd)
  {
    int i = 0;
    while (i < this.ani.length)
    {
      u.a locala = (u.a)this.anh.get(i);
      paramd.kf();
      k localk = paramf.cp(paramd.kg());
      localk.f(Format.a(paramd.kh(), "application/dvbsubs", Collections.singletonList(locala.aph), locala.aem));
      this.ani[i] = localk;
      i += 1;
    }
  }
  
  public final void b(j paramj)
  {
    int i = 0;
    if ((!this.anj) || ((this.ank == 2) && (!c(paramj, 32)))) {}
    while ((this.ank == 1) && (!c(paramj, 0))) {
      return;
    }
    int j = paramj.position;
    int k = paramj.me();
    k[] arrayOfk = this.ani;
    int m = arrayOfk.length;
    while (i < m)
    {
      k localk = arrayOfk[i];
      paramj.setPosition(j);
      localk.a(paramj, k);
      i += 1;
    }
    this.alP += k;
  }
  
  public final void d(long paramLong, boolean paramBoolean)
  {
    if (!paramBoolean) {
      return;
    }
    this.anj = true;
    this.anl = paramLong;
    this.alP = 0;
    this.ank = 2;
  }
  
  public final void jX()
  {
    this.anj = false;
  }
  
  public final void jY()
  {
    if (this.anj)
    {
      k[] arrayOfk = this.ani;
      int j = arrayOfk.length;
      int i = 0;
      while (i < j)
      {
        arrayOfk[i].a(this.anl, 1, this.alP, 0, null);
        i += 1;
      }
      this.anj = false;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/exoplayer2/c/c/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */