package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class sr
  extends bhp
{
  public int rci;
  public long rcq;
  public String rdo;
  public int rgC;
  public int rjC;
  public bhy rtW;
  public int rvV;
  public int rvX;
  public int rvY;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rtW == null) {
        throw new b("Not all required fields were included: Data");
      }
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      paramVarArgs.fT(1, this.rci);
      paramVarArgs.fT(2, this.rjC);
      paramVarArgs.fT(3, this.rvV);
      paramVarArgs.fT(5, this.rvX);
      if (this.rdo != null) {
        paramVarArgs.g(6, this.rdo);
      }
      if (this.rtW != null)
      {
        paramVarArgs.fV(7, this.rtW.boi());
        this.rtW.a(paramVarArgs);
      }
      paramVarArgs.fT(8, this.rgC);
      if (this.six != null)
      {
        paramVarArgs.fV(9, this.six.boi());
        this.six.a(paramVarArgs);
      }
      paramVarArgs.fT(10, this.rvY);
      paramVarArgs.T(11, this.rcq);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.fQ(1, this.rci) + 0 + f.a.a.a.fQ(2, this.rjC) + f.a.a.a.fQ(3, this.rvV) + f.a.a.a.fQ(5, this.rvX);
      paramInt = i;
      if (this.rdo != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rdo);
      }
      i = paramInt;
      if (this.rtW != null) {
        i = paramInt + f.a.a.a.fS(7, this.rtW.boi());
      }
      i += f.a.a.a.fQ(8, this.rgC);
      paramInt = i;
      if (this.six != null) {
        paramInt = i + f.a.a.a.fS(9, this.six.boi());
      }
      return paramInt + f.a.a.a.fQ(10, this.rvY) + f.a.a.a.S(11, this.rcq);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.rtW == null) {
        throw new b("Not all required fields were included: Data");
      }
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      sr localsr = (sr)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 4: 
      default: 
        return -1;
      case 1: 
        localsr.rci = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localsr.rjC = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 3: 
        localsr.rvV = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 5: 
        localsr.rvX = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 6: 
        localsr.rdo = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 7: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          localsr.rtW = ((bhy)localObject1);
          paramInt += 1;
        }
        return 0;
      case 8: 
        localsr.rgC = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 9: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new fl();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          localsr.six = ((fl)localObject1);
          paramInt += 1;
        }
        return 0;
      case 10: 
        localsr.rvY = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      localsr.rcq = ((f.a.a.a.a)localObject1).vHC.rZ();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/sr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */