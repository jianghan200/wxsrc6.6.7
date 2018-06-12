package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class awe
  extends com.tencent.mm.bk.a
{
  public int hcd;
  public int rZx;
  public int rZy;
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
      paramVarArgs.fT(3, this.rlm);
      if (this.rny != null)
      {
        paramVarArgs.fV(4, this.rny.boi());
        this.rny.a(paramVarArgs);
      }
      paramVarArgs.fT(5, this.hcd);
      paramVarArgs.fT(6, this.rZx);
      paramVarArgs.fT(7, this.rZy);
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
      i = paramInt + f.a.a.a.fQ(3, this.rlm);
      paramInt = i;
      if (this.rny != null) {
        paramInt = i + f.a.a.a.fS(4, this.rny.boi());
      }
      return paramInt + f.a.a.a.fQ(5, this.hcd) + f.a.a.a.fQ(6, this.rZx) + f.a.a.a.fQ(7, this.rZy);
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
      awe localawe = (awe)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localawe.rfn = ((f.a.a.a.a)localObject1).vHC.rY();
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
          localawe.rnB = ((pn)localObject1);
          paramInt += 1;
        }
        return 0;
      case 3: 
        localawe.rlm = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 4: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localawe.rny = ((bhy)localObject1);
          paramInt += 1;
        }
        return 0;
      case 5: 
        localawe.hcd = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 6: 
        localawe.rZx = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      localawe.rZy = ((f.a.a.a.a)localObject1).vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/awe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */