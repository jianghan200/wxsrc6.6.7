package com.tencent.mm.kernel.a.b;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import junit.framework.Assert;

public final class a
{
  private static ThreadLocal<Stack<b>> dse = new ThreadLocal();
  
  static b EC()
  {
    return (b)((Stack)dse.get()).pop();
  }
  
  public static a a(Object paramObject, Class paramClass)
  {
    b localb = (b)((Stack)dse.get()).peek();
    Assert.assertNotNull(localb);
    if (localb.dsh == null) {
      localb.dsh = new HashMap();
    }
    a locala2 = (a)localb.dsh.get(paramClass);
    a locala1 = locala2;
    if (locala2 == null)
    {
      locala1 = new a(paramObject, paramClass);
      localb.dsh.put(locala1.dsf, locala1);
    }
    return locala1;
  }
  
  static void start()
  {
    b localb = new b();
    Stack localStack2 = (Stack)dse.get();
    Stack localStack1 = localStack2;
    if (localStack2 == null)
    {
      localStack1 = new Stack();
      dse.set(localStack1);
    }
    localStack1.push(localb);
  }
  
  public static final class a
  {
    Object dsb;
    Class dsf;
    Set dsg = new HashSet();
    
    a(Object paramObject, Class paramClass)
    {
      this.dsb = paramObject;
      if (paramClass != null) {
        this.dsf = paramClass;
      }
      aM(this.dsb);
    }
    
    private void aM(Object paramObject)
    {
      Assert.assertNotNull(paramObject);
      Assert.assertNotNull(this.dsf);
      if (!this.dsf.isInstance(paramObject)) {
        throw new IllegalArgumentException("Your depend object " + paramObject + " must implement your type " + this.dsf);
      }
    }
    
    public final a aN(Object paramObject)
    {
      this.dsg.add(paramObject);
      aM(paramObject);
      return this;
    }
  }
  
  static final class b
  {
    public HashMap<Class, a.a> dsh = null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/kernel/a/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */