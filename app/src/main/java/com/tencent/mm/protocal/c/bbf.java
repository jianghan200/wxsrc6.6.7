package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bbf
  extends com.tencent.mm.bk.a
{
  public int rID;
  public String rIE;
  public String rIF;
  public bue sdt;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rID);
      if (this.rIE != null) {
        paramVarArgs.g(2, this.rIE);
      }
      if (this.rIF != null) {
        paramVarArgs.g(3, this.rIF);
      }
      if (this.sdt != null)
      {
        paramVarArgs.fV(4, this.sdt.boi());
        this.sdt.a(paramVarArgs);
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
      i = f.a.a.a.fQ(1, this.rID) + 0;
      paramInt = i;
      if (this.rIE != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rIE);
      }
      i = paramInt;
      if (this.rIF != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rIF);
      }
      paramInt = i;
    } while (this.sdt == null);
    return i + f.a.a.a.fS(4, this.sdt.boi());
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
      bbf localbbf = (bbf)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localbbf.rID = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localbbf.rIE = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 3: 
        localbbf.rIF = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bue();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((bue)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localbbf.sdt = ((bue)localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/bbf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */