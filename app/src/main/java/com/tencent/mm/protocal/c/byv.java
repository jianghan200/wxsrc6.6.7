package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class byv
  extends bhd
{
  public int rth;
  public int rxG;
  public long rxH;
  public String seC;
  public int suJ;
  public cak suK;
  public cak suL;
  public String suM;
  public int suN;
  public long suO;
  
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
      paramVarArgs.fT(2, this.rxG);
      paramVarArgs.T(3, this.rxH);
      if (this.seC != null) {
        paramVarArgs.g(4, this.seC);
      }
      paramVarArgs.fT(5, this.suJ);
      if (this.suK != null)
      {
        paramVarArgs.fV(6, this.suK.boi());
        this.suK.a(paramVarArgs);
      }
      if (this.suL != null)
      {
        paramVarArgs.fV(7, this.suL.boi());
        this.suL.a(paramVarArgs);
      }
      paramVarArgs.fT(8, this.rth);
      if (this.suM != null) {
        paramVarArgs.g(9, this.suM);
      }
      paramVarArgs.fT(10, this.suN);
      paramVarArgs.T(11, this.suO);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label915;
      }
    }
    label915:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rxG) + f.a.a.a.S(3, this.rxH);
      paramInt = i;
      if (this.seC != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.seC);
      }
      i = paramInt + f.a.a.a.fQ(5, this.suJ);
      paramInt = i;
      if (this.suK != null) {
        paramInt = i + f.a.a.a.fS(6, this.suK.boi());
      }
      i = paramInt;
      if (this.suL != null) {
        i = paramInt + f.a.a.a.fS(7, this.suL.boi());
      }
      i += f.a.a.a.fQ(8, this.rth);
      paramInt = i;
      if (this.suM != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.suM);
      }
      return paramInt + f.a.a.a.fQ(10, this.suN) + f.a.a.a.S(11, this.suO);
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
        byv localbyv = (byv)paramVarArgs[1];
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
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbyv.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbyv.rxG = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbyv.rxH = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 4: 
          localbyv.seC = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localbyv.suJ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new cak();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cak)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbyv.suK = ((cak)localObject1);
            paramInt += 1;
          }
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new cak();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cak)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbyv.suL = ((cak)localObject1);
            paramInt += 1;
          }
        case 8: 
          localbyv.rth = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localbyv.suM = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localbyv.suN = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localbyv.suO = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/byv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */