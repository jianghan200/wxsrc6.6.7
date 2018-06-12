package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class caj
  extends bhp
{
  public int rxG;
  public long rxH;
  public int seq;
  public LinkedList<byx> svB = new LinkedList();
  public int swK;
  public LinkedList<byx> swL = new LinkedList();
  public int swM;
  public LinkedList<byx> swN = new LinkedList();
  public int swO;
  public int swP;
  public int swQ;
  
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
      paramVarArgs.fT(2, this.rxG);
      paramVarArgs.fT(3, this.swK);
      paramVarArgs.d(4, 8, this.swL);
      paramVarArgs.fT(5, this.swM);
      paramVarArgs.d(6, 8, this.swN);
      paramVarArgs.T(7, this.rxH);
      paramVarArgs.fT(8, this.seq);
      paramVarArgs.fT(9, this.swO);
      paramVarArgs.d(10, 8, this.svB);
      paramVarArgs.fT(11, this.swP);
      paramVarArgs.fT(12, this.swQ);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1008;
      }
    }
    label1008:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.fQ(2, this.rxG) + f.a.a.a.fQ(3, this.swK) + f.a.a.a.c(4, 8, this.swL) + f.a.a.a.fQ(5, this.swM) + f.a.a.a.c(6, 8, this.swN) + f.a.a.a.S(7, this.rxH) + f.a.a.a.fQ(8, this.seq) + f.a.a.a.fQ(9, this.swO) + f.a.a.a.c(10, 8, this.svB) + f.a.a.a.fQ(11, this.swP) + f.a.a.a.fQ(12, this.swQ);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.swL.clear();
        this.swN.clear();
        this.svB.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
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
        caj localcaj = (caj)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        int i;
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
            localcaj.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localcaj.rxG = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localcaj.swK = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new byx();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((byx)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localcaj.swL.add(localObject1);
            paramInt += 1;
          }
        case 5: 
          localcaj.swM = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new byx();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((byx)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localcaj.swN.add(localObject1);
            paramInt += 1;
          }
        case 7: 
          localcaj.rxH = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 8: 
          localcaj.seq = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localcaj.swO = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new byx();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((byx)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localcaj.svB.add(localObject1);
            paramInt += 1;
          }
        case 11: 
          localcaj.swP = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localcaj.swQ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/caj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */