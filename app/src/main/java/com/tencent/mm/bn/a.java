package com.tencent.mm.bn;

import com.tencent.mm.api.d;
import com.tencent.mm.api.k;
import com.tencent.mm.cache.ArtistCacheManager;
import com.tencent.mm.cache.g;
import com.tencent.mm.t.e;
import java.util.Iterator;
import java.util.Stack;

public final class a
  implements k
{
  private com.tencent.mm.bi.b bBn;
  
  public a(com.tencent.mm.bi.b paramb)
  {
    this.bBn = paramb;
  }
  
  public final int getTextColor()
  {
    Object localObject1 = (com.tencent.mm.cache.c)ArtistCacheManager.yn().a(com.tencent.mm.d.a.bBj);
    if (localObject1 == null) {
      return 0;
    }
    localObject1 = ((com.tencent.mm.cache.c)localObject1).daj;
    if (localObject1 != null)
    {
      localObject1 = ((Stack)localObject1).iterator();
      int i = 0;
      label112:
      for (;;)
      {
        j = i;
        if (!((Iterator)localObject1).hasNext()) {
          break;
        }
        Object localObject2 = (com.tencent.mm.t.c)((Iterator)localObject1).next();
        if ((localObject2 instanceof e))
        {
          localObject2 = (e)localObject2;
          int[] arrayOfInt = com.tencent.mm.view.footer.a.uUQ;
          j = 0;
          for (;;)
          {
            if (j >= arrayOfInt.length) {
              break label112;
            }
            if (((e)localObject2).pN == arrayOfInt[j])
            {
              i = 1 << j | i;
              break;
            }
            j += 1;
          }
        }
      }
    }
    int j = 0;
    return j;
  }
  
  public final int ub()
  {
    com.tencent.mm.cache.c localc = (com.tencent.mm.cache.c)ArtistCacheManager.yn().a(com.tencent.mm.d.a.bBj);
    if (localc == null) {
      return 0;
    }
    return localc.yu()[1];
  }
  
  public final int uc()
  {
    com.tencent.mm.cache.c localc = (com.tencent.mm.cache.c)ArtistCacheManager.yn().a(com.tencent.mm.d.a.bBj);
    if (localc == null) {
      return 0;
    }
    return localc.yu()[0];
  }
  
  public final int ud()
  {
    g localg = (g)ArtistCacheManager.yn().a(com.tencent.mm.d.a.bBi);
    if (localg == null) {
      return 0;
    }
    return localg.aW(false);
  }
  
  public final int ue()
  {
    com.tencent.mm.cache.b localb = (com.tencent.mm.cache.b)ArtistCacheManager.yn().a(com.tencent.mm.d.a.bBh);
    if (localb == null) {
      return 0;
    }
    return localb.aW(false);
  }
  
  public final int uf()
  {
    int i = 0;
    Object localObject = (com.tencent.mm.cache.b)ArtistCacheManager.yn().a(com.tencent.mm.d.a.bBh);
    if (localObject != null) {
      i = ((com.tencent.mm.cache.b)localObject).dal + 0;
    }
    localObject = (g)ArtistCacheManager.yn().a(com.tencent.mm.d.a.bBi);
    int j = i;
    if (localObject != null) {
      j = i + ((g)localObject).dal;
    }
    return j;
  }
  
  public final boolean ug()
  {
    com.tencent.mm.cache.a locala = (com.tencent.mm.cache.a)ArtistCacheManager.yn().a(com.tencent.mm.d.a.bBk);
    if (locala == null) {
      return false;
    }
    return locala.aW(false) > 0;
  }
  
  public final boolean uh()
  {
    boolean bool2 = false;
    com.tencent.mm.d.b localb = this.bBn.b(d.bwR);
    boolean bool1 = bool2;
    if (localb != null)
    {
      bool1 = bool2;
      if (localb.vE() == com.tencent.mm.d.a.bBk) {
        if (((com.tencent.mm.d.c)localb).bCa <= 0) {
          break label47;
        }
      }
    }
    label47:
    for (bool1 = true;; bool1 = false) {
      return bool1;
    }
  }
  
  public final int ui()
  {
    Object localObject = (com.tencent.mm.cache.b)ArtistCacheManager.yn().a(com.tencent.mm.d.a.bBh);
    if (localObject == null) {
      return 0;
    }
    localObject = ((com.tencent.mm.cache.b)localObject).daj;
    if (localObject != null)
    {
      localObject = ((Stack)localObject).iterator();
      int i = 0;
      label97:
      for (;;)
      {
        j = i;
        if (!((Iterator)localObject).hasNext()) {
          break;
        }
        com.tencent.mm.t.b localb = (com.tencent.mm.t.b)((Iterator)localObject).next();
        int[] arrayOfInt = com.tencent.mm.view.footer.a.uUQ;
        j = 0;
        for (;;)
        {
          if (j >= arrayOfInt.length) {
            break label97;
          }
          if (localb.pN == arrayOfInt[j])
          {
            i = 1 << j | i;
            break;
          }
          j += 1;
        }
      }
    }
    int j = 0;
    return j;
  }
  
  public final boolean uj()
  {
    com.tencent.mm.cache.b localb = (com.tencent.mm.cache.b)ArtistCacheManager.yn().a(com.tencent.mm.d.a.bBh);
    g localg = (g)ArtistCacheManager.yn().a(com.tencent.mm.d.a.bBi);
    com.tencent.mm.cache.a locala = (com.tencent.mm.cache.a)ArtistCacheManager.yn().a(com.tencent.mm.d.a.bBk);
    com.tencent.mm.cache.c localc = (com.tencent.mm.cache.c)ArtistCacheManager.yn().a(com.tencent.mm.d.a.bBj);
    return ((localb != null) && (localb.aW(true) > 0)) || ((localg != null) && (localg.aW(true) > 0)) || ((localc != null) && (localc.aW(true) > 0)) || ((locala != null) && (locala.aW(true) > 0));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/bn/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */