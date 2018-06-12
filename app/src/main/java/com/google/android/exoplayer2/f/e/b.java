package com.google.android.exoplayer2.f.e;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan.Standard;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.i.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

final class b
{
  public final long asN;
  public final long asO;
  public final boolean ayL;
  public final d ayM;
  public final String ayN;
  private final String[] ayO;
  private final HashMap<String, Integer> ayP;
  private final HashMap<String, Integer> ayQ;
  private List<b> ayR;
  public final String tag;
  public final String text;
  
  b(String paramString1, String paramString2, long paramLong1, long paramLong2, d paramd, String[] paramArrayOfString, String paramString3)
  {
    this.tag = paramString1;
    this.text = paramString2;
    this.ayM = paramd;
    this.ayO = paramArrayOfString;
    if (paramString2 != null) {}
    for (boolean bool = true;; bool = false)
    {
      this.ayL = bool;
      this.asN = paramLong1;
      this.asO = paramLong2;
      this.ayN = ((String)a.Z(paramString3));
      this.ayP = new HashMap();
      this.ayQ = new HashMap();
      return;
    }
  }
  
  static SpannableStringBuilder a(SpannableStringBuilder paramSpannableStringBuilder)
  {
    int i = paramSpannableStringBuilder.length();
    int j = 0;
    int k;
    if (j < i)
    {
      if (paramSpannableStringBuilder.charAt(j) != ' ') {
        break label290;
      }
      k = j + 1;
      while ((k < paramSpannableStringBuilder.length()) && (paramSpannableStringBuilder.charAt(k) == ' ')) {
        k += 1;
      }
      k -= j + 1;
      if (k <= 0) {
        break label290;
      }
      paramSpannableStringBuilder.delete(j, j + k);
      i -= k;
    }
    label290:
    for (;;)
    {
      j += 1;
      break;
      j = i;
      if (i > 0)
      {
        j = i;
        if (paramSpannableStringBuilder.charAt(0) == ' ')
        {
          paramSpannableStringBuilder.delete(0, 1);
          j = i - 1;
        }
      }
      k = 0;
      i = j;
      j = k;
      while (j < i - 1)
      {
        k = i;
        if (paramSpannableStringBuilder.charAt(j) == '\n')
        {
          k = i;
          if (paramSpannableStringBuilder.charAt(j + 1) == ' ')
          {
            paramSpannableStringBuilder.delete(j + 1, j + 2);
            k = i - 1;
          }
        }
        j += 1;
        i = k;
      }
      j = i;
      if (i > 0)
      {
        j = i;
        if (paramSpannableStringBuilder.charAt(i - 1) == ' ')
        {
          paramSpannableStringBuilder.delete(i - 1, i);
          j = i - 1;
        }
      }
      i = 0;
      while (i < j - 1)
      {
        k = j;
        if (paramSpannableStringBuilder.charAt(i) == ' ')
        {
          k = j;
          if (paramSpannableStringBuilder.charAt(i + 1) == '\n')
          {
            paramSpannableStringBuilder.delete(i, i + 1);
            k = j - 1;
          }
        }
        i += 1;
        j = k;
      }
      if ((j > 0) && (paramSpannableStringBuilder.charAt(j - 1) == '\n')) {
        paramSpannableStringBuilder.delete(j - 1, j);
      }
      return paramSpannableStringBuilder;
    }
  }
  
  private void a(TreeSet<Long> paramTreeSet, boolean paramBoolean)
  {
    boolean bool2 = "p".equals(this.tag);
    if ((paramBoolean) || (bool2))
    {
      if (this.asN != -9223372036854775807L) {
        paramTreeSet.add(Long.valueOf(this.asN));
      }
      if (this.asO != -9223372036854775807L) {
        paramTreeSet.add(Long.valueOf(this.asO));
      }
    }
    if (this.ayR == null) {
      return;
    }
    int i = 0;
    label76:
    b localb;
    if (i < this.ayR.size())
    {
      localb = (b)this.ayR.get(i);
      if ((!paramBoolean) && (!bool2)) {
        break label131;
      }
    }
    label131:
    for (boolean bool1 = true;; bool1 = false)
    {
      localb.a(paramTreeSet, bool1);
      i += 1;
      break label76;
      break;
    }
  }
  
  private static SpannableStringBuilder b(String paramString, Map<String, SpannableStringBuilder> paramMap)
  {
    if (!paramMap.containsKey(paramString)) {
      paramMap.put(paramString, new SpannableStringBuilder());
    }
    return (SpannableStringBuilder)paramMap.get(paramString);
  }
  
  private b cP(int paramInt)
  {
    if (this.ayR == null) {
      throw new IndexOutOfBoundsException();
    }
    return (b)this.ayR.get(paramInt);
  }
  
  private int getChildCount()
  {
    if (this.ayR == null) {
      return 0;
    }
    return this.ayR.size();
  }
  
  final void a(long paramLong, boolean paramBoolean, String paramString, Map<String, SpannableStringBuilder> paramMap)
  {
    this.ayP.clear();
    this.ayQ.clear();
    Object localObject2 = this.ayN;
    Object localObject1 = localObject2;
    if ("".equals(localObject2)) {
      localObject1 = paramString;
    }
    if ((this.ayL) && (paramBoolean)) {
      b((String)localObject1, paramMap).append(this.text);
    }
    for (;;)
    {
      return;
      if (("br".equals(this.tag)) && (paramBoolean))
      {
        b((String)localObject1, paramMap).append('\n');
        return;
      }
      if (!"metadata".equals(this.tag))
      {
        if (((this.asN == -9223372036854775807L) && (this.asO == -9223372036854775807L)) || ((this.asN <= paramLong) && (this.asO == -9223372036854775807L)) || ((this.asN == -9223372036854775807L) && (paramLong < this.asO)) || ((this.asN <= paramLong) && (paramLong < this.asO))) {}
        boolean bool2;
        for (int i = 1; i != 0; i = 0)
        {
          bool2 = "p".equals(this.tag);
          paramString = paramMap.entrySet().iterator();
          while (paramString.hasNext())
          {
            localObject2 = (Map.Entry)paramString.next();
            this.ayP.put(((Map.Entry)localObject2).getKey(), Integer.valueOf(((SpannableStringBuilder)((Map.Entry)localObject2).getValue()).length()));
          }
        }
        continue;
        i = 0;
        if (i < getChildCount())
        {
          paramString = cP(i);
          if ((paramBoolean) || (bool2)) {}
          for (boolean bool1 = true;; bool1 = false)
          {
            paramString.a(paramLong, bool1, (String)localObject1, paramMap);
            i += 1;
            break;
          }
        }
        if (bool2)
        {
          paramString = b((String)localObject1, paramMap);
          i = paramString.length() - 1;
          while ((i >= 0) && (paramString.charAt(i) == ' ')) {
            i -= 1;
          }
          if ((i >= 0) && (paramString.charAt(i) != '\n')) {
            paramString.append('\n');
          }
        }
        paramString = paramMap.entrySet().iterator();
        while (paramString.hasNext())
        {
          paramMap = (Map.Entry)paramString.next();
          this.ayQ.put(paramMap.getKey(), Integer.valueOf(((SpannableStringBuilder)paramMap.getValue()).length()));
        }
      }
    }
  }
  
  public final void a(b paramb)
  {
    if (this.ayR == null) {
      this.ayR = new ArrayList();
    }
    this.ayR.add(paramb);
  }
  
  final void a(Map<String, d> paramMap, Map<String, SpannableStringBuilder> paramMap1)
  {
    Iterator localIterator = this.ayQ.entrySet().iterator();
    if (localIterator.hasNext())
    {
      Object localObject1 = (Map.Entry)localIterator.next();
      Object localObject2 = (String)((Map.Entry)localObject1).getKey();
      int i;
      SpannableStringBuilder localSpannableStringBuilder;
      int k;
      String[] arrayOfString;
      if (this.ayP.containsKey(localObject2))
      {
        i = ((Integer)this.ayP.get(localObject2)).intValue();
        localSpannableStringBuilder = (SpannableStringBuilder)paramMap1.get(localObject2);
        k = ((Integer)((Map.Entry)localObject1).getValue()).intValue();
        if (i == k) {
          break label660;
        }
        localObject2 = this.ayM;
        arrayOfString = this.ayO;
        if ((localObject2 != null) || (arrayOfString != null)) {
          break label270;
        }
        localObject1 = null;
        label135:
        if (localObject1 == null) {
          break label660;
        }
        if (((d)localObject1).getStyle() != -1) {
          localSpannableStringBuilder.setSpan(new StyleSpan(((d)localObject1).getStyle()), i, k, 33);
        }
        if (((d)localObject1).ayW != 1) {
          break label486;
        }
        j = 1;
        label183:
        if (j != 0) {
          localSpannableStringBuilder.setSpan(new StrikethroughSpan(), i, k, 33);
        }
        if (((d)localObject1).ayX != 1) {
          break label492;
        }
      }
      label270:
      label486:
      label492:
      for (int j = 1;; j = 0)
      {
        if (j != 0) {
          localSpannableStringBuilder.setSpan(new UnderlineSpan(), i, k, 33);
        }
        if (!((d)localObject1).ayU) {
          break label520;
        }
        if (((d)localObject1).ayU) {
          break label498;
        }
        throw new IllegalStateException("Font color has not been defined.");
        i = 0;
        break;
        if ((localObject2 == null) && (arrayOfString.length == 1))
        {
          localObject1 = (d)paramMap.get(arrayOfString[0]);
          break label135;
        }
        if ((localObject2 == null) && (arrayOfString.length > 1))
        {
          localObject2 = new d();
          m = arrayOfString.length;
          j = 0;
          for (;;)
          {
            localObject1 = localObject2;
            if (j >= m) {
              break;
            }
            ((d)localObject2).b((d)paramMap.get(arrayOfString[j]));
            j += 1;
          }
        }
        if ((localObject2 != null) && (arrayOfString != null) && (arrayOfString.length == 1))
        {
          localObject1 = ((d)localObject2).b((d)paramMap.get(arrayOfString[0]));
          break label135;
        }
        localObject1 = localObject2;
        if (localObject2 == null) {
          break label135;
        }
        localObject1 = localObject2;
        if (arrayOfString == null) {
          break label135;
        }
        localObject1 = localObject2;
        if (arrayOfString.length <= 1) {
          break label135;
        }
        int m = arrayOfString.length;
        j = 0;
        for (;;)
        {
          localObject1 = localObject2;
          if (j >= m) {
            break;
          }
          ((d)localObject2).b((d)paramMap.get(arrayOfString[j]));
          j += 1;
        }
        j = 0;
        break label183;
      }
      label498:
      localSpannableStringBuilder.setSpan(new ForegroundColorSpan(((d)localObject1).ayT), i, k, 33);
      label520:
      if (((d)localObject1).ayV)
      {
        if (!((d)localObject1).ayV) {
          throw new IllegalStateException("Background color has not been defined.");
        }
        localSpannableStringBuilder.setSpan(new BackgroundColorSpan(((d)localObject1).backgroundColor), i, k, 33);
      }
      if (((d)localObject1).ayS != null) {
        localSpannableStringBuilder.setSpan(new TypefaceSpan(((d)localObject1).ayS), i, k, 33);
      }
      if (((d)localObject1).azd != null) {
        localSpannableStringBuilder.setSpan(new AlignmentSpan.Standard(((d)localObject1).azd), i, k, 33);
      }
      switch (((d)localObject1).aza)
      {
      }
      for (;;)
      {
        label660:
        i = 0;
        while (i < getChildCount())
        {
          cP(i).a(paramMap, paramMap1);
          i += 1;
        }
        localSpannableStringBuilder.setSpan(new AbsoluteSizeSpan((int)((d)localObject1).azb, true), i, k, 33);
        continue;
        localSpannableStringBuilder.setSpan(new RelativeSizeSpan(((d)localObject1).azb), i, k, 33);
        continue;
        localSpannableStringBuilder.setSpan(new RelativeSizeSpan(((d)localObject1).azb / 100.0F), i, k, 33);
      }
    }
  }
  
  public final long[] lD()
  {
    Object localObject = new TreeSet();
    a((TreeSet)localObject, false);
    long[] arrayOfLong = new long[((TreeSet)localObject).size()];
    localObject = ((TreeSet)localObject).iterator();
    int i = 0;
    while (((Iterator)localObject).hasNext())
    {
      arrayOfLong[i] = ((Long)((Iterator)localObject).next()).longValue();
      i += 1;
    }
    return arrayOfLong;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/exoplayer2/f/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */