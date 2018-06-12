package com.google.android.exoplayer2.source.b;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.h.r;
import com.google.android.exoplayer2.h.r.d;
import com.google.android.exoplayer2.h.s;
import com.google.android.exoplayer2.h.s.a;
import com.google.android.exoplayer2.source.a.a;
import com.google.android.exoplayer2.source.b.a.b.a;
import com.google.android.exoplayer2.source.b.a.c;
import com.google.android.exoplayer2.source.b.a.e.a;
import com.google.android.exoplayer2.source.b.a.e.e;
import com.google.android.exoplayer2.source.f;
import com.google.android.exoplayer2.source.f.b;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.w;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

public final class h
  implements e.e, f
{
  private final d atN;
  private final int atO;
  private final a.a atP;
  private final Uri atW;
  private final s.a<c> atX;
  private com.google.android.exoplayer2.source.f.a atY;
  private com.google.android.exoplayer2.source.b.a.e atb;
  
  static
  {
    com.google.android.exoplayer2.j.ae("goog.exo.hls");
  }
  
  public h(Uri paramUri, com.google.android.exoplayer2.h.f.a parama, Handler paramHandler, com.google.android.exoplayer2.source.a parama1)
  {
    this(paramUri, parama, paramHandler, parama1, (byte)0);
  }
  
  private h(Uri paramUri, com.google.android.exoplayer2.h.f.a parama, Handler paramHandler, com.google.android.exoplayer2.source.a parama1, byte paramByte)
  {
    this(paramUri, new b(parama), paramHandler, parama1);
  }
  
  private h(Uri paramUri, d paramd, Handler paramHandler, com.google.android.exoplayer2.source.a parama)
  {
    this(paramUri, paramd, paramHandler, parama, new com.google.android.exoplayer2.source.b.a.d());
  }
  
  private h(Uri paramUri, d paramd, Handler paramHandler, com.google.android.exoplayer2.source.a parama, s.a<c> parama1)
  {
    this.atW = paramUri;
    this.atN = paramd;
    this.atO = 3;
    this.atX = parama1;
    this.atP = new a.a(paramHandler, parama);
  }
  
  public final com.google.android.exoplayer2.source.e a(f.b paramb, com.google.android.exoplayer2.h.b paramb1)
  {
    if (paramb.arU == 0) {}
    for (boolean bool = true;; bool = false)
    {
      com.google.android.exoplayer2.i.a.ao(bool);
      return new g(this.atb, this.atN, this.atO, this.atP, paramb1);
    }
  }
  
  public final void a(com.google.android.exoplayer2.source.b.a.b paramb)
  {
    long l2;
    long l3;
    label26:
    long l1;
    long l4;
    label63:
    long l5;
    label92:
    long l6;
    boolean bool;
    if (paramb.auN)
    {
      l2 = 0L;
      if (!paramb.auN) {
        break label173;
      }
      l3 = com.google.android.exoplayer2.b.n(paramb.asN);
      l1 = paramb.auG;
      if (!this.atb.avH) {
        break label225;
      }
      if (!paramb.auM) {
        break label181;
      }
      l4 = paramb.asN;
      l4 = paramb.aet + l4;
      localObject = paramb.auP;
      l5 = l1;
      if (l1 == -9223372036854775807L)
      {
        if (!((List)localObject).isEmpty()) {
          break label189;
        }
        l1 = 0L;
        l5 = l1;
      }
      l1 = paramb.aet;
      l6 = paramb.asN;
      if (paramb.auM) {
        break label219;
      }
      bool = true;
    }
    label116:
    for (Object localObject = new k(l2, l3, l4, l1, l6, l5, bool);; localObject = new k(l2, l3, paramb.asN + paramb.aet, paramb.aet, paramb.asN, l4, false))
    {
      this.atY.a((w)localObject, new e(this.atb.ats, paramb));
      return;
      l2 = -9223372036854775807L;
      break;
      label173:
      l3 = -9223372036854775807L;
      break label26;
      label181:
      l4 = -9223372036854775807L;
      break label63;
      label189:
      l1 = ((b.a)((List)localObject).get(Math.max(0, ((List)localObject).size() - 3))).auR;
      break label92;
      label219:
      bool = false;
      break label116;
      label225:
      l4 = l1;
      if (l1 == -9223372036854775807L) {
        l4 = 0L;
      }
    }
  }
  
  public final void a(com.google.android.exoplayer2.source.f.a parama)
  {
    if (this.atb == null) {}
    for (boolean bool = true;; bool = false)
    {
      com.google.android.exoplayer2.i.a.ap(bool);
      this.atb = new com.google.android.exoplayer2.source.b.a.e(this.atW, this.atN, this.atP, this.atO, this, this.atX);
      this.atY = parama;
      parama = this.atb;
      s locals = new s(parama.atN.kT(), parama.avy, parama.atX);
      parama.avE.a(locals, parama, parama.avz);
      return;
    }
  }
  
  public final void b(com.google.android.exoplayer2.source.e parame)
  {
    parame = (g)parame;
    parame.atb.avD.remove(parame);
    parame.atR.removeCallbacksAndMessages(null);
    parame = parame.atT;
    int k = parame.length;
    int i = 0;
    while (i < k)
    {
      r.d locald = parame[i];
      boolean bool = locald.aud.a(locald);
      if ((locald.adE) && (!bool))
      {
        com.google.android.exoplayer2.source.h[] arrayOfh = locald.auh;
        int m = arrayOfh.length;
        int j = 0;
        while (j < m)
        {
          arrayOfh[j].kM();
          j += 1;
        }
      }
      locald.handler.removeCallbacksAndMessages(null);
      locald.released = true;
      i += 1;
    }
  }
  
  public final void kD()
  {
    com.google.android.exoplayer2.source.b.a.e locale = this.atb;
    locale.avE.kC();
    if (locale.avF != null) {
      locale.d(locale.avF);
    }
  }
  
  public final void kE()
  {
    if (this.atb != null)
    {
      com.google.android.exoplayer2.source.b.a.e locale = this.atb;
      locale.avE.a(null);
      Iterator localIterator = locale.avA.values().iterator();
      while (localIterator.hasNext()) {
        ((e.a)localIterator.next()).avJ.a(null);
      }
      locale.avB.removeCallbacksAndMessages(null);
      locale.avA.clear();
      this.atb = null;
    }
    this.atY = null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/exoplayer2/source/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */