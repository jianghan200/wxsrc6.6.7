package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class awx
  extends bhp
{
  public int balance;
  public int hwV;
  public String hwW;
  public arq rZU;
  public int rZV;
  public int rZW;
  public int rZX;
  public LinkedList<sj> rZY = new LinkedList();
  
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
      paramVarArgs.fT(2, this.hwV);
      if (this.hwW != null) {
        paramVarArgs.g(3, this.hwW);
      }
      paramVarArgs.fT(4, this.balance);
      paramVarArgs.fT(5, this.rZV);
      paramVarArgs.fT(6, this.rZW);
      paramVarArgs.fT(7, this.rZX);
      paramVarArgs.d(8, 8, this.rZY);
      if (this.rZU != null)
      {
        paramVarArgs.fV(9, this.rZU.boi());
        this.rZU.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label837;
      }
    }
    label837:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hwV);
      paramInt = i;
      if (this.hwW != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.hwW);
      }
      i = paramInt + f.a.a.a.fQ(4, this.balance) + f.a.a.a.fQ(5, this.rZV) + f.a.a.a.fQ(6, this.rZW) + f.a.a.a.fQ(7, this.rZX) + f.a.a.a.c(8, 8, this.rZY);
      paramInt = i;
      if (this.rZU != null) {
        paramInt = i + f.a.a.a.fS(9, this.rZU.boi());
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rZY.clear();
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
        awx localawx = (awx)paramVarArgs[1];
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
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localawx.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localawx.hwV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localawx.hwW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localawx.balance = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localawx.rZV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localawx.rZW = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localawx.rZX = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new sj();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((sj)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localawx.rZY.add(localObject1);
            paramInt += 1;
          }
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new arq();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((arq)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          localawx.rZU = ((arq)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/awx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */