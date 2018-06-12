package com.tencent.tencentmap.mapsdk.a;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;

public class gp
{
  int a;
  go b;
  go c;
  Interpolator d;
  ArrayList<go> e;
  gt f;
  
  public gp(go... paramVarArgs)
  {
    this.a = paramVarArgs.length;
    this.e = new ArrayList();
    this.e.addAll(Arrays.asList(paramVarArgs));
    this.b = ((go)this.e.get(0));
    this.c = ((go)this.e.get(this.a - 1));
    this.d = this.c.c();
  }
  
  public static gp a(double... paramVarArgs)
  {
    int i = 1;
    int j = paramVarArgs.length;
    go.a[] arrayOfa = new go.a[Math.max(j, 2)];
    if (j == 1)
    {
      arrayOfa[0] = ((go.a)go.a(0.0F));
      arrayOfa[1] = ((go.a)go.a(1.0F, paramVarArgs[0]));
    }
    for (;;)
    {
      return new gk(arrayOfa);
      arrayOfa[0] = ((go.a)go.a(0.0F, paramVarArgs[0]));
      while (i < j)
      {
        arrayOfa[i] = ((go.a)go.a(i / (j - 1), paramVarArgs[i]));
        i += 1;
      }
    }
  }
  
  public static gp a(Object... paramVarArgs)
  {
    int i = 1;
    int j = paramVarArgs.length;
    go.b[] arrayOfb = new go.b[Math.max(j, 2)];
    if (j == 1)
    {
      arrayOfb[0] = ((go.b)go.b(0.0F));
      arrayOfb[1] = ((go.b)go.a(1.0F, paramVarArgs[0]));
    }
    for (;;)
    {
      return new gp(arrayOfb);
      arrayOfb[0] = ((go.b)go.a(0.0F, paramVarArgs[0]));
      while (i < j)
      {
        arrayOfb[i] = ((go.b)go.a(i / (j - 1), paramVarArgs[i]));
        i += 1;
      }
    }
  }
  
  public void a(gt paramgt)
  {
    this.f = paramgt;
  }
  
  public gp b()
  {
    ArrayList localArrayList = this.e;
    int j = this.e.size();
    go[] arrayOfgo = new go[j];
    int i = 0;
    while (i < j)
    {
      arrayOfgo[i] = ((go)localArrayList.get(i)).d();
      i += 1;
    }
    return new gp(arrayOfgo);
  }
  
  public String toString()
  {
    String str = " ";
    int i = 0;
    while (i < this.a)
    {
      str = str + ((go)this.e.get(i)).a() + "  ";
      i += 1;
    }
    return str;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/gp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */