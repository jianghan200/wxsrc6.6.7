package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bpv
  extends bhd
{
  public int hbF;
  public LinkedList<bhz> hbG = new LinkedList();
  public String jSt;
  public int otY;
  public int qZc;
  public long snO;
  
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
      paramVarArgs.fT(2, this.qZc);
      paramVarArgs.T(3, this.snO);
      if (this.jSt != null) {
        paramVarArgs.g(4, this.jSt);
      }
      paramVarArgs.fT(5, this.hbF);
      paramVarArgs.d(6, 8, this.hbG);
      paramVarArgs.fT(7, this.otY);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label613;
      }
    }
    label613:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.qZc) + f.a.a.a.S(3, this.snO);
      paramInt = i;
      if (this.jSt != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jSt);
      }
      return paramInt + f.a.a.a.fQ(5, this.hbF) + f.a.a.a.c(6, 8, this.hbG) + f.a.a.a.fQ(7, this.otY);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.hbG.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
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
        bpv localbpv = (bpv)paramVarArgs[1];
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
            localbpv.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbpv.qZc = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbpv.snO = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 4: 
          localbpv.jSt = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localbpv.hbF = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbpv.hbG.add(localObject1);
            paramInt += 1;
          }
        }
        localbpv.otY = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bpv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */