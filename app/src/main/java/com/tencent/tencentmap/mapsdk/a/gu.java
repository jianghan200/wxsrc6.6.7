package com.tencent.tencentmap.mapsdk.a;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashMap;

public class gu
  extends gi
{
  private static ThreadLocal<Object> b = new ThreadLocal();
  private static final ThreadLocal<ArrayList<gu>> h = new gu.1();
  private static final ThreadLocal<ArrayList<gu>> i = new gu.2();
  private static final ThreadLocal<ArrayList<gu>> j = new gu.3();
  private static final ThreadLocal<ArrayList<gu>> k = new gu.4();
  private static final ThreadLocal<ArrayList<gu>> l = new ThreadLocal()
  {
    protected final ArrayList<gu> a()
    {
      return new ArrayList();
    }
  };
  private static final Interpolator m = new LinearInterpolator();
  private static long v = 10L;
  long c = -1L;
  int d = 0;
  gr[] e;
  HashMap<Integer, gr> f;
  protected gh g;
  private boolean n = false;
  private int o = 0;
  private float p = 0.0F;
  private boolean q = false;
  private boolean r = false;
  private boolean s = false;
  private long t = 300L;
  private long u = 0L;
  private int w = 0;
  private int x = 1;
  private Interpolator y = m;
  private ArrayList<Object> z = null;
  
  public gu(gh paramgh)
  {
    this.g = paramgh;
  }
  
  public static void a(long paramLong)
  {
    v = paramLong;
  }
  
  public gi a()
  {
    int i2 = 0;
    gu localgu = (gu)super.a();
    int i3;
    int i1;
    if (this.z != null)
    {
      localObject = this.z;
      localgu.z = new ArrayList();
      i3 = ((ArrayList)localObject).size();
      i1 = 0;
      while (i1 < i3)
      {
        localgu.z.add(((ArrayList)localObject).get(i1));
        i1 += 1;
      }
    }
    localgu.c = -1L;
    localgu.n = false;
    localgu.o = 0;
    localgu.d = 0;
    localgu.q = false;
    Object localObject = this.e;
    if (localObject != null)
    {
      i3 = localObject.length;
      localgu.e = new gr[i3];
      localgu.f = new HashMap(i3);
      i1 = i2;
      while (i1 < i3)
      {
        gr localgr = localObject[i1].a();
        localgu.e[i1] = localgr;
        localgu.f.put(Integer.valueOf(localgr.b()), localgr);
        i1 += 1;
      }
    }
    return localgu;
  }
  
  public void a(gt<?> paramgt)
  {
    if ((paramgt != null) && (this.e != null) && (this.e.length > 0)) {
      this.e[0].a(paramgt);
    }
  }
  
  public void a(double... paramVarArgs)
  {
    if ((paramVarArgs == null) || (paramVarArgs.length == 0)) {
      return;
    }
    if ((this.e == null) || (this.e.length == 0))
    {
      a(new gr[] { gr.a(0, paramVarArgs) });
      return;
    }
    this.e[0].a(paramVarArgs);
  }
  
  public void a(gr... paramVarArgs)
  {
    int i2 = paramVarArgs.length;
    this.e = paramVarArgs;
    this.f = new HashMap(i2);
    int i1 = 0;
    while (i1 < i2)
    {
      gr localgr = paramVarArgs[i1];
      this.f.put(Integer.valueOf(localgr.b()), localgr);
      i1 += 1;
    }
  }
  
  public void a(Object... paramVarArgs)
  {
    if ((paramVarArgs == null) || (paramVarArgs.length == 0)) {
      return;
    }
    if ((this.e == null) || (this.e.length == 0))
    {
      a(new gr[] { gr.a(0, null, paramVarArgs) });
      return;
    }
    this.e[0].a(paramVarArgs);
  }
  
  public String toString()
  {
    String str1 = "ValueAnimator@" + Integer.toHexString(hashCode());
    String str2 = str1;
    if (this.e != null)
    {
      int i1 = 0;
      for (;;)
      {
        str2 = str1;
        if (i1 >= this.e.length) {
          break;
        }
        str1 = str1 + "\n    " + this.e[i1].toString();
        i1 += 1;
      }
    }
    return str2;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/gu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */