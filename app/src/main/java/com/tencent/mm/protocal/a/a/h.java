package com.tencent.mm.protocal.a.a;

import java.util.LinkedList;

public final class h
  extends com.tencent.mm.bk.a
{
  public int qXC;
  public int qXj;
  public int qXk;
  public o qXl;
  public o qXm;
  public int qXn;
  public int qXo;
  public int ret;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.ret);
      paramVarArgs.fT(2, this.qXj);
      paramVarArgs.fT(3, this.qXk);
      if (this.qXl != null)
      {
        paramVarArgs.fV(4, this.qXl.boi());
        this.qXl.a(paramVarArgs);
      }
      if (this.qXm != null)
      {
        paramVarArgs.fV(5, this.qXm.boi());
        this.qXm.a(paramVarArgs);
      }
      paramVarArgs.fT(6, this.qXn);
      paramVarArgs.fT(7, this.qXC);
      paramVarArgs.fT(8, this.qXo);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.fQ(1, this.ret) + 0 + f.a.a.a.fQ(2, this.qXj) + f.a.a.a.fQ(3, this.qXk);
      paramInt = i;
      if (this.qXl != null) {
        paramInt = i + f.a.a.a.fS(4, this.qXl.boi());
      }
      i = paramInt;
      if (this.qXm != null) {
        i = paramInt + f.a.a.a.fS(5, this.qXm.boi());
      }
      return i + f.a.a.a.fQ(6, this.qXn) + f.a.a.a.fQ(7, this.qXC) + f.a.a.a.fQ(8, this.qXo);
    }
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
      h localh = (h)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localh.ret = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localh.qXj = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 3: 
        localh.qXk = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 4: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new o();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((o)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localh.qXl = ((o)localObject1);
          paramInt += 1;
        }
        return 0;
      case 5: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new o();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((o)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localh.qXm = ((o)localObject1);
          paramInt += 1;
        }
        return 0;
      case 6: 
        localh.qXn = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 7: 
        localh.qXC = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      localh.qXo = ((f.a.a.a.a)localObject1).vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/a/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */