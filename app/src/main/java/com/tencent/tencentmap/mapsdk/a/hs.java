package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseBooleanArray;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.gl.model.GLIcon;
import com.tencent.map.lib.util.StringUtil;
import com.tencent.map.lib.util.SystemUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class hs
{
  public HashMap<Integer, GLIcon> a;
  public HashMap<Integer, GLIcon> b;
  private gy c;
  private hq d;
  private CopyOnWriteArrayList<Integer> e = new CopyOnWriteArrayList();
  private SparseBooleanArray f = new SparseBooleanArray();
  private ArrayList<Integer> g = new ArrayList();
  
  hs(gy paramgy, com.tencent.map.lib.gl.b paramb, hq paramhq)
  {
    this.c = paramgy;
    this.d = paramhq;
    this.a = new HashMap();
    this.b = new HashMap();
  }
  
  public static Bitmap a(String paramString)
  {
    return com.tencent.map.lib.util.b.a(paramString);
  }
  
  private int b(iq paramiq)
  {
    if (((this.c instanceof hv)) && (paramiq != null) && (!paramiq.l()))
    {
      Context localContext = ((hv)this.c).l();
      float f1 = paramiq.n();
      paramiq.a(SystemUtil.getDensity(localContext) * f1);
    }
    int i = this.c.f().a(paramiq);
    paramiq.b(i);
    if (!this.e.contains(Integer.valueOf(i)))
    {
      this.e.add(Integer.valueOf(i));
      this.f.append(i, paramiq.l());
    }
    return i;
  }
  
  private void e()
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = this.a.entrySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject3 = (Map.Entry)((Iterator)localObject1).next();
      Object localObject2 = ((Map.Entry)localObject3).getKey();
      localObject3 = (GLIcon)((Map.Entry)localObject3).getValue();
      if (!this.b.containsKey(localObject2))
      {
        localArrayList.add(Integer.valueOf(((Integer)localObject2).intValue()));
        com.tencent.map.lib.util.b.b(((GLIcon)localObject3).getIconName());
      }
    }
    int j = localArrayList.size();
    if (j <= 0) {
      return;
    }
    localObject1 = new int[j];
    int i = 0;
    while (i < j)
    {
      localObject1[i] = ((Integer)localArrayList.get(i)).intValue();
      i += 1;
    }
    this.d.a((int[])localObject1, j);
  }
  
  private void f()
  {
    this.a.clear();
    this.a.putAll(this.b);
    this.b.clear();
  }
  
  public void a()
  {
    e();
    f();
  }
  
  public void a(int paramInt)
  {
    this.c.f().a(paramInt, this.f.get(paramInt));
    this.f.delete(paramInt);
    this.e.remove(Integer.valueOf(paramInt));
  }
  
  public void a(GeoPoint paramGeoPoint, GLIcon paramGLIcon, boolean paramBoolean1, int paramInt1, boolean paramBoolean2, boolean paramBoolean3, int paramInt2)
  {
    if (paramBoolean3) {}
    for (float f1 = 360.0F - paramGLIcon.getRotateAngle(); this.a.containsKey(Integer.valueOf(paramGLIcon.mDisplayId)); f1 = paramGLIcon.getRotateAngle())
    {
      if (paramGLIcon.isDirty())
      {
        this.d.a(paramGLIcon.mDisplayId, paramGLIcon.getIconName(), paramGLIcon.mPositionX, paramGLIcon.mPositionY, paramGLIcon.getAnchroX(), paramGLIcon.getAnchorY(), paramGLIcon.getScaleX(), paramGLIcon.getScaleY(), paramGLIcon.getAlpha(), f1, paramBoolean1, paramGLIcon.isFixPos(), paramGLIcon.isFastLoad(), paramGLIcon.isAvoidAnno(), paramInt2);
        if (paramGLIcon.isIconChanged())
        {
          com.tencent.map.lib.util.b.a(paramGLIcon.getIconName(), paramGLIcon.getTextureBm(0));
          com.tencent.map.lib.util.b.b(paramGLIcon.getLastName());
          paramGLIcon.setIconChanged(false);
        }
      }
      this.b.put(Integer.valueOf(paramGLIcon.mDisplayId), paramGLIcon);
      return;
    }
    paramGLIcon.mDisplayId = this.d.a(paramGLIcon.getIconName(), paramGLIcon.mPositionX, paramGLIcon.mPositionY, paramGLIcon.getAnchroX(), paramGLIcon.getAnchorY(), paramGLIcon.getScaleX(), paramGLIcon.getScaleY(), paramGLIcon.getAlpha(), f1, paramBoolean1, paramGLIcon.isFixPos(), paramGLIcon.isFastLoad(), paramGLIcon.isAvoidAnno(), paramInt2);
    com.tencent.map.lib.util.b.a(paramGLIcon.getIconName(), paramGLIcon.getTextureBm(0));
    paramGLIcon.setIconChanged(false);
    paramGLIcon.setDirty(false);
    this.b.put(Integer.valueOf(paramGLIcon.mDisplayId), paramGLIcon);
  }
  
  public void a(iq paramiq)
  {
    if (!this.e.contains(Integer.valueOf(paramiq.r())))
    {
      paramiq.a(b(paramiq));
      this.d.c(paramiq);
    }
    if (!this.g.contains(Integer.valueOf(paramiq.r()))) {
      this.g.add(Integer.valueOf(paramiq.r()));
    }
    this.d.b(paramiq);
    this.d.d(paramiq);
    if (paramiq.s()) {
      this.d.h(paramiq);
    }
    for (;;)
    {
      this.d.f(paramiq);
      if (!StringUtil.isEmpty(paramiq.u())) {
        this.d.e(paramiq);
      }
      this.d.i(paramiq);
      return;
      this.d.g(paramiq);
    }
  }
  
  public gy b()
  {
    return this.c;
  }
  
  protected void c()
  {
    if ((this.e != null) && (this.e.size() > 0))
    {
      Iterator localIterator = this.e.iterator();
      while (localIterator.hasNext())
      {
        int i = ((Integer)localIterator.next()).intValue();
        if (!this.g.contains(Integer.valueOf(i))) {
          a(i);
        }
      }
      this.g.clear();
    }
  }
  
  public float d()
  {
    return this.c.a().l();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/hs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */