package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class sq
  extends bhd
{
  public int rci;
  public long rcq;
  public String rdo;
  public int rjC;
  public int rvV;
  public long rvW;
  public String rvj;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rci);
      paramVarArgs.fT(2, this.rjC);
      paramVarArgs.fT(3, this.rvV);
      if (this.rdo != null) {
        paramVarArgs.g(4, this.rdo);
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(5, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      paramVarArgs.T(6, this.rcq);
      if (this.rvj != null) {
        paramVarArgs.g(7, this.rvj);
      }
      paramVarArgs.T(8, this.rvW);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.fQ(1, this.rci) + 0 + f.a.a.a.fQ(2, this.rjC) + f.a.a.a.fQ(3, this.rvV);
      paramInt = i;
      if (this.rdo != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rdo);
      }
      i = paramInt;
      if (this.shX != null) {
        i = paramInt + f.a.a.a.fS(5, this.shX.boi());
      }
      i += f.a.a.a.S(6, this.rcq);
      paramInt = i;
      if (this.rvj != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.rvj);
      }
      return paramInt + f.a.a.a.S(8, this.rvW);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      sq localsq = (sq)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localsq.rci = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localsq.rjC = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 3: 
        localsq.rvV = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 4: 
        localsq.rdo = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 5: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new fk();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
          localsq.shX = ((fk)localObject1);
          paramInt += 1;
        }
        return 0;
      case 6: 
        localsq.rcq = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 7: 
        localsq.rvj = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      localsq.rvW = ((f.a.a.a.a)localObject1).vHC.rZ();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/sq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */