package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class byw
  extends bhp
{
  public int rxG;
  public long rxH;
  public int suJ;
  public int suP;
  public caf suQ;
  public int suR;
  public int suS;
  public int suT;
  public int suU;
  public bhy suV;
  
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
      paramVarArgs.fT(2, this.rxG);
      paramVarArgs.T(3, this.rxH);
      paramVarArgs.fT(4, this.suP);
      if (this.suQ != null)
      {
        paramVarArgs.fV(5, this.suQ.boi());
        this.suQ.a(paramVarArgs);
      }
      paramVarArgs.fT(6, this.suJ);
      paramVarArgs.fT(7, this.suR);
      paramVarArgs.fT(8, this.suS);
      paramVarArgs.fT(9, this.suT);
      paramVarArgs.fT(10, this.suU);
      if (this.suV != null)
      {
        paramVarArgs.fV(11, this.suV.boi());
        this.suV.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label911;
      }
    }
    label911:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rxG) + f.a.a.a.S(3, this.rxH) + f.a.a.a.fQ(4, this.suP);
      paramInt = i;
      if (this.suQ != null) {
        paramInt = i + f.a.a.a.fS(5, this.suQ.boi());
      }
      i = paramInt + f.a.a.a.fQ(6, this.suJ) + f.a.a.a.fQ(7, this.suR) + f.a.a.a.fQ(8, this.suS) + f.a.a.a.fQ(9, this.suT) + f.a.a.a.fQ(10, this.suU);
      paramInt = i;
      if (this.suV != null) {
        paramInt = i + f.a.a.a.fS(11, this.suV.boi());
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
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
        byw localbyw = (byw)paramVarArgs[1];
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
            localbyw.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbyw.rxG = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbyw.rxH = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 4: 
          localbyw.suP = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new caf();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((caf)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbyw.suQ = ((caf)localObject1);
            paramInt += 1;
          }
        case 6: 
          localbyw.suJ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbyw.suR = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localbyw.suS = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localbyw.suT = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          localbyw.suU = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          localbyw.suV = ((bhy)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/byw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */