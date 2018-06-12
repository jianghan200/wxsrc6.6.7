package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class nr
  extends bhp
{
  public cgh rrI;
  public boolean rrJ;
  public String rrK;
  public String rrL;
  public boolean rrM;
  public String rrN;
  public String rrO;
  public String rrP;
  
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
      paramVarArgs.av(3, this.rrJ);
      if (this.rrK != null) {
        paramVarArgs.g(4, this.rrK);
      }
      if (this.rrL != null) {
        paramVarArgs.g(5, this.rrL);
      }
      paramVarArgs.av(6, this.rrM);
      if (this.rrN != null) {
        paramVarArgs.g(7, this.rrN);
      }
      if (this.rrO != null) {
        paramVarArgs.g(8, this.rrO);
      }
      if (this.rrP != null) {
        paramVarArgs.g(9, this.rrP);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label805;
      }
    }
    label805:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rrI != null) {
        i = paramInt + f.a.a.a.fS(2, this.rrI.boi());
      }
      i += f.a.a.b.b.a.ec(3) + 1;
      paramInt = i;
      if (this.rrK != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rrK);
      }
      i = paramInt;
      if (this.rrL != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rrL);
      }
      i += f.a.a.b.b.a.ec(6) + 1;
      paramInt = i;
      if (this.rrN != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.rrN);
      }
      i = paramInt;
      if (this.rrO != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.rrO);
      }
      paramInt = i;
      if (this.rrP != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.rrP);
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
        nr localnr = (nr)paramVarArgs[1];
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
            localnr.six = ((fl)localObject1);
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
            localnr.rrI = ((cgh)localObject1);
            paramInt += 1;
          }
        case 3: 
          localnr.rrJ = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 4: 
          localnr.rrK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localnr.rrL = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localnr.rrM = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 7: 
          localnr.rrN = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localnr.rrO = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localnr.rrP = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/nr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */