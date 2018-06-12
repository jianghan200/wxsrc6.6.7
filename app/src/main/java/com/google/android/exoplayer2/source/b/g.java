package com.google.android.exoplayer2.source.b;

import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.h.b;
import com.google.android.exoplayer2.h.r;
import com.google.android.exoplayer2.i.t;
import com.google.android.exoplayer2.source.b.a.e.b;
import com.google.android.exoplayer2.source.h;
import com.google.android.exoplayer2.source.l;
import com.google.android.exoplayer2.source.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.List;

public final class g
  implements e.b, j.a, com.google.android.exoplayer2.source.e
{
  private m acW;
  private com.google.android.exoplayer2.source.e.a arL;
  private final k asZ;
  private final b asl;
  private final d atN;
  private final int atO;
  private final com.google.android.exoplayer2.source.a.a atP;
  private final IdentityHashMap<com.google.android.exoplayer2.source.i, Integer> atQ;
  final Handler atR;
  private int atS;
  j[] atT;
  private j[] atU;
  private com.google.android.exoplayer2.source.d atV;
  final com.google.android.exoplayer2.source.b.a.e atb;
  
  public g(com.google.android.exoplayer2.source.b.a.e parame, d paramd, int paramInt, com.google.android.exoplayer2.source.a.a parama, b paramb)
  {
    this.atb = parame;
    this.atN = paramd;
    this.atO = paramInt;
    this.atP = parama;
    this.asl = paramb;
    this.atQ = new IdentityHashMap();
    this.asZ = new k();
    this.atR = new Handler();
    this.atT = new j[0];
    this.atU = new j[0];
  }
  
  private j a(int paramInt, com.google.android.exoplayer2.source.b.a.a.a[] paramArrayOfa, Format paramFormat, List<Format> paramList, long paramLong)
  {
    return new j(paramInt, this, new c(this.atb, paramArrayOfa, this.atN, this.asZ, paramList), this.asl, paramLong, paramFormat, this.atO, this.atP);
  }
  
  private static boolean a(com.google.android.exoplayer2.source.b.a.a.a parama, String paramString)
  {
    parama = parama.aep.adT;
    if (TextUtils.isEmpty(parama)) {}
    for (;;)
    {
      return false;
      parama = parama.split("(\\s*,\\s*)|(\\s*$)");
      int j = parama.length;
      int i = 0;
      while (i < j)
      {
        if (parama[i].startsWith(paramString)) {
          return true;
        }
        i += 1;
      }
    }
  }
  
  private void kZ()
  {
    if (this.acW != null) {
      this.arL.a(this);
    }
    for (;;)
    {
      return;
      j[] arrayOfj = this.atT;
      int j = arrayOfj.length;
      int i = 0;
      while (i < j)
      {
        arrayOfj[i].la();
        i += 1;
      }
    }
  }
  
  public final void E(long paramLong)
  {
    j[] arrayOfj = this.atU;
    int k = arrayOfj.length;
    int i = 0;
    while (i < k)
    {
      j localj = arrayOfj[i];
      int m = localj.auh.length;
      int j = 0;
      while (j < m)
      {
        h localh = localj.auh[j];
        int n = localj.aup[j];
        localh.L(localh.asn.f(paramLong, n));
        j += 1;
      }
      i += 1;
    }
  }
  
  public final long F(long paramLong)
  {
    if (this.atU.length > 0)
    {
      boolean bool = this.atU[0].g(paramLong, false);
      int i = 1;
      while (i < this.atU.length)
      {
        this.atU[i].g(paramLong, bool);
        i += 1;
      }
      if (bool) {
        this.asZ.aux.clear();
      }
    }
    return paramLong;
  }
  
  public final boolean G(long paramLong)
  {
    return this.atV.G(paramLong);
  }
  
  public final long a(com.google.android.exoplayer2.g.e[] paramArrayOfe, boolean[] paramArrayOfBoolean1, com.google.android.exoplayer2.source.i[] paramArrayOfi, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    int[] arrayOfInt1 = new int[paramArrayOfe.length];
    int[] arrayOfInt2 = new int[paramArrayOfe.length];
    int i = 0;
    int j;
    label32:
    Object localObject1;
    if (i < paramArrayOfe.length)
    {
      if (paramArrayOfi[i] == null)
      {
        j = -1;
        arrayOfInt1[i] = j;
        arrayOfInt2[i] = -1;
        if (paramArrayOfe[i] != null)
        {
          localObject1 = paramArrayOfe[i].lG();
          j = 0;
        }
      }
      for (;;)
      {
        if (j < this.atT.length)
        {
          if (this.atT[j].acW.a((l)localObject1) != -1) {
            arrayOfInt2[i] = j;
          }
        }
        else
        {
          i += 1;
          break;
          j = ((Integer)this.atQ.get(paramArrayOfi[i])).intValue();
          break label32;
        }
        j += 1;
      }
    }
    boolean bool1 = false;
    this.atQ.clear();
    com.google.android.exoplayer2.source.i[] arrayOfi1 = new com.google.android.exoplayer2.source.i[paramArrayOfe.length];
    com.google.android.exoplayer2.source.i[] arrayOfi2 = new com.google.android.exoplayer2.source.i[paramArrayOfe.length];
    com.google.android.exoplayer2.g.e[] arrayOfe = new com.google.android.exoplayer2.g.e[paramArrayOfe.length];
    int m = 0;
    j[] arrayOfj = new j[this.atT.length];
    int k = 0;
    label225:
    label270:
    j localj;
    label384:
    label387:
    com.google.android.exoplayer2.g.e locale;
    label404:
    Object localObject2;
    int n;
    if (k < this.atT.length)
    {
      i = 0;
      if (i < paramArrayOfe.length)
      {
        if (arrayOfInt1[i] == k)
        {
          localObject1 = paramArrayOfi[i];
          arrayOfi2[i] = localObject1;
          if (arrayOfInt2[i] != k) {
            break label270;
          }
        }
        for (localObject1 = paramArrayOfe[i];; localObject1 = null)
        {
          arrayOfe[i] = localObject1;
          i += 1;
          break;
          localObject1 = null;
          break label225;
        }
      }
      localj = this.atT[k];
      com.google.android.exoplayer2.i.a.ap(localj.adE);
      j = localj.auk;
      i = 0;
      while (i < arrayOfe.length)
      {
        if ((arrayOfi2[i] != null) && ((arrayOfe[i] == null) || (paramArrayOfBoolean1[i] == 0)))
        {
          localj.q(((i)arrayOfi2[i]).group, false);
          arrayOfi2[i] = null;
        }
        i += 1;
      }
      if (!bool1)
      {
        if (localj.auu) {
          if (j != 0) {
            break label597;
          }
        }
      }
      else
      {
        i = 1;
        locale = localj.aub.atl;
        j = 0;
        localObject1 = locale;
        if (j >= arrayOfe.length) {
          break label609;
        }
        localObject2 = localObject1;
        if (arrayOfi2[j] != null) {
          break label1170;
        }
        localObject2 = localObject1;
        if (arrayOfe[j] == null) {
          break label1170;
        }
        localObject2 = arrayOfe[j];
        n = localj.acW.a(((com.google.android.exoplayer2.g.e)localObject2).lG());
        localj.q(n, true);
        if (n == localj.aun)
        {
          localj.aub.atl = ((com.google.android.exoplayer2.g.e)localObject2);
          localObject1 = localObject2;
        }
        arrayOfi2[j] = new i(localj, n);
        paramArrayOfBoolean2[j] = true;
        localObject2 = localObject1;
        if (i != 0) {
          break label1170;
        }
        localObject2 = localj.auh[n];
        ((h)localObject2).rewind();
        if (((h)localObject2).e(paramLong, true)) {
          break label603;
        }
        localObject2 = ((h)localObject2).asn;
        i = ((com.google.android.exoplayer2.source.g)localObject2).asc;
        if (((com.google.android.exoplayer2.source.g)localObject2).ase + i == 0) {
          break label603;
        }
        i = 1;
      }
    }
    for (;;)
    {
      j += 1;
      break label404;
      if (paramLong != localj.aur) {
        break label384;
      }
      label597:
      i = 0;
      break label387;
      label603:
      i = 0;
      continue;
      label609:
      label702:
      boolean bool2;
      label742:
      int i1;
      if (localj.auk == 0)
      {
        localj.aub.atg = null;
        localj.aul = null;
        localj.auf.clear();
        if (localj.aud.iD())
        {
          localObject1 = localj.auh;
          n = localObject1.length;
          j = 0;
          while (j < n)
          {
            localObject1[j].kM();
            j += 1;
          }
          localj.aud.lY();
        }
        for (j = i;; j = i)
        {
          localj.auu = true;
          n = 0;
          i = 0;
          for (;;)
          {
            if (i >= paramArrayOfe.length) {
              break label1010;
            }
            if (arrayOfInt2[i] != k) {
              break label967;
            }
            if (arrayOfi2[i] == null) {
              break;
            }
            bool2 = true;
            com.google.android.exoplayer2.i.a.ap(bool2);
            arrayOfi1[i] = arrayOfi2[i];
            i1 = 1;
            this.atQ.put(arrayOfi2[i], Integer.valueOf(k));
            label778:
            i += 1;
            n = i1;
          }
          localj.lc();
        }
      }
      if ((!localj.auf.isEmpty()) && (!t.i(localObject1, locale))) {
        if (!localj.auu)
        {
          ((com.google.android.exoplayer2.g.e)localObject1).kU();
          j = localj.aub.atc.j(((f)localj.auf.getLast()).asK);
          if (((com.google.android.exoplayer2.g.e)localObject1).lI() == j) {
            break label1164;
          }
          j = 1;
        }
      }
      for (;;)
      {
        label881:
        if (j != 0)
        {
          bool2 = true;
          i = 1;
          localj.aut = true;
        }
        for (;;)
        {
          j = i;
          if (i == 0) {
            break label702;
          }
          localj.g(paramLong, bool2);
          n = 0;
          for (;;)
          {
            j = i;
            if (n >= arrayOfi2.length) {
              break;
            }
            if (arrayOfi2[n] != null) {
              paramArrayOfBoolean2[n] = true;
            }
            n += 1;
          }
          j = 1;
          break label881;
          bool2 = false;
          break label742;
          label967:
          i1 = n;
          if (arrayOfInt1[i] != k) {
            break label778;
          }
          if (arrayOfi2[i] == null) {}
          for (bool2 = true;; bool2 = false)
          {
            com.google.android.exoplayer2.i.a.ap(bool2);
            i1 = n;
            break;
          }
          label1010:
          i = m;
          bool2 = bool1;
          if (n != 0)
          {
            arrayOfj[m] = localj;
            i = m + 1;
            if (m != 0) {
              break label1101;
            }
            localj.ak(true);
            if ((j == 0) && (this.atU.length != 0) && (localj == this.atU[0])) {
              break label1107;
            }
            this.asZ.aux.clear();
          }
          label1101:
          label1107:
          for (bool2 = true;; bool2 = bool1)
          {
            k += 1;
            m = i;
            bool1 = bool2;
            break;
            localj.ak(false);
          }
          System.arraycopy(arrayOfi1, 0, paramArrayOfi, 0, arrayOfi1.length);
          this.atU = ((j[])Arrays.copyOf(arrayOfj, m));
          this.atV = new com.google.android.exoplayer2.source.d(this.atU);
          return paramLong;
          bool2 = bool1;
        }
        label1164:
        j = 0;
      }
      label1170:
      localObject1 = localObject2;
    }
  }
  
  public final void a(com.google.android.exoplayer2.source.b.a.a.a parama)
  {
    ((com.google.android.exoplayer2.source.b.a.e.a)this.atb.avA.get(parama)).lg();
  }
  
  public final void a(com.google.android.exoplayer2.source.e.a parama, long paramLong)
  {
    this.arL = parama;
    this.atb.avD.add(this);
    Object localObject2 = this.atb.ats;
    parama = new ArrayList(((com.google.android.exoplayer2.source.b.a.a)localObject2).auC);
    Object localObject1 = new ArrayList();
    Object localObject3 = new ArrayList();
    int i = 0;
    Object localObject4;
    if (i < parama.size())
    {
      localObject4 = (com.google.android.exoplayer2.source.b.a.a.a)parama.get(i);
      if ((((com.google.android.exoplayer2.source.b.a.a.a)localObject4).aep.height > 0) || (a((com.google.android.exoplayer2.source.b.a.a.a)localObject4, "avc"))) {
        ((ArrayList)localObject1).add(localObject4);
      }
      for (;;)
      {
        i += 1;
        break;
        if (a((com.google.android.exoplayer2.source.b.a.a.a)localObject4, "mp4a")) {
          ((ArrayList)localObject3).add(localObject4);
        }
      }
    }
    if (!((ArrayList)localObject1).isEmpty())
    {
      parama = (com.google.android.exoplayer2.source.e.a)localObject1;
      localObject3 = ((com.google.android.exoplayer2.source.b.a.a)localObject2).auD;
      localObject1 = ((com.google.android.exoplayer2.source.b.a.a)localObject2).auE;
      this.atT = new j[((List)localObject3).size() + 1 + ((List)localObject1).size()];
      this.atS = this.atT.length;
      if (parama.isEmpty()) {
        break label384;
      }
    }
    label384:
    for (boolean bool = true;; bool = false)
    {
      com.google.android.exoplayer2.i.a.ao(bool);
      localObject4 = new com.google.android.exoplayer2.source.b.a.a.a[parama.size()];
      parama.toArray((Object[])localObject4);
      parama = a(0, (com.google.android.exoplayer2.source.b.a.a.a[])localObject4, ((com.google.android.exoplayer2.source.b.a.a)localObject2).auc, ((com.google.android.exoplayer2.source.b.a.a)localObject2).atd, paramLong);
      this.atT[0] = parama;
      parama.ak(true);
      parama.la();
      i = 1;
      j = 0;
      while (j < ((List)localObject3).size())
      {
        parama = (com.google.android.exoplayer2.source.b.a.a.a)((List)localObject3).get(j);
        localObject2 = Collections.emptyList();
        parama = a(1, new com.google.android.exoplayer2.source.b.a.a.a[] { parama }, null, (List)localObject2, paramLong);
        this.atT[i] = parama;
        parama.la();
        i += 1;
        j += 1;
      }
      if (((ArrayList)localObject3).size() < parama.size()) {
        parama.removeAll((Collection)localObject3);
      }
      break;
    }
    int j = 0;
    while (j < ((List)localObject1).size())
    {
      parama = (com.google.android.exoplayer2.source.b.a.a.a)((List)localObject1).get(j);
      localObject2 = Collections.emptyList();
      localObject2 = a(3, new com.google.android.exoplayer2.source.b.a.a.a[] { parama }, null, (List)localObject2, paramLong);
      parama = parama.aep;
      ((j)localObject2).cL(0).f(parama);
      ((j)localObject2).auj = true;
      ((j)localObject2).ld();
      this.atT[i] = localObject2;
      i += 1;
      j += 1;
    }
    this.atU = this.atT;
  }
  
  public final void b(com.google.android.exoplayer2.source.b.a.a.a parama)
  {
    j[] arrayOfj = this.atT;
    int j = arrayOfj.length;
    int i = 0;
    while (i < j)
    {
      c localc = arrayOfj[i].aub;
      int k = localc.atc.j(parama.aep);
      if (k != -1)
      {
        k = localc.atl.indexOf(k);
        if (k != -1) {
          localc.atl.cU(k);
        }
      }
      i += 1;
    }
    kZ();
  }
  
  public final void iy()
  {
    int i = this.atS - 1;
    this.atS = i;
    if (i > 0) {
      return;
    }
    Object localObject = this.atT;
    int k = localObject.length;
    i = 0;
    int j = 0;
    while (i < k)
    {
      j += localObject[i].acW.length;
      i += 1;
    }
    localObject = new l[j];
    j[] arrayOfj = this.atT;
    int m = arrayOfj.length;
    j = 0;
    i = 0;
    while (i < m)
    {
      j localj = arrayOfj[i];
      int n = localj.acW.length;
      k = 0;
      while (k < n)
      {
        localObject[j] = localj.acW.asI[k];
        k += 1;
        j += 1;
      }
      i += 1;
    }
    this.acW = new m((l[])localObject);
    this.arL.a(this);
  }
  
  public final long kA()
  {
    return this.atV.kA();
  }
  
  public final long kB()
  {
    return this.atV.kB();
  }
  
  public final void kY()
  {
    kZ();
  }
  
  public final void kx()
  {
    j[] arrayOfj = this.atT;
    int j = arrayOfj.length;
    int i = 0;
    while (i < j)
    {
      arrayOfj[i].kC();
      i += 1;
    }
  }
  
  public final m ky()
  {
    return this.acW;
  }
  
  public final long kz()
  {
    return -9223372036854775807L;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/exoplayer2/source/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */