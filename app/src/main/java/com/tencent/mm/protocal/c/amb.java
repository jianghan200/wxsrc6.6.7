package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class amb
  extends com.tencent.mm.bk.a
{
  public int hcE;
  public int lOH;
  public long rON;
  public bhy rfy;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rfy == null) {
        throw new b("Not all required fields were included: Buffer");
      }
      paramVarArgs.T(1, this.rON);
      paramVarArgs.fT(2, this.lOH);
      if (this.rfy != null)
      {
        paramVarArgs.fV(3, this.rfy.boi());
        this.rfy.a(paramVarArgs);
      }
      paramVarArgs.fT(4, this.hcE);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.S(1, this.rON) + 0 + f.a.a.a.fQ(2, this.lOH);
      paramInt = i;
      if (this.rfy != null) {
        paramInt = i + f.a.a.a.fS(3, this.rfy.boi());
      }
      return paramInt + f.a.a.a.fQ(4, this.hcE);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.rfy == null) {
        throw new b("Not all required fields were included: Buffer");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      amb localamb = (amb)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localamb.rON = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 2: 
        localamb.lOH = ((f.a.a.a.a)localObject1).vHC.rY();
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
          localamb.rfy = ((bhy)localObject1);
          paramInt += 1;
        }
        return 0;
      }
      localamb.hcE = ((f.a.a.a.a)localObject1).vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/amb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */