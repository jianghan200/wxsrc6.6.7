package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class asl
  extends com.tencent.mm.bk.a
{
  public String iwP;
  public int otY;
  public int rUH;
  public aqs rUI;
  public int rUJ;
  public long rUK;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.otY);
      paramVarArgs.fT(2, this.rUH);
      if (this.rUI != null)
      {
        paramVarArgs.fV(3, this.rUI.boi());
        this.rUI.a(paramVarArgs);
      }
      paramVarArgs.fT(4, this.rUJ);
      if (this.iwP != null) {
        paramVarArgs.g(5, this.iwP);
      }
      paramVarArgs.T(6, this.rUK);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.fQ(1, this.otY) + 0 + f.a.a.a.fQ(2, this.rUH);
      paramInt = i;
      if (this.rUI != null) {
        paramInt = i + f.a.a.a.fS(3, this.rUI.boi());
      }
      i = paramInt + f.a.a.a.fQ(4, this.rUJ);
      paramInt = i;
      if (this.iwP != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.iwP);
      }
      return paramInt + f.a.a.a.S(6, this.rUK);
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
      asl localasl = (asl)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localasl.otY = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localasl.rUH = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 3: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aqs();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((aqs)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localasl.rUI = ((aqs)localObject1);
          paramInt += 1;
        }
        return 0;
      case 4: 
        localasl.rUJ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 5: 
        localasl.iwP = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      localasl.rUK = ((f.a.a.a.a)localObject1).vHC.rZ();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/asl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */