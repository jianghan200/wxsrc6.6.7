package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class cdc
  extends bhd
{
  public int hcE;
  public String rHk;
  public int rjC;
  public String rlo;
  public int sdX;
  public int syH;
  public int syI = 2;
  public double syJ;
  public double syK;
  public String syL;
  public String syM;
  public String syN;
  public String syO;
  public int syP;
  public String syQ;
  
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
      if (this.rHk != null) {
        paramVarArgs.g(2, this.rHk);
      }
      paramVarArgs.fT(3, this.rjC);
      paramVarArgs.fT(4, this.syH);
      if (this.rlo != null) {
        paramVarArgs.g(5, this.rlo);
      }
      paramVarArgs.fT(6, this.syI);
      paramVarArgs.c(7, this.syJ);
      paramVarArgs.c(8, this.syK);
      paramVarArgs.fT(9, this.hcE);
      paramVarArgs.fT(10, this.sdX);
      if (this.syL != null) {
        paramVarArgs.g(99, this.syL);
      }
      if (this.syM != null) {
        paramVarArgs.g(100, this.syM);
      }
      if (this.syN != null) {
        paramVarArgs.g(101, this.syN);
      }
      if (this.syO != null) {
        paramVarArgs.g(102, this.syO);
      }
      paramVarArgs.fT(103, this.syP);
      if (this.syQ != null) {
        paramVarArgs.g(104, this.syQ);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label1038;
      }
    }
    label1038:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rHk != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.rHk);
      }
      i = i + f.a.a.a.fQ(3, this.rjC) + f.a.a.a.fQ(4, this.syH);
      paramInt = i;
      if (this.rlo != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rlo);
      }
      i = paramInt + f.a.a.a.fQ(6, this.syI) + (f.a.a.b.b.a.ec(7) + 8) + (f.a.a.b.b.a.ec(8) + 8) + f.a.a.a.fQ(9, this.hcE) + f.a.a.a.fQ(10, this.sdX);
      paramInt = i;
      if (this.syL != null) {
        paramInt = i + f.a.a.b.b.a.h(99, this.syL);
      }
      i = paramInt;
      if (this.syM != null) {
        i = paramInt + f.a.a.b.b.a.h(100, this.syM);
      }
      paramInt = i;
      if (this.syN != null) {
        paramInt = i + f.a.a.b.b.a.h(101, this.syN);
      }
      i = paramInt;
      if (this.syO != null) {
        i = paramInt + f.a.a.b.b.a.h(102, this.syO);
      }
      i += f.a.a.a.fQ(103, this.syP);
      paramInt = i;
      if (this.syQ != null) {
        paramInt = i + f.a.a.b.b.a.h(104, this.syQ);
      }
      return paramInt;
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
        cdc localcdc = (cdc)paramVarArgs[1];
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
            localcdc.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localcdc.rHk = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localcdc.rjC = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localcdc.syH = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localcdc.rlo = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localcdc.syI = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localcdc.syJ = ((f.a.a.a.a)localObject1).vHC.readDouble();
          return 0;
        case 8: 
          localcdc.syK = ((f.a.a.a.a)localObject1).vHC.readDouble();
          return 0;
        case 9: 
          localcdc.hcE = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          localcdc.sdX = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 99: 
          localcdc.syL = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 100: 
          localcdc.syM = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 101: 
          localcdc.syN = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 102: 
          localcdc.syO = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 103: 
          localcdc.syP = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localcdc.syQ = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/cdc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */