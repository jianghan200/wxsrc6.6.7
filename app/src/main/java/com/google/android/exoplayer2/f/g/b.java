package com.google.android.exoplayer2.f.g;

import com.google.android.exoplayer2.f.a;
import com.google.android.exoplayer2.i.j;
import com.google.android.exoplayer2.i.t;
import java.util.Collections;

public final class b
  extends com.google.android.exoplayer2.f.b
{
  private static final int azv = t.aE("payl");
  private static final int azw = t.aE("sttg");
  private static final int azx = t.aE("vttc");
  private final j amJ = new j();
  private final e.a azy = new e.a();
  
  public b()
  {
    super("Mp4WebvttDecoder");
  }
  
  private static a a(j paramj, e.a parama, int paramInt)
  {
    parama.reset();
    while (paramInt > 0)
    {
      if (paramInt < 8) {
        throw new com.google.android.exoplayer2.f.f("Incomplete vtt cue box header found.");
      }
      int i = paramj.readInt();
      int j = paramj.readInt();
      i -= 8;
      String str = new String(paramj.data, paramj.position, i);
      paramj.da(i);
      i = paramInt - 8 - i;
      if (j == azw)
      {
        f.a(str, parama);
        paramInt = i;
      }
      else
      {
        paramInt = i;
        if (j == azv)
        {
          f.a(null, str.trim(), parama, Collections.emptyList());
          paramInt = i;
        }
      }
    }
    return parama.lE();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/google/android/exoplayer2/f/g/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */