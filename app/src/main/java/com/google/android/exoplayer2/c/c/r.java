package com.google.android.exoplayer2.c.c;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c.f;
import com.google.android.exoplayer2.c.k;
import com.google.android.exoplayer2.f.a.g;
import com.google.android.exoplayer2.i.a;
import com.google.android.exoplayer2.i.j;
import java.util.List;

final class r
{
  private final List<Format> anf;
  private final k[] ani;
  
  public r(List<Format> paramList)
  {
    this.anf = paramList;
    this.ani = new k[paramList.size()];
  }
  
  public final void a(long paramLong, j paramj)
  {
    g.a(paramLong, paramj, this.ani);
  }
  
  public final void a(f paramf, u.d paramd)
  {
    int i = 0;
    if (i < this.ani.length)
    {
      paramd.kf();
      k localk = paramf.cp(paramd.kg());
      Format localFormat = (Format)this.anf.get(i);
      String str2 = localFormat.adW;
      boolean bool;
      if (("application/cea-608".equals(str2)) || ("application/cea-708".equals(str2)))
      {
        bool = true;
        label72:
        a.b(bool, "Invalid closed caption mime type provided: " + str2);
        if (localFormat.id == null) {
          break label159;
        }
      }
      label159:
      for (String str1 = localFormat.id;; str1 = paramd.kh())
      {
        localk.f(Format.a(str1, str2, localFormat.ael, localFormat.aem, localFormat.aen));
        this.ani[i] = localk;
        i += 1;
        break;
        bool = false;
        break label72;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/google/android/exoplayer2/c/c/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */