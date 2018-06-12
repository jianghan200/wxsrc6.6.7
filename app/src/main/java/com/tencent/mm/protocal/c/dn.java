package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class dn
  extends com.tencent.mm.bk.a
{
  public int rdH;
  public int rdI;
  public int rdP;
  public do rdQ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rdH);
      paramVarArgs.fT(2, this.rdI);
      paramVarArgs.fT(3, this.rdP);
      if (this.rdQ != null)
      {
        paramVarArgs.fV(4, this.rdQ.boi());
        this.rdQ.a(paramVarArgs);
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
      i = f.a.a.a.fQ(1, this.rdH) + 0 + f.a.a.a.fQ(2, this.rdI) + f.a.a.a.fQ(3, this.rdP);
      paramInt = i;
    } while (this.rdQ == null);
    return i + f.a.a.a.fS(4, this.rdQ.boi());
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
      dn localdn = (dn)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localdn.rdH = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localdn.rdI = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 3: 
        localdn.rdP = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new do();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((do)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localdn.rdQ = ((do)localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/dn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */