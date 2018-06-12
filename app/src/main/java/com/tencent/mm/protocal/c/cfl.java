package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class cfl
  extends com.tencent.mm.bk.a
{
  public String iwP;
  public int otY;
  public String rEx;
  public int rUH;
  public aqs rUI;
  public long rll;
  public LinkedList<String> szV = new LinkedList();
  public LinkedList<ps> szW = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 1, this.szV);
      paramVarArgs.fT(2, this.rUH);
      if (this.iwP != null) {
        paramVarArgs.g(3, this.iwP);
      }
      paramVarArgs.fT(4, this.otY);
      paramVarArgs.T(5, this.rll);
      if (this.rEx != null) {
        paramVarArgs.g(6, this.rEx);
      }
      if (this.rUI != null)
      {
        paramVarArgs.fV(7, this.rUI.boi());
        this.rUI.a(paramVarArgs);
      }
      paramVarArgs.d(8, 8, this.szW);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.c(1, 1, this.szV) + 0 + f.a.a.a.fQ(2, this.rUH);
      paramInt = i;
      if (this.iwP != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.iwP);
      }
      i = paramInt + f.a.a.a.fQ(4, this.otY) + f.a.a.a.S(5, this.rll);
      paramInt = i;
      if (this.rEx != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rEx);
      }
      i = paramInt;
      if (this.rUI != null) {
        i = paramInt + f.a.a.a.fS(7, this.rUI.boi());
      }
      return i + f.a.a.a.c(8, 8, this.szW);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.szV.clear();
      this.szW.clear();
      paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      cfl localcfl = (cfl)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localcfl.szV.add(((f.a.a.a.a)localObject1).vHC.readString());
        return 0;
      case 2: 
        localcfl.rUH = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 3: 
        localcfl.iwP = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 4: 
        localcfl.otY = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 5: 
        localcfl.rll = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 6: 
        localcfl.rEx = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 7: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aqs();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aqs)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localcfl.rUI = ((aqs)localObject1);
          paramInt += 1;
        }
        return 0;
      }
      paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new ps();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((ps)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localcfl.szW.add(localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/cfl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */