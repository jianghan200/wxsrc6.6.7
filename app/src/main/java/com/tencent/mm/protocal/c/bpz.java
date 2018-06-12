package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bpz
  extends bhd
{
  public bhy slZ;
  public String smu;
  public long smv;
  public long snR;
  public int snS;
  public long snT;
  public int snU;
  
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
      if (this.smu != null) {
        paramVarArgs.g(2, this.smu);
      }
      paramVarArgs.T(3, this.smv);
      paramVarArgs.T(4, this.snR);
      paramVarArgs.fT(5, this.snS);
      paramVarArgs.T(6, this.snT);
      if (this.slZ != null)
      {
        paramVarArgs.fV(7, this.slZ.boi());
        this.slZ.a(paramVarArgs);
      }
      paramVarArgs.fT(8, this.snU);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label668;
      }
    }
    label668:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.smu != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.smu);
      }
      i = i + f.a.a.a.S(3, this.smv) + f.a.a.a.S(4, this.snR) + f.a.a.a.fQ(5, this.snS) + f.a.a.a.S(6, this.snT);
      paramInt = i;
      if (this.slZ != null) {
        paramInt = i + f.a.a.a.fS(7, this.slZ.boi());
      }
      return paramInt + f.a.a.a.fQ(8, this.snU);
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
        bpz localbpz = (bpz)paramVarArgs[1];
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
            localbpz.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbpz.smu = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbpz.smv = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 4: 
          localbpz.snR = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 5: 
          localbpz.snS = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localbpz.snT = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbpz.slZ = ((bhy)localObject1);
            paramInt += 1;
          }
        }
        localbpz.snU = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/bpz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */