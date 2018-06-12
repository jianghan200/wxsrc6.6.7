package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bft
  extends bhp
{
  public int hwV;
  public String hwW;
  public String knE;
  public String lNU;
  public int sdC;
  public boolean sgR;
  public boolean sgS;
  public String sgT;
  public String sgU;
  public String sgV;
  public int status;
  
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
      paramVarArgs.av(4, this.sgR);
      paramVarArgs.av(5, this.sgS);
      paramVarArgs.fT(6, this.status);
      if (this.sgT != null) {
        paramVarArgs.g(7, this.sgT);
      }
      if (this.sgU != null) {
        paramVarArgs.g(8, this.sgU);
      }
      paramVarArgs.fT(9, this.sdC);
      if (this.knE != null) {
        paramVarArgs.g(10, this.knE);
      }
      if (this.lNU != null) {
        paramVarArgs.g(11, this.lNU);
      }
      if (this.sgV != null) {
        paramVarArgs.g(12, this.sgV);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label832;
      }
    }
    label832:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hwV);
      paramInt = i;
      if (this.hwW != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.hwW);
      }
      i = paramInt + (f.a.a.b.b.a.ec(4) + 1) + (f.a.a.b.b.a.ec(5) + 1) + f.a.a.a.fQ(6, this.status);
      paramInt = i;
      if (this.sgT != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.sgT);
      }
      i = paramInt;
      if (this.sgU != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.sgU);
      }
      i += f.a.a.a.fQ(9, this.sdC);
      paramInt = i;
      if (this.knE != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.knE);
      }
      i = paramInt;
      if (this.lNU != null) {
        i = paramInt + f.a.a.b.b.a.h(11, this.lNU);
      }
      paramInt = i;
      if (this.sgV != null) {
        paramInt = i + f.a.a.b.b.a.h(12, this.sgV);
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
        bft localbft = (bft)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
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
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbft.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbft.hwV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbft.hwW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localbft.sgR = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 5: 
          localbft.sgS = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 6: 
          localbft.status = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbft.sgT = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localbft.sgU = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localbft.sdC = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          localbft.knE = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 11: 
          localbft.lNU = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbft.sgV = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/bft.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */