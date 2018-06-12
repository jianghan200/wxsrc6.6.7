package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bvn
  extends bhp
{
  public String hbL;
  public String jQb;
  public int lOH;
  public int rdV;
  public int rdW;
  public int rdX;
  public String rvP;
  public String ssa;
  
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
      if (this.jQb != null) {
        paramVarArgs.g(2, this.jQb);
      }
      if (this.rvP != null) {
        paramVarArgs.g(3, this.rvP);
      }
      if (this.ssa != null) {
        paramVarArgs.g(4, this.ssa);
      }
      if (this.hbL != null) {
        paramVarArgs.g(5, this.hbL);
      }
      paramVarArgs.fT(6, this.rdV);
      paramVarArgs.fT(7, this.rdW);
      paramVarArgs.fT(8, this.rdX);
      paramVarArgs.fT(9, this.lOH);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label681;
      }
    }
    label681:
    for (int i = f.a.a.a.fS(1, this.six.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jQb != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jQb);
      }
      i = paramInt;
      if (this.rvP != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rvP);
      }
      paramInt = i;
      if (this.ssa != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.ssa);
      }
      i = paramInt;
      if (this.hbL != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.hbL);
      }
      return i + f.a.a.a.fQ(6, this.rdV) + f.a.a.a.fQ(7, this.rdW) + f.a.a.a.fQ(8, this.rdX) + f.a.a.a.fQ(9, this.lOH);
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
        bvn localbvn = (bvn)paramVarArgs[1];
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
            localbvn.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbvn.jQb = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbvn.rvP = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localbvn.ssa = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localbvn.hbL = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localbvn.rdV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbvn.rdW = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localbvn.rdX = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localbvn.lOH = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/bvn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */