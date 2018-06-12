package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class axp
  extends bhp
{
  public int hwV;
  public String hwW;
  public String rhd;
  public bbc rhe;
  public ayi rhf;
  public String saE;
  public String saK;
  
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
      if (this.saE != null) {
        paramVarArgs.g(4, this.saE);
      }
      if (this.rhd != null) {
        paramVarArgs.g(5, this.rhd);
      }
      if (this.saK != null) {
        paramVarArgs.g(6, this.saK);
      }
      if (this.rhe != null)
      {
        paramVarArgs.fV(7, this.rhe.boi());
        this.rhe.a(paramVarArgs);
      }
      if (this.rhf != null)
      {
        paramVarArgs.fV(8, this.rhf.boi());
        this.rhf.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label866;
      }
    }
    label866:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hwV);
      paramInt = i;
      if (this.hwW != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.hwW);
      }
      i = paramInt;
      if (this.saE != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.saE);
      }
      paramInt = i;
      if (this.rhd != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rhd);
      }
      i = paramInt;
      if (this.saK != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.saK);
      }
      paramInt = i;
      if (this.rhe != null) {
        paramInt = i + f.a.a.a.fS(7, this.rhe.boi());
      }
      i = paramInt;
      if (this.rhf != null) {
        i = paramInt + f.a.a.a.fS(8, this.rhf.boi());
      }
      return i;
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
        axp localaxp = (axp)paramVarArgs[1];
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
            localaxp.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localaxp.hwV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localaxp.hwW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localaxp.saE = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localaxp.rhd = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localaxp.saK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bbc();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bbc)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localaxp.rhe = ((bbc)localObject1);
            paramInt += 1;
          }
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ayi();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ayi)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          localaxp.rhf = ((ayi)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/axp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */