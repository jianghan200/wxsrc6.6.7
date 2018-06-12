package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class aqk
  extends bhd
{
  public String jQb;
  public int rKO;
  public cgg rSN;
  public chi rSO;
  public chd rSP;
  public chx rSQ;
  public chh rSR;
  public chj rSS;
  public int rST;
  
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
      if (this.rSN != null)
      {
        paramVarArgs.fV(3, this.rSN.boi());
        this.rSN.a(paramVarArgs);
      }
      paramVarArgs.fT(4, this.rKO);
      if (this.rSO != null)
      {
        paramVarArgs.fV(5, this.rSO.boi());
        this.rSO.a(paramVarArgs);
      }
      if (this.rSP != null)
      {
        paramVarArgs.fV(6, this.rSP.boi());
        this.rSP.a(paramVarArgs);
      }
      if (this.rSQ != null)
      {
        paramVarArgs.fV(7, this.rSQ.boi());
        this.rSQ.a(paramVarArgs);
      }
      if (this.rSR != null)
      {
        paramVarArgs.fV(8, this.rSR.boi());
        this.rSR.a(paramVarArgs);
      }
      if (this.rSS != null)
      {
        paramVarArgs.fV(9, this.rSS.boi());
        this.rSS.a(paramVarArgs);
      }
      paramVarArgs.fT(10, this.rST);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label1296;
      }
    }
    label1296:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jQb != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jQb);
      }
      i = paramInt;
      if (this.rSN != null) {
        i = paramInt + f.a.a.a.fS(3, this.rSN.boi());
      }
      i += f.a.a.a.fQ(4, this.rKO);
      paramInt = i;
      if (this.rSO != null) {
        paramInt = i + f.a.a.a.fS(5, this.rSO.boi());
      }
      i = paramInt;
      if (this.rSP != null) {
        i = paramInt + f.a.a.a.fS(6, this.rSP.boi());
      }
      paramInt = i;
      if (this.rSQ != null) {
        paramInt = i + f.a.a.a.fS(7, this.rSQ.boi());
      }
      i = paramInt;
      if (this.rSR != null) {
        i = paramInt + f.a.a.a.fS(8, this.rSR.boi());
      }
      paramInt = i;
      if (this.rSS != null) {
        paramInt = i + f.a.a.a.fS(9, this.rSS.boi());
      }
      return paramInt + f.a.a.a.fQ(10, this.rST);
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
        aqk localaqk = (aqk)paramVarArgs[1];
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
            localaqk.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localaqk.jQb = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new cgg();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cgg)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localaqk.rSN = ((cgg)localObject1);
            paramInt += 1;
          }
        case 4: 
          localaqk.rKO = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new chi();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((chi)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localaqk.rSO = ((chi)localObject1);
            paramInt += 1;
          }
        case 6: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new chd();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((chd)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localaqk.rSP = ((chd)localObject1);
            paramInt += 1;
          }
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new chx();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((chx)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localaqk.rSQ = ((chx)localObject1);
            paramInt += 1;
          }
        case 8: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new chh();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((chh)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localaqk.rSR = ((chh)localObject1);
            paramInt += 1;
          }
        case 9: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new chj();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((chj)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localaqk.rSS = ((chj)localObject1);
            paramInt += 1;
          }
        }
        localaqk.rST = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/aqk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */