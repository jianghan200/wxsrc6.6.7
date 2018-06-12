package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class boi
  extends com.tencent.mm.bk.a
{
  public String rcc;
  public long rlK;
  public long smn;
  public boh smo;
  public boh smp;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.smo == null) {
        throw new b("Not all required fields were included: CurrentAction");
      }
      paramVarArgs.T(1, this.rlK);
      paramVarArgs.T(2, this.smn);
      if (this.smo != null)
      {
        paramVarArgs.fV(3, this.smo.boi());
        this.smo.a(paramVarArgs);
      }
      if (this.smp != null)
      {
        paramVarArgs.fV(4, this.smp.boi());
        this.smp.a(paramVarArgs);
      }
      if (this.rcc != null) {
        paramVarArgs.g(5, this.rcc);
      }
      paramInt = 0;
    }
    int i;
    do
    {
      return paramInt;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.S(1, this.rlK) + 0 + f.a.a.a.S(2, this.smn);
      paramInt = i;
      if (this.smo != null) {
        paramInt = i + f.a.a.a.fS(3, this.smo.boi());
      }
      i = paramInt;
      if (this.smp != null) {
        i = paramInt + f.a.a.a.fS(4, this.smp.boi());
      }
      paramInt = i;
    } while (this.rcc == null);
    return i + f.a.a.b.b.a.h(5, this.rcc);
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.smo == null) {
        throw new b("Not all required fields were included: CurrentAction");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      boi localboi = (boi)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localboi.rlK = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 2: 
        localboi.smn = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 3: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new boh();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((boh)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localboi.smo = ((boh)localObject1);
          paramInt += 1;
        }
        return 0;
      case 4: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new boh();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((boh)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localboi.smp = ((boh)localObject1);
          paramInt += 1;
        }
        return 0;
      }
      localboi.rcc = ((f.a.a.a.a)localObject1).vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/boi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */