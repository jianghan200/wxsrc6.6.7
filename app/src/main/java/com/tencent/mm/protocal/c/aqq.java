package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;
import java.util.LinkedList;

public final class aqq
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public int hcE;
  public String lCG;
  public float lCH;
  public int lCI;
  public LinkedList<Integer> lCJ = new LinkedList();
  public int lCK;
  public LinkedList<bhz> lCL = new LinkedList();
  public float lCM;
  public String lCN;
  public bhy lCO;
  public String rTm;
  public bhy rTn;
  public int rTo;
  public int rTp;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.lCG != null) {
        paramVarArgs.g(1, this.lCG);
      }
      if (this.bHD != null) {
        paramVarArgs.g(2, this.bHD);
      }
      paramVarArgs.l(3, this.lCH);
      paramVarArgs.fT(4, this.lCI);
      paramVarArgs.c(5, this.lCJ);
      paramVarArgs.fT(6, this.lCK);
      paramVarArgs.d(7, 8, this.lCL);
      paramVarArgs.l(8, this.lCM);
      if (this.lCN != null) {
        paramVarArgs.g(9, this.lCN);
      }
      paramVarArgs.fT(10, this.hcE);
      if (this.lCO != null)
      {
        paramVarArgs.fV(11, this.lCO.boi());
        this.lCO.a(paramVarArgs);
      }
      if (this.rTm != null) {
        paramVarArgs.g(12, this.rTm);
      }
      if (this.rTn != null)
      {
        paramVarArgs.fV(13, this.rTn.boi());
        this.rTn.a(paramVarArgs);
      }
      paramVarArgs.fT(14, this.rTo);
      paramVarArgs.fT(15, this.rTp);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lCG == null) {
        break label1108;
      }
    }
    label1108:
    for (paramInt = f.a.a.b.b.a.h(1, this.lCG) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.bHD != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.bHD);
      }
      i = i + (f.a.a.b.b.a.ec(3) + 4) + f.a.a.a.fQ(4, this.lCI) + f.a.a.a.b(5, this.lCJ) + f.a.a.a.fQ(6, this.lCK) + f.a.a.a.c(7, 8, this.lCL) + (f.a.a.b.b.a.ec(8) + 4);
      paramInt = i;
      if (this.lCN != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.lCN);
      }
      i = paramInt + f.a.a.a.fQ(10, this.hcE);
      paramInt = i;
      if (this.lCO != null) {
        paramInt = i + f.a.a.a.fS(11, this.lCO.boi());
      }
      i = paramInt;
      if (this.rTm != null) {
        i = paramInt + f.a.a.b.b.a.h(12, this.rTm);
      }
      paramInt = i;
      if (this.rTn != null) {
        paramInt = i + f.a.a.a.fS(13, this.rTn.boi());
      }
      return paramInt + f.a.a.a.fQ(14, this.rTo) + f.a.a.a.fQ(15, this.rTp);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.lCJ.clear();
        this.lCL.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        aqq localaqq = (aqq)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localaqq.lCG = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localaqq.bHD = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localaqq.lCH = ((f.a.a.a.a)localObject1).vHC.readFloat();
          return 0;
        case 4: 
          localaqq.lCI = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localaqq.lCJ = new f.a.a.a.a(((f.a.a.a.a)localObject1).cJR().lR, unknownTagHandler).cJO();
          return 0;
        case 6: 
          localaqq.lCK = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localaqq.lCL.add(localObject1);
            paramInt += 1;
          }
        case 8: 
          localaqq.lCM = ((f.a.a.a.a)localObject1).vHC.readFloat();
          return 0;
        case 9: 
          localaqq.lCN = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localaqq.hcE = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 11: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localaqq.lCO = ((bhy)localObject1);
            paramInt += 1;
          }
        case 12: 
          localaqq.rTm = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 13: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localaqq.rTn = ((bhy)localObject1);
            paramInt += 1;
          }
        case 14: 
          localaqq.rTo = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localaqq.rTp = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/aqq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */