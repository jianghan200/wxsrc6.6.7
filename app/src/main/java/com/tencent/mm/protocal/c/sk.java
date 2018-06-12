package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class sk
  extends bhd
{
  public int hcE;
  public int rjC;
  public ayv rvL;
  public int rvM;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rvL == null) {
        throw new b("Not all required fields were included: Package");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.rvL != null)
      {
        paramVarArgs.fV(2, this.rvL.boi());
        this.rvL.a(paramVarArgs);
      }
      paramVarArgs.fT(3, this.rjC);
      paramVarArgs.fT(4, this.rvM);
      paramVarArgs.fT(5, this.hcE);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label563;
      }
    }
    label563:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rvL != null) {
        i = paramInt + f.a.a.a.fS(2, this.rvL.boi());
      }
      return i + f.a.a.a.fQ(3, this.rjC) + f.a.a.a.fQ(4, this.rvM) + f.a.a.a.fQ(5, this.hcE);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rvL != null) {
          break;
        }
        throw new b("Not all required fields were included: Package");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        sk localsk = (sk)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localsk.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ayv();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ayv)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localsk.rvL = ((ayv)localObject1);
            paramInt += 1;
          }
        case 3: 
          localsk.rjC = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localsk.rvM = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localsk.hcE = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/sk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */