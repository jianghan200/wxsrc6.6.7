package com.tencent.tencentmap.mapsdk.a;

import com.qq.jutil.string.StringUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class al
{
  String a;
  int b;
  int c;
  int d;
  int e;
  ay f;
  int g;
  public au h;
  int i;
  int j;
  boolean k;
  long l;
  String m;
  String n;
  String o;
  String p;
  private int q;
  
  public static ai<ArrayList<bb>, ArrayList<bb>> a(String paramString1, int paramInt1, int paramInt2, int paramInt3, String paramString2)
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    paramString2 = StringUtil.split(paramString2, ":");
    int i2 = paramString2.length;
    int i1 = 0;
    if (i1 < i2)
    {
      bb localbb = bb.a(paramString1, paramString2[i1], paramInt1, paramInt2, paramInt3);
      if (localbb.g()) {
        localArrayList1.add(localbb);
      }
      for (;;)
      {
        i1 += 1;
        break;
        localArrayList2.add(localbb);
      }
    }
    paramString1 = new ai();
    paramString1.a = localArrayList1;
    paramString1.b = localArrayList2;
    return paramString1;
  }
  
  public int a()
  {
    return this.c;
  }
  
  public void a(au paramau)
  {
    this.h = paramau;
  }
  
  public String b()
  {
    Object localObject1 = new StringBuffer();
    Object localObject2 = this.h.c().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      bb localbb = (bb)((Iterator)localObject2).next();
      ((StringBuffer)localObject1).append(localbb.c() + ":");
    }
    localObject2 = ((StringBuffer)localObject1).toString();
    localObject1 = localObject2;
    if (((String)localObject2).endsWith(":")) {
      localObject1 = ((String)localObject2).substring(0, ((String)localObject2).length() - 1);
    }
    return (String)localObject1;
  }
  
  public String c()
  {
    return this.a;
  }
  
  public int d()
  {
    return this.e;
  }
  
  public ay e()
  {
    return this.f;
  }
  
  public boolean equals(Object paramObject)
  {
    return ((paramObject instanceof al)) && (((al)paramObject).q == this.q);
  }
  
  public String f()
  {
    return this.n;
  }
  
  public String g()
  {
    return this.o;
  }
  
  public String h()
  {
    return this.p;
  }
  
  public int hashCode()
  {
    return this.q;
  }
  
  public String toString()
  {
    Object localObject1 = new StringBuffer();
    ((StringBuffer)localObject1).append(c() + "@");
    Object localObject2 = this.h.c().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      bb localbb = (bb)((Iterator)localObject2).next();
      ((StringBuffer)localObject1).append(localbb.d() + ":");
    }
    localObject2 = ((StringBuffer)localObject1).toString();
    localObject1 = localObject2;
    if (((String)localObject2).endsWith(":")) {
      localObject1 = ((String)localObject2).substring(0, ((String)localObject2).length() - 1);
    }
    return (String)localObject1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */