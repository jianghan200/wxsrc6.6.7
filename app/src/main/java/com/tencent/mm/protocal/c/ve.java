package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class ve
  extends bhp
{
  public int amount;
  public int bJL;
  public int ceS;
  public int ceT;
  public int hUm;
  public String hUn;
  public String kLZ;
  public int kNg;
  public String kNh;
  public String kNi;
  public String kNj;
  public int kNk;
  public String kQg;
  public bfi ryB;
  
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
      paramVarArgs.fT(4, this.bJL);
      if (this.kLZ != null) {
        paramVarArgs.g(5, this.kLZ);
      }
      paramVarArgs.fT(6, this.ceS);
      paramVarArgs.fT(7, this.ceT);
      if (this.kQg != null) {
        paramVarArgs.g(8, this.kQg);
      }
      paramVarArgs.fT(9, this.amount);
      if (this.ryB != null)
      {
        paramVarArgs.fV(10, this.ryB.boi());
        this.ryB.a(paramVarArgs);
      }
      paramVarArgs.fT(11, this.kNg);
      if (this.kNh != null) {
        paramVarArgs.g(12, this.kNh);
      }
      if (this.kNi != null) {
        paramVarArgs.g(13, this.kNi);
      }
      if (this.kNj != null) {
        paramVarArgs.g(14, this.kNj);
      }
      paramVarArgs.fT(15, this.kNk);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1073;
      }
    }
    label1073:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hUm);
      paramInt = i;
      if (this.hUn != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.hUn);
      }
      i = paramInt + f.a.a.a.fQ(4, this.bJL);
      paramInt = i;
      if (this.kLZ != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.kLZ);
      }
      i = paramInt + f.a.a.a.fQ(6, this.ceS) + f.a.a.a.fQ(7, this.ceT);
      paramInt = i;
      if (this.kQg != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.kQg);
      }
      i = paramInt + f.a.a.a.fQ(9, this.amount);
      paramInt = i;
      if (this.ryB != null) {
        paramInt = i + f.a.a.a.fS(10, this.ryB.boi());
      }
      i = paramInt + f.a.a.a.fQ(11, this.kNg);
      paramInt = i;
      if (this.kNh != null) {
        paramInt = i + f.a.a.b.b.a.h(12, this.kNh);
      }
      i = paramInt;
      if (this.kNi != null) {
        i = paramInt + f.a.a.b.b.a.h(13, this.kNi);
      }
      paramInt = i;
      if (this.kNj != null) {
        paramInt = i + f.a.a.b.b.a.h(14, this.kNj);
      }
      return paramInt + f.a.a.a.fQ(15, this.kNk);
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
        ve localve = (ve)paramVarArgs[1];
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
            localve.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localve.hUm = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localve.hUn = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localve.bJL = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localve.kLZ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localve.ceS = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localve.ceT = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localve.kQg = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localve.amount = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bfi();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bfi)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localve.ryB = ((bfi)localObject1);
            paramInt += 1;
          }
        case 11: 
          localve.kNg = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 12: 
          localve.kNh = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 13: 
          localve.kNi = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 14: 
          localve.kNj = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localve.kNk = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/ve.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */