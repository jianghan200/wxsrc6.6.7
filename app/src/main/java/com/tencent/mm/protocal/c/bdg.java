package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bdg
  extends bhp
{
  public String bWP;
  public int huV;
  public int hwV;
  public String hwW;
  public String hwg;
  public String qYy;
  public btd rHg;
  public bhw rPi;
  public long rPl;
  public long ruW;
  
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
      if (this.qYy != null) {
        paramVarArgs.g(4, this.qYy);
      }
      paramVarArgs.T(5, this.rPl);
      paramVarArgs.T(6, this.ruW);
      if (this.rPi != null)
      {
        paramVarArgs.fV(7, this.rPi.boi());
        this.rPi.a(paramVarArgs);
      }
      if (this.rHg != null)
      {
        paramVarArgs.fV(8, this.rHg.boi());
        this.rHg.a(paramVarArgs);
      }
      if (this.hwg != null) {
        paramVarArgs.g(9, this.hwg);
      }
      paramVarArgs.fT(10, this.huV);
      if (this.bWP != null) {
        paramVarArgs.g(11, this.bWP);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label987;
      }
    }
    label987:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hwV);
      paramInt = i;
      if (this.hwW != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.hwW);
      }
      i = paramInt;
      if (this.qYy != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.qYy);
      }
      i = i + f.a.a.a.S(5, this.rPl) + f.a.a.a.S(6, this.ruW);
      paramInt = i;
      if (this.rPi != null) {
        paramInt = i + f.a.a.a.fS(7, this.rPi.boi());
      }
      i = paramInt;
      if (this.rHg != null) {
        i = paramInt + f.a.a.a.fS(8, this.rHg.boi());
      }
      paramInt = i;
      if (this.hwg != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.hwg);
      }
      i = paramInt + f.a.a.a.fQ(10, this.huV);
      paramInt = i;
      if (this.bWP != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.bWP);
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
        bdg localbdg = (bdg)paramVarArgs[1];
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
            localbdg.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbdg.hwV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbdg.hwW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localbdg.qYy = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localbdg.rPl = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 6: 
          localbdg.ruW = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhw();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhw)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbdg.rPi = ((bhw)localObject1);
            paramInt += 1;
          }
        case 8: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new btd();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((btd)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbdg.rHg = ((btd)localObject1);
            paramInt += 1;
          }
        case 9: 
          localbdg.hwg = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localbdg.huV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localbdg.bWP = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/bdg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */