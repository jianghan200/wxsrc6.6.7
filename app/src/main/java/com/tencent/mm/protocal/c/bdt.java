package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bdt
  extends bhp
{
  public int amount;
  public int hUm;
  public String hUn;
  public String jyK;
  public String muC;
  public String muD;
  public String sfU;
  public int sfV;
  public String sfW;
  public String sfX;
  public String sfY;
  public String sfZ;
  public int state;
  
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
      paramVarArgs.fT(2, this.hUm);
      if (this.hUn != null) {
        paramVarArgs.g(3, this.hUn);
      }
      paramVarArgs.fT(4, this.state);
      if (this.sfU != null) {
        paramVarArgs.g(5, this.sfU);
      }
      paramVarArgs.fT(6, this.amount);
      paramVarArgs.fT(7, this.sfV);
      if (this.muC != null) {
        paramVarArgs.g(8, this.muC);
      }
      if (this.sfW != null) {
        paramVarArgs.g(9, this.sfW);
      }
      if (this.muD != null) {
        paramVarArgs.g(10, this.muD);
      }
      if (this.sfX != null) {
        paramVarArgs.g(11, this.sfX);
      }
      if (this.sfY != null) {
        paramVarArgs.g(12, this.sfY);
      }
      if (this.sfZ != null) {
        paramVarArgs.g(14, this.sfZ);
      }
      if (this.jyK != null) {
        paramVarArgs.g(15, this.jyK);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label976;
      }
    }
    label976:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hUm);
      paramInt = i;
      if (this.hUn != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.hUn);
      }
      i = paramInt + f.a.a.a.fQ(4, this.state);
      paramInt = i;
      if (this.sfU != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.sfU);
      }
      i = paramInt + f.a.a.a.fQ(6, this.amount) + f.a.a.a.fQ(7, this.sfV);
      paramInt = i;
      if (this.muC != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.muC);
      }
      i = paramInt;
      if (this.sfW != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.sfW);
      }
      paramInt = i;
      if (this.muD != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.muD);
      }
      i = paramInt;
      if (this.sfX != null) {
        i = paramInt + f.a.a.b.b.a.h(11, this.sfX);
      }
      paramInt = i;
      if (this.sfY != null) {
        paramInt = i + f.a.a.b.b.a.h(12, this.sfY);
      }
      i = paramInt;
      if (this.sfZ != null) {
        i = paramInt + f.a.a.b.b.a.h(14, this.sfZ);
      }
      paramInt = i;
      if (this.jyK != null) {
        paramInt = i + f.a.a.b.b.a.h(15, this.jyK);
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
        bdt localbdt = (bdt)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        case 13: 
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
            localbdt.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbdt.hUm = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbdt.hUn = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localbdt.state = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localbdt.sfU = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localbdt.amount = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbdt.sfV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localbdt.muC = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localbdt.sfW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localbdt.muD = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 11: 
          localbdt.sfX = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 12: 
          localbdt.sfY = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 14: 
          localbdt.sfZ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbdt.jyK = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/bdt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */