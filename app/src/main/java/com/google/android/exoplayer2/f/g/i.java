package com.google.android.exoplayer2.f.g;

import android.text.SpannableStringBuilder;
import com.google.android.exoplayer2.f.d;
import com.google.android.exoplayer2.i.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class i
  implements d
{
  private final List<e> awy;
  private final long[] ayz;
  private final int azS;
  private final long[] azT;
  
  public i(List<e> paramList)
  {
    this.awy = paramList;
    this.azS = paramList.size();
    this.ayz = new long[this.azS * 2];
    int i = 0;
    while (i < this.azS)
    {
      e locale = (e)paramList.get(i);
      int j = i * 2;
      this.ayz[j] = locale.startTime;
      this.ayz[(j + 1)] = locale.endTime;
      i += 1;
    }
    this.azT = Arrays.copyOf(this.ayz, this.ayz.length);
    Arrays.sort(this.azT);
  }
  
  public final int P(long paramLong)
  {
    int i = t.a(this.azT, paramLong);
    if (i < this.azT.length) {
      return i;
    }
    return -1;
  }
  
  public final List<com.google.android.exoplayer2.f.a> Q(long paramLong)
  {
    int i = 0;
    SpannableStringBuilder localSpannableStringBuilder = null;
    Object localObject1 = null;
    Object localObject3 = null;
    if (i < this.azS)
    {
      Object localObject2 = localObject3;
      int j;
      if (this.ayz[(i * 2)] <= paramLong)
      {
        localObject2 = localObject3;
        if (paramLong < this.ayz[(i * 2 + 1)])
        {
          localObject2 = localObject3;
          if (localObject3 == null) {
            localObject2 = new ArrayList();
          }
          localObject3 = (e)this.awy.get(i);
          if ((((e)localObject3).avU == Float.MIN_VALUE) && (((e)localObject3).avX == Float.MIN_VALUE))
          {
            j = 1;
            label113:
            if (j == 0) {
              break label204;
            }
            if (localObject1 != null) {
              break label144;
            }
            localObject1 = localObject3;
          }
        }
      }
      for (;;)
      {
        i += 1;
        localObject3 = localObject2;
        break;
        j = 0;
        break label113;
        label144:
        if (localSpannableStringBuilder == null)
        {
          localSpannableStringBuilder = new SpannableStringBuilder();
          localSpannableStringBuilder.append(((e)localObject1).text).append("\n").append(((e)localObject3).text);
        }
        else
        {
          localSpannableStringBuilder.append("\n").append(((e)localObject3).text);
          continue;
          label204:
          ((ArrayList)localObject2).add(localObject3);
        }
      }
    }
    if (localSpannableStringBuilder != null) {
      ((ArrayList)localObject3).add(new e(localSpannableStringBuilder));
    }
    while (localObject3 != null)
    {
      return (List<com.google.android.exoplayer2.f.a>)localObject3;
      if (localObject1 != null) {
        ((ArrayList)localObject3).add(localObject1);
      }
    }
    return Collections.emptyList();
  }
  
  public final long cM(int paramInt)
  {
    boolean bool2 = true;
    if (paramInt >= 0)
    {
      bool1 = true;
      com.google.android.exoplayer2.i.a.ao(bool1);
      if (paramInt >= this.azT.length) {
        break label39;
      }
    }
    label39:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      com.google.android.exoplayer2.i.a.ao(bool1);
      return this.azT[paramInt];
      bool1 = false;
      break;
    }
  }
  
  public final int lj()
  {
    return this.azT.length;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/exoplayer2/f/g/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */