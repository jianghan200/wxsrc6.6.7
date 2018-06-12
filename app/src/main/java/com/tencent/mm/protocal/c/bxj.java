package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bxj
  extends com.tencent.mm.bk.a
{
  public int bzI;
  public String jOS;
  public bhy stO;
  public bhy stP;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.stO == null) {
        throw new b("Not all required fields were included: Icon");
      }
      if (this.stP == null) {
        throw new b("Not all required fields were included: HDIcon");
      }
      paramVarArgs.fT(1, this.bzI);
      if (this.jOS != null) {
        paramVarArgs.g(2, this.jOS);
      }
      if (this.stO != null)
      {
        paramVarArgs.fV(3, this.stO.boi());
        this.stO.a(paramVarArgs);
      }
      if (this.stP != null)
      {
        paramVarArgs.fV(4, this.stP.boi());
        this.stP.a(paramVarArgs);
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
      i = f.a.a.a.fQ(1, this.bzI) + 0;
      paramInt = i;
      if (this.jOS != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jOS);
      }
      i = paramInt;
      if (this.stO != null) {
        i = paramInt + f.a.a.a.fS(3, this.stO.boi());
      }
      paramInt = i;
    } while (this.stP == null);
    return i + f.a.a.a.fS(4, this.stP.boi());
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.stO == null) {
        throw new b("Not all required fields were included: Icon");
      }
      if (this.stP == null) {
        throw new b("Not all required fields were included: HDIcon");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      bxj localbxj = (bxj)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localbxj.bzI = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localbxj.jOS = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 3: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localbxj.stO = ((bhy)localObject1);
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
        localObject1 = new bhy();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localbxj.stP = ((bhy)localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/bxj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */