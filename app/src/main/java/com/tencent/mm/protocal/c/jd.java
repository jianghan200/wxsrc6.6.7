package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class jd
  extends bhd
{
  public int amount;
  public int bVU;
  public int mwQ;
  public String mwR;
  public String mwS;
  public String myi;
  public String myl;
  public String rcH;
  public String rky;
  public int rkz;
  
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
      paramVarArgs.fT(2, this.amount);
      paramVarArgs.fT(3, this.bVU);
      paramVarArgs.fT(4, this.mwQ);
      if (this.rky != null) {
        paramVarArgs.g(5, this.rky);
      }
      if (this.myi != null) {
        paramVarArgs.g(6, this.myi);
      }
      if (this.mwR != null) {
        paramVarArgs.g(7, this.mwR);
      }
      if (this.myl != null) {
        paramVarArgs.g(8, this.myl);
      }
      if (this.rcH != null) {
        paramVarArgs.g(9, this.rcH);
      }
      if (this.mwS != null) {
        paramVarArgs.g(10, this.mwS);
      }
      paramVarArgs.fT(11, this.rkz);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label763;
      }
    }
    label763:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.amount) + f.a.a.a.fQ(3, this.bVU) + f.a.a.a.fQ(4, this.mwQ);
      paramInt = i;
      if (this.rky != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rky);
      }
      i = paramInt;
      if (this.myi != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.myi);
      }
      paramInt = i;
      if (this.mwR != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.mwR);
      }
      i = paramInt;
      if (this.myl != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.myl);
      }
      paramInt = i;
      if (this.rcH != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.rcH);
      }
      i = paramInt;
      if (this.mwS != null) {
        i = paramInt + f.a.a.b.b.a.h(10, this.mwS);
      }
      return i + f.a.a.a.fQ(11, this.rkz);
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
        jd localjd = (jd)paramVarArgs[1];
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
            localjd.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localjd.amount = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localjd.bVU = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localjd.mwQ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localjd.rky = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localjd.myi = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localjd.mwR = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localjd.myl = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localjd.rcH = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localjd.mwS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localjd.rkz = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/jd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */