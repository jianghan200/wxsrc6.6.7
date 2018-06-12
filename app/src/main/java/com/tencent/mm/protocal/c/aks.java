package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class aks
  extends bhp
{
  public String rNA;
  public int rNB;
  public String rNC;
  public String rND;
  public String rNE;
  public String rNF;
  public int rNs;
  public LinkedList<chg> rNy = new LinkedList();
  public chg rNz;
  public cgh rrI;
  
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
      if (this.rrI != null)
      {
        paramVarArgs.fV(2, this.rrI.boi());
        this.rrI.a(paramVarArgs);
      }
      paramVarArgs.d(3, 8, this.rNy);
      if (this.rNz != null)
      {
        paramVarArgs.fV(4, this.rNz.boi());
        this.rNz.a(paramVarArgs);
      }
      if (this.rNA != null) {
        paramVarArgs.g(5, this.rNA);
      }
      paramVarArgs.fT(6, this.rNB);
      if (this.rNC != null) {
        paramVarArgs.g(7, this.rNC);
      }
      if (this.rND != null) {
        paramVarArgs.g(8, this.rND);
      }
      if (this.rNE != null) {
        paramVarArgs.g(9, this.rNE);
      }
      if (this.rNF != null) {
        paramVarArgs.g(10, this.rNF);
      }
      paramVarArgs.fT(11, this.rNs);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1097;
      }
    }
    label1097:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rrI != null) {
        i = paramInt + f.a.a.a.fS(2, this.rrI.boi());
      }
      i += f.a.a.a.c(3, 8, this.rNy);
      paramInt = i;
      if (this.rNz != null) {
        paramInt = i + f.a.a.a.fS(4, this.rNz.boi());
      }
      i = paramInt;
      if (this.rNA != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rNA);
      }
      i += f.a.a.a.fQ(6, this.rNB);
      paramInt = i;
      if (this.rNC != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.rNC);
      }
      i = paramInt;
      if (this.rND != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.rND);
      }
      paramInt = i;
      if (this.rNE != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.rNE);
      }
      i = paramInt;
      if (this.rNF != null) {
        i = paramInt + f.a.a.b.b.a.h(10, this.rNF);
      }
      return i + f.a.a.a.fQ(11, this.rNs);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rNy.clear();
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
        aks localaks = (aks)paramVarArgs[1];
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
            localaks.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new cgh();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cgh)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localaks.rrI = ((cgh)localObject1);
            paramInt += 1;
          }
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new chg();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((chg)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localaks.rNy.add(localObject1);
            paramInt += 1;
          }
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new chg();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((chg)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localaks.rNz = ((chg)localObject1);
            paramInt += 1;
          }
        case 5: 
          localaks.rNA = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localaks.rNB = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localaks.rNC = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localaks.rND = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localaks.rNE = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localaks.rNF = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localaks.rNs = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/aks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */