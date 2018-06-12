package com.google.android.gms.c;

import com.google.android.gms.common.internal.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class ae
{
  public final v aFC;
  public final ag aXY;
  public boolean aXZ;
  public long aYa;
  public long aYb;
  public long aYc;
  private long aYd;
  private long aYe;
  public boolean aYf;
  final Map<Class<? extends af>, af> aYg;
  final List<ai> aYh;
  
  private ae(ae paramae)
  {
    this.aXY = paramae.aXY;
    this.aFC = paramae.aFC;
    this.aYa = paramae.aYa;
    this.aYb = paramae.aYb;
    this.aYc = paramae.aYc;
    this.aYd = paramae.aYd;
    this.aYe = paramae.aYe;
    this.aYh = new ArrayList(paramae.aYh);
    this.aYg = new HashMap(paramae.aYg.size());
    paramae = paramae.aYg.entrySet().iterator();
    while (paramae.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramae.next();
      af localaf = f((Class)localEntry.getKey());
      ((af)localEntry.getValue()).a(localaf);
      this.aYg.put(localEntry.getKey(), localaf);
    }
  }
  
  ae(ag paramag, v paramv)
  {
    w.ah(paramag);
    w.ah(paramv);
    this.aXY = paramag;
    this.aFC = paramv;
    this.aYd = 1800000L;
    this.aYe = 3024000000L;
    this.aYg = new HashMap();
    this.aYh = new ArrayList();
  }
  
  private static <T extends af> T f(Class<T> paramClass)
  {
    try
    {
      paramClass = (af)paramClass.newInstance();
      return paramClass;
    }
    catch (InstantiationException paramClass)
    {
      throw new IllegalArgumentException("dataType doesn't have default constructor", paramClass);
    }
    catch (IllegalAccessException paramClass)
    {
      throw new IllegalArgumentException("dataType default constructor is not accessible", paramClass);
    }
  }
  
  public final void b(af paramaf)
  {
    w.ah(paramaf);
    Class localClass = paramaf.getClass();
    if (localClass.getSuperclass() != af.class) {
      throw new IllegalArgumentException();
    }
    paramaf.a(e(localClass));
  }
  
  public final <T extends af> T d(Class<T> paramClass)
  {
    return (af)this.aYg.get(paramClass);
  }
  
  public final <T extends af> T e(Class<T> paramClass)
  {
    af localaf2 = (af)this.aYg.get(paramClass);
    af localaf1 = localaf2;
    if (localaf2 == null)
    {
      localaf1 = f(paramClass);
      this.aYg.put(paramClass, localaf1);
    }
    return localaf1;
  }
  
  public final ae ql()
  {
    return new ae(this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/gms/c/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */