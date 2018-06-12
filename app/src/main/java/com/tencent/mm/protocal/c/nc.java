package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class nc
  extends bhp
{
  public int hUm;
  public String hUn;
  public String muA;
  public String muB;
  public String muC;
  public String ref;
  
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
      if (this.muA != null) {
        paramVarArgs.g(4, this.muA);
      }
      if (this.muB != null) {
        paramVarArgs.g(5, this.muB);
      }
      if (this.muC != null) {
        paramVarArgs.g(6, this.muC);
      }
      if (this.ref != null) {
        paramVarArgs.g(7, this.ref);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label623;
      }
    }
    label623:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hUm);
      paramInt = i;
      if (this.hUn != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.hUn);
      }
      i = paramInt;
      if (this.muA != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.muA);
      }
      paramInt = i;
      if (this.muB != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.muB);
      }
      i = paramInt;
      if (this.muC != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.muC);
      }
      paramInt = i;
      if (this.ref != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.ref);
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
        nc localnc = (nc)paramVarArgs[1];
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
            localnc.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localnc.hUm = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localnc.hUn = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localnc.muA = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localnc.muB = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localnc.muC = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localnc.ref = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/nc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */