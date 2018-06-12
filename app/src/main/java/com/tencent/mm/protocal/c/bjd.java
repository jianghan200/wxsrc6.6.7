package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bjd
  extends com.tencent.mm.bk.a
{
  public bhy rHj;
  public String rHk;
  public long rHm;
  public int rgA;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rHk == null) {
        throw new b("Not all required fields were included: KeyWord");
      }
      paramVarArgs.fT(1, this.rgA);
      if (this.rHk != null) {
        paramVarArgs.g(2, this.rHk);
      }
      if (this.rHj != null)
      {
        paramVarArgs.fV(3, this.rHj.boi());
        this.rHj.a(paramVarArgs);
      }
      paramVarArgs.T(4, this.rHm);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.fQ(1, this.rgA) + 0;
      paramInt = i;
      if (this.rHk != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rHk);
      }
      i = paramInt;
      if (this.rHj != null) {
        i = paramInt + f.a.a.a.fS(3, this.rHj.boi());
      }
      return i + f.a.a.a.S(4, this.rHm);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.rHk == null) {
        throw new b("Not all required fields were included: KeyWord");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      bjd localbjd = (bjd)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localbjd.rgA = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localbjd.rHk = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 3: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localbjd.rHj = ((bhy)localObject1);
          paramInt += 1;
        }
        return 0;
      }
      localbjd.rHm = ((f.a.a.a.a)localObject1).vHC.rZ();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bjd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */