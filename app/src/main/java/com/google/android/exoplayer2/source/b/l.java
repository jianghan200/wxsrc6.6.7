package com.google.android.exoplayer2.source.b;

import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c.d;
import com.google.android.exoplayer2.c.e;
import com.google.android.exoplayer2.c.j.a;
import com.google.android.exoplayer2.c.k;
import com.google.android.exoplayer2.f.g.h;
import com.google.android.exoplayer2.i.j;
import com.google.android.exoplayer2.i.q;
import com.google.android.exoplayer2.o;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class l
  implements d
{
  private static final Pattern auy = Pattern.compile("LOCAL:([^,]+)");
  private static final Pattern auz = Pattern.compile("MPEGTS:(\\d+)");
  private final String aem;
  private final q alB;
  private com.google.android.exoplayer2.c.f aoY;
  private final j auA;
  private byte[] auB;
  private int sampleSize;
  
  public l(String paramString, q paramq)
  {
    this.aem = paramString;
    this.alB = paramq;
    this.auA = new j();
    this.auB = new byte['Ѐ'];
  }
  
  private k N(long paramLong)
  {
    k localk = this.aoY.cp(0);
    localk.f(Format.a("text/vtt", this.aem, paramLong));
    this.aoY.jU();
    return localk;
  }
  
  public final int a(e parame)
  {
    int j = (int)parame.getLength();
    Object localObject;
    if (this.sampleSize == this.auB.length)
    {
      localObject = this.auB;
      if (j == -1) {
        break label102;
      }
    }
    label102:
    for (int i = j;; i = this.auB.length)
    {
      this.auB = Arrays.copyOf((byte[])localObject, i * 3 / 2);
      i = parame.read(this.auB, this.sampleSize, this.auB.length - this.sampleSize);
      if (i == -1) {
        break;
      }
      this.sampleSize = (i + this.sampleSize);
      if ((j != -1) && (this.sampleSize == j)) {
        break;
      }
      return 0;
    }
    parame = new j(this.auB);
    long l1;
    long l2;
    for (;;)
    {
      Matcher localMatcher1;
      try
      {
        h.k(parame);
        l1 = 0L;
        l2 = 0L;
        localObject = parame.readLine();
        if (TextUtils.isEmpty((CharSequence)localObject)) {
          break;
        }
        if (!((String)localObject).startsWith("X-TIMESTAMP-MAP")) {
          continue;
        }
        localMatcher1 = auy.matcher((CharSequence)localObject);
        if (!localMatcher1.find()) {
          throw new o("X-TIMESTAMP-MAP doesn't contain local timestamp: " + (String)localObject);
        }
      }
      catch (com.google.android.exoplayer2.f.f parame)
      {
        throw new o(parame);
      }
      Matcher localMatcher2 = auz.matcher((CharSequence)localObject);
      if (!localMatcher2.find()) {
        throw new o("X-TIMESTAMP-MAP doesn't contain media timestamp: " + (String)localObject);
      }
      l2 = h.ap(localMatcher1.group(1));
      l1 = q.V(Long.parseLong(localMatcher2.group(1)));
    }
    parame = h.l(parame);
    if (parame == null) {
      N(0L);
    }
    for (;;)
    {
      return -1;
      long l3 = h.ap(parame.group(1));
      l1 = this.alB.T(q.W(l1 + l3 - l2));
      parame = N(l1 - l3);
      this.auA.m(this.auB, this.sampleSize);
      parame.a(this.auA, this.sampleSize);
      parame.a(l1, 1, this.sampleSize, 0, null);
    }
  }
  
  public final void a(com.google.android.exoplayer2.c.f paramf)
  {
    this.aoY = paramf;
    new j.a(-9223372036854775807L);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/exoplayer2/source/b/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */