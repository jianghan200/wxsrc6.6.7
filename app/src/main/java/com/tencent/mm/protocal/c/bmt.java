package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bmt
  extends bhd
{
  public int cae;
  public LinkedList<bmv> dzs = new LinkedList();
  public bqs qZR;
  public String rGk;
  public int skX;
  public String skY;
  public bnk skZ;
  
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
      paramVarArgs.fT(2, this.skX);
      paramVarArgs.d(3, 8, this.dzs);
      if (this.skY != null) {
        paramVarArgs.g(4, this.skY);
      }
      if (this.rGk != null) {
        paramVarArgs.g(5, this.rGk);
      }
      if (this.skZ != null)
      {
        paramVarArgs.fV(6, this.skZ.boi());
        this.skZ.a(paramVarArgs);
      }
      paramVarArgs.fT(7, this.cae);
      if (this.qZR != null)
      {
        paramVarArgs.fV(8, this.qZR.boi());
        this.qZR.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label892;
      }
    }
    label892:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.skX) + f.a.a.a.c(3, 8, this.dzs);
      paramInt = i;
      if (this.skY != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.skY);
      }
      i = paramInt;
      if (this.rGk != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rGk);
      }
      paramInt = i;
      if (this.skZ != null) {
        paramInt = i + f.a.a.a.fS(6, this.skZ.boi());
      }
      i = paramInt + f.a.a.a.fQ(7, this.cae);
      paramInt = i;
      if (this.qZR != null) {
        paramInt = i + f.a.a.a.fS(8, this.qZR.boi());
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.dzs.clear();
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
        bmt localbmt = (bmt)paramVarArgs[1];
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
            localbmt.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbmt.skX = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bmv();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bmv)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbmt.dzs.add(localObject1);
            paramInt += 1;
          }
        case 4: 
          localbmt.skY = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localbmt.rGk = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bnk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bnk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbmt.skZ = ((bnk)localObject1);
            paramInt += 1;
          }
        case 7: 
          localbmt.cae = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bqs();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bqs)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
          localbmt.qZR = ((bqs)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bmt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */