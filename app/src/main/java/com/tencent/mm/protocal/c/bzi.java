package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bzi
  extends bhp
{
  public int kpF;
  public int kpG;
  public int kpK;
  public int kpz;
  public LinkedList<bzc> rfi = new LinkedList();
  public long rxH;
  public com.tencent.mm.bk.b seu;
  public int svA;
  public LinkedList<bzc> svB = new LinkedList();
  public long svs;
  public int svx;
  public int svy;
  public int svz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new f.a.a.b("Not all required fields were included: BaseResponse");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      paramVarArgs.T(2, this.svs);
      paramVarArgs.T(3, this.rxH);
      paramVarArgs.d(4, 8, this.rfi);
      paramVarArgs.fT(5, this.svx);
      paramVarArgs.fT(6, this.kpF);
      paramVarArgs.fT(7, this.kpG);
      paramVarArgs.fT(8, this.kpz);
      paramVarArgs.fT(9, this.kpK);
      paramVarArgs.fT(10, this.svy);
      paramVarArgs.fT(11, this.svz);
      if (this.seu != null) {
        paramVarArgs.b(12, this.seu);
      }
      paramVarArgs.fT(13, this.svA);
      paramVarArgs.d(14, 8, this.svB);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1009;
      }
    }
    label1009:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.S(2, this.svs) + f.a.a.a.S(3, this.rxH) + f.a.a.a.c(4, 8, this.rfi) + f.a.a.a.fQ(5, this.svx) + f.a.a.a.fQ(6, this.kpF) + f.a.a.a.fQ(7, this.kpG) + f.a.a.a.fQ(8, this.kpz) + f.a.a.a.fQ(9, this.kpK) + f.a.a.a.fQ(10, this.svy) + f.a.a.a.fQ(11, this.svz);
      paramInt = i;
      if (this.seu != null) {
        paramInt = i + f.a.a.a.a(12, this.seu);
      }
      return paramInt + f.a.a.a.fQ(13, this.svA) + f.a.a.a.c(14, 8, this.svB);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rfi.clear();
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
        throw new f.a.a.b("Not all required fields were included: BaseResponse");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bzi localbzi = (bzi)paramVarArgs[1];
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
            localbzi.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbzi.svs = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 3: 
          localbzi.rxH = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bzc();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bzc)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbzi.rfi.add(localObject1);
            paramInt += 1;
          }
        case 5: 
          localbzi.svx = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localbzi.kpF = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbzi.kpG = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localbzi.kpz = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localbzi.kpK = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          localbzi.svy = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 11: 
          localbzi.svz = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 12: 
          localbzi.seu = ((f.a.a.a.a)localObject1).cJR();
          return 0;
        case 13: 
          localbzi.svA = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bzc();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bzc)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          localbzi.svB.add(localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/bzi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */