package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class aei
  extends com.tencent.mm.bk.a
{
  public int rIr;
  public int rfn;
  public alx rgS;
  public String rwj;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rfn);
      if (this.rgS != null)
      {
        paramVarArgs.fV(2, this.rgS.boi());
        this.rgS.a(paramVarArgs);
      }
      if (this.rwj != null) {
        paramVarArgs.g(3, this.rwj);
      }
      paramVarArgs.fT(4, this.rIr);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.fQ(1, this.rfn) + 0;
      paramInt = i;
      if (this.rgS != null) {
        paramInt = i + f.a.a.a.fS(2, this.rgS.boi());
      }
      i = paramInt;
      if (this.rwj != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rwj);
      }
      return i + f.a.a.a.fQ(4, this.rIr);
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
      aei localaei = (aei)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localaei.rfn = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new alx();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((alx)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localaei.rgS = ((alx)localObject1);
          paramInt += 1;
        }
        return 0;
      case 3: 
        localaei.rwj = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      localaei.rIr = ((f.a.a.a.a)localObject1).vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/aei.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */