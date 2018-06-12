package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class lq
  extends bhd
{
  public int amount;
  public int bVU;
  public int mwQ;
  public String mye;
  public String myf;
  public String rcD;
  public String rcE;
  public String rpL;
  public String rpM;
  
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
      if (this.rcD != null) {
        paramVarArgs.g(2, this.rcD);
      }
      if (this.rcE != null) {
        paramVarArgs.g(3, this.rcE);
      }
      paramVarArgs.fT(4, this.amount);
      if (this.myf != null) {
        paramVarArgs.g(5, this.myf);
      }
      if (this.mye != null) {
        paramVarArgs.g(6, this.mye);
      }
      paramVarArgs.fT(7, this.bVU);
      paramVarArgs.fT(8, this.mwQ);
      if (this.rpL != null) {
        paramVarArgs.g(9, this.rpL);
      }
      if (this.rpM != null) {
        paramVarArgs.g(10, this.rpM);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label728;
      }
    }
    label728:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rcD != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rcD);
      }
      i = paramInt;
      if (this.rcE != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rcE);
      }
      i += f.a.a.a.fQ(4, this.amount);
      paramInt = i;
      if (this.myf != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.myf);
      }
      i = paramInt;
      if (this.mye != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.mye);
      }
      i = i + f.a.a.a.fQ(7, this.bVU) + f.a.a.a.fQ(8, this.mwQ);
      paramInt = i;
      if (this.rpL != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.rpL);
      }
      i = paramInt;
      if (this.rpM != null) {
        i = paramInt + f.a.a.b.b.a.h(10, this.rpM);
      }
      return i;
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
        lq locallq = (lq)paramVarArgs[1];
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
            locallq.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          locallq.rcD = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          locallq.rcE = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          locallq.amount = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          locallq.myf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          locallq.mye = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          locallq.bVU = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          locallq.mwQ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          locallq.rpL = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        locallq.rpM = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/lq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */