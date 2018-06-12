package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class jz
  extends com.tencent.mm.bk.a
{
  public int hcE;
  public jt rlB;
  public js rlC;
  public long rlD;
  public jy rlE;
  public kb rlF;
  public jx rlG;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.hcE);
      if (this.rlB != null)
      {
        paramVarArgs.fV(2, this.rlB.boi());
        this.rlB.a(paramVarArgs);
      }
      if (this.rlC != null)
      {
        paramVarArgs.fV(3, this.rlC.boi());
        this.rlC.a(paramVarArgs);
      }
      paramVarArgs.T(4, this.rlD);
      if (this.rlE != null)
      {
        paramVarArgs.fV(5, this.rlE.boi());
        this.rlE.a(paramVarArgs);
      }
      if (this.rlF != null)
      {
        paramVarArgs.fV(6, this.rlF.boi());
        this.rlF.a(paramVarArgs);
      }
      if (this.rlG != null)
      {
        paramVarArgs.fV(7, this.rlG.boi());
        this.rlG.a(paramVarArgs);
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
      i = f.a.a.a.fQ(1, this.hcE) + 0;
      paramInt = i;
      if (this.rlB != null) {
        paramInt = i + f.a.a.a.fS(2, this.rlB.boi());
      }
      i = paramInt;
      if (this.rlC != null) {
        i = paramInt + f.a.a.a.fS(3, this.rlC.boi());
      }
      i += f.a.a.a.S(4, this.rlD);
      paramInt = i;
      if (this.rlE != null) {
        paramInt = i + f.a.a.a.fS(5, this.rlE.boi());
      }
      i = paramInt;
      if (this.rlF != null) {
        i = paramInt + f.a.a.a.fS(6, this.rlF.boi());
      }
      paramInt = i;
    } while (this.rlG == null);
    return i + f.a.a.a.fS(7, this.rlG.boi());
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
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
      jz localjz = (jz)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localjz.hcE = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new jt();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((jt)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localjz.rlB = ((jt)localObject1);
          paramInt += 1;
        }
        return 0;
      case 3: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new js();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((js)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localjz.rlC = ((js)localObject1);
          paramInt += 1;
        }
        return 0;
      case 4: 
        localjz.rlD = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 5: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new jy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((jy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localjz.rlE = ((jy)localObject1);
          paramInt += 1;
        }
        return 0;
      case 6: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new kb();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((kb)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localjz.rlF = ((kb)localObject1);
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
        localObject1 = new jx();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((jx)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localjz.rlG = ((jx)localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/jz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */