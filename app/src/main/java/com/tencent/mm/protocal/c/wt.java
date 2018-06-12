package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class wt
  extends com.tencent.mm.bk.a
  implements bnu
{
  public int rfn;
  public int rlm;
  public pn rnB;
  public bhy rny;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rnB == null) {
        throw new b("Not all required fields were included: CmdList");
      }
      if (this.rny == null) {
        throw new b("Not all required fields were included: KeyBuf");
      }
      paramVarArgs.fT(1, this.rfn);
      if (this.rnB != null)
      {
        paramVarArgs.fV(2, this.rnB.boi());
        this.rnB.a(paramVarArgs);
      }
      if (this.rny != null)
      {
        paramVarArgs.fV(3, this.rny.boi());
        this.rny.a(paramVarArgs);
      }
      paramVarArgs.fT(4, this.rlm);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.fQ(1, this.rfn) + 0;
      paramInt = i;
      if (this.rnB != null) {
        paramInt = i + f.a.a.a.fS(2, this.rnB.boi());
      }
      i = paramInt;
      if (this.rny != null) {
        i = paramInt + f.a.a.a.fS(3, this.rny.boi());
      }
      return i + f.a.a.a.fQ(4, this.rlm);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.rnB == null) {
        throw new b("Not all required fields were included: CmdList");
      }
      if (this.rny == null) {
        throw new b("Not all required fields were included: KeyBuf");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      wt localwt = (wt)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localwt.rfn = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new pn();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((pn)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localwt.rnB = ((pn)localObject1);
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
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localwt.rny = ((bhy)localObject1);
          paramInt += 1;
        }
        return 0;
      }
      localwt.rlm = ((f.a.a.a.a)localObject1).vHC.rY();
      return 0;
    }
    return -1;
  }
  
  public final int getRet()
  {
    return this.rfn;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/wt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */