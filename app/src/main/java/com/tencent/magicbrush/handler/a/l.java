package com.tencent.magicbrush.handler.a;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;

final class l
  implements d
{
  private d.a boA = new d.a();
  private int boB;
  private d.c boC = new d.c();
  private ArrayList<d.b> boz = new ArrayList();
  private int mHeight;
  private int mWidth;
  
  public final void a(int paramInt1, int paramInt2, Rect paramRect)
  {
    if (paramRect == null) {
      return;
    }
    if ((paramInt1 <= 0) || (paramInt2 <= 0))
    {
      paramRect.setEmpty();
      return;
    }
    d.c localc = this.boC;
    localc.x = 0;
    localc.y = 0;
    localc.width = paramInt1;
    localc.height = paramInt2;
    int m = -1;
    int i = 0;
    int j = Integer.MAX_VALUE;
    int n = Integer.MAX_VALUE;
    d.b localb1;
    int k;
    if (i < this.boz.size())
    {
      localb1 = (d.b)this.boz.get(i);
      if (localb1.x + paramInt1 > this.mWidth - 1)
      {
        k = -1;
        label107:
        if (k < 0) {
          break label733;
        }
        localb1 = (d.b)this.boz.get(i);
        if ((k + paramInt2 >= n) && ((k + paramInt2 != n) || (localb1.z <= 0) || (localb1.z >= j))) {
          break label733;
        }
        j = localb1.z;
        localc.x = localb1.x;
        localc.y = k;
        n = k + paramInt2;
        m = i;
      }
    }
    label301:
    label733:
    for (;;)
    {
      i += 1;
      break;
      k = localb1.y;
      int i1 = i;
      int i2 = paramInt1;
      for (;;)
      {
        if (i2 <= 0) {
          break label301;
        }
        localb1 = (d.b)this.boz.get(i1);
        int i3 = k;
        if (localb1.y > k) {
          i3 = localb1.y;
        }
        if (i3 + paramInt2 > this.mHeight - 1)
        {
          k = -1;
          break;
        }
        i2 -= localb1.z;
        i1 += 1;
        k = i3;
      }
      break label107;
      if (m == -1)
      {
        localc.x = -1;
        localc.y = -1;
        localc.width = 0;
        localc.height = 0;
      }
      while ((localc.x < 0) || (localc.y < 0))
      {
        paramRect.setEmpty();
        return;
        localb1 = this.boA.td();
        localb1.x = localc.x;
        localb1.y = (localc.y + paramInt2);
        localb1.z = paramInt1;
        this.boz.add(m, localb1);
        d.b localb2;
        for (i = m + 1; i < this.boz.size(); i = i - 1 + 1)
        {
          localb1 = (d.b)this.boz.get(i);
          localb2 = (d.b)this.boz.get(i - 1);
          if (localb1.x >= localb2.x + localb2.z) {
            break;
          }
          j = localb2.x;
          j = localb2.z + j - localb1.x;
          localb1.x += j;
          localb1.z -= j;
          if (localb1.z > 0) {
            break;
          }
          localb1 = (d.b)this.boz.remove(i);
          this.boA.a(localb1);
        }
        for (i = 0; i < this.boz.size() - 1; i = j + 1)
        {
          localb1 = (d.b)this.boz.get(i);
          localb2 = (d.b)this.boz.get(i + 1);
          j = i;
          if (localb1.y == localb2.y)
          {
            j = localb1.z;
            localb2.z += j;
            localb1 = (d.b)this.boz.remove(i + 1);
            this.boA.a(localb1);
            j = i - 1;
          }
        }
        this.boB += paramInt1 * paramInt2;
      }
      paramRect.set(localc.x, localc.y, localc.x + paramInt1 - 1, localc.y + paramInt2 - 1);
      return;
    }
  }
  
  public final void init(int paramInt1, int paramInt2)
  {
    this.mWidth = paramInt1;
    this.mHeight = paramInt2;
    reset();
  }
  
  public final void reset()
  {
    this.boB = 0;
    Object localObject = this.boA;
    ArrayList localArrayList = this.boz;
    if ((localArrayList == null) || (localArrayList.isEmpty())) {}
    for (;;)
    {
      localObject = this.boA.td();
      int i = this.mWidth;
      ((d.b)localObject).x = 1;
      ((d.b)localObject).y = 1;
      ((d.b)localObject).z = (i - 2);
      this.boz.add(localObject);
      return;
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        d.b localb = (d.b)localIterator.next();
        ((d.a)localObject).bnG.offer(localb);
      }
      localArrayList.clear();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/magicbrush/handler/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */