package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Rect;
import com.tencent.map.lib.basemap.data.GeoPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ir
{
  ArrayList<GeoPoint> a;
  ArrayList<GeoPoint> b;
  int[] c;
  int[] d;
  int[] e;
  int[] f;
  float g;
  boolean h;
  boolean i;
  float j = 9.0F;
  String k = "";
  boolean l = true;
  float m = 1.0F;
  boolean n = true;
  int o = 0;
  boolean p = false;
  List<GeoPoint> q;
  int r = 0;
  boolean s = false;
  Rect t = new Rect();
  int u = 0;
  String v = "";
  float w = -1.0F;
  int x = -1;
  int y = -15248742;
  List<Integer> z = null;
  
  public int a()
  {
    return this.o;
  }
  
  public ir a(int paramInt)
  {
    this.o = paramInt;
    return this;
  }
  
  public ir a(int paramInt, List<GeoPoint> paramList)
  {
    if ((paramInt != 1) && (paramInt != 2) && (paramInt != 3)) {
      throw new IllegalArgumentException("bezier曲线阶数为1，2，3");
    }
    if ((paramInt == 1) && (paramList != null) && ((paramList == null) || (paramList.size() != 0))) {
      throw new IllegalArgumentException("bezier曲线控制点数目错误");
    }
    if ((paramInt == 2) && ((paramList == null) || ((paramList != null) && (paramList.size() != 1)))) {
      throw new IllegalArgumentException("bezier曲线控制点数目错误");
    }
    if ((paramInt == 3) && ((paramList == null) || ((paramList != null) && (paramList.size() != 2)))) {
      throw new IllegalArgumentException("bezier曲线控制点数目错误");
    }
    this.r = paramInt;
    this.q = paramList;
    return this;
  }
  
  public ir a(List<GeoPoint> paramList)
  {
    if ((paramList == null) || (paramList.size() < 2)) {
      throw new IllegalArgumentException("参数points不能小于2!");
    }
    this.b = new ArrayList(paramList.size());
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      GeoPoint localGeoPoint = (GeoPoint)localIterator.next();
      if (localGeoPoint != null) {
        this.b.add(localGeoPoint);
      }
    }
    if (this.b.size() < 2) {
      throw new IllegalArgumentException("参数points存在null值");
    }
    this.a = new ArrayList(paramList.size());
    this.a.addAll(this.b);
    return this;
  }
  
  public ir a(int[] paramArrayOfInt)
  {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0)) {
      throw new IllegalArgumentException("参数startIndexes不能为空!");
    }
    this.c = paramArrayOfInt;
    return this;
  }
  
  public ir a(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    int i2 = 0;
    if ((paramArrayOfInt1 == null) || (paramArrayOfInt1.length <= 0) || (paramArrayOfInt2 == null) || (paramArrayOfInt2.length <= 0)) {
      throw new IllegalArgumentException("参数colors 、borderColors为空，或者两者长度不同");
    }
    if (!this.h) {
      this.d = paramArrayOfInt1;
    }
    for (;;)
    {
      return this;
      int[] arrayOfInt = paramArrayOfInt2;
      if (paramArrayOfInt2.length < paramArrayOfInt1.length)
      {
        arrayOfInt = new int[paramArrayOfInt1.length];
        i1 = 0;
        if (i1 < paramArrayOfInt1.length)
        {
          if (i1 < paramArrayOfInt2.length) {
            arrayOfInt[i1] = paramArrayOfInt2[i1];
          }
          for (;;)
          {
            i1 += 1;
            break;
            arrayOfInt[i1] = paramArrayOfInt2[(paramArrayOfInt2.length - 1)];
          }
        }
      }
      paramArrayOfInt2 = new ArrayList();
      this.d = new int[paramArrayOfInt1.length];
      int i1 = 0;
      while (i1 < paramArrayOfInt1.length)
      {
        a locala = new a(paramArrayOfInt1[i1], arrayOfInt[i1]);
        if (!paramArrayOfInt2.contains(locala)) {
          paramArrayOfInt2.add(locala);
        }
        this.d[i1] = paramArrayOfInt2.indexOf(locala);
        i1 += 1;
      }
      int i3 = paramArrayOfInt2.size();
      this.e = new int[i3];
      this.f = new int[i3];
      i1 = i2;
      while (i1 < i3)
      {
        this.e[i1] = ((a)paramArrayOfInt2.get(i1)).b;
        this.f[i1] = ((a)paramArrayOfInt2.get(i1)).a;
        i1 += 1;
      }
    }
  }
  
  @Deprecated
  public void a(float paramFloat)
  {
    this.m = paramFloat;
  }
  
  @Deprecated
  public void a(String paramString)
  {
    this.k = paramString;
  }
  
  @Deprecated
  public void a(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }
  
  public float b()
  {
    return this.w;
  }
  
  public ir b(float paramFloat)
  {
    this.j = paramFloat;
    return this;
  }
  
  public ir b(int paramInt)
  {
    this.u = paramInt;
    return this;
  }
  
  public ir b(String paramString)
  {
    this.v = paramString;
    return this;
  }
  
  public ir b(List<Integer> paramList)
  {
    if ((paramList != null) && (paramList.size() % 2 != 0)) {
      paramList.add(paramList.get(paramList.size() - 1));
    }
    this.z = paramList;
    return this;
  }
  
  public ir b(boolean paramBoolean)
  {
    this.h = paramBoolean;
    return this;
  }
  
  public ir b(int[] paramArrayOfInt)
  {
    int i2 = 0;
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0)) {
      throw new IllegalArgumentException("参数colors不能为空!");
    }
    if (!this.h) {
      this.d = paramArrayOfInt;
    }
    for (;;)
    {
      return this;
      ArrayList localArrayList = new ArrayList();
      int i1 = 0;
      while (i1 < paramArrayOfInt.length)
      {
        if (!localArrayList.contains(Integer.valueOf(paramArrayOfInt[i1]))) {
          localArrayList.add(Integer.valueOf(paramArrayOfInt[i1]));
        }
        paramArrayOfInt[i1] = localArrayList.indexOf(Integer.valueOf(paramArrayOfInt[i1]));
        i1 += 1;
      }
      this.d = paramArrayOfInt;
      int i3 = localArrayList.size();
      this.e = new int[i3];
      i1 = i2;
      while (i1 < i3)
      {
        this.e[i1] = ((Integer)localArrayList.get(i1)).intValue();
        i1 += 1;
      }
    }
  }
  
  public ir c(float paramFloat)
  {
    this.g = paramFloat;
    return this;
  }
  
  public ir c(boolean paramBoolean)
  {
    this.i = paramBoolean;
    return this;
  }
  
  public ir d(float paramFloat)
  {
    this.w = paramFloat;
    return this;
  }
  
  public ir d(boolean paramBoolean)
  {
    this.n = paramBoolean;
    return this;
  }
  
  public ir e(boolean paramBoolean)
  {
    this.p = paramBoolean;
    return this;
  }
  
  public ir f(boolean paramBoolean)
  {
    this.s = paramBoolean;
    return this;
  }
  
  private class a
  {
    public int a;
    public int b;
    
    public a(int paramInt1, int paramInt2)
    {
      this.b = paramInt1;
      this.a = paramInt2;
    }
    
    public boolean equals(Object paramObject)
    {
      if (paramObject == null) {}
      do
      {
        return false;
        if (paramObject == this) {
          return true;
        }
        paramObject = (a)paramObject;
      } while ((((a)paramObject).a != this.a) || (((a)paramObject).b != this.b));
      return true;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ir.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */