package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bit
  extends bhp
{
  public String dxK;
  public LinkedList<awp> rZJ = new LinkedList();
  public String rZK;
  public boolean rZL;
  public boolean rZM;
  public boolean rZN;
  public String rqU;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      paramVarArgs.d(3, 8, this.rZJ);
      if (this.dxK != null) {
        paramVarArgs.g(4, this.dxK);
      }
      if (this.rZK != null) {
        paramVarArgs.g(5, this.rZK);
      }
      if (this.rqU != null) {
        paramVarArgs.g(6, this.rqU);
      }
      paramVarArgs.av(8, this.rZL);
      paramVarArgs.av(9, this.rZM);
      paramVarArgs.av(10, this.rZN);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label715;
      }
    }
    label715:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.c(3, 8, this.rZJ);
      paramInt = i;
      if (this.dxK != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.dxK);
      }
      i = paramInt;
      if (this.rZK != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rZK);
      }
      paramInt = i;
      if (this.rqU != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rqU);
      }
      return paramInt + (f.a.a.b.b.a.ec(8) + 1) + (f.a.a.b.b.a.ec(9) + 1) + (f.a.a.b.b.a.ec(10) + 1);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rZJ.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six != null) {
          break;
        }
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bit localbit = (bit)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 2: 
        case 7: 
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbit.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new awp();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((awp)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbit.rZJ.add(localObject1);
            paramInt += 1;
          }
        case 4: 
          localbit.dxK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localbit.rZK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localbit.rqU = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localbit.rZL = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 9: 
          localbit.rZM = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        }
        localbit.rZN = ((f.a.a.a.a)localObject1).cJQ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/bit.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */