package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class adh
  extends bhp
{
  public int rHB;
  public LinkedList<ts> rHC = new LinkedList();
  public th rHD;
  public int rHE;
  public LinkedList<th> rHF = new LinkedList();
  public int rHG;
  public LinkedList<tl> rHH = new LinkedList();
  public int rHI;
  public LinkedList<tj> rHJ = new LinkedList();
  public int rHK;
  public int rHL;
  public int rHM;
  public LinkedList<tj> rHN = new LinkedList();
  public bhy rcT;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.rcT == null) {
        throw new b("Not all required fields were included: ReqBuf");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      if (this.rcT != null)
      {
        paramVarArgs.fV(2, this.rcT.boi());
        this.rcT.a(paramVarArgs);
      }
      paramVarArgs.fT(3, this.rHB);
      paramVarArgs.d(4, 8, this.rHC);
      if (this.rHD != null)
      {
        paramVarArgs.fV(5, this.rHD.boi());
        this.rHD.a(paramVarArgs);
      }
      paramVarArgs.fT(6, this.rHE);
      paramVarArgs.d(7, 8, this.rHF);
      paramVarArgs.fT(8, this.rHG);
      paramVarArgs.d(9, 8, this.rHH);
      paramVarArgs.fT(10, this.rHI);
      paramVarArgs.d(11, 8, this.rHJ);
      paramVarArgs.fT(12, this.rHK);
      paramVarArgs.fT(13, this.rHL);
      paramVarArgs.fT(14, this.rHM);
      paramVarArgs.d(15, 8, this.rHN);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1565;
      }
    }
    label1565:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rcT != null) {
        i = paramInt + f.a.a.a.fS(2, this.rcT.boi());
      }
      i = i + f.a.a.a.fQ(3, this.rHB) + f.a.a.a.c(4, 8, this.rHC);
      paramInt = i;
      if (this.rHD != null) {
        paramInt = i + f.a.a.a.fS(5, this.rHD.boi());
      }
      return paramInt + f.a.a.a.fQ(6, this.rHE) + f.a.a.a.c(7, 8, this.rHF) + f.a.a.a.fQ(8, this.rHG) + f.a.a.a.c(9, 8, this.rHH) + f.a.a.a.fQ(10, this.rHI) + f.a.a.a.c(11, 8, this.rHJ) + f.a.a.a.fQ(12, this.rHK) + f.a.a.a.fQ(13, this.rHL) + f.a.a.a.fQ(14, this.rHM) + f.a.a.a.c(15, 8, this.rHN);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rHC.clear();
        this.rHF.clear();
        this.rHH.clear();
        this.rHJ.clear();
        this.rHN.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six == null) {
          throw new b("Not all required fields were included: BaseResponse");
        }
        if (this.rcT != null) {
          break;
        }
        throw new b("Not all required fields were included: ReqBuf");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        adh localadh = (adh)paramVarArgs[1];
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
            localadh.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localadh.rcT = ((bhy)localObject1);
            paramInt += 1;
          }
        case 3: 
          localadh.rHB = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ts();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ts)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localadh.rHC.add(localObject1);
            paramInt += 1;
          }
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new th();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((th)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localadh.rHD = ((th)localObject1);
            paramInt += 1;
          }
        case 6: 
          localadh.rHE = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new th();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((th)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localadh.rHF.add(localObject1);
            paramInt += 1;
          }
        case 8: 
          localadh.rHG = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new tl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((tl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localadh.rHH.add(localObject1);
            paramInt += 1;
          }
        case 10: 
          localadh.rHI = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 11: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new tj();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((tj)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localadh.rHJ.add(localObject1);
            paramInt += 1;
          }
        case 12: 
          localadh.rHK = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 13: 
          localadh.rHL = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 14: 
          localadh.rHM = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new tj();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((tj)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          localadh.rHN.add(localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/adh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */