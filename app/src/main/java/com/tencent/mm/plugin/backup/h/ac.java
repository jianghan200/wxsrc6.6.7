package com.tencent.mm.plugin.backup.h;

import java.util.LinkedList;

public final class ac
  extends com.tencent.mm.bk.a
{
  public int hbr;
  public q hcW;
  public p hcX;
  public r hcY;
  public s hcZ;
  public int hcd;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.hbr);
      paramVarArgs.fT(2, this.hcd);
      if (this.hcW != null)
      {
        paramVarArgs.fV(3, this.hcW.boi());
        this.hcW.a(paramVarArgs);
      }
      if (this.hcX != null)
      {
        paramVarArgs.fV(4, this.hcX.boi());
        this.hcX.a(paramVarArgs);
      }
      if (this.hcY != null)
      {
        paramVarArgs.fV(5, this.hcY.boi());
        this.hcY.a(paramVarArgs);
      }
      if (this.hcZ != null)
      {
        paramVarArgs.fV(6, this.hcZ.boi());
        this.hcZ.a(paramVarArgs);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.hbr) + 0 + f.a.a.a.fQ(2, this.hcd);
      paramInt = i;
      if (this.hcW != null) {
        paramInt = i + f.a.a.a.fS(3, this.hcW.boi());
      }
      i = paramInt;
      if (this.hcX != null) {
        i = paramInt + f.a.a.a.fS(4, this.hcX.boi());
      }
      paramInt = i;
      if (this.hcY != null) {
        paramInt = i + f.a.a.a.fS(5, this.hcY.boi());
      }
      i = paramInt;
    } while (this.hcZ == null);
    return paramInt + f.a.a.a.fS(6, this.hcZ.boi());
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
      ac localac = (ac)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localac.hbr = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localac.hcd = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 3: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new q();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((q)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localac.hcW = ((q)localObject1);
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
          localObject1 = new p();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((p)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localac.hcX = ((p)localObject1);
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
          localObject1 = new r();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((r)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localac.hcY = ((r)localObject1);
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
        localObject1 = new s();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((s)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localac.hcZ = ((s)localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/backup/h/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */