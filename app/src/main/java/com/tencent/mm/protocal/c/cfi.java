package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class cfi
  extends com.tencent.mm.bk.a
{
  public int otY;
  public String rDH;
  public int rUH;
  public aqs rUI;
  public String rZE;
  public int rjC;
  public String rlo;
  public int shN;
  public int spQ;
  public int syI = 2;
  public String syL;
  public int szP;
  public LinkedList<ps> szQ = new LinkedList();
  public String szR;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rjC);
      paramVarArgs.fT(2, this.rUH);
      paramVarArgs.fT(3, this.shN);
      if (this.rDH != null) {
        paramVarArgs.g(4, this.rDH);
      }
      if (this.rUI != null)
      {
        paramVarArgs.fV(5, this.rUI.boi());
        this.rUI.a(paramVarArgs);
      }
      paramVarArgs.fT(6, this.otY);
      if (this.rlo != null) {
        paramVarArgs.g(7, this.rlo);
      }
      paramVarArgs.fT(8, this.szP);
      paramVarArgs.fT(9, this.syI);
      paramVarArgs.d(10, 8, this.szQ);
      if (this.syL != null) {
        paramVarArgs.g(11, this.syL);
      }
      if (this.rZE != null) {
        paramVarArgs.g(12, this.rZE);
      }
      paramVarArgs.fT(13, this.spQ);
      if (this.szR != null) {
        paramVarArgs.g(14, this.szR);
      }
      paramInt = 0;
    }
    int i;
    do
    {
      return paramInt;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.rjC) + 0 + f.a.a.a.fQ(2, this.rUH) + f.a.a.a.fQ(3, this.shN);
      paramInt = i;
      if (this.rDH != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rDH);
      }
      i = paramInt;
      if (this.rUI != null) {
        i = paramInt + f.a.a.a.fS(5, this.rUI.boi());
      }
      i += f.a.a.a.fQ(6, this.otY);
      paramInt = i;
      if (this.rlo != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.rlo);
      }
      i = paramInt + f.a.a.a.fQ(8, this.szP) + f.a.a.a.fQ(9, this.syI) + f.a.a.a.c(10, 8, this.szQ);
      paramInt = i;
      if (this.syL != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.syL);
      }
      i = paramInt;
      if (this.rZE != null) {
        i = paramInt + f.a.a.b.b.a.h(12, this.rZE);
      }
      i += f.a.a.a.fQ(13, this.spQ);
      paramInt = i;
    } while (this.szR == null);
    return i + f.a.a.b.b.a.h(14, this.szR);
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.szQ.clear();
      paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      cfi localcfi = (cfi)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localcfi.rjC = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localcfi.rUH = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 3: 
        localcfi.shN = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 4: 
        localcfi.rDH = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 5: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aqs();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aqs)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localcfi.rUI = ((aqs)localObject1);
          paramInt += 1;
        }
        return 0;
      case 6: 
        localcfi.otY = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 7: 
        localcfi.rlo = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 8: 
        localcfi.szP = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 9: 
        localcfi.syI = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 10: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ps();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ps)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localcfi.szQ.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 11: 
        localcfi.syL = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 12: 
        localcfi.rZE = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 13: 
        localcfi.spQ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      localcfi.szR = ((f.a.a.a.a)localObject1).vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/cfi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */