package com.google.android.exoplayer2.f.e;

import android.text.SpannableStringBuilder;
import com.google.android.exoplayer2.f.a;
import com.google.android.exoplayer2.i.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

final class e
  implements com.google.android.exoplayer2.f.d
{
  private final b aze;
  private final long[] azf;
  private final Map<String, d> azg;
  private final Map<String, c> azh;
  
  public e(b paramb, Map<String, d> paramMap, Map<String, c> paramMap1)
  {
    this.aze = paramb;
    this.azh = paramMap1;
    this.azg = Collections.unmodifiableMap(paramMap);
    this.azf = paramb.lD();
  }
  
  public final int P(long paramLong)
  {
    int i = t.a(this.azf, paramLong);
    if (i < this.azf.length) {
      return i;
    }
    return -1;
  }
  
  public final List<a> Q(long paramLong)
  {
    Object localObject1 = this.aze;
    Object localObject3 = this.azg;
    Map localMap = this.azh;
    Object localObject2 = new TreeMap();
    ((b)localObject1).a(paramLong, false, ((b)localObject1).ayN, (Map)localObject2);
    ((b)localObject1).a((Map)localObject3, (Map)localObject2);
    localObject1 = new ArrayList();
    localObject2 = ((TreeMap)localObject2).entrySet().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (Map.Entry)((Iterator)localObject2).next();
      c localc = (c)localMap.get(((Map.Entry)localObject3).getKey());
      ((List)localObject1).add(new a(b.a((SpannableStringBuilder)((Map.Entry)localObject3).getValue()), null, localc.avU, localc.avV, localc.avW, localc.avX, Integer.MIN_VALUE, localc.width));
    }
    return (List<a>)localObject1;
  }
  
  public final long cM(int paramInt)
  {
    return this.azf[paramInt];
  }
  
  public final int lj()
  {
    return this.azf.length;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/exoplayer2/f/e/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */