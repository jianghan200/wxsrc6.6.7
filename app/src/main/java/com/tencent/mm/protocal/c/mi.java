package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class mi
  extends bhp
{
  public int amount;
  public String bQa;
  public int hUm;
  public String hUn;
  public String rcE;
  public String rqA;
  public String rqo;
  public String rqp;
  public String rqr;
  
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
      if (this.bQa != null) {
        paramVarArgs.g(4, this.bQa);
      }
      if (this.rqr != null) {
        paramVarArgs.g(5, this.rqr);
      }
      if (this.rcE != null) {
        paramVarArgs.g(6, this.rcE);
      }
      paramVarArgs.fT(7, this.amount);
      if (this.rqA != null) {
        paramVarArgs.g(8, this.rqA);
      }
      if (this.rqp != null) {
        paramVarArgs.g(9, this.rqp);
      }
      if (this.rqo != null) {
        paramVarArgs.g(10, this.rqo);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label780;
      }
    }
    label780:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hUm);
      paramInt = i;
      if (this.hUn != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.hUn);
      }
      i = paramInt;
      if (this.bQa != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.bQa);
      }
      paramInt = i;
      if (this.rqr != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rqr);
      }
      i = paramInt;
      if (this.rcE != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.rcE);
      }
      i += f.a.a.a.fQ(7, this.amount);
      paramInt = i;
      if (this.rqA != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rqA);
      }
      i = paramInt;
      if (this.rqp != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.rqp);
      }
      paramInt = i;
      if (this.rqo != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.rqo);
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
        mi localmi = (mi)paramVarArgs[1];
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
            localmi.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localmi.hUm = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localmi.hUn = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localmi.bQa = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localmi.rqr = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localmi.rcE = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localmi.amount = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localmi.rqA = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localmi.rqp = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localmi.rqo = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/mi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */