package com.tencent.mm.vending.g;

import java.util.Stack;

public final class g
{
  private static final a uRB = new a();
  
  public static final <Var1, Var2, Var3> c<com.tencent.mm.vending.j.d<Var1, Var2, Var3>> a(Var1 paramVar1, Var2 paramVar2, Var3 paramVar3)
  {
    return new e().w(new Object[] { paramVar1, paramVar2, paramVar3 });
  }
  
  public static final <Var1, Var2, Var3, Var4> c<com.tencent.mm.vending.j.e<Var1, Var2, Var3, Var4>> a(Var1 paramVar1, Var2 paramVar2, Var3 paramVar3, Var4 paramVar4)
  {
    return new e().w(new Object[] { paramVar1, paramVar2, paramVar3, paramVar4 });
  }
  
  public static final <Var1, Var2, Var3, Var4, Var5> c<com.tencent.mm.vending.j.f<Var1, Var2, Var3, Var4, Var5>> a(Var1 paramVar1, Var2 paramVar2, Var3 paramVar3, Var4 paramVar4, Var5 paramVar5)
  {
    return new e().w(new Object[] { paramVar1, paramVar2, paramVar3, paramVar4, paramVar5 });
  }
  
  public static final void a(b paramVarArgs)
  {
    if (paramVarArgs == null)
    {
      com.tencent.mm.vending.f.a.w("Vending.QuickAccess", "dummy mario", new Object[0]);
      return;
    }
    paramVarArgs.ct(null);
  }
  
  public static final void a(b paramb, Object... paramVarArgs)
  {
    if (paramb == null)
    {
      com.tencent.mm.vending.f.a.w("Vending.QuickAccess", "dummy mario", new Object[0]);
      return;
    }
    if (paramVarArgs.length > 0)
    {
      paramb.v(paramVarArgs);
      return;
    }
    paramb.resume();
  }
  
  public static final <_Var> void a(d<_Var> paramd)
  {
    b localb = cBL();
    paramd.a(new d.b()
    {
      public final void aF(_Var paramAnonymous_Var)
      {
        g.a(this.dEk, new Object[] { paramAnonymous_Var });
      }
    }).a(new d.a()
    {
      public final void bd(Object paramAnonymousObject)
      {
        this.dEk.ct(paramAnonymousObject);
      }
    });
  }
  
  public static final b cBF()
  {
    Object localObject = f.cBJ();
    Stack localStack = (Stack)((f)localObject).uRA.get();
    if (localStack == null) {
      localObject = null;
    }
    while (localObject != null)
    {
      return ((c)localObject).cBF();
      if (localStack.size() == 0) {
        localObject = null;
      } else {
        localObject = (c)((Stack)((f)localObject).uRA.get()).peek();
      }
    }
    return uRB;
  }
  
  public static final c<Void> cBK()
  {
    return new e().w(new Object[0]);
  }
  
  public static final b cBL()
  {
    b localb = cBF();
    if (localb != null)
    {
      localb.cBE();
      return localb;
    }
    com.tencent.mm.vending.f.a.w("Vending.QuickAccess", "dummy mario", new Object[0]);
    return localb;
  }
  
  public static final <Var1> c<Var1> cx(Var1 paramVar1)
  {
    return new e().w(new Object[] { paramVar1 });
  }
  
  public static <$1> com.tencent.mm.vending.j.b<$1> cy($1 param$1)
  {
    new com.tencent.mm.vending.j.b();
    return com.tencent.mm.vending.j.b.cz(param$1);
  }
  
  public static final <Var1, Var2> c<com.tencent.mm.vending.j.c<Var1, Var2>> v(Var1 paramVar1, Var2 paramVar2)
  {
    return new e().w(new Object[] { paramVar1, paramVar2 });
  }
  
  public static <$1, $2> com.tencent.mm.vending.j.c<$1, $2> w($1 param$1, $2 param$2)
  {
    new com.tencent.mm.vending.j.c();
    return com.tencent.mm.vending.j.c.x(param$1, param$2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/vending/g/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */