package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class sm
  extends bhd
{
  public String hbL;
  public int hcE;
  public String jQb;
  public long rcq;
  public int rdV;
  public int rdW;
  public int rdX;
  public int rdn;
  public String rvP;
  public String rvQ;
  public int rvR;
  public int rvS;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.jQb != null) {
        paramVarArgs.g(2, this.jQb);
      }
      paramVarArgs.fT(3, this.rdn);
      if (this.rvP != null) {
        paramVarArgs.g(4, this.rvP);
      }
      if (this.hbL != null) {
        paramVarArgs.g(5, this.hbL);
      }
      paramVarArgs.fT(6, this.rdV);
      paramVarArgs.fT(7, this.rdW);
      paramVarArgs.fT(8, this.rdX);
      if (this.rvQ != null) {
        paramVarArgs.g(9, this.rvQ);
      }
      paramVarArgs.fT(10, this.rvR);
      paramVarArgs.fT(11, this.hcE);
      paramVarArgs.fT(12, this.rvS);
      paramVarArgs.T(13, this.rcq);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label809;
      }
    }
    label809:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jQb != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.jQb);
      }
      i += f.a.a.a.fQ(3, this.rdn);
      paramInt = i;
      if (this.rvP != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rvP);
      }
      i = paramInt;
      if (this.hbL != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.hbL);
      }
      i = i + f.a.a.a.fQ(6, this.rdV) + f.a.a.a.fQ(7, this.rdW) + f.a.a.a.fQ(8, this.rdX);
      paramInt = i;
      if (this.rvQ != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.rvQ);
      }
      return paramInt + f.a.a.a.fQ(10, this.rvR) + f.a.a.a.fQ(11, this.hcE) + f.a.a.a.fQ(12, this.rvS) + f.a.a.a.S(13, this.rcq);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        sm localsm = (sm)paramVarArgs[1];
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
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localsm.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localsm.jQb = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localsm.rdn = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localsm.rvP = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localsm.hbL = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localsm.rdV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localsm.rdW = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localsm.rdX = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localsm.rvQ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localsm.rvR = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 11: 
          localsm.hcE = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 12: 
          localsm.rvS = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localsm.rcq = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/sm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */